package com.gecg;

public class LongestCommonSubsequence {
    public static int lcsBetter(int m , int  n , String a , String b)
    {
        int dp[][] = new int[m+1][n+1];

        for (int i = 1; i <= m ; i++) {
            for (int j = 1 ; j <= n ; j++) {
                dp[i][j] = -1;
            }
        }

        return lcs(m , n , a , b , dp);
    }
    public static int lcs(int m , int n , String a , String b , int dp[][])
    {
        if (m==0 || n==0)
        {
            return 0;
        }

        if (dp[m][n] != -1)
        {
            return dp[m][n];
        }

        if (a.charAt(m-1) == b.charAt(n-1))
        {
            return dp[m][n] = 1+lcs(m-1 , n-1 , a,b , dp);
        }

        else
        {
            return dp[m][n] = Math.max(lcs(m-1,n,a,b,dp) , lcs(m,n-1,a,b,dp));
        }
    }
    public static void main(String[] args) {
        String a = "HOLLABOYZ";
        String b = "LIFEBOUY";

        System.out.println("Maximum length common subsequence is : " + lcsBetter(a.length() , b.length() , a , b));

    }
}
