package com.kishore.anant.blind75.binary;

public class SumOfTwoIntegers {

    public static void main(String[] args) {

        SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();
        int result = sumOfTwoIntegers.getSum(-1,1);
        System.out.println(result);
    }

    public int getSum(int a, int b) {
        int carry = 0;
        while(b > 0){
            carry = a&b;
            a = a^b;
            b = carry<<1;
        }
        return a;
    }
}
