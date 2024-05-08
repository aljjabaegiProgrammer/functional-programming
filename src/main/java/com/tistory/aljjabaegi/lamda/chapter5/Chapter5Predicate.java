package com.tistory.aljjabaegi.lamda.chapter5;

import java.util.function.Predicate;

/**
 * java.util.function.Predicate<br />
 * parameter type 을 설정하고 boolean 을 리턴하는 Functional interface<br />
 *
 * @author GEONLEE
 * @since 2024-05-08
 */
public class Chapter5Predicate {
    public static void main(String[] args) {
        Predicate<String> predicate = "GEONLEE"::equalsIgnoreCase; // (String name) -> "GEONLEE".equalsIgnoreCase(name)
        boolean isGeonlee = predicate.test("geonlee");
        System.out.println(isGeonlee);

        // 반대 조건
        boolean isNotGeonlee = predicate.negate().test("geonlee");
        System.out.println(isNotGeonlee);

        // and 조건
        Predicate<String> checkLee = predicate.and((text) -> text.contains("lee"));
        boolean isLee = checkLee.test("geonlee");
        System.out.println(isLee);

        // or 조건
        Predicate<String> checkGeon = predicate.or((text) -> text.contains("geon"));
        boolean isGeon = checkGeon.test("geonlee");
        System.out.println(isGeon);
    }
}
