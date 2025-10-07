package InheritamcePractice;

//Create a parent class Person with a variable name and a method display().
//Create a subclass Student that has a variable rollNo and overrides display().
//Use super.display() to show both parent and child information.

class Person1{
    String name = "Atish";

    void display(){
        System.out.println("Name "+name);
    }
}

class Student1 extends Person1{
    int rollNo=101;

    void display(){
        super.display();
        System.out.println("Roll No "+rollNo);
    }
}

public class Problem4 {

    public static void main(String[] args) {

        Student1 s = new Student1();
        s.display();
    }
}
