package com.tistory.aljjabaegi.lamda.chapter1;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * java.util.function.Function<br />
 * 파라메터 타입과 리턴 타입을 설정하고 결과를 리턴하는 functional interface<br />
 *
 * @author GEONLEE
 * @since 2024-05-07
 */
public class Chapter1Function {
    public static void main(String[] args) {

        // parameter 가 1개일 경우
        Function<Integer, Integer> tenAdder = integer -> integer * 10;
        int result = tenAdder.apply(5);
        System.out.println(result);

        // parameter 가 2개일 경우
        BiFunction<Integer, Integer, Integer> adder = Integer::sum; // (x, y) -> x + y
        int biResult = adder.apply(10, 20);
        System.out.println(biResult);

        // parameter 가 3개일 경우
        TriFunction<Integer, Integer, Integer, Integer> triAdder = (x, y, z) -> x + y + z;
        int triResult = triAdder.apply(10, 20, 30);
        System.out.println(triResult);

    }
}
