package com.tistory.aljjabaegi.lamda.chapter1;

/**
 * 3개의 parameter type, 1개의 return type 인 Functional interface
 *
 * @author GEONLEE
 * @since 2024-05-08
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
