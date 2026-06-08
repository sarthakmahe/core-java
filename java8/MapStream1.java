package com.java8;

import java.util.Arrays;
import java.util.List;

public class MapStream1 {
    public static void main(String[] args) {
      List<String> names= Arrays.asList("INDIA","USA","UK","JAPAN");

      /*normal way
        for(String name:names){
            System.out.println(name.toLowerCase());
        }*/

      names.stream()
                  .map(name->name.toLowerCase())
                   .forEach(n-> System.out.println(n));


        //map to int function
        names.stream()
                .mapToInt(name->name.length())
                .forEach(n-> System.out.println(n));



    }
}
