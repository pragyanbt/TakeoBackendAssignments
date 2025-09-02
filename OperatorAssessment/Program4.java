package OperatorAssessment;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = inp.nextInt();
        System.out.println("Enter b:");
        int b = inp.nextInt();
        System.out.println("a==b " + (a==b));
        System.out.println("a!=b " + (a!=b));
        System.out.println("a>b " + (a>b));
        System.out.println("a<b " + (a<b));
        System.out.println("a>=b " + (a>=b));
        System.out.println("a<=b " + (a<=b));
    }
}
//OUTPUT
//        Enter a:
//        4
//        Enter b:
//        5
//        a==b false
//        a!=b true
//        a>b false
//        a<b true
//        a>=b false
//        a<=b true