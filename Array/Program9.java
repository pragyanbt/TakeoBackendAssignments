package Array;

class Program9 {
    public static void main(String[] args) {
        String[] arr1 = {"apple", "banana", "cherry"};
        String[] arr2 = {"banana", "cherry", "grape"};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println("Common: " + arr1[i]);
                }
            }
        }
    }
}

