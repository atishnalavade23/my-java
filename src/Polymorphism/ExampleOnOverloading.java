package Polymorphism;

class Display{
    void show(int a){
        System.out.println("Age :"+a);
    }

    void show(String name){
        System.out.println("Name :"+name);
    }
}

public class ExampleOnOverloading {
    public static void main(String[] args) {
        Display d = new Display();
        d.show(24);
        d.show("Atish");
    }
}
