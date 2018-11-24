package com.zzu.offer;

public class FibonacciTest2 {
    public int Fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int one = 1;
        int two = 0;
        int fibN = 0;
        for (int i = 2; i <= n; i++) {
            fibN = one + two;
            two = one;
            one = fibN;

        }
        return fibN;
    }
}
