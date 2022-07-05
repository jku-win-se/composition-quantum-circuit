from qiskit import QuantumCircuit, ClassicalRegister, QuantumRegister
from qiskit.circuit import Gate
import numpy as np
#Import Library
import Composite_Gates
import Loop_Operations
import Measurements
import Elementary_Gates
#Create empty Quantum Circuit
qr1=QuantumRegister(4)
Generated-Qubo-Circuit = QuantumCircuit(qr1)#Create objects for quantum operations
e_gate=Elementary_Gates.ElementaryGate()
c_gate=Composite_Gates.CompositeGate()
l_gate=Loop_Operations.LoopOperation()
m_gate=Measurements.MeasurementGate()
target_qubits=[1]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[1]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[1]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[2]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[2]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[2]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[3]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[3]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[3]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[1]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[1]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[1]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[2]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[2]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[2]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[1]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[1]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[1]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[0]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[1]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[2]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
target_qubits=[3]
Generated-Qubo-Circuit.append(e_gate.hadamard(target_qubits), target_qubits)
