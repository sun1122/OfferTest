package com.zzu.offer;

public class RectCoverTest {
    public static void main(String[] args) {
        RectCoverTest  rectCoverTest = new  RectCoverTest();

        System.out.println(rectCoverTest.RectCover2(4));
    }
    public int RectCover(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if(target == 2){
            return 2;
        }
        return RectCover(target - 1) + RectCover(target - 2);
    }

    public int RectCover2(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if(target == 2){
            return 2;
        }
        int one = 1;
        int two = 2;
        int fibN = 0;
        for (int i = 3; i <= target; i++) {
            fibN = one + two;
            one = two;
            two = fibN;

        }
        return fibN;
    }
}
