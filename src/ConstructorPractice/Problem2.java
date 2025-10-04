package ConstructorPractice;
//Car Details (Parameterized Constructor)
//Create a class Car with attributes model, year, and price.
//Use a parameterized constructor to initialize all attributes.
//In main(), create two car objects with different values and display their details.

public class Problem2 {
    String model;
    int year ;
    double price;

    Problem2(String m , int y,  double p) {
        model = m;
        year = y;
        price = p;
    }

    void display(){
            System.out.println("car Model "+model);
            System.out.println("Year"+year);
            System.out.println("Price is "+price);
        }

    public static void main(String[] args) {
        Problem2 obj1 = new Problem2("Mahindra",2024,1512000.00);
        Problem2 obj2 = new Problem2("Suzuki",2025,1312000.00);

        obj1.display();
        obj2.display();
    }


    }

