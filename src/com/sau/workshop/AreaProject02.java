package com.sau.workshop;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.text.DecimalFormat;

public class AreaProject02 {
    public static void main(String[] args)throws IOException {
        Double width, length, bases, highs, radius;
        Double areaSquare, areaTriangle, areaCircle;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader menu = new BufferedReader(input);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("   Shape Area Program by Me   ");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("1. Square Area ");
        System.out.println("2. Triangle Area ");
        System.out.println("3. Circle Area ");
        System.out.print(" Select menu : ");

        int choice;
        try {
            choice = Integer.parseInt(menu.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number between 1 and 3.");
            return;
        }

        switch (menu){
            case 1:
                System.out.print("Input width : ");
                width = Double.parseDouble(menu.readLine());
                System.out.print("Input length : ");
                length = Double.parseDouble(menu.readLine());
                areaSquare = width * length;
                System.out.print("Area of Square is : " + areaSquare);
                break;
            case 2:
                System.out.print("Input Highs : ");
                highs = Double.parseDouble(menu.readLine());
                System.out.print("Input Bases : ");
                bases = Double.parseDouble(menu.readLine());
                areaTriangle = bases * highs / 2 ;
                System.out.println("Area of Triangle is : " + areaTriangle);
                break;
            case 3:
                System.out.println("Input radius : ");
                radius = Double.parseDouble(menu.readLine());
                areaCircle = Math.PI * radius * radius ;
                System.out.println("Area of Circle is : " + areaCircle);
                break;
            default:
                System.out.println("++++++++++++++++++++++");
                System.out.println("      THX BYE BYE     ");
                System.out.println("++++++++++++++++++++++");
        }
    }
}
