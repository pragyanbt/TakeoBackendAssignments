package StaticAndNonStaticVariableAssignment;

public class StudentTask13 {
    String name;   // instance variable
    int m1, m2, m3; // instance variables for marks

    void calculateAverage() {
        int total = m1 + m2 + m3;       // local variable
        double average = total / 3.0;   // local variable
        System.out.println("Average Marks of " + name + " = " + average);
    }

    public static void main(String[] args) {

    }
}
