package com.dev.java7.concurrency.adaptor;

/**
 * The Class SomeTask.
 */
public class SomeTask implements Task {

	/**
	 * 
	 * @see concurrency.adaptor.Task#perform()
	 */
	@Override
	public void perform() {
		System.err.println("task complete");
	}

}
