package com.java8;

import java.util.StringJoiner;

public class stringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner("-");
        sj.add("sarthak");
        sj.add("maheshwari");
        sj.add("1a2r26");

        System.out.println(sj);

    StringJoiner sj2=new StringJoiner("-","(",")");
        sj2.add("sarthak");
        sj2.add("maheshwari");
        sj2.add("1a2r26");
        System.out.println(sj2);

    }
}
