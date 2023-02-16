package com.improve10x.logicalproblems.hoursandminutesintoseconds;

import junit.framework.TestCase;

public class HrsAndMinsToSecondsControllerImplTest extends TestCase {

    public void testConvertHrsAndMinsToSeconds() throws Exception {
        int expectedOutput = 7260;
        int actualOutput = new HrsAndMinsToSecondsControllerImpl().convertHrsAndMinsToSeconds("2", "1");
        assertEquals(expectedOutput, actualOutput);
    }
}