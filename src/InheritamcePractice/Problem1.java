package InheritamcePractice;


//Create a base class Animal with a method sound().
//Create a subclass Dog that overrides the method.


class Animal {
    void sound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }

}

public class Problem1 {
    public static void main(String[] args) {
        Animal a =new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();
    }


}
