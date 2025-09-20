package ConstructorProgramming;

public class IntroToThisKeyword {
    IntroToThisKeyword(){
        this(100,"Atish");
        System.out.println("No-args Constructor");
    }

    IntroToThisKeyword(int i , String name){
        System.out.println("2-args Constructor");
    }
    IntroToThisKeyword(int i,String name,boolean b){
        this();
        System.out.println("3-args Constructor");
    }
    public static void main(String[] args) {
        IntroToThisKeyword obj = new IntroToThisKeyword(10, "Java",true);

    }
}


