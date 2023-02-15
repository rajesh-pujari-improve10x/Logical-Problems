package com.improve10x.logicalproblems.minutestoseconds;

public class MinsToSecondsControllerImpl implements MinsToSecondsController {
    @Override
    public int convertMinsToSeconds(String minutes) {
        try {
            int mins = Integer.parseInt(minutes);
            int seconds = mins * 60;
            return seconds;
        } catch (Exception ex) {
            return -1;
        }
    }
}
