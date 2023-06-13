package org.hw;

import java.io.IOException;

public class SumCalculator {
    public static int sum(int n) {
        if(n==0){
            throw new IllegalArgumentException("Result is zero. An exception occurred.");
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}