package com.javacad.modern;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by cadqe13@gmail.com on 2022-04-23
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
public class FunctionalInterfaceExamples {

	//같은 타입이면서 같은 값을 반환하는 것을 identity function이라 한다.


	public static void main(String[] args) {

//		Function<String, Integer> toInt = new Function<String, Integer>() {
//			@Override
//			public Integer apply(String value) {
//				return Integer.parseInt(value);
//			}
//		};

		// Functional
		Function<String, Integer> toInt = Integer::parseInt;

		final Integer number = toInt.apply("100");

		System.out.println(number);

		final Function<Integer, Integer> identity = Function.identity();
		final Function<Integer, Integer> identity2 = t -> t;
		System.out.println(identity.apply(999));
		System.out.println(identity2.apply(999));


		final Consumer<String> print = System.out::println;
		final Consumer<String> greetings = s -> System.out.println(s + " World");

		print.accept("jaja");
		greetings.accept("Hello");
	}
}
