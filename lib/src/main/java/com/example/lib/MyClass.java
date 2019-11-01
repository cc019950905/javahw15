package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("請輸入時間(小時)");
        int h=sc.nextInt();
        System.out.println("請輸入時間(分鐘)");
        int m =sc.nextInt();
        if(h==7 && m>30){
            if(h<17){
                System.out.println("上課時間");
            }else{
                System.out.println("放學時間");
            }
        }if(h>7 && h<17){
            System.out.println("上課時間");
        }else{
            System.out.println("放學時間");
        }
    }
}
