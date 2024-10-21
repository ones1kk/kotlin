package org.sample.day02;

public class Day02Java {

    public static void main(String[] args) {

    }

    public static boolean startsWithA1(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        return str.startsWith("A");
    }

    public static Boolean startsWithA2(String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith("A");
    }

    public static boolean startsWithA3(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("A");
    }

}
