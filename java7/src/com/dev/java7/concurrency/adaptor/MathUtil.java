package com.dev.java7.concurrency.adaptor;

/**
 * The Enum MathUtil.
 */
public enum MathUtil {

	/** The instance. */
	SINGLETON;

	/**
	 * Adds the.
	 * 
	 * @param values
	 *            the values
	 * @return the int
	 */
	public int add(int... values) {
		int returnValue = 0;
		for (int intValue : values) {
			returnValue += intValue;
		}// for
		return returnValue;
	}// add()

	/**
	 * Multiply.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the int
	 */
	public int multiply(int a, int b) {
		return (a * b);
	}
	
}
