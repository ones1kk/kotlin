package org.sample.day06;

import java.util.List;

public class Day06Java {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        for (int i = 2; i >= 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i += 2) {
            System.out.println(i);
        }

        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }

    }
}
