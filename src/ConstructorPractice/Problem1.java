package ConstructorPractice;
//Student Info (Default Constructor)
//Create a class Student with attributes name and age.
//Use a default constructor to set name = "Atish" and age = 24.
//Print the values by creating an object.

public class Problem1 {

    String name;
    int age;

    Problem1(){
        name = "Atish";
        age = 24;
    }

    void display(){
        System.out.println("Name is "+name+ "\nAge is "+age);
    }

    public static void main(String[] args) {
        Problem1 obj = new Problem1();
        obj.display();

    }
}
