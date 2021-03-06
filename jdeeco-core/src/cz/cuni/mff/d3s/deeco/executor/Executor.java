package cz.cuni.mff.d3s.deeco.executor;

import cz.cuni.mff.d3s.deeco.task.Task;

public interface Executor {
	void execute(Task task);
	void setExecutionListener(ExecutionListener listener);
}
