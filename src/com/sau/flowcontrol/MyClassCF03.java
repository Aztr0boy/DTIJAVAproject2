package com.sau.flowcontrol;

public class MyClassCF03 {
    //กลุ่มที่2 Loop(While , do-while , for)
    public static void main(String[] args) {
        //while
        int i = 1;
        while (i <= 5) {
            System.out.println("Hi...");
            i = 1 + 1; //i ++ หรือ i+1 หรือ i+=1
        }
        System.out.println("---------------------------");
        //do-while
        int j = 1;
        do {
            System.out.println("Ho Ho Ho");
            j = j + 1;
        } while (j <= 5);

        System.out.println("---------------------------");
        for( int k = 1 ; k >= 5; k = k + 1 ){
            System.out.println("Hoo......");

        }

    }
}
