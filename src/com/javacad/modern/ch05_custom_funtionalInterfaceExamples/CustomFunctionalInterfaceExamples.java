package com.javacad.modern.ch05_custom_funtionalInterfaceExamples;

/**
 * Created by cadqe13@gmail.com on 2022-04-24
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
public class CustomFunctionalInterfaceExamples {
	public static void main(String[] args) {

		println(1, 2, 3, (a, b, c) -> String.valueOf(a + b + c));
		println(2, 3, 4, (a, b, c) -> String.valueOf(a * b * c));

		println("Area is ", 3, 4, (a, b, c) -> a + (b * c));

	}

	private static <T1, T2, T3> void println(T1 t1, T2 t2, T3 t3, Function3<T1, T2, T3, String> function) {
		System.out.println(function.apply(t1, t2, t3));
	}

}

// 컴파일 타임에 Functional 인터페이스 임을 보장해주는 어노테이션
// 둘 이상의 메서드를 만들면 에러가 난다.
@FunctionalInterface
interface Function3<T1, T2, T3, R> {
	R apply(T1 t1, T2 t2, T3 t3);


}