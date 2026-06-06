package com.java8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {
        //stream creation
        //Approch 1
      Stream<Integer> stream1=Stream.of(1,2,3,4,5);
        ArrayList<String> names=new ArrayList<>();
        names.add("John");
        names.add("Jon");
        names.add("Johny");
        names.add("Joheny");
        names.add("Joeeny");
        System.out.println(stream1);
        //Approch 2
        Stream<String> stream2=names.stream();
        System.out.println(stream2);


    }
}
