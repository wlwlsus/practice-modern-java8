package com.javacad.modern.ch02_consumer;

import java.util.function.Consumer;

/**
 * Created by cadqe13@gmail.com on 2022-04-23
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
public class ConsumerExamples {

	public static void main(String[] args) {
		final Consumer<String> print = System.out::println;
		final Consumer<String> greetings = s -> System.out.println(s + " World");

		print.accept("jaja");
		greetings.accept("Hello");
		greetings.accept("CAD");
	}
}
