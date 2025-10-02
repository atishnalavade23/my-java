package OperatorsPractice;

//Swap two numbers without using a third variable.
public class Problem3{

    public static void main(String[] args) {
        int a = 10;
        int b = 5 ;


        a = a+b; //15
        b = a-b; // 10
        a = a-b;

        System.out.println("After swiping the value of a is "+a+" and value of B is "+b);

    }
}
