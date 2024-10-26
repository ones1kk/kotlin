package org.sample.day04;

import org.jetbrains.annotations.NotNull;

public class Day04Java {

    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(2_000);
        JavaMoney money2 = new JavaMoney(1_000);

        if (money1.compareTo(money2) > 0) {
            System.out.println("money1이 Money2보다 금액이 큽니다");
        }

        JavaMoney pulsed = money1.plus(money2);
        System.out.println(pulsed);
    }

    static class JavaMoney implements Comparable<JavaMoney> {

        private final long amount;

        public JavaMoney(long amount) {
            this.amount = amount;
        }

        public JavaMoney plus(JavaMoney other) {
            return new JavaMoney(this.amount + other.amount);
        }

        @Override
        public int compareTo(@NotNull JavaMoney o) {
            return Long.compare(this.amount, o.amount);
        }

        @Override
        public String toString() {
            return String.valueOf(amount);
        }
    }
}
