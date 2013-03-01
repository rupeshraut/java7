package com.dev.java7.concurrency.adaptor;

/**
 * The Class TaskAdaptor.
 */
public class TaskAdaptor implements Runnable {

	/** The task. */
	private final Task task;

	/**
	 * Instantiates a new task adaptor.
	 * 
	 * @param inTask
	 *            the in task
	 */
	public TaskAdaptor(final Task inTask) {
		task = inTask;
	}

	/**
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		task.perform();
	}

}
