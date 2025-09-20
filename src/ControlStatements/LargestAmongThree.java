package ControlStatements;

public class LargestAmongThree {
    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        int c = 50;

        if (a>=b && a>=c){
            System.out.println("Number A is Greater");
        }else if  (b>=a && b>=c){
            System.out.println("Number B is Greater");
        }else {
            System.out.println("Number C is Greater");
        }
    }
}
