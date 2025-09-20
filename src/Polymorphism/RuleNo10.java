package Polymorphism;
//Constructors cannot be overridden.
//In Constructor Give the same name to method as a class name
//In a constructor, the method must have the same name as the class.

class Parent4 {
    Parent4() {
        System.out.println("Parent constructor");
    }
}

class Child4 extends Parent4 {

    Child4() {
        System.out.println("Child constructor");
    }
}
// Constructors chaining, not overriding

public class RuleNo10 {
}
