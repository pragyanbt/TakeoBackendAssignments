package StaticAndNonStaticVariableAssignment;

public class Assignment1 {
    public static void main(String[] args) {
        Assignment1 obj = new Assignment1();
        System.out.println("Sum = " + obj.add(5, 7));

    }
    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
