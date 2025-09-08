package Array;

class Program5 {
    public static void main(String[] args) {
        int[] arr = {15, 8, 27, 4, 19};
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}

