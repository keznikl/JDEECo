package cz.cuni.mff.d3s.deeco.task;

import cz.cuni.mff.d3s.deeco.knowledge.TriggerListener;
import cz.cuni.mff.d3s.deeco.model.runtime.api.SchedulingSpecification;
import cz.cuni.mff.d3s.deeco.scheduler.Scheduler;

/**
 * 
 * @author Ilias Gerostathopoulos <iliasg@d3s.mff.cuni.cz>
 * @author Tomas Bures <bures@d3s.mff.cuni.cz>
 * 
 */
public abstract class Task {
	protected SchedulingSpecification schedulingSpecification;
	protected TriggerListener listener;
	protected Scheduler scheduler;
	
	public Task(SchedulingSpecification schedulingSpecification, Scheduler scheduler) {
		this.schedulingSpecification = schedulingSpecification;
		this.scheduler = scheduler;
	}
	
	public abstract void invoke();

	protected abstract void registerTriggers();
	protected abstract void unregisterTriggers();
	
	public void setTriggerListener(TriggerListener listener) {
		assert(listener != null);
		
		if (this.listener != null) {
			unsetTriggerListener();
		}
		
		this.listener = listener;
		registerTriggers();
	}
	
	public void unsetTriggerListener() {
		if (this.listener != null) {
			unregisterTriggers();			
			this.listener = null;
		}
	}
	
	public long getSchedulingPeriod() {
		return schedulingSpecification.getPeriod();
	}
}
