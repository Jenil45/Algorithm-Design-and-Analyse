package com.gecg;

import java.util.Arrays;
import java.util.Scanner;

public class MultiStageGraph {

    public static int[] minPath(int graph[][] , int n , int stage)
    {
        int cost[] = new int[n];
        int node[] = new int[n];
        int path[] = new int[n];

        cost[n-1] = 0;

        for (int i = n-2; i >= 1 ; i--) {
            int min = 99999;
            for (int j = i+1; j < n ; j++) {

                if (graph[i][j] != 0 && graph[i][j] + cost[j] < min)
                {
                    min = graph[i][j] + cost[j];
                    node[i] = j;
                }
            }
            cost[i] = min;
        }

        path[1] = 1;
        for (int i = 2; i <= stage; i++) {
            path[i] = node[path[i-1]];
        }
        return path;
    }

    public static void print(int[][] arr)
    {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many dimension matrix do you want to create ? " );
        int n = sc.nextInt();
        System.out.print("How many stages do you want to create ? " );
        int stage = sc.nextInt();
        int graph[][] = new int[n+1][n+1];
        System.out.println("Enter element of graph array : ");
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < n ; j++) {
                System.out.print("Enter element of " + i + " and " + j + " : ");
                graph[i][j] = sc.nextInt();
            }
        }

        int ans[] = minPath(graph , n , stage);
        System.out.println(Arrays.toString(ans));
    }
}
