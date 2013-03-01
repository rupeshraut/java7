package com.dev.java7.concurrency.adaptor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
		final RunnableTaskAdaptor runnableTaskAdaptor = new RunnableTaskAdaptor(task);
		runnableTaskAdaptor.run();

		new Thread(runnableTaskAdaptor).start();
		
		final CallableAdaptor callableAdaptor = new CallableAdaptor(task);
		
		final ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.submit(callableAdaptor);

	}
}
