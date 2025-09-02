package StaticAndNonStaticVariableAssignment;

class EmployeeTask10 {
    int empId;
    String name;
    double salary;
    static int totalEmployees;
    static double totalSalary;

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empId = 1;
        e1.name = "Alice";
        e1.salary = 5000;
        totalEmployees++;
        totalSalary += e1.salary;

        Employee e2 = new Employee();
        e2.empId = 2;
        e2.name = "Bob";
        e2.salary = 6000;
        totalEmployees++;
        totalSalary += e2.salary;

        System.out.println("Total Employees = " + totalEmployees);
        System.out.println("Total Salary Expense = " + totalSalary);
    }
}


