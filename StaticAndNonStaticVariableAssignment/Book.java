package StaticAndNonStaticVariableAssignment;

class Book {
    String title;       // instance variable
    String author;      // instance variable
    static int bookCount; // static variable shared by all books

    void printBookInfo() {
        int serialNumber = ++bookCount; // local variable for serial number
        System.out.println("Book " + serialNumber + ": " + title + " by " + author);
    }

    public static void main(String[] args) {
        //rest logig goes here
    }
}
