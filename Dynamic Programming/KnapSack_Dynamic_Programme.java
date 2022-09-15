package com.gecg;

public class KnapSack_Dynamic_Programme {

    public static int KanpSack(int value[] , int weight[] , int capacity)
    {
        int n = capacity+1;
        int profitDP[][] = new int[value.length+1][n];
        for (int i = 0; i <= value.length; i++) {
            for (int j = 0; j <= capacity; j++) {

                if (i==0 || j==0)
                {
                    profitDP[i][j] = 0;
                    continue;
                }

                if (j < weight[i-1])
                {
                    profitDP[i][j] = profitDP[i-1][j];
                }

                else
                {
                    profitDP[i][j] = Math.max(profitDP[i-1][j] , profitDP[i-1][j-weight[i-1]]+value[i-1]);
                }
            }

        }
            return profitDP[value.length][capacity];
    }
    public static void main(String[] args) {

        int value[] = {1,6,18,22,28};
        int weight[] = {1,2,5,6,7};
        int capacity = 11;

        System.out.println("Maximum profit can be gain is : " + KanpSack(value , weight , capacity));
    }
}
