package com.java8;

import java.util.Arrays;
import java.util.List;

public class MapStream2 {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("Ashok", "Anil", "Raju", "Rani", "John", "Akash", "Charles");
        // print name with its length which are starting with 'A' using Stream API
       name.stream()
               .filter(names->names.startsWith("A"))
               .mapToInt(names->names.length())
               .forEach(p-> System.out.println(p));


       name.stream()
               .filter(names->names.startsWith("A"))
               .map(names-> names + "-" +names.length())
               .forEach(names-> System.out.println(names));

    }
}
