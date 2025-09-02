package Assignment2;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter boolean x:");
        boolean x = inp.nextBoolean();
        System.out.println("Enter boolean y:");
        boolean y = inp.nextBoolean();
        System.out.println("x&&y=" + (x&&y));
        System.out.println("x||y=" + (x||y));
        System.out.println("!x=" + (!x));
        System.out.println("!y=" + (!y));
    }
}

//OUTPUT
//        Enter boolean x:
//        True
//        Enter boolean y:
//        False
//        x&&y=false
//        x||y=true
//        !x=false
//        !y=true