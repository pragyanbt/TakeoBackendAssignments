package Assignment2;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = inp.nextInt();
        System.out.println("Enter b:");
        int b = inp.nextInt();
        System.out.println("a&b = " + (a&b));
        System.out.println("a|b = " + (a|b));
        System.out.println("a^b = " + (a^b));
        System.out.println("~a = " + (~a));
        System.out.println("~b = " + (~b));
        System.out.println("a<<1 = " + (a<<1));
        System.out.println("a>>1 = " + (a>>1));
        System.out.println("b<<2 = " + (b<<2));
        System.out.println("b>>2 = " + (b>>2));
    }
}

//        OUTPUT
//        Enter a:
//        3
//        Enter b:
//        4
//        a&b = 0
//        a|b = 7
//        a^b = 7
//        ~a = -4
//        ~b = -5
//        a<<1 = 6
//        a>>1 = 1
//        b<<2 = 16
//        b>>2 = 1
