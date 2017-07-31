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

        //映射
        List<Integer> integers = list.stream().map(String::length).collect(toList());
        System.out.println(integers.toString());

        //流的扁平化1
        String [] words = new String[]{"hello","world"};
        List<String[]> wordList = Arrays.stream(words).map(w -> w.split("")).distinct().collect(toList());
        wordList.forEach(System.out::println);

        //流的扁平化2
        List<String> strings = Arrays.stream(words).map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(toList());
        strings.forEach(System.out::println);

    }

}
