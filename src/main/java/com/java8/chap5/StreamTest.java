package com.java8.chap5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by pengt on 2017/7/31.
 */
public class StreamTest {

    public static void main(String[] args) {
        //筛选
        List<String> list = new ArrayList<>(Arrays.asList("", "1", "a", "", "test"));
        List<String> emptys = list.stream()
                .filter(String::isEmpty)
                .collect(toList());

        //去重
        long count = list.stream().distinct().count();
        System.out.println(count);

        //截短流
        long count1 = list.stream().limit(2).count();
        System.out.println(count1);

        //跳过
        List<String> collect = list.stream().skip(2).collect(toList());
        collect.forEach(System.out::println);

    }

}
