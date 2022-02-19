package ru.netology.SquareCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiServiceTest {

    @Test
    void shouldSqrCalculate() {
        MultiService multiService = new MultiService();
        int bottomBound = 200;
        int upperBound = 300;
        int expected = 3;
        int actual = multiService.sqrCalculate(bottomBound, upperBound);
        assertEquals(expected, actual);
    }
}