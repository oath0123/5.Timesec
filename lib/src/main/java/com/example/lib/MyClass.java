package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("TIME1:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(+num1 + "hr" + num2 + "min" + num3+ "sec");
        System.out.println("TIME2:");
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        System.out.println(+num4 + "hr" + num5 + "min" + num6+ "sec");
        int num7=num1*3600+num2*60+num3;
        int num8=num4*3600+num5*60+num6;
        int num9=num7-num8;
        if(num9<0){
            num9=num9*(-1);
            System.out.println(num9+"sec");
        }
    }
}
