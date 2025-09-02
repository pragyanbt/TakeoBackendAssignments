package StaticAndNonStaticVariableAssignment;

class Product {
    int id;          // instance variable
    String name;     // instance variable
    double price;    // instance variable

    void calculateDiscount(double discountPercent) {
        double discountAmount = price * discountPercent / 100;   // local variable
        double discountedPrice = price - discountAmount;         // local variable
        System.out.println("Discounted Price = " + discountedPrice);
    }
}

