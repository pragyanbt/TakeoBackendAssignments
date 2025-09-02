package StaticAndNonStaticVariableAssignment;

import java.util.Scanner;

class Car {
    String model;          // instance variable
    double price;          // instance variable
    static int carCount;   // static variable shared by all objects


    void display() {
        System.out.println("Model: " + model + ", Price: " + price);
    }

    public static void main(String[] args) {
        //we have to implement program logic here
    }
}

