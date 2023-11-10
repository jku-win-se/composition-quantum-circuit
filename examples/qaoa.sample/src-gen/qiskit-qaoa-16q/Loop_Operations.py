#Loop Operations
from qiskit import QuantumCircuit, ClassicalRegister, QuantumRegister
from qiskit.circuit import Gate
import numpy as np
from numpy.random import choice, random as rand, randint

import Composite_Gates
import Measurements
import Elementary_Gates
import Loop_Operations

class LoopOperation:
    def __init__(self):
        self.type="Loop_Operation"

    #current version: control- and target-qubits for all gates given by loop_*quibts
    @staticmethod
    def simple_loop(p,gates,target_qubits,control_qubits=None, overall_control_qubits=None, inverse=False):
        if not isinstance(gates, list):
            gates=[gates]
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(max(target_qubits+control_qubits)+1)
        for i in range(p):
            for gate in gates:
                if isinstance(gate[0],QuantumCircuit):
                    circ=gate[0]
                    for j in range(len(control_qubits)):
                        circ=circ.control
                    if control_qubits!=None:
                        qc.compose(circ, control_qubits+target_qubits)
                    if control_qubits==None:
                        qc.compose(circ, target_qubits)
                else:
                    gate1=gate[0](*gate[1],**gate[2], control_qubits=control_qubits)
                    if control_qubits!=None:
                        qc.append(gate1, control_qubits+target_qubits)
                    if control_qubits==None:
                        qc.append(gate1, target_qubits)

        sl_gate=qc.to_instruction()
        sl_gate.label="StaticLoop"
        if inverse==True:
            sl_gate=sl_gate.inverse()
        if overall_control_qubits!=None:
            for i in range(len(overall_control_qubits)):
                sl_gate=sl_gate.control()
        return sl_gate

    @classmethod
    def Power_2_loop(self,gate, gate_args: list, gate_kwargs: dict, target_qubits, control_qubits, increment_c=True, increment_t=True,  overall_control_qubits=None, inverse=False):
        #different meaning of increment_t here!!, is not a Boolean
        qc=QuantumCircuit(max(target_qubits+control_qubits)+1)
        if (increment_t==True):
            reps=1
        elif increment_t==False:
            reps=2**(len(control_qubits)-1)
        if increment_c==False:
            control_qubits.reverse()

        for i in (control_qubits):
            if (increment_t==None):
                #print(gate_params)
                gate1=gate(*gate_args, **gate_kwargs, control_qubits=[i])
                qc.append(gate1,[i]+target_qubits)
            else:
                #print(gate_params)
                #import pdb;pdb.set_trace()
                #gate1=gate(*gate_args, control_qubits=[i])
                sl_gate=self.simple_loop(reps,[(gate,gate_args,gate_kwargs)],target_qubits,[i])
                qc.append(sl_gate,qc.qubits)
            if increment_t==True:
                reps*=2
            elif increment_t==False:
                reps=int(reps/2)
            else:
                continue

        ll_gate=qc.to_instruction()
        ll_gate.label="P2-Loop"
        if inverse==True:
            ll_gate=ll_gate.inverse()
        if overall_control_qubits!=None:
            for i in range(len(overall_control_qubits)):
                ll_gate=ll_gate.control()
        return ll_gate

    @staticmethod
    def general_loop(gate, gate_args: list, gate_kwargs: dict, target_qubits,control_qubits=None,f_tqubits=None,f_cqubits=None,iter_type_t=None,iter_type_c=None,increment_t=True,increment_c=True,
                 p=None, block_size_tq=1, block_size_cq=1, incr_block_tq=True, incr_block_cq=True, overall_control_qubits=None, inverse=False, incr_by=1):


        #function definitions for general loop
        def determine_p(iter_type_t, iter_type_c, block_size_tq, incr_by,flex_tq,flex_cq,p):
            if ((iter_type_t!=None) and (iter_type_c!=None)):
                if (iter_type_t=="change_block"):
                    p_t=int((len(flex_tq)-block_size_tq+1)/incr_by)
                elif iter_type_t=="shift":
                    p_t=int((len(flex_tq)-block_size_tq+1)/incr_by)
                if (iter_type_c=="change_block"):
                    p_c=int((len(flex_cq)-block_size_cq+1)/incr_by)
                elif iter_type_c=="shift":
                    p_c=int((len(flex_cq)-block_size_cq+1)/incr_by)
                p1=min(p_t,p_c)

            elif iter_type_t==None and iter_type_c!=None:
                if (iter_type_c=="change_block"):
                    p1=int((len(flex_cq)-block_size_cq+1)/incr_by)
                elif iter_type_c=="shift":
                    p1=int((len(flex_cq)-block_size_cq+1)/incr_by)

            elif iter_type_t!=None and iter_type_c==None:
                if (iter_type_t=="change_block"):
                    p1=int((len(flex_tq)-block_size_tq+1)/incr_by)
                elif iter_type_t=="shift":
                    p1=int((len(flex_tq)-block_size_tq+1)/incr_by)
            elif (iter_type_t==None) and (iter_type_c==None):
                if p==None:
                    print("Error: p has to be specified! It is recommended to use the 'Simple Loop' for this purpose.")
                    return
                else:
                    p1=p

            if p==None or p>p1:
                p=p1
                print("Warning: p determined based on available qubits for iterations!")

            print("Iterations:", p)
            return p


        def targetQubitsCHANGEBLOCK(incr_block_tq,increment_t,flex_tq,block_size_tq,f_tqubits):
            if incr_block_tq==True:
                    if increment_t==True:
                        flex_tq1=flex_tq[:block_size_tq+i]
                    else:
                        flex_tq1=flex_tq[len(flex_tq)-block_size_tq-i:]
            else:
                if increment_t==True:
                    flex_tq1=flex_tq[i:]
                else:
                    flex_tq1=flex_tq[:len(flex_tq)-i]

            target_qubits=flex_tq1+f_tqubits
            return target_qubits

        def controlQubitsCHANGEBLOCK(incr_block_cq,flex_cq,block_size_cq,increment_c,f_cqubits):
            if incr_block_cq==True:
                if increment_c==True:
                    flex_cq1=flex_cq[:block_size_cq+i]
                else:
                    flex_cq1=flex_cq[len(flex_cq)-block_size_cq-i:]
            else:
                if increment_c==True:
                    flex_cq1=flex_cq[i:]
                else:
                    flex_cq1=flex_cq[:len(flex_cq)-i]
            control_qubits=flex_cq1+f_cqubits
            return control_qubits

        def controlQubitsSHIFT(increment_c,flex_cq,block_size_cq,f_cqubits):
            if increment_c==True:
                c_qubits=flex_cq[i:block_size_cq+i]
            else:
                c_qubits=flex_cq[len(flex_cq)-block_size_cq-i:len(flex_cq)-i]
            control_qubits=c_qubits+f_cqubits
            return control_qubits

        def targetQubitsSHIFT(increment_t,flex_tq,block_size_tq,f_tqubits):
            if increment_t==True:
                t_qubits=flex_tq[i:block_size_tq+i]
            else:
                t_qubits=flex_tq[len(flex_tq)-block_size_tq-i:len(flex_tq)-i]
            target_qubits=t_qubits+f_tqubits
            return target_qubits

        #implementation of loop
        if control_qubits==None:
            control_qubits=[]
        if f_tqubits==None:
            f_tqubits=[]
        if f_cqubits==None:
            f_cqubits=[]

        qc=QuantumCircuit(max(target_qubits+control_qubits)+1)
        flex_tq = [ele for ele in target_qubits if ele not in f_tqubits]
        if len(flex_tq)==0:
            iter_type_t=None
        flex_cq = [ele for ele in control_qubits if ele not in f_cqubits]
        if len(flex_cq)==0:
            iter_type_c=None

        p=determine_p(iter_type_t, iter_type_c, block_size_tq, incr_by,flex_tq,flex_cq,p)

        for i in range(p):
            i*=incr_by
            if iter_type_t=="change_block":
                    target_qubits=targetQubitsCHANGEBLOCK(incr_block_tq,increment_t,flex_tq,block_size_tq,f_tqubits)
            elif iter_type_t=="shift":
                    target_qubits=targetQubitsSHIFT(increment_t,flex_tq,block_size_tq,f_tqubits)

            if iter_type_c=="change_block":
                control_qubits=controlQubitsCHANGEBLOCK(incr_block_cq,flex_cq,block_size_cq,increment_c,f_cqubits)
            elif iter_type_c=="shift":
                control_qubits=controlQubitsSHIFT(increment_c,flex_cq,block_size_cq,f_cqubits)



            gate_kwargs["size"]=len(target_qubits)
            #print(*gate_args)
            gate1=gate(*gate_args, **gate_kwargs, control_qubits=control_qubits)
            qc.append(gate1, control_qubits+target_qubits)

        gl_gate=qc.to_instruction()
        gl_gate.label="GeneralLoop"
        if inverse==True:
            gl_gate=gl_gate.inverse()
        if overall_control_qubits!=None:
            for i in range(len(overall_control_qubits)):
                gl_gate=gl_gate.control()
        return gl_gate
