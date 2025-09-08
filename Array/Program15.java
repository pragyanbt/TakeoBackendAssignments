package Array;

import java.util.Arrays;

class Program15 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        Arrays.sort(arr);
        System.out.println(k + " Smallest elements:");
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }
}

