package com.java8.chap3;

import java.util.function.Consumer;

/**
 * Created by pengt on 2017/7/25.
 */
public class Lambda {

    public void defindLambda(){
        Consumer<String> stringConsumer = (String s) -> System.out.println(s);
    }

}
