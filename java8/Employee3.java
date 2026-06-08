package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee3 {

    int id;
    String name;
    double salary;
    String country;


    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", country='" + country + '\'' +
                '}';
    }

    public Employee3(int id, String name, double salary, String country) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.country = country;





    }

    public static void main(String[] args) {
        Employee3 e1 = new Employee3(1, "Robert", 26500.00,"china");
        Employee3 e2 = new Employee3(2, "Abraham", 46500.00,"India");
        Employee3 e3 = new Employee3(3, "Ching", 36500.00,"Uk");
        Employee3 e4 = new Employee3(4, "David", 16500.00,"Usa");
        Employee3 e5 = new Employee3(5, "Cathy", 25500.00,"India");


        List<Employee3> list = Arrays.asList(e1,e2,e3,e4,e5);
        Map<String, List<Employee3>> collect
                = list.stream()
                .collect(Collectors
                        .groupingBy(e -> e.country));


        System.out.println(collect);
    }
}