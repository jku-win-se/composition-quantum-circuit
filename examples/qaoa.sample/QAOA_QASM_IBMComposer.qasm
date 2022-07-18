OPENQASM 2.0;
include "qelib1.inc";
gate cost_unitary a, b, c, d {
  cx a, b;
  rz(6.1048818) b;
  cx a, b;
  cx a, c;
  rz(9.1573227) c;
  cx a, c;
  cx b, c;
  rz(6.1048818) c;
  cx b, c;
  cx a, d;
  rz(12.209764) d;
  cx a, d;
  cx b, d;
  rz(15.262204) d;
  cx b, d;
  cx c, d;
  rz(9.1573227) d;
  cx c, d;
  rz(3.0524409) a;
  rz(18.314645) b;
  rz(15.262204) c;
  rz(12.209764) d;
}
gate mixer_unitary a, b, c, d {
  rx(5.9744648) a;
  rx(5.9744648) b;
  rx(5.9744648) c;
  rx(5.9744648) d;
}

qreg q4[4];
creg c4[4];
h q4[0];
h q4[1];
h q4[2];
h q4[3];
cost_unitary q4[0], q4[1], q4[2], q4[3];
mixer_unitary q4[0], q4[1], q4[2], q4[3];
cost_unitary q4[0], q4[1], q4[2], q4[3];
mixer_unitary q4[0], q4[1], q4[2], q4[3];
measure q4[0] -> c4[0];
measure q4[1] -> c4[1];
measure q4[2] -> c4[2];
measure q4[3] -> c4[3];