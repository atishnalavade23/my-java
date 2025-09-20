package Polymorphism;

//A method declared static cannot be overridden (method hiding).

class Parent2{
    static void display(){
        System.out.println("These is Parent Class");

    }
}
class Child2 extends Parent2{
   static void display(){
       System.out.println("These is Child Class");

   }
}
public class RuleNo6 {
    public static void main(String[] args) {

    }
}
