package StaticAndNonStaticVariableAssignment;

public class Circle {
    double radius;

    void printArea(){
        double area = 3.14 * radius * radius;
        System.out.println("Area = " + area);
    }

    void printCircumference(){
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference = " + circumference);
    }

    public static void main(String[] args) {
        //logic goes here
    }
}
