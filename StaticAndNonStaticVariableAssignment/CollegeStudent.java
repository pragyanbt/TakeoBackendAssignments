package StaticAndNonStaticVariableAssignment;

class CollegeStudent {
    int studentId;           // instance variable
    String studentName;      // instance variable
    static String collegeName = "XYZ College"; // static variable shared by all

    void display() {
        System.out.println(studentId + " " + studentName + " " + collegeName);
    }

    public static void main(String[] args) {
        // First student
        CollegeStudent s1 = new CollegeStudent();
        s1.studentId = 1;
        s1.studentName = "Pragyan";

        // Second student
        CollegeStudent s2 = new CollegeStudent();
        s2.studentId = 2;
        s2.studentName = "Ravin";

        // Both students share the same collegeName
        s1.display();
        s2.display();

        // Change the static variable using one object
        s1.collegeName = "ABC University";

        // Both students now show the updated value
        s1.display();
        s2.display();
    }
}


