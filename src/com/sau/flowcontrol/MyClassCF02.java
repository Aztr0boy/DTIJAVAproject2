package com.sau.flowcontrol;

import org.w3c.dom.ls.LSOutput;

public class MyClassCF02 {
    public static void main(String[] args) {
        //พิสุจน์หลายครั้ง : if-else-if , switch-case
        //if-else-if : ใช้ไดุ้ทุกรณี
        int score = 70;
        if (score > 80){
            System.out.println("Grade A ");
        }else if(score > 70){
            System.out.println("Grade B ");
        }else if(score > 60){
            System.out.println("Grade C ");
        } else if(score > 50) {
            System.out.println("Grade D ");
        } else{
            System.out.println("Grade F");
        }
        System.out.println("+++++++++++++++++++++++++++");

        //switch-case : ใช้พิสูจน์เฉพาะเท่าหันหรือไม่เท่ากัน เเละใช้ไม่ได้กับทศนิยม
        int busNumber = 84;
        switch ( busNumber ){
            case 80 :
                System.out.println("Go to Wat Pata");
                break;
            case 81 :
                System.out.println("Go to Siri Raj");
                break;
            case 84 :
                System.out.println("Go to Wat Rai Khing");
                break;
            case 123 :
                System.out.println("Go to Central Pinklao");
                break;
            default:
                System.out.println("Don't Have Data T_T");
        }
    }
}
