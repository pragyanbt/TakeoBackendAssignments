package FlowControlPart2;

class Program18 {
    public static void main(String[] args) {
        int a = 5, b = 5, c = 5;
        if (a == b && b == c) {System.out.println("Equilateral");}
        else if (a == b || b == c || a == c) {System.out.println("Isosceles");}
        else {System.out.println("Scalene");}
    }
}

