package org.sample.day01;

import java.util.Arrays;
import java.util.List;

public class Day01Java {

    public static void main(String[] args) {
        long number1 = 10L; // 가변변수
        final long number2 = 10L; // 불변변수

        Long number3 = 1_000L;


        final List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.add(3);


        Person person = new Person("JAVA");
    }
}
