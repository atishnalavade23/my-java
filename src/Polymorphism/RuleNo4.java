package Polymorphism;

//Access level cannot be more restrictive (Same Access Modifier)
class Parent {
    public void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    // @Override
    // private void show() { }  //  Compile error: cannot reduce visibility

    @Override
    public void show() {  //  Same or more accessible
        System.out.println("Child method");
    }
}

public class RuleNo4 {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.show();
    }
}
