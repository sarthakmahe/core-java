package com.java8;

import java.sql.SQLOutput;
import java.util.function.Predicate;

public class PredictateDemo {
/*
    //method without lambda
public boolean test(int i){
       if(i>10){
           return true;
       }else{
           return false;
       }
   }
*/
    public static void main(String[] args) {
       Predicate<Integer> p =i->i > 10;
        System.out.println(p.test(11));
    }
}
