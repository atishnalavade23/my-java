package IntroToInheritance;

class parent11 {
    int a = 30;
    int b = 20;

    void show() {
        System.out.println("First Number is: " + a);
        System.out.println("Second Number is: " + b);
    }
}

class child11 extends parent11 {
    int sum;

    void add() {
        sum = a + b;
        System.out.println("Sum is: " + sum);
    }
}

class child22 extends parent11 {
    int sub;

    void sub1() {
        sub = a - b;
        System.out.println("Subtraction is: " + sub);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Object of child11 to access addition
        child11 obj1 = new child11();
        obj1.show();   // from parent11
        obj1.add();    // from child11

        System.out.println("-----");

        // Object of child22 to access subtraction
        child22 obj2 = new child22();
        obj2.show();   // from parent11
        obj2.sub1();   // from child22
    }
}
