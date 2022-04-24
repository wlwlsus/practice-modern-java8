package com.javacad.modern.ch04_supplier;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * Created by cadqe13@gmail.com on 2022-04-24
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
public class SupplierExamples {
	public static void main(String[] args) {
		final Supplier<String> helloSupplier = () -> "Hello";

		System.out.println(helloSupplier.get());

		long start = System.currentTimeMillis();
		printIfValidIndex(0, getVeryExpensiveValue());
		printIfValidIndex(-1, getVeryExpensiveValue());
		printIfValidIndex(-2, getVeryExpensiveValue());
		System.out.println("It took " + ((System.currentTimeMillis() - start) / 1000) + " seconds");


		System.out.println();
		System.out.println();

		long start2 = System.currentTimeMillis();
		printIfValidIndexSupplier(0, SupplierExamples::getVeryExpensiveValue);
		printIfValidIndexSupplier(-1, () -> getVeryExpensiveValue());
		printIfValidIndexSupplier(-2, () -> getVeryExpensiveValue());
		System.out.println("It took " + ((System.currentTimeMillis() - start2) / 1000) + " seconds");
	}

	private static String getVeryExpensiveValue() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Cad!";
	}

	// Supplier 는 즉시 호출하지 않고 .get() method 가 호출되면 그 시점에 리턴 값을 찾으러 간다.
	private static void printIfValidIndexSupplier(int number, Supplier<String> valueSupplier) {
		if (number >= 0) {
			System.out.println("The Supplier value is " + valueSupplier.get() + ".");
		} else {
			System.out.println("Invalid");
		}
	}

	private static void printIfValidIndex(int number, String value) {
		if (number >= 0) {
			System.out.println("The value is " + value + ".");
		} else {
			System.out.println("Invalid");
		}
	}
}
