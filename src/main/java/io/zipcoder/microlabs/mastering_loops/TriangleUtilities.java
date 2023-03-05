package io.zipcoder.microlabs.mastering_loops;

import java.util.StringJoiner;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringJoiner s = new StringJoiner("");
        for(int i=1; i<numberOfRows; i++) {
            for (int j = 1; j<=i; j++) {
                s.add("*");
            }
            s.add("\n");
        }
        return s.toString();
    }

    public static String getRow(int numberOfStars) {
        StringJoiner s = new StringJoiner("");
        for (int i = 1; i<=numberOfStars; i++) {
            s.add("*");
        }
        return s.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
