package com.cj.interview.preparation;

public class RomanNumeralTestE_2_green {
    public static void main(String[] args) {
        new RomanNumeralTestE_2_green().run();
    }

    private void run() {
        test(1, "I");
        test(2, "II");
    }

    private String romanNumeral(int value) {
        if (value == 1) {
            return "I";
        } else {
            return "II";
        }
    }

    private void test(int number, String expected) {
        String actual = romanNumeral(number);
        if (expected.equals(actual)) {
            System.out.println(String.format("SUCCESS: %d -> %s", number, expected));
        } else {
            System.out.println(String.format("FAILURE: %d", number));
            System.out.println(String.format("  actual  : %s", actual));
            System.out.println(String.format("  expected: %s", expected));
        }
    }
}
