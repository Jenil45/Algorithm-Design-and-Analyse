package com.gecg;

import java.util.Scanner;

public class Exponential_Divide_and_Conquer {
    public static int Exponential(int base , int power)
    {
        if (power == 0)
        {
            return 1;
        }
        if (power%2 == 0)
        {
            return Exponential(base , power/2)*Exponential(base , power/2);
        }
        else
        {
            return base*Exponential(base,(power-1)/2)*Exponential(base , (power-1)/2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base : ");
        int base = sc.nextInt();

        System.out.print("Enter a power : ");
        int power = sc.nextInt();

        System.out.println("The "+ base + " raised to "+power+" = " + Exponential(base , power) );
    }
}
