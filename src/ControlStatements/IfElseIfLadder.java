package ControlStatements;

public class IfElseIfLadder {
    public static void main(String[] args) {

        int marks = 34;

        if (marks>90){
            System.out.println("Passed with merit");
        } else if (marks>=75 && marks<90){
            System.out.println("Passed with Destinction");
        } else if (marks>=60 && marks<75){
            System.out.println("Passed with first class");
        } else if (marks>=45 && marks<60){
            System.out.println("Passed with second class");
        } else{
            System.out.println("You are Failed");
        }
    }
}
