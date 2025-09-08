package Array;

import java.util.Arrays;

class Program27 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] c = {5, 6};
        int[] temp;

        temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
        System.out.println("Array c: " + Arrays.toString(c));
    }
}

