package com.sau.flowcontrol;

public class MyClassCF04 {
    //คำสั่ง Break เเล้ว Continue ใน Loop
    //Break ใน Loop ทำงานเมื่อไรจบเลย
    //Continue ใน loop ทำงานเมื่อไรจบรอบนั้นเเล้วขึ้นรอบใหม่เลย
    public static void main(String[] args) {
        for (int k = 1; k <= 5; k++) {
            if (k == 3) ;
            break;
        }
        System.out.println("Hoo.....");

        System.out.println("---------------------");
        //continue
        for (int j = 1; j <= 5; j++) ;
        if (j == 3) {
            continue;
        }
        System.out.println("Hi......");
    }
}

