package com.gecg;

import java.util.Scanner;

public class All_pair_Shortest_Path_Warshall {

    public static int[][] Warshall(int graph[][] , int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                    if (j == k)
                    {
                        graph[j][k] = 0;
                        continue;
                    }
                    if (graph[j][i] + graph[i][k] < graph[j][k])
                    {
                        graph[j][k] = graph[j][i] + graph[i][k];
                    }
                }
            }
        }
        return graph;
    }
    public static void print(int[][] arr,int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many dimension matrix do you want to create ? " );
        int n = sc.nextInt();

        int graph[][] = new int[n][n];
        System.out.println("Enter element of graph array : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print("Enter element of " + i + " and " + j + " : ");
                graph[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original graph : ");
        print(graph , n);
        System.out.println("Minimum distance between all pair of vertices : ");
        int ans[][] = Warshall(graph , n);
        print(ans , n);
    }
}
