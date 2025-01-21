package com.sau.flowcontrol;

public class MyClassCF01 {
    //controlflow/Control Statement
    //กลุ่มที่1 Selection/Condition (IF, if-else, if-else-if, switch-case)
    public static void main(String[] args) {
        //พิสูจน์ครั้งเดียว จริงทำ เท็จไม่ทำ : if
        int a  = 50;
        if (a > 35){
            System.out.println("Hello : ");
        }
        System.out.println("++++++++++++++++++++++++++++");
        //พิสูจน์ครั้งเดียว จริงทำ เท็จทำ : if-else
        String d = "XYs";
        if (d.equals("SAU") ){
            System.out.println("Southeast Asia University");
        }else{
            System.out.println("Nuh Uhh....");
        }
    }
}
