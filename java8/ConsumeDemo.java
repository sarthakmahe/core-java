package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumeDemo {
    public static void main(String[] args) {
       Consumer<String> consumer= (name)-> System.out.println(name+ ",Good evening");
      consumer.accept("sarthak");
      consumer.accept("abc");
      consumer.accept("john");

        List<Integer> numbers= Arrays.asList(10,20,30,40);

        //for loop
        //for each
        //iterator
        //list iterator

        numbers.forEach(i ->System.out.println(i));
      


    }
}
