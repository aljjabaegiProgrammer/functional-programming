package com.tistory.aljjabaegi.lamda.chapter6;

import com.tistory.aljjabaegi.lamda.chapter6.record.UserResponse;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author GEONLEE
 * @since 2024-06-19
 */
public class Chapter6Stream {
    public static void main(String[] args) {
        List<String> list = List.of("geonlee", "changhye", "changsam", "changhye");
        //filter
        list = list.stream().filter(name -> name.contains("chang")).toList();
        System.out.println(list);

        //map
        int[] id = {0};
        List<UserResponse> userList = list.stream().map(name -> new UserResponse(id[0]++, name)).toList();
        System.out.println(userList);

        //flatMap
        list = userList.stream().flatMap(userResponse -> Stream.of(userResponse.userName())).toList();
        System.out.println(list);

        //distinct
        list = list.stream().distinct().toList();
        System.out.println(list);

        //allMatch
        boolean isAllChanghye = list.stream().allMatch("changhye"::equals);
        System.out.println(isAllChanghye);

        //anyMatch
        boolean isAnyChanghye = list.stream().anyMatch("changhye"::equals);
        System.out.println(isAnyChanghye);

    }
}
