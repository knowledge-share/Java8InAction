package com.java8.chap3;

import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;

/**
 * Created by pengt on 2017/7/25.
 */
public class Lambda {

    public void defindLambda(){
        Consumer<String> stringConsumer = (String s) -> System.out.println(s);
        Runnable tt = () -> System.out.println("tt");
        Function<String,Integer> func = (String s) -> s.length();
        DoubleSupplier doubleSupplier = () -> 50;
        Runnable runnable = () -> {};
        //()-> return "test";
    }

}
