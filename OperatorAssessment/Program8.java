package OperatorAssessment;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = inp.nextInt();
        System.out.println("Enter b:");
        int b = inp.nextInt();
        System.out.println("Enter c:");
        int c = inp.nextInt();


        boolean result = ((a+b)>c) && (b!=0);
        System.out.println("Result=" + result);
    }
}

//OUTPUT
//        Enter a:
//        1
//        Enter b:
//        2
//        Enter c:
//        1
//        Result=true
