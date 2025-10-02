package ControlStatementsPractice;

//Write a program to find the largest number among three numbers.
public class Problem4 {

    public static void main(String[] args) {
        int a = 15;
        int b = 15;
        int c = 20;

        if(a>=b&& a>=c){
            System.out.println("A is Largest Number");
        }else if(b>=a &&b>=c){
            System.out.println("B is Largest Number");
        }else if(c>=a && c>=b){
            System.out.println("C is Largest Number");
        }else{
            System.out.println("Neutral");
        }
    }
}
