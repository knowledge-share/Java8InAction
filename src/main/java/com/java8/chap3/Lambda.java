package com.java8.chap3;

import java.util.function.*;

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

        //常用的函数式接口
        Predicate<String> predicate = (String s) -> s.length()>0;//单参数的条件判断
        Consumer<String> consumer = (String s) -> System.out.println(s);//消费者
        Function<String,Integer> function = (String s) -> Integer.parseInt(s);//转换
        Supplier<String> supplier = ()-> new String("test");//工厂
        UnaryOperator<String> unaryOperator = (String s)-> s+"test";//一元操作符
        BinaryOperator<String> binaryOperator = (String s,String s2) -> s+s2;//二元操作
        BiPredicate<String,Integer> biPredicate = (String s,Integer i) -> Integer.parseInt(s)>i;//两个条件的判断
        BiConsumer<String,String> biConsumer = (String s,String s2) -> System.out.println(s+s2);//两个参数的消费者
        BiFunction<String,String,String> biFunction = (String s,String s2) -> s+s2;//两个参数转换为一个返回值
        //各个类型分别有对应的原始特化类型

    }

}
