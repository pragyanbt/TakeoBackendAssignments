package FlowControl;

class Program7 {
    public static void main(String[] args) {
        int num = 12345, count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
