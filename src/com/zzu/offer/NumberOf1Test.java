package com.zzu.offer;

public class NumberOf1Test {
    public static void main(String[] args) {
       NumberOf1Test numberOf1Test = new  NumberOf1Test();
       int a = numberOf1Test.NumberOf1(9);
        System.out.println(a);
    }

    public int NumberOf1(int n) {

        //1的个数
        int count = 0;
        while( n != 0){
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }
}
