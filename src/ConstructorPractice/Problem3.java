package ConstructorPractice;
//Rectangle Area & Perimeter
//Create a class Rectangle with attributes length and breadth.
//Create two constructors:
//Constructor 1: Accepts no arguments and sets both values to 1.
//Constructor 2: Accepts two arguments to initialize length and breadth.
//Add methods area() and perimeter().
//Create objects using both constructors and display area and perimeter.
public class Problem3 {

    int length;
    int breadth;

    Problem3(){
        length = 1;
        breadth = 1;
    }
    Problem3(int l, int b){
        length = l;
        breadth = b;
    }
//    Method to create area and parameter

    int area(){
        return length*breadth;
    }

    int perimeter(){
        return 2 *(length+breadth);
    }

    public static void main(String[] args) {
        Problem3 r1 = new Problem3();
        System.out.println("Properties of Rectangle 1");
        System.out.println("Area of Rectangle is "+r1.area());
        System.out.println("Perimeter of Rectangle is "+r1.perimeter());

        Problem3 r2 = new Problem3( 3, 4);
        System.out.println("Properties of Rectangle 1");
        System.out.println("Area of Rectangle is "+r2.area());
        System.out.println("Perimeter of Rectangle is "+r2.perimeter());
    }
}
