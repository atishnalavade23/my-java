package ControlStatementsPractice;
//Write a program to print grades based on marks:
//Marks >= 90 → A
//Marks >= 75 → B
//Marks >= 50 → C
//Otherwise → Fail

public class Problem6 {

    public static void main(String[] args) {

        int marks =49;

        if(marks>=90){
            System.out.println("Pass with Grade A");
        } else if (marks>=75) {
            System.out.println("Pass with Grade B");
        }else if(marks>=50) {
            System.out.println("Pass with Grade C");
        }else{
            System.out.println("Falied in Exams");
        }
    }
}
