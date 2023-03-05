package io.zipcoder.microlabs.mastering_loops;

import java.util.stream.IntStream;
import java.util.StringJoiner;
public class NumberUtilities {


    public static String getEvenNumbers(int start, int stop) {
        StringJoiner s = new StringJoiner("");
        for (int i = start; i <= stop; i++) {
            if (i % 2 != 0) {
                s.add(Integer.toString(i));
            }
        }
        return s.toString();
    }

    public static String getOddNumbers(int start, int stop) {
        StringJoiner s = new StringJoiner("");
        for (int i = start; i < stop; i++ ) {
                if (i % 2 == 0) {
                    s.add(Integer.toString(i));
                }
        }
        return s.toString();
    }

    public static String getSquareNumbers(int start, int stop, int step) {
       StringJoiner s = new StringJoiner("");
       int square = 0;
        for (int i = start; i < stop; i+=step) {
            square = (int) Math.pow(i,2);
            s.add(Integer.toString(square));
        }
        return s.toString();

    }



    public static String getRange(int stop) {
        StringJoiner s = new StringJoiner("");
        for(int i = 0; i<stop; i++) {
          s.add(Integer.toString(i));

        }
            return s.toString();
    }

    public static String getRange(int start, int stop) {
        StringJoiner s = new StringJoiner("");
        for(int i = start; i<stop; i++) {
            s.add(Integer.toString(i));

        }
        return s.toString();

    }


    public static String getRange(int start, int stop, int step) {
        StringJoiner s = new StringJoiner("");
        for(int i = start; i<stop; i+=step) {
            s.add(Integer.toString(i));

        }
        return s.toString();

    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringJoiner s = new StringJoiner("");
        int square = 0;
        for (int i = start; i < stop; i+=step) {
            square = (int) Math.pow(i,exponent);
            s.add(Integer.toString(square));
        }
        return s.toString();

    }

    public static void main(String[] args) {
        String evens = getEvenNumbers(5,20);
        System.out.println(evens);
    }
}
