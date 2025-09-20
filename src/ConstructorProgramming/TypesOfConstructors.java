package ConstructorProgramming;

public class TypesOfConstructors {
    public TypesOfConstructors(){
        System.out.println("This is No Args Constructor");
    }

    public TypesOfConstructors(int a, int b){
        int sum = a + b;
        System.out.println("This is Parameterized Constructor");
//        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        TypesOfConstructors obj = new TypesOfConstructors(10, 20);
        TypesOfConstructors obj2 = new TypesOfConstructors();

    }
}
