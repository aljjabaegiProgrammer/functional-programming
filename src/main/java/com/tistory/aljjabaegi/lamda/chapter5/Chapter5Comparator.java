package com.tistory.aljjabaegi.lamda.chapter5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * java.util.Comparator
 *
 * @author GEONLEE
 * @since 2024-05-08
 */
public class Chapter5Comparator {
    public static void main(String[] args) {
        List<Integer> numberList = new java.util.ArrayList<>(List.of(1, 5, 2, 6, 7, 2, 3, 4));

        // 숫자 오름차순 정렬
        Comparator<Integer> ascComparator = Comparator.comparingInt(num -> num); //(num1, num2) -> num1 - num2;
        numberList.sort(ascComparator);
        System.out.println(numberList);

        // 숫자 내림차순 정렬
        Comparator<Integer> descComparator = (num1, num2) -> num2 - num1;
        numberList.sort(descComparator);
        System.out.println(numberList);

        // 객체 정렬
        List<User> users = new ArrayList<>();
        users.add(new User(1, "geonlee"));
        users.add(new User(3, "changhye"));
        users.add(new User(2, "sam"));

        // long type id acs 정렬
        Comparator<User> idAscComparator = Comparator.comparingLong(User::getId);
        users.sort(idAscComparator);
        System.out.println(users);

        // long type id desc 정렬
        Comparator<User> idDescComparator = (user1, user2) -> Math.toIntExact(user2.getId() - user1.getId());
        users.sort(idDescComparator);
        System.out.println(users);

        // String type name asc 정렬
        Comparator<User> nameAscComparator = Comparator.comparing(User::getName); //(user1, user2) -> user1.getName().compareTo(user2.getName());
        users.sort(nameAscComparator);
        System.out.println(users);

        // String type name desc 정렬
        Comparator<User> nameDescComparator = (user1, user2) -> user2.getName().compareTo(user1.getName());
        users.sort(nameDescComparator);
        System.out.println(users);
    }
}

class User {
    private long id;
    private String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}