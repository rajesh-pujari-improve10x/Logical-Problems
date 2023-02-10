package com.improve10x.logicalproblems.minutestoseconds;

import junit.framework.TestCase;

public class MinsToSecondsControllerImplTest extends TestCase {

    public void testConvertMinsToSeconds() {
        int expectedOutput = 300;
        int actualOutput = new MinsToSecondsControllerImpl().convertMinsToSeconds("5");
        assertEquals(expectedOutput, actualOutput);
    }
}