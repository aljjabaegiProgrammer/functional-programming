package com.tistory.aljjabaegi.lamda.chapter3;

/**
 * @author GEONLEE
 * @since 2024-05-08
 */
@FunctionalInterface
public interface TriConsumer<T, U, V> {
    void accept(T t, U u, V v);
}
