package quantum.circuit.qiskit.library;

import quantum.circuit.qiskit.api.QiskitLibrary;
import qucircuit.QuantumCircuit;

public class ElementaryGateUtils implements QiskitLibrary {

	@Override
	public String generateLibraryFile(QuantumCircuit quCircuit) {
		return """
# elementary Quantum Gates
from qiskit import QuantumCircuit, ClassicalRegister, QuantumRegister
from qiskit.circuit import Gate
import numpy as np
from numpy.random import choice, random as rand, randint

class ElementaryGate:
    def __init__(self):
        self.type="ElementaryGate"

    def rx_gate(self, size, theta=None, control_qubits=None, inverse=False):
        if theta==None:
            theta= 2 * np.pi * rand(1)[0]
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(size)
        for i in range(size):
            qc.rx(theta, i)
        gate = qc.to_gate()
        if inverse==True:
            gate=gate.inverse()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()

        return gate

    def rz_gate(self, size, theta=None, control_qubits=None, inverse=False):
        if theta==None:
            theta= 2 * np.pi * rand(1)[0]
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(size)
        for i in range(size):
            qc.rz(theta, i)
        gate = qc.to_gate()
        if inverse==True:
            gate=gate.inverse()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()

        return gate

    def ry_gate(self, size, theta=None, control_qubits=None, inverse=False):
        if theta==None:
            theta= 2 * np.pi * rand(1)[0]
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(size)
        for i in range(size):
            qc.ry(theta, i)
        gate = qc.to_gate()
        if inverse==True:
            gate=gate.inverse()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()

        return gate

    def hadamard(self, size, control_qubits=None,inverse=False):
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(size)
        for i in range(size):
            qc.h(i)
        gate = qc.to_gate()
        gate.label="Had"
        if inverse==True:
            gate=gate.inverse()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()

        return gate

    def x_gate(self, size, control_qubits=None,inverse=False):
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(size)
        for i in range(size):
            qc.x(i)
        gate = qc.to_gate()
        gate.label="X"
        if inverse==True:
            gate=gate.inverse()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()

        return gate

    def z_gate(self, size, control_qubits=None,inverse=False):
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(size)
        for i in range(size):
            qc.z(i)
        gate = qc.to_gate()
        gate.label="Z"
        if inverse==True:
            gate=gate.inverse()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()

        return gate

    def y_gate(self, size, control_qubits=None,inverse=False):
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(size)
        for i in range(size):
            qc.y(i)
        gate = qc.to_gate()
        gate.label="Y"
        if inverse==True:
            gate=gate.inverse()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()

        return gate

    def swap(self,size=None, control_qubits=None, inverse=False):
        qc=QuantumCircuit(2)
        qc.swap(0,1)
        swap=qc.to_gate()
        swap.label="Swap"
        if inverse==True:
            swap=swap.inverse()
        if control_qubits!=None:
            print("Note: The control quits are used as the second qubits in the swap operation!")
        return swap

    def p_gate(self,size,theta=None, control_qubits=None, inverse=False):
        if theta==None:
            theta=2*np.pi*rand(1)[0]
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(size)
        for i in range(size):
            qc.p(theta, i)
        gate = qc.to_gate()
        if inverse==True:
            gate=gate.inverse()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()
        return gate
				""";
	}
	

}
