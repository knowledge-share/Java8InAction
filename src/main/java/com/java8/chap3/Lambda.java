package com.java8.chap3;

import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntConsumer;

/**
 * Created by pengt on 2017/7/25.
 */
public class Lambda {

    public void defindLambda() {
        Consumer<String> stringConsumer = (String s) -> System.out.println(s);
        Runnable tt = () -> System.out.println("tt");
        Function<String, Integer> func = (String s) -> s.length();
        DoubleSupplier doubleSupplier = () -> 50;
        Runnable runnable = () -> {
        };
        //()-> return "test";
        DoubleSupplier doubleSupplier1 = () -> {
            return 10;
        };
        Runnable runnable1 = () -> {
        };

        //如Runnable函数式接口的函数描述符可以表示为“()-void”
        //Function的函数式接口的描述符可以表示为“(T)-R”

        //原始类型特化
        IntConsumer intConsumer = (int i) -> System.out.println(i);
    }

}
