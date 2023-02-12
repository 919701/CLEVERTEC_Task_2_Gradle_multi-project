package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.clevertec.Utils.isAllPositiveNumbers;

class UtilsTest {

    @Test
    void isAllPositiveNumbersTest() {
        assertTrue(isAllPositiveNumbers("75","13"));
    }
    @Test
    void isAllNegativeNumbersTest() {
        assertFalse(isAllPositiveNumbers("-6","13"));
    }
    @Test
    void isAllStringNumbersTest() {
        assertFalse(isAllPositiveNumbers("clever","13"));
    }
}