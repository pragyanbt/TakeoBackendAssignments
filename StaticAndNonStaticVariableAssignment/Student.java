package StaticAndNonStaticVariableAssignment;

class Student {
    int id;
    String name;
    static String schoolName = "Takeo School"; // shared by all students

    void display() {
        System.out.println(id + " " + name + " " + schoolName);
    }

    public static void main(String[] args) {
        // First student
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Pragyan";

        // Second student
        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Ankur";

        // Display before changing static variable
        s1.display();
        s2.display();

        // Change static variable using one object
        s1.schoolName = "Trinnity School";

        // Display again to see that both objects reflect the change
        s1.display();
        s2.display();

        //so this is how we share static variable among all objects
    }
}
