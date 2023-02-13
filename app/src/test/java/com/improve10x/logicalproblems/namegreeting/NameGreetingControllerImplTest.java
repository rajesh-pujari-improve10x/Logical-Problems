package com.improve10x.logicalproblems.namegreeting;

import junit.framework.TestCase;

public class NameGreetingControllerImplTest extends TestCase {

    public void testStrNameGreeting() {
        String expectedOutput = "Hello 12345!";
        String actualOutput = new NameGreetingControllerImpl().strNameGreeting("12345");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testStrNameGreeting1() {
        String expectedOutput = "Hello Rajesh!";
        String actualOutput = new NameGreetingControllerImpl().strNameGreeting("Rajesh");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testStrNameGreeting2() {
        String expectedOutput = "Hello 123.45!";
        String actualOutput = new NameGreetingControllerImpl().strNameGreeting("123.45");
        assertEquals(expectedOutput, actualOutput);
    }
}