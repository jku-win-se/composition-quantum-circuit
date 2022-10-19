from qiskit import QuantumCircuit, ClassicalRegister, QuantumRegister
from qiskit.circuit import Gate
import numpy as np
#Import Library
import Composite_Gates
import Loop_Operations
import Measurements
import Elementary_Gates
#Create empty Quantum Circuit
qr=QuantumRegister(4)
qr1=QuantumRegister(4)
cr=QuantumRegister(4)
QuantumCounting = QuantumCircuit(qr,qr1,cr)
#Create objects for quantum operations
e_gate=Elementary_Gates.ElementaryGate()
c_gate=Composite_Gates.CompositeGate()
l_gate=Loop_Operations.LoopOperation()
m_gate=Measurements.MeasurementGate()
target_qubits = [0,1,2,3,4,5,6,7]
QuantumCounting.append(e_gate.null(target_qubits), target_qubits)
loop_tqubits=[0,1,2,3]
loop_cqubits=[0,1,2,3]
QuantumCounting.append(l_gate.Power_2_loop(c_gate.grover4,loop_target_qubits,loop_control_qubits, increment_t=True), target_qubits)
loop_tqubits=[0,1]
loop_cqubits=[2,3]
loopGate=l_gate.general_loop(e_gate.swap, loop_tqubits, loop_cqubits, iter_type_t="shift", iter_type_c="shift", block_size_tq=1, block_size_cq=1, increment_t=False, increment_c=True) #definition of LoopOperation
QuantumCounting.append(loopGate, target_qubits) #append LoopOperation to Circuit
loop_tqubits=[0,1,2,3]
loopGate=l_gate.general_loop(c_gate.qft_elements, qft_loop_tqubits,iter_type_t="change_block", block_size_tq=1)
QuantumCounting.append(loopGate, target_qubits) #append LoopOperation to Circuit
cbits=[0,1,2,3]
QuantumCounting.append(m_gate.measurement(target_qubits,cbits), target_qubits, cbits)
