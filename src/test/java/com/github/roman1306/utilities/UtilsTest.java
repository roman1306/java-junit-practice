package com.github.roman1306.utilities;

import org.junit.jupiter.api.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    private static Utils utils;

    @BeforeAll
    static void setup() {
        utils = new Utils();
    }

    @Test
    void testConcatenateWords() {
        assertEquals("Hello world!", utils.concatenateWords("Hello", "world!"));
    }

    @Test
    void testConcatenateWordsNonLatin() {
        assertTrue(utils.concatenateWords("", "").matches("^[^a-zA-Z0-9]+$"));
    }

    @Test
    @Disabled
    @Timeout(4)
    void testConcatenateWordsWithTimeout() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertNotEquals(0, utils.computeFactorial(new Random().nextInt(5)));
    }

    @Test
    void testComputeFactorial() {
        assertEquals(24, utils.computeFactorial(4));
    }
}