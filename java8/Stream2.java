package com.java8;

import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {

        // List<Integer> list=Arrays.asList(66,32,45,12,20);

      /*  for(Integer i:list){
            if(i>20){
                System.out.println(i);
            }
        }*/

        /*
        Stream<Integer> stream=list.stream();
        Stream<Integer> filter= stream.filter(i -> (i>20));
        filter.forEach(i-> System.out.println(i));
        */

        // list.stream().filter(i ->i>20).forEach(i-> System.out.println(i));

        // example 2
//        List<String> names=Arrays.asList("John","Anushka","Anupama", "Smith", "Ashok");
        //      names.stream().filter(p->p.startsWith("A")).forEach(p-> System.out.println(p));
        //example 3

        detailOfUsers u1 = new detailOfUsers("Anushka", 25);
        detailOfUsers u2 = new detailOfUsers("Smith", 30);
        detailOfUsers u3 = new detailOfUsers("Raju", 15);
        detailOfUsers u4 = new detailOfUsers("Rani", 10);
        detailOfUsers u5 = new detailOfUsers("Charles", 35);
        detailOfUsers u6 = new detailOfUsers("Ashok", 30);

        Stream<detailOfUsers> stream = Stream.of(u1, u2, u3, u4, u5, u6);
     //   stream.filter(u -> (u.age>18)).forEach(u-> System.out.println(u));
//        stream.filter(u->(u.age>=18 && u.name.startsWith("A"))).forEach(u-> System.out.println(u));

        stream.filter(u ->u.age>18)
                .filter(u->u.name.startsWith("A"))
                .forEach(u-> System.out.println(u));

    }
}
    class detailOfUsers {
        String name;
        int age;

        detailOfUsers(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


