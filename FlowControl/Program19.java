package FlowControl;

class Program19 {
    public static void main(String[] args) {
        int num = 1234;
        String s = String.valueOf(num);
        char[] arr = s.toCharArray();
        char t = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = t;
        System.out.println(new String(arr));
    }
}

