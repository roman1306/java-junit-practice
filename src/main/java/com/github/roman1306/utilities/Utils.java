package com.github.roman1306.utilities;

public class Utils {

    public String concatenateWords(String prevWord, String nextWord) {
        if (prevWord == null && nextWord == null) {
            return null;
        }
        return prevWord + " " + nextWord;
    }

    public int computeFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
