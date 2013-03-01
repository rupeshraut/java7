package com.dev.java7.concurrency.adaptor;

/**
 * The Class TaskAdaptor.
 */
public abstract class TaskAdaptor {

	/** The task. */
	private final Task task;

	/**
	 * Instantiates a new task adaptor.
	 * 
	 * @param task
	 *            the task
	 */
	public TaskAdaptor(Task task) {
		super();
		this.task = task;
	}

	/**
	 * Perform.
	 */
	protected void perform() {
		task.perform();
	}

}
