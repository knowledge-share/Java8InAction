package com.java8.chap3;

import java.util.function.*;

/**
 * Created by pengttyy on 2017/7/27.
 */
public class FunctionReference {

    public static void main(String[] args) {
        String str = "pengttyy";
        Function<String, Integer> function = String::length;//任意类型实例的方法引用

        //通过变量引用方法
        Supplier<Integer> supplier = str::length;
        BiPredicate<String, Integer> biPredicate = String::equals;

        //静态方法引用
        BiFunction<String, Integer, Integer> staticRef = Integer::valueOf;
        //方法引用的方法可以有多个参数
        Integer apply = staticRef.apply("AF", 16);
        System.out.println(apply);

        //构造方法引用
        IntConsumer intConsumer = Integer::new;

        //数组构造引用
        Function<Integer, String[]> aNew = String[]::new;

    }

}
