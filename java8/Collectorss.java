package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Collectorss {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2(1, "Robert", 26500.00);
        Employee2 e2 = new Employee2(2, "Abraham", 46500.00);
        Employee2 e3 = new Employee2(3, "Ching", 36500.00);
        Employee2 e4 = new Employee2(4, "David", 16500.00);
        Employee2 e5 = new Employee2(5, "Cathy", 25500.00);

        List<Employee2> list = Arrays.asList(e1, e2, e3, e4, e5);

        Optional<Employee2> max = list.stream()
                .collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));

        System.out.println("Max Salary :: " + max.get().salary);

        Optional<Employee2> min = list.stream()
                .collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));

        System.out.println("Min Salary :: " + min.get().salary);

        Double avgSalary = list.stream()
                .collect(Collectors.averagingDouble(e -> e.salary));
        System.out.println(avgSalary);


    }
}

class Employee2 {
    int id;
    String name;
    double salary;



    public Employee2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;



    }
}
