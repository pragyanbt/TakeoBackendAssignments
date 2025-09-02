package OperatorAssessment;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = inp.nextInt();
        String ans = (num%2==0) ? "Even" : "Odd";
        System.out.println("Number is " + ans);

    }
}

//OUTPUT
//        Enter num:
//        5
//        Number is Odd

//        Enter num:
//        6
//        Number is Even
