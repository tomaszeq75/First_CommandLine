package com.company;

import static org.junit.jupiter.api.Assertions.*;

class SomeClassTest {

    @org.junit.jupiter.api.BeforeEach

    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    boolean getString() {
        SomeClass someClass = new SomeClass("str");
        if (someClass.equals("sts")) {
            return true;
        } else return false;

    }

}