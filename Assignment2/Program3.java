package Assignment2;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = inp.nextInt();

        x += 5;
        System.out.println("x+=5 -> " + x);

        x -= 3;
        System.out.println("x-=3 -> " + x);

        x *= 2;
        System.out.println("x*=2 -> " + x);

        x /= 2;
        System.out.println("x/=2 -> " + x);

        x %= 3;
        System.out.println("x%=3 -> " + x);
    }
}

//OUTPUT
//        Enter x:
//        10
//        x+=5 -> 15
//        x-=3 -> 12
//        x*=2 -> 24
//        x/=2 -> 12
//        x%=3 -> 0
