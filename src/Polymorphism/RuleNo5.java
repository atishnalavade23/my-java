package Polymorphism;

// A method declared final cannot be overridden.
class Parent1 {
    final void show() {
        System.out.println("Final method - cannot override");
    }
}

class Child1 extends Parent {
//     @Override
//     void show() { }  //  Compile error
}

public class RuleNo5 {
}
