package com.tistory.aljjabaegi.lamda.chapter2;

import java.util.UUID;
import java.util.function.Supplier;

/**
 * java.util.function.Supplier<br />
 * return type 만 설정하고 결과를 리턴하는 Functional interface<br />
 *
 * @author GEONLEE
 * @since 2024-05-08
 */
public class Chapter2Supplier {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "aljjabaegi.tistory.com";
        String uri = supplier.get();
        System.out.println(uri);

        Supplier<UUID> uuidSupplier = UUID::randomUUID;
        UUID uuid = uuidSupplier.get();
        System.out.println(uuid);

        System.out.println("==========");
        printUUID(uuidSupplier, 5);
    }

    private static void printUUID(Supplier<UUID> uuidSupplier, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(uuidSupplier.get());
        }
    }
}
