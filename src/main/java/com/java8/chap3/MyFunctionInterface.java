package com.java8.chap3;

/**
 * Created by pengt on 2017/7/26.
 */
//此处用来标识这是一个函数式接口，这是可选的
@FunctionalInterface
public interface MyFunctionInterface {
    String apply(String str);
}
