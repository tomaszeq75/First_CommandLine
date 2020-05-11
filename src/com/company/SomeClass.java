package com.company;

public class SomeClass {
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
}
