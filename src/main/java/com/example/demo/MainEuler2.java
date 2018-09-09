package com.example.demo;

public class MainEuler2 {
    public static void main(String[] args) {

        Euler2 euler2 = new Euler2();
        int sum = euler2.fibonacci(4_000_000);
        System.out.println(sum);
    }
}
