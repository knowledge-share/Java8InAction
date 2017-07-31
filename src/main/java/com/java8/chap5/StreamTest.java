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
    }

}
