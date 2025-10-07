package InheritamcePractice;


//Create a base class Vehicle.
//Then create two subclasses: Car and Bike.
//Each subclass should print its own message.
//Create objects of both and call their methods.

class Vehicle{
    void start(){
        System.out.println("Vehicle is Starting...");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Car is Starting...");
    }
}
class Bike extends Vehicle{
    void ride(){
        System.out.println("Bike is Starting...");
    }
}

public class Problem3 {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.drive();

        System.out.println("----------------------");

        Bike b = new Bike();
        b.start();
        b.ride();


    }
}
