package com.prac;

public class StringManipulation {

    public static void main(String[] args) {
        String spr = "The rains have started heres";
        String spr1 = "The rains Have started heres";

        System.out.println(spr.length());
        System.out.println(spr.charAt(5));
        System.out.println(spr.indexOf('s'));
        System.out.println(spr.indexOf('s',9));
        System.out.println(spr.indexOf('s',spr.indexOf('s')+3));
        System.out.println(spr.indexOf("have"));
        System.out.println(spr.indexOf("hello"));
        System.out.println(spr.equals(spr1));
        System.out.println(spr.equalsIgnoreCase(spr1));
        System.out.println(spr.substring(0,9));

        String s = "    trim now    ";
        System.out.println(s.trim());
        System.out.println(s.replace(" ",""));

        String date = "01-01-2017";
        System.out.println(date.replace("-","/"));

        //split
        String test = "Hello_World_Test_Selenium";
        String spl[] = test.split("_");
        for(int i =0;i<spl.length;i++) {
            System.out.println(spl[i]);
        }

        for(String val : spl) {
            System.out.println(val);
        }

        String s2 = "cares";
        System.out.println(s2.concat(s));

        String x = "hello";
        String y = "World";
        int a = 100;
        int b = 200;

        System.out.println(x+y);
        System.out.println(a+b);
        System.out.println(x+y+a+b);
        System.out.println(a+b+x+y);
        System.out.println(x+y+(a+b));
    }
}
