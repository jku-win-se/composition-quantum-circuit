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
QuantumCounting.append(l_gate.Power_2_loop(gate=c_gate.grover, gate_args=[], gate_kwargs=dict(qubits=len(loop_tqubits)),target_qubits=loop_tqubits, control_qubits=loop_cqubits, increment_c=True, increment_t=True, overall_control_qubits=overall_control_qubits, inverse=False), target_qubits)

# Layer L3
target_qubits = [0,1,2,3]
loop_tqubits = [0,1]
loop_cqubits = [2,3]
overall_control_qubits = None
QuantumCounting.append(l_gate.general_loop(gate=e_gate.swap, gate_args=[], gate_kwargs={},target_qubits=loop_tqubits, control_qubits=loop_cqubits, f_tqubits=None, f_cqubits=None, iter_type_t='shift', iter_type_c='shift', increment_c=True, increment_t=True, p=None, block_size_tq=1, block_size_cq=1, incr_block_tq=True, incr_block_cq=True, overall_control_qubits=overall_control_qubits, inverse=False, incr_by=1), target_qubits)

# Layer L4
target_qubits = [0,1,2,3]
loop_tqubits = [0,1,2,3]
loop_cqubits = None
overall_control_qubits = None
QuantumCounting.append(l_gate.general_loop(gate=c_gate.qft_elements, gate_args=[], gate_kwargs={},target_qubits=loop_tqubits, control_qubits=loop_cqubits, f_tqubits=None, f_cqubits=None, iter_type_t='change_block', iter_type_c=None, increment_c=True, increment_t=True, p=None, block_size_tq=1, block_size_cq=1, incr_block_tq=True, incr_block_cq=True, overall_control_qubits=overall_control_qubits, inverse=False, incr_by=1), target_qubits)

# Layer L5
target_qubits = [0,1,2,3]
cbits = [0,1,2,3]
QuantumCounting.append(m_gate.measurement(target_qubits, cbits), target_qubits, cbits)
