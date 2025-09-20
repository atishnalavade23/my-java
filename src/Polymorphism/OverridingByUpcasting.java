package Polymorphism;

class Vehicle{
    void run(){
        System.out.println("Vehicle is Running");
    }
}
class Car extends Vehicle{
    void run(){
        System.out.println("Car is running Safely");
    }
}
public class OverridingByUpcasting {
    public static void main(String[] args) {
        Vehicle obj = new Car(); //Upcasting

        obj.run();

    }
}
