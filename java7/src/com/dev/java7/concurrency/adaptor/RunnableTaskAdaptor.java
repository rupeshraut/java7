package com.dev.java7.concurrency.adaptor;

/**
 * The Class TaskAdaptor.
 */
public class RunnableTaskAdaptor extends TaskAdaptor implements Runnable {

	/**
	 * Instantiates a new task adaptor.
	 * 
	 * @param inTask
	 *            the in task
	 */
	public RunnableTaskAdaptor(final Task inTask) {
		super(inTask);
	}

	/**
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		super.perform();
	}

}
