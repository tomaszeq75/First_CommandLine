package com.company;

public class SomeClass {
    public static String publicString = "";
    private String string;

    public SomeClass(String string) {
        this.string = string;
    }

    public String getString() {
        return string == null ? "" : string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public static void staticMethod(String string) {
        System.out.println(string);
    }
}
