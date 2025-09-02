package Assignment2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int n = inp.nextInt();

        System.out.println("Start n = " + n);
        System.out.println("Pre-increment (++n): " +  (++n));
        System.out.println("Now n becomes: " + n);


        System.out.println("Post-increment (n++): "+ (n++) );
        System.out.println("Now n becomes: " + n);


        System.out.println("Pre-decrement (--n): " + (--n));
        System.out.println("Now n becomes: " + n);

        System.out.println("Post-decrement (n--): " + (n--));
        System.out.println("Now n becomes: " + n);

    }
}

//OUTPUT
//        Enter integer n: 10
//        Start n = 10
//        Pre-increment (++n): 11
//        Now n becomes: 11
//        Post-increment (n++): 11
//        Now n becomes: 12
//        Pre-decrement (--n): 11
//        Now n becomes: 11
//        Post-decrement (n--): 11
//        Now n becomes: 10
