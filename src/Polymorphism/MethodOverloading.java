package Polymorphism;


class Addition{
    int add(int a , int b){
        return a+b;
    }

    double add(double a , double b , double c){
        return a+b+c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println("Addition of int method is "+a.add(20,30));
        System.out.println("Addition of double method is "+a.add(20,30 ,40));

    }

}


