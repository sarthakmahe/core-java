package com.java8;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
      //  com.String symbols="";
      Supplier<String> s= () ->{
          String otp="";
          for (int i = 0; i<=5; i++){
                otp=otp+ (int)(Math.random()*10);

            }
          return otp;
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());


    }
}
