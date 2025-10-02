package ControlStatementsPractice;

//Write a program to check if a person is eligible to vote (age must be >= 18).
public class Problem5 {

    public static void main(String[] args) {

        int age = 17;

        if(age>=18){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not Eligible");
        }
    }
}
