package com.example.demo;

public class Euler2 {
    public int fibonacci(int bound) {

        int firstNum = 0;
        int secondNum = 1;
        int evenSum = 0;
        int num = firstNum + secondNum;
        while (num < bound) {
            firstNum = secondNum;
            secondNum = num;
            num = firstNum + secondNum;
            if (num % 2 == 0) {
                evenSum += num;
            }
        }
        return evenSum;
    }
}

