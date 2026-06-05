package com.java8;

@FunctionalInterface
interface MyInterface2{
    public void m2();
}
public class MyApp2 {
        public static void main(String[] args) {
        MyInterface2 mit =() -> System.out.println("m2 method called");
        mit.m2();
    }
}
