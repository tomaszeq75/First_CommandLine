package com.company;

import java.io.FileOutputStream;
import java.time.*;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {



        int[] i;

        i = new int[]{1, 2, 3};
        char[] chars = {'a', 'b', 'c'};
        System.out.println(String.valueOf(chars));
        System.out.println(new String(chars));

        int[][] j = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        showOutput(i, j[0]);

        for (int[] j1 : j) {
            System.out.println(Arrays.toString(j1));
        }

        var a = 199999999;
        var b = 2;
        var c = "ttt";
        var k = a > b ? a : c;
        System.out.println("---");
        System.out.println(a + b);
        System.out.println(k);
        System.out.println(k.getClass().getName());
        k = "aaa";
        System.out.println(k);


        System.out.println(fun1() + fun2("a"));

        LocalTime godzina = LocalTime.now();
        System.out.println(godzina);

        SomeClass.staticMethod("");
        RegexForEmail regexForEmail = new RegexForEmail();
    }

    static String fun1() {
        String s = "aaa ";
        return fun2(s);
    }


    // TODO: 17.11.2020
    static String fun2(String s1) {
        return s1 += s1;
    }

    private static void showOutput(int[] i, int[] a1) {
        System.out.println("1. " + Arrays.toString(i));
        System.out.println("2. " + Arrays.toString(a1));
        System.out.println("3. " + i.hashCode());
    }

    // TODO: 17.11.2020 duuupcia


}
