package ConstructorProgramming;

class Parent3 {
    Parent3() {
        System.out.println("Parent: No-args Constructor");
    }
}

public class EasyThisSuper extends Parent3 {

    // No-args constructor
    EasyThisSuper() {
        this(10); // call 1-arg constructor
        System.out.println("Child: No-args Constructor");
    }

    // 1-arg constructor
    EasyThisSuper(int x) {
        super(); // call parent constructor
        System.out.println("Child: 1-arg Constructor -> " + x);
    }

    public static void main(String[] args) {
        EasyThisSuper obj = new EasyThisSuper();
    }
}
