package org.example;

public class Interval {
    public static boolean numberInInterval(int n) {
        for (int i = 25; i < 101; i++) {
            if (i == n) {
                return true;
            }

        }
        return false;
    }
}
