from qiskit import QuantumCircuit, ClassicalRegister, QuantumRegister
from qiskit.circuit import Gate
import numpy as np

#Import Library
import Composite_Gates
import Loop_Operations
import Measurements
import Elementary_Gates


#Create empty Quantum Circuit
qr = QuantumRegister(4)
qr1 = QuantumRegister(4)
cr = ClassicalRegister(4)
QuantumCounting = QuantumCircuit(qr,qr1,cr)

#Create objects for quantum operations
e_gate=Elementary_Gates.ElementaryGate()
c_gate=Composite_Gates.CompositeGate()
l_gate=Loop_Operations.LoopOperation()
m_gate=Measurements.MeasurementGate()

# Layer L1
target_qubits = [0,1,2,3,4,5,6,7]
QuantumCounting.append(e_gate.hadamard(size=len(target_qubits), control_qubits=None, inverse=False), target_qubits)

# Layer L2
target_qubits = [0,1,2,3,4,5,6,7]
loop_tqubits = [4,5,6,7]
loop_cqubits = [0,1,2,3]
overall_control_qubits = None
QuantumCounting.append(l_gate.Power_2_loop(gate=c_gate.grover4, gate_args=[], gate_kwargs={},target_qubits=loop_tqubits, control_qubits=loop_cqubits, increment_c=True, increment_t=True, overall_control_qubits=overall_control_qubits, inverse=False), target_qubits)

# Layer L3
target_qubits = [0,1,2,3]
QuantumCounting.append(c_gate.qft(size=len(target_qubits), control_qubits=None, inverse=True), target_qubits)

# Layer L4
target_qubits = [0,1,2,3]
cbits = [0,1,2,3]
QuantumCounting.append(m_gate.measurement(target_qubits, cbits), target_qubits, cbits)
