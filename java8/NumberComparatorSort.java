package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumberComparatorSort {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(5);
        al.add(3);
        al.add(44);
        al.add(1);
        al.add(2);
        System.out.println("before sort::" +al);

        //Collections.sort(al,new NumberComparator());
       // Collections.sort(al,(i,j)->(i>j) ?-1:1);
        Collections.sort(al,(i,j)->i.compareTo(j));
        System.out.println("after sort::" +al);

    }
}
        class NumberComparator implements Comparator<Integer>{

            @Override
            public int compare(Integer i, Integer j) {
                if (i > j) {
                    return -1;
                } else if (i < j) {
                    return 1;
                }
                else{
                        return 0;
                }
            }
        }