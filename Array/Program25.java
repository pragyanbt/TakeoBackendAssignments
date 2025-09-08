package Array;

import java.util.Arrays;
import java.util.Collections;

class Program25 {
    public static void main(String[] args) {
        Integer[] arr = {10, 50, 30, 20, 40};
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

