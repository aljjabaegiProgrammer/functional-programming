package com.tistory.aljjabaegi.lamda;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * java.util.function.Function<br />
 * 파라메터 타입과 리턴 타입을 받아 결과를 리턴하는 functional interface<br />
 *
 * @author GEONLEE
 * @since 2024-05-07
 */
public class chapter1Function {
    public static void main(String[] args) {
        Function<Integer, Integer> tenAdder = integer -> integer * 10;
        int result = tenAdder.apply(5);
        System.out.println(result);

        BiFunction<Integer, Integer, Integer> adder = Integer::sum;
        int result2 = adder.apply(10, 20);
        System.out.println(result2);
    }
}
