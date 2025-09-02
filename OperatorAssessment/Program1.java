package OperatorAssessment;

import java.util.Scanner;

//Assignment
public class Program1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter an integer a: ");
        int a = inp.nextInt();
        System.out.println("Enter an integer b: ");
        int b = inp.nextInt();


        //Addition
        int additionResult = a + b;
        System.out.println("Addition of a and b (a + b) equals " + additionResult);

        //Subtraction
        int subtractionResult = a - b;
        System.out.println("Subtraction of a and b (a - b) equals " + subtractionResult);

        //multiplication
        int multiplicationResult = a * b;
        System.out.println("Multiplication of a and b (ab) equals " + multiplicationResult);

        //Division
        int divisionResult = a / b;
        System.out.println("Division of a and b (a / b) equals " + divisionResult);

        //modulo
        int moduloResult = a % b;
        System.out.println("Modulo of a and b (a % b) equals " + moduloResult);

    }
}

//Output
//Enter an integer a:
//20
//Enter an integer b:
//10
//Addition of a and b (a + b) equals 30
//Subtraction of a and b (a - b) equals 10
//Multiplication of a and b (ab) equals 200
//Division of a and b (a / b) equals 2
//Modulo of a and b (a % b) equals 0
