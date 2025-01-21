package com.sau.workshop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaProject01 {
    public static void main(String[] args) {
        int menu;
        Double width, length, bases, highs, radius;
        Double areaSquare, areaTriangle, areaCircle;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("   Shape Area Program by Me   ");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("1. Square Area ");
        System.out.println("2. Triangle Area ");
        System.out.println("3. Circle Area ");
        System.out.print(" Select menu : ");
        menu = sc.nextInt();
        System.out.println("++++++++++++++++++++++++++++++");

        switch (menu){
            case 1 :
                System.out.print("Input width : ");
                width = sc.nextDouble();
                System.out.print("Input length : ");
                length = sc.nextDouble();
                areaSquare = width * length;
                System.out.print("Area of Square is : " + areaSquare);
            case 2 :
                System.out.print("Input Highs : ");
                highs = sc.nextDouble();
                System.out.print("Input Bases : ");
                bases = sc.nextDouble();
                areaTriangle = bases * highs / 2 ;
                System.out.println("Area of Triangle is : " + areaTriangle);
            case 3 :
                System.out.println("Input radius : ");
                radius = sc.nextDouble();
                areaCircle = Math.PI * radius * radius ;
                System.out.println("Area of Circle is : " + areaCircle);
            default:
                System.out.println("++++++++++++++++++++++");
                System.out.println("      THX BYE BYE     ");
                System.out.println("++++++++++++++++++++++");
        }


    }
}
