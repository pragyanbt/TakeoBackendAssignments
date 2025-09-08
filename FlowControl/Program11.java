package FlowControl;

class Program11 {
    public static void main(String[] args) {
        int n = 50;
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) count++;
            }
            if (count == 0) System.out.println(i);
        }
    }
}

