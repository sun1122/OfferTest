package com.zzu.offer301;

public class PowerTest {
    public static void main(String[] args) {

        PowerTest powerTest = new PowerTest();

        System.out.println(powerTest.Power(2.0, -2));
    }



    public double Power(double base, int exponent) {

        if (equal(base, 0.0) && exponent < 0) {
            return 0.0;
        }

        int absExponent = Math.abs(exponent);
        double result = powerWithExponent(base, absExponent);
        if (exponent < 0) {
            result = 1.0 / result;
        }
        return result;

    }

    double powerWithExponent(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        //右移运算代替除以二
        double result = powerWithExponent(base, exponent >> 1);
        result *= result;
        if ((exponent & 0x1) == 1) {//位与运算代替求余运算 %  判断奇偶
            result *= base;
        }

        return result;
    }

    /**
     * double类型判断是否为空
     *
     * @param num1
     * @param num2
     * @return true代表为空 false为不空
     */
    boolean equal(double num1, double num2) {
        if ((num1 - num2 > -0.0000001) && (num1 - num2 < 0.0000001)) {
            return true;
        } else {
            return false;
        }

    }

}
