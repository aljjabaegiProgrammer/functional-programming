package com.tistory.aljjabaegi.lamda.chapter4;

import java.util.function.Supplier;

/**
 * java.util.function.Supplier<br />
 * parameter 가 없고 return type 만 설정하는 Functional interface<br />
 *
 * @author GEONLEE
 * @since 2024-05-08
 */
public class Chapter4Supplier {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "aljjabaegi.tistory.com";
        String text = supplier.get();
        System.out.println(text);
    }
}
