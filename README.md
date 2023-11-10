# Composition-based Quantum Circuit Design (CoQuaDe) 

Wiki Page
  - https://github.com/jku-win-se/composition-quantum-circuit/wiki

This repository contains the meta-models for the Composition of Quantum Circuits
  - Quantum Circuit Meta-model: bundles\quantum.circuit.mm\model\QuCircuit.ecore
  - Library Meta-model: bundles\quantum.operation.library.mm\model\quantumOpe.ecore

In addition, we put two examples of implemented Quantum Circuits including the generated code in:
  - Quantum Counting: examples/quantum.counting.sample/
  - QAOA: qaoa.sample/

Instructions

Install Eclipse Modelling Tools 
  -https://www.eclipse.org/downloads/packages/release/2021-12/r/eclipse-modeling-tools

Steps
1. Open a workspace and import all the projects. Then, you may see both ecores
2. In order to see the models you have to open a runtime configuration and import the project within the sample folder. Then, you may visualize in a tree editor the grover search and the library of quantum operations 
