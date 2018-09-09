package com.example.demo;

public class Euler1 {

    public int calc(int border) {
        int sum = 0;
        for (int i = 0; i < border; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

