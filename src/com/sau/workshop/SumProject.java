package com.sau.workshop;

import java.util.Scanner;

public class SumProject {
    public static void main(String[] args) {
        double num1, num2, total;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Number 1 :  ");
            num1 = sc.nextDouble();
            System.out.println("Enter Number 2 :  ");
            num2 = sc.nextDouble();
            total = num1 + num2;
            System.out.println(num1 + " " + num2 + " " + total);
            System.out.println("------------------------------");
        } while (total >= 500);
    }
}