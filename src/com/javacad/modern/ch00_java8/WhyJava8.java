package com.javacad.modern.ch00_java8;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * Created by cadqe13@gmail.com on 2022-04-23
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
public class WhyJava8 {
	public static void main(String[] args) {
		System.out.println("Start practice java8!!");

		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		final StringBuilder stringBuilder = new StringBuilder();

		//		for (Integer n : numbers) {
//
//			stringBuilder.append(n).append(" : ");
//		}

		final String separator = " : ";

		for (Integer number : numbers) {
			stringBuilder.append(number).append(separator);
		}
		final int stringLength = stringBuilder.length();
		if (stringLength > 0) {
			stringBuilder.delete(stringLength - separator.length(), stringLength);
		}
		System.out.println(stringBuilder);

		final String result = numbers.stream()
						.map(String::valueOf)
						.collect(joining(" : "));
		System.out.println(result);
	}
}
