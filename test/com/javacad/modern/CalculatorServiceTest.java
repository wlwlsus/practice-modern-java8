package com.javacad.modern;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cadqe13@gmail.com on 2022-04-23
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
public class CalculatorServiceTest {

	@Test
	public void testCalculateAddition() throws Exception {
		final Calculation calculation = Integer::sum;

		final int actual = calculation.calculate(1, 1);

		assertEquals(2, actual);
	}

	@Test
	public void testCalculateSubtraction() throws Exception {
		final Calculation calculation = new Subtraction();

		final int actual = calculation.calculate(1, 1);

		assertEquals(0, actual);
	}

	@Test
	public void testCalculateMultiplication() throws Exception {
		final Calculation calculation = new Multiplication();

		final int actual = calculation.calculate(1, 1);

		assertEquals(1, actual);
	}

	@Test
	public void testCalculateDivision() throws Exception {
		final Calculation calculation = new Division();

		final int actual = calculation.calculate(8, 4);

		assertEquals(2, actual);
	}
}