package com.improve10x.logicalproblems.twomaketen;

public class TwoMakeTenControllerImpl implements TwoMakeTenController {
    @Override
    public boolean isMakeTen(String a, String b) throws Exception {
        int m = Integer.parseInt(a);
        int n = Integer.parseInt(b);
        boolean result = false;
        if (m == 10 || n == 10) {
            result = true;
        } else if (m + n == 10) {
            result = true;
        }
        return result;
    }
}
