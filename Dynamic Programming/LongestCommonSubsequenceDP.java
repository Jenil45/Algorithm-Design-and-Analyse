package com.gecg;

public class LongestCommonSubsequenceDP {
    public static int lcsDP(int m , int n , String a , String b)
    {
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m ; i++) {
            for (int j = 0; j <= n; j++) {

                if (i==0 || j==0)
                {
                    dp[i][j] = 0;
                    continue;
                }
                if (a.charAt(i-1) == b.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String a = "HOLLABOYZ";
        String b = "LIFEBOUY";

        System.out.println("Maximum length common subsequence is : " + lcsDP(a.length() , b.length() , a , b));
    }
}
