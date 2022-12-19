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
cr=ClassicalRegister(4)
QAOA = QuantumCircuit(qr,cr)
#Create objects for quantum operations
e_gate=Elementary_Gates.ElementaryGate()
c_gate=Composite_Gates.CompositeGate()
l_gate=Loop_Operations.LoopOperation()
m_gate=Measurements.MeasurementGate()

# Layer L1
target_qubits = [0,1,2,3]
QAOA.append(e_gate.hadamard(target_qubits), target_qubits)

# Layer L2
target_qubits = [0,1,2,3]
loop_tqubits=[0,1,2,3]
sl_gate=l_gate.simple_loop(2, [c_gate.cost_unitary([[1.0, 2.0, 3.0, 4.0, ], [6.0, 2.0, 5.0, ], [5.0, 3.0, ], [4.0, ], ],c_gate.mixer_unitary(QAOA.num_qubits)], loopTargetQubits)
QAOA.append(sl_gate,target_qubits)

# Layer L3
target_qubits = [0,1,2,3]
cbits=[0,1,2,3]
QAOA.append(m_gate.measurement(target_qubits,cbits), target_qubits, cbits)
