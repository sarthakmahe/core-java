package com.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctioDemo {
    public static void main(String[] args) {
        Function<String,Integer> f =(name) -> name.length();
        System.out.println(f.apply("ashokit"));
        System.out.println(f.apply("hyd"));
        System.out.println(f.apply("sratthak"));

       BiFunction<Integer,Integer,Integer> f2=(a, b) -> a+b;
        System.out.println(f2.apply(10,20));

    }
}
