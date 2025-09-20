package Polymorphism;

class ChangeOrderOfParameter {
    void show1(int a, String name) {
        System.out.println("Integer is:" + a + ", String is:" + name);
    }

    void show1(String name, int a) {
        System.out.println("String is: " + name + ", Integer is: " + a);
    }
}

public class ChangingOrderInOverloading {
    public static void main(String[] args) {
        ChangeOrderOfParameter obj = new ChangeOrderOfParameter();

        obj.show1(10, "Atish");
        obj.show1("Atish", 10);
    }
}
