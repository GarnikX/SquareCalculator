package ru.netology.SquareCalculator;

public class MultiService {
    int counter = 0;

    public int sqrCalculate(int bottomBound, int upperBound) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottomBound && i * i <= upperBound) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
