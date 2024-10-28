package org.sample.day08;

public class Day08Java {

    public static void main(String[] args) {

    }

    public int max(int a, int b) {
        if(a > b) {
            return a;
        }
        return b;
    }

    public void repeat(String str, int num, boolean useNewLine) {
        for (int i = 0; i < num; i++) {
            if(useNewLine) {
                System.out.println(str);
            }else {
                System.out.print(str);
            }
        }
    }

    public void repeat(String str, int num) {
        repeat(str, num, true);
    }

    public void repeat(String str) {
        repeat(str, 3, true);
    }

    public void printAll(String...strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
