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
    void testConcatenateWordsCheckNoNull() {
        assertNotNull(utils.concatenateWords("Hello", "world!"));
    }

    @Test
    void testConcatenateWordsCheckNull() {
        assertNull(utils.concatenateWords(null, null));
    }

    @Test
    void testConcatenateWordsCheckEmptyString() {
        assertTrue(utils.concatenateWords("", "").trim().isEmpty());
    }

    @Test
    void testConcatenateWordsCheckNoEmptyString() {
        assertFalse(utils.concatenateWords("Hello", "world!").isEmpty());
    }

    @Test
    void testConcatenateWordsCheckNonLatin() {
        assertFalse(utils.concatenateWords("Привет", "мир").matches("^[a-zA-Z\\s]+$"));
    }

    @Test
    @Disabled
    @Timeout(4)
    void testConcatenateWordsWithTimeout() throws InterruptedException {

        TimeUnit.SECONDS.sleep(5);

        assertNotEquals(0, utils.computeFactorial(new Random().nextInt(5)));
    }

    @Test
    void testComputeFactorial() {
        assertEquals(24, utils.computeFactorial(4));
    }
}