package com.improve10x.logicalproblems.twomaketen;

import junit.framework.TestCase;

public class TwoMakeTenControllerImplTest extends TestCase {

    public void testIsMakeTen() throws Exception {
        boolean expectedOutput = true;
        boolean actualOutput = new TwoMakeTenControllerImpl().isMakeTen("1", "9");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testIsMakeTen1() throws Exception {
        boolean expectedOutput = true;
        boolean actualOutput = new TwoMakeTenControllerImpl().isMakeTen("10", "9");
        assertEquals(expectedOutput, actualOutput);
    }
}