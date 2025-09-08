package FlowControlPart2;

class Program21 {
    public static void main(String[] args) {
        int math = 85, physics = 75, chemistry = 65, english = 70, hindi = 60;
        int total = math + physics + chemistry + english + hindi;
        double percentage = total / 5.0;

        System.out.println("Percentage: " + percentage);

        if (percentage >= 90) {System.out.println("Grade A");}
        else if (percentage >= 80) {System.out.println("Grade B");}
        else if (percentage >= 70) {System.out.println("Grade C");}
        else if (percentage >= 60) {System.out.println("Grade D");}
        else if (percentage >= 40) {System.out.println("Grade E");}
        else {System.out.println("Grade F");}
    }
}

