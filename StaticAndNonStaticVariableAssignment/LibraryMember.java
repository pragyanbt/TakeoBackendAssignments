package StaticAndNonStaticVariableAssignment;

class LibraryMember {
    int memberId;         // instance variable
    String memberName;    // instance variable
    int booksBorrowed;    // instance variable

    void borrowBooks(int count) {
        int maxLimit = 5;  // local variable
        if (booksBorrowed + count <= maxLimit) {
            booksBorrowed += count;
            System.out.println(memberName + " borrowed " + count + " books. Total borrowed = " + booksBorrowed);
        } else {
            System.out.println(memberName + " cannot borrow " + count + " books. Limit exceeded!");
        }
    }

    public static void main(String[] args) {
        //logic goes here
    }
}

