package Polymorphism;

class Aniaml{
    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Aniaml{
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class IntroToOverriding {
    public static void main(String[] args) {
        Aniaml a = new Aniaml();
        a.sound();

        Dog d = new Dog();
        d.sound();
    }
}
