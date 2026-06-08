package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapStream4 {
    public static void main(String[] args) {
        List<String> java= Arrays.asList("core java","advance java","springboot");
        List<String> ui=Arrays.asList("html", "css", "bs", "js");

        List<List<String>> courses = Arrays.asList(java, ui);

     //   courses.stream().forEach(c-> System.out.println(c));
        Stream<String> flatMap=courses.stream().flatMap(s->s.stream());
        flatMap.forEach(c-> System.out.println(c));


    }
}
