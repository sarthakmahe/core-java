package com.java8;


import java.util.stream.Stream;

public class MapStream3{
    public static void main(String[] args) {

       // Task : Print Emp Name with
        // Emp age whose salary
        // is >= 50,000 using Stream API.

        Employees e1 = new Employees("John", 35, 55000.00);
        Employees e2 = new Employees("David", 25, 45000.00);
        Employees e3 = new Employees("Buttler", 35, 35000.00);
        Employees e4 = new Employees("Steve", 45, 65000.00);

        Stream<Employees> stream = Stream.of(e1, e2, e3, e4);

      /*  stream.filter(e->e.salary>=50000)
                .map(e->e.name+"-"+e.age+"-"+e.salary)
                .forEach(e-> System.out.println(e));
*/
        stream.filter(e->e.salary>=50000)
                .forEach(e-> System.out.println(e.name+"-"+e.age));

    }
}

 class Employees {
    String name;
    int age;
    double salary;

     public Employees(String name,int age,double salary) {
         this.name = name;
         this.age=age;
         this.salary=salary;
     }
 }


