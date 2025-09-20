package Polymorphism;
//Subclass in same package can override any non-private, non-final, non-static method.


class ParentClass {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child3 extends ParentClass {
    @Override
    void greet() {
        System.out.println("Hello from Child (same package)");
    }
}

public class RuleNo8 {
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        obj.greet();

        Child3 c = new Child3();
        c.greet();

    }

}
