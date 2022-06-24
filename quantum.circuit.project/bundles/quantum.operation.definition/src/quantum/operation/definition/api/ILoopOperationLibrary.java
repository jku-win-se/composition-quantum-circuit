package quantum.operation.definition.api;

public interface ILoopOperationLibrary {
	
	public boolean allowsFixedControlQubits();
	public boolean allowsFixedTargetQubits();
	public boolean allowsControlQubitsIterationType();
	public boolean allowsTargetQubitsIterationType();
	public boolean allowsControlQubitsBlockSize();
	public boolean allowsTargetQubitsBlockSize();
	public boolean allowsIncrementControlQubits();
	public boolean allowsIncrementTargetQubits();
	public boolean allowsIteration();
	public boolean allowsMultipleOperations();
}
