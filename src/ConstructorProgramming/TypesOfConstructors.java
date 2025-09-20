package ConstructorProgramming;

public class TypesOfConstructors {
     TypesOfConstructors(){
        System.out.println("This is No Args Constructor");
    }

     TypesOfConstructors(int a, int b){
        int sum = a + b;
        System.out.println("This is Parameterized Constructor");
//        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        TypesOfConstructors obj2 = new TypesOfConstructors();
        TypesOfConstructors obj = new TypesOfConstructors(10, 20); // These constructors will print by first preference
    }
}
