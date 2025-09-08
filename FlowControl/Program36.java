package FlowControl;

class Program36 {
    public static void main(String[] args) {
        int num = 60;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.println(i);
                num /= i;
            }
        }
    }
}

