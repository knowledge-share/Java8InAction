package com.java8.chap2;

import lambdasinaction.chap2.FilteringApples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 行为参数化
 * Created by pengt on 2017/7/23.
 */
public class Main {
    public static void main(String[] args) {
        List<FilteringApples.Apple> inventory = Arrays.asList(new FilteringApples.Apple(80, "green"),
                new FilteringApples.Apple(155, "green"),
                new FilteringApples.Apple(120, "red"));
        Consumer<FilteringApples.Apple> appleConsumer = t -> System.out.println(t.getColor());
        inventory.forEach(appleConsumer.andThen(t -> System.out.println(t.getWeight())));
    }
}
