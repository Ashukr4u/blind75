package com.kishore.anant.interviewbit.dp.knapsack;

import java.util.ArrayList;
/*
https://www.interviewbit.com/problems/0-1-knapsack/
 */
public class ZeroOneKnapsack {

    public static void main(String[] args) {
        ZeroOneKnapsack zeroOneKnapsack = new ZeroOneKnapsack();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        A.add(60);
        A.add(100);
        A.add(120);

        B.add(10);
        B.add(20);
        B.add(30);
        int result = zeroOneKnapsack.solve(A, B, 50);
        System.out.println(result);
    }

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {

        int n = B.size();
        int[][] dp = new int[n+1][C+1];

        for(int i =1; i<=n;i++){
            for(int j =1; j<=C; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else{
                    if(B.get(i-1) > j){
                        dp[i][j] = dp[i-1][j];
                    }
                    else{
                        dp[i][j] = Math.max(dp[i-1][j-B.get(i-1)]+A.get(i-1),
                                dp[i-1][j]);
                    }
                }
            }
        }

        return dp[n][C];
    }
}
