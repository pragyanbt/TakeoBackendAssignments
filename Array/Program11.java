package Array;

class Program11 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 5, 40};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        System.out.println("Second Largest = " + second);
    }
}

