package com.javacad.modern.ch03_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by cadqe13@gmail.com on 2022-04-23
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
public class PredicateExamples {

	public static void main(String[] args) {

		Predicate<Integer> isPositive = i -> i > 0;

		System.out.println(isPositive.test(1));
		System.out.println(isPositive.test(0));
		System.out.println(isPositive.test(-1));

		final List<Integer> numbers = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);

		final List<Integer> positiveNumbers = new ArrayList<>();
		for (final Integer num : numbers) {
			if (isPositive.test(num)) {
				positiveNumbers.add(num);
			}
		}

		System.out.println(positiveNumbers);

		final Predicate<Integer> lessThan3 = i -> i < 3;
		final List<Integer> numbersLessThan3 = new ArrayList<>();
		for (final Integer num : numbers) {
			if (lessThan3.test(num)) {
				numbersLessThan3.add(num);
			}
		}
		System.out.println(numbersLessThan3);

		System.out.println(filter(numbers, isPositive));
		System.out.println(filter(numbers, lessThan3));
	}

	private static <T> List<T> filter(List<T> list, Predicate<T> filter) {
		List<T> result = new ArrayList<>();
		for (T input : list) {
			if (filter.test(input)) {
				result.add(input);
			}
		}
		return result;
	}
}
