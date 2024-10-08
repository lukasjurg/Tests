package org.example;

public class Counter {
    public double digitAverage(int number) {
        int sum = 0;
        int count = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
            count++;
        }

        return (double) sum / count;
    }
}