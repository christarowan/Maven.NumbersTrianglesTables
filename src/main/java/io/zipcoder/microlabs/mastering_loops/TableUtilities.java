package io.zipcoder.microlabs.mastering_loops;

import java.util.StringJoiner;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringJoiner s = new StringJoiner("");
        int maxProduct = (int) Math.pow(tableSize,2);
        int maxDigits = String.valueOf(maxProduct).length();
        if (maxDigits < 3) {maxDigits = 3;}
        int padding = 0;
        int product = 0;
        for (int i = 1; i<=tableSize; i++) {
            for (int j = 1; j<=tableSize; j++) {
                product = i*j;
                padding = maxDigits - String.valueOf(product).length();
                for (int k = 0; k < padding; k++) {s.add(" ");}
                s.add(Integer.toString(product));
                s.add(" |");
            }
            s.add("\n");
        }
        return s.toString();
    }
}
