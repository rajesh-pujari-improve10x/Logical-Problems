package com.improve10x.logicalproblems.hoursandminutesintoseconds;

public class HrsAndMinsToSecondsControllerImpl implements HrsAndMinsToSecondsController {
    @Override
    public int convertHrsAndMinsToSeconds(String hours, String minutes) throws Exception {
            int hrs = Integer.parseInt(hours);
            int mins = Integer.parseInt(minutes);
            int seconds = hrs * 60 * 60;
            int sec = mins * 60;
            return seconds + sec;
    }
}
