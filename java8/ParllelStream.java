package com.java8;

import java.util.stream.Stream;

public class ParllelStream {
    public static void main(String[] args) {
        System.out.println("Serial stream");
        Stream<Integer> ss= Stream.of(1,2,3,4);
        ss.forEach(n-> System.out.println(n+ "::"+Thread.currentThread()));

        //PARALLEL STREAM
        System.out.println("Parallel stream");
        Stream<Integer> ps= Stream.of(1,2,3,4);
        ps.parallel().forEach(n-> System.out.println(n+ "::"+Thread.currentThread()));

    }

}
