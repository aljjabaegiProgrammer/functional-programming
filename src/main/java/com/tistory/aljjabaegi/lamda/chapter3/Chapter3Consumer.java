package com.tistory.aljjabaegi.lamda.chapter3;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * java.util.function.Consumer<br />
 * parameter type 만 설정하고 리턴이 없는 Functional interface<br />
 *
 * @author GEONLEE
 * @since 2024-05-08
 */
public class Chapter3Consumer {

    public static void main(String[] args) {
        // parameter 가 1개일 경우
        Consumer<String> consumer = System.out::println; //(String text) -> System.out.println(text);
        consumer.accept("aljjabaegi.tistory.com");

        // parameter 가 2개일 경우
        BiConsumer<String, String> biConsumer = (String text1, String text2) -> System.out.println(text1 + text2);
        biConsumer.accept("Geon", "Lee");

        TriConsumer<String, String, String> triConsumer =
                (String text1, String text2, String text3) -> System.out.println(text1 + text2 + text3);
        triConsumer.accept("Hi", "Geon", "Lee");
    }
}
