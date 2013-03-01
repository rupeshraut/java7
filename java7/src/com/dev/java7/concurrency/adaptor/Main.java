package com.dev.java7.concurrency.adaptor;

/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		final Task task = new SomeTask();
		final TaskAdaptor taskAdaptor = new TaskAdaptor(task);
		taskAdaptor.run();

		new Thread(taskAdaptor).start();
		
		int value  = MathUtil.SINGLETON.add(10,20,30);
		System.out.println(value);
		value  = MathUtil.SINGLETON.multiply(20,30);
		System.out.println(value);
	}
}
