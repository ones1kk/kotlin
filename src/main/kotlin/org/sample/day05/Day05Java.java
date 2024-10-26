package org.sample.day05;

public class Day05Java {

    public static void main(String[] args) {

    }

    private void validateScoreIsNotNegative(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("score must not be negative");
        }
    }

    private void validateScoreIsNotNegativeNew(int score) {
        if (0 <= score && score <= 100) {
            throw new IllegalArgumentException("score must not be negative");
        }
    }

    private String getPassOrFail(int score) {
        // statement
        // 프로그램의 문장 하나의 값으로 도출되지 않는다
        if (score >= 50) {
            return "P";
        } else {
            return "F";
        }
    }

    private String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else {
            return "C";
        }
    }

    private String getGradeWithSwitch(int score) {
        switch (score / 10) {
            case 9:
                return "A";
            case 8:
                return "B";
            default:
                return "D";
        }
    }


}
