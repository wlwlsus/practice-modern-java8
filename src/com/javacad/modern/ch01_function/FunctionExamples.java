package com.javacad.modern.ch01_function;

import java.util.function.Function;

/**
 * Created by cadqe13@gmail.com on 2022-04-23
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
public class FunctionExamples {
	public static void main(String[] args) {
		// Functional

		//같은 타입이면서 같은 값을 반환하는 것을 identity function이라 한다.
		Function<String, Integer> toInt = Integer::parseInt;

		final Integer number = toInt.apply("100");

		System.out.println(number);

		final Function<Integer, Integer> identity = Function.identity();
		final Function<Integer, Integer> identity2 = t -> t;
		System.out.println(identity.apply(999));
		System.out.println(identity2.apply(999));
	}
}
