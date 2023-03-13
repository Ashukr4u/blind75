package com.kishore.anant.blind75.binary;

public class HammingWeight {

    public static void main(String[] args) {
        HammingWeight hammingWeight = new HammingWeight();
        int result = hammingWeight.hammingWeight(-3);
        System.out.print(result);
    }

    public int hammingWeight(int n) {
        if(n<0){
            n = -n;
        }
        int bitsCount = 0;
        int count = 0;
        while (n > 0 && bitsCount < 32){
            count += n & 1;
            n = n >> 1;
            bitsCount++;
        }
        return count;
    }
}
