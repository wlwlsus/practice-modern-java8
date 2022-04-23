package com.javacad.modern;

/**
 * Created by cadqe13@gmail.com on 2022-04-23
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
public class OopAnotherExample {

	public static void main(String[] args) {
		final CalculatorService calculatorService =
						new CalculatorService(new Addition(), new Subtraction(), new Multiplication(), new Division());

		final int additionResult = calculatorService.add(11, 4);
		System.out.println(additionResult);

		final int subtractionResult = calculatorService.subtract(11, 1);
		System.out.println(subtractionResult);

		final int multiplicationResult = calculatorService.multiply(11, 2);
		System.out.println(multiplicationResult);

		final int divisionResult = calculatorService.divide(20, 4);
		System.out.println(divisionResult);


		final FpCalculatorService fpCalculatorService = new FpCalculatorService();
		final Calculation add = Integer::sum;
		final Calculation sub = (i1, i2) -> i1 - i2;
		final Calculation mul = (i1, i2) -> i1 * i2;
		final Calculation div = (i1, i2) -> i1 / i2;
		System.out.println(fpCalculatorService.calculate(add, 11, 2));
		System.out.println(fpCalculatorService.calculate(sub, 11, 2));
		System.out.println(fpCalculatorService.calculate(mul, 11, 2));
		System.out.println(fpCalculatorService.calculate(div, 11, 2));

	}
}

interface Calculation {
	int calculate(final int num1, final int num2);
}

class Addition implements Calculation {
	@Override
	public int calculate(final int num1, final int num2) {
		return num1 + num2;
	}
}

class Subtraction implements Calculation {
	@Override
	public int calculate(final int num1, final int num2) {
		return num1 - num2;
	}
}

class Multiplication implements Calculation {
	@Override
	public int calculate(final int num1, final int num2) {
		return num1 * num2;
	}
}

class Division implements Calculation {
	@Override
	public int calculate(final int num1, final int num2) {
		return num1 / num2;
	}
}

class CalculatorService {
	private final Calculation addition;
	private final Calculation subtraction;
	private final Calculation multiplication;
	private final Calculation division;

	public CalculatorService(final Calculation addition, final Calculation subtraction, final Calculation multiplication, final Calculation division) {
		this.addition = addition;
		this.subtraction = subtraction;
		this.multiplication = multiplication;
		this.division = division;
	}

	public int add(final int num1, final int num2) {
		if (num1 > 10 && num2 < num1) { // boilerplate code
			return addition.calculate(num1, num2);
		} else { // boilerplate code
			throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2); // boilerplate code
		} // boilerplate code
	}

	public int subtract(final int num1, final int num2) {
		if (num1 > 10 && num2 < num1) { // boilerplate code
			return subtraction.calculate(num1, num2);
		} else { // boilerplate code
			throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2); // boilerplate code
		} // boilerplate code
	}

	public int multiply(final int num1, final int num2) {
		if (num1 > 10 && num2 < num1) { // boilerplate code
			return multiplication.calculate(num1, num2);
		} else { // boilerplate code
			throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2); // boilerplate code
		} // boilerplate code
	}

	public int divide(final int num1, final int num2) {
		if (num1 > 10 && num2 < num1) { // boilerplate code
			return division.calculate(num1, num2);
		} else { // boilerplate code
			throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2); // boilerplate code
		} // boilerplate code
	}
}

class FpCalculatorService {
	public int calculate(final Calculation calculation, final int num1, final int num2) {
		if (num1 > 10 && num2 < num1) {
			return calculation.calculate(num1, num2);
		} else {
			throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
		}
	}
}