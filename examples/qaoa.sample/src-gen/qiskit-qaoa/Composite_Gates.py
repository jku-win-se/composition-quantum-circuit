#composite Gates
from qiskit import QuantumCircuit, ClassicalRegister, QuantumRegister
from qiskit.circuit import Gate
import numpy as np
from numpy.random import choice, random as rand, randint

import Composite_Gates
import Measurements
import Elementary_Gates
import Loop_Operations

class CompositeGate:
    def __init__(self):
        self.type="CompositeGate"

    def read_qasm(self,filename,control_qubits=None, inverse=False):
        qc=QuantumCircuit.from_qasm_file(filename)
        gate=qc.to_gate()
        if inverse==True:
                gate=gate.inverse()
        if control_qubits!=None:
            for i in range(len(control_qubits)):
                gate=gate.control()
        return gate

    def oracle(self, size=None, control_qubits=None, inverse=None):
        #size=len(target_qubits)
        oracle=Gate(name="oracle", num_qubits=size, params=[])
        if inverse==True:
            oracle=oracle.inverse()
        if control_qubits!=None:
            for i in range(len(control_qubits)):
                oracle=oracle.control()
        return oracle



    def amplitude_amplification(self, size=None, control_qubits=None, inverse=None):
        #size=len(target_qubits)
        qc=QuantumCircuit(size)
        for qubit in range(size):
            qc.h(qubit)
        for qubit in range(size):
            qc.x(qubit)
        qc.h(size-1)
        qc.mct(list(range(size-1)), size-1)
        qc.h(size-1)
        for qubit in range(size):
            qc.x(qubit)
        for qubit in range(size):
            qc.h(qubit)
        aa=qc.to_instruction()
        aa.label="Amplitude_Amplification"
        if inverse==True:
            aa=aa.inverse()
        if control_qubits!=None:
            for i in range(len(control_qubits)):
                aa=aa.control()
        return aa



    def cost_unitary(self,w, control_qubits=None, inverse=False):
        qc=QuantumCircuit(len(w))
        gamma=np.pi*rand(1)[0]
        #off-diagonal elements of matrix
        for i in range(len(w)):
            for j in range(i+1,len(w)):
                qc.cnot(i,j)
                qc.rz(2*gamma*w[i][j-i],j)
                qc.cnot(i,j)
        #diagonal elements of matrix
        qc.barrier()
        for i in range(len(w)):
            qc.rz(2*gamma*w[i][0],i)
        c_u=qc.to_instruction()
        c_u.label="Cost Unitary"
        if inverse==True:
            c_u=c_u.inverse()
        if control_qubits!=None:
            for i in range(len(control_qubits)):
                c_u=c_u.control()
        return c_u

    def cost_unitary_fixed(self):
        w=[[1,2,3,4], [6,2,5], [5,3], [4]]
        qc=QuantumCircuit(4)
        gamma=np.pi*rand(1)[0]
        #off-diagonal elements of matrix
        for i in range(4):
            for j in range(i+1,4):
                qc.cnot(i,j)
                qc.rz(2*gamma*w[i][j-i],j)
                qc.cnot(i,j)
        #diagonal elements of matrix
        qc.barrier()
        for i in range(len(w)):
            qc.rz(2*gamma*w[i][0],i)
        c_u=qc.to_instruction()
        c_u.label="Cost Unitary"
        return c_u


    def mixer_unitary(self,size=None, control_qubits=None, inverse=False):
        #size=len(target_qubits)
        qc=QuantumCircuit(size)
        beta=np.pi*rand(1)[0]
        for i in range(size):
            qc.rx(2*beta,i)
        m_u=qc.to_gate()
        m_u.label="Mixer Unitary"
        if inverse==True:
            m_u=m_u.inverse()
        if control_qubits!=None:
            for i in range(len(control_qubits)):
                m_u=m_u.control()
        return m_u

    def qaoa_unitary(self, control_qubits=None, inverse=False):
        #block from Circuit Generation (see QAOA_main)
        num_qubits=4
        qc1=QuantumCircuit(num_qubits)
        c_gate=Composite_Gates.CompositeGate()
        l_gate=Loop_Operations.LoopOperation()
        e_gate=Elementary_Gates.ElementaryGate()
        m_gate=Measurements.MeasurementGate()
        m_u=c_gate.mixer_unitary(num_qubits)
        c_u=c_gate.cost_unitary_fixed()
        target_qubits=[0,1,2,3] #for Cost Unitary
        qc1.append(c_u,target_qubits)
        target_qubits=[0,1,2,3] #for Mixer
        qc1.append(m_u,target_qubits)
        qaoa_unitary=qc1.to_instruction()
        if inverse==True:
            qaoa_unitary=qaoa_unitary.inverse()
        #additionally
        if control_qubits!=None:
            for i in range(len(control_qubits)):
                qaoa_unitary=qaoa_unitary.control()

        return qaoa_unitary

    def grover3(self,size=4, control_qubits=None, inverse=False):
        qc = QuantumCircuit(3)
        for q in range(3):
            qc.h(q)
        #oracle --> specifically for this use case
        qc.cz(0, 2)
        qc.cz(1, 2)
        #AA:
        for qubit in range(3):
            qc.h(qubit)
        for qubit in range(3):
            qc.x(qubit)
        qc.h(2)
        qc.mct(list(range(2)), 2)
        qc.h(2)
        for qubit in range(3):
            qc.x(qubit)
        for qubit in range(3):
            qc.h(qubit)
        grover = qc.to_gate()
        grover.name = "Grover"
        if inverse==True:
            grover=grover.inverse()
        if control_qubits!=None:
            for i in range(len(control_qubits)):
                grover=grover.control()
        return grover

    def grover4(self,size=4, control_qubits=None, inverse=False):
        qc = QuantumCircuit(4)
        # Oracle
        qc.h([2,3])
        qc.ccx(0,1,2)
        qc.h(2)
        qc.x(2)
        qc.ccx(0,2,3)
        qc.x(2)
        qc.h(3)
        qc.x([1,3])
        qc.h(2)
        qc.mct([0,1,3],2)
        qc.x([1,3])
        qc.h(2)
        # Diffuser
        qc.h(range(3))
        qc.x(range(3))
        qc.z(3)
        qc.mct([0,1,2],3)
        qc.x(range(3))
        qc.h(range(3))
        qc.z(3)
        grover=qc.to_gate()
        grover.label="Grover"
        if inverse==True:
            grover=grover.inverse()
        if control_qubits!=None:
            for i in range(len(control_qubits)):
                grover=grover.control()
        return grover

    def qft(self,size=None, control_qubits=None, inverse=False):
        #size=len(target_qubits)
        n = size
        circuit = QuantumCircuit(n)
        def swap_registers(circuit, n):
            for qubit in range(n//2):
                circuit.swap(qubit, n-qubit-1)
            return circuit
        def qft_rotations(circuit, n):
            if n == 0:
                return circuit
            n -= 1
            circuit.h(n)
            for qubit in range(n):
                circuit.cp(np.pi/2**(n-qubit), qubit, n)
            qft_rotations(circuit, n)

        qft_rotations(circuit, n)
        swap_registers(circuit, n)
        qft_gate = circuit.to_gate()
        qft_gate.label="QFT"
        if inverse==True:
            qft_gate=qft_gate.inverse()
            qft_gate.label="QFT_inv"
        if control_qubits!=None:
            for i in range(len(control_qubits)):
                qft_gate=qft_gate.control()
        return qft_gate

    def qft_elements(self,size=None, control_qubits=None, inverse=False):
        qc=QuantumCircuit(size)
        n=size
        for i in range(n-1):
            qc.cp(-np.pi/(2**(i+1)), n-2-i, n-1)
        qc.h(n-1)
        gate=qc.to_gate()
        gate.label="QFT_Rot"
        if inverse==True:
            gate=gate.inverse()
        if control_qubits!=None:
            for i in range(len(control_qubits)):
                gate=gate.control()
        return gate
