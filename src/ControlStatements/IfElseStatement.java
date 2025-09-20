package ControlStatements;

import java.sql.SQLOutput;

public class IfElseStatement {
    public static void main(String[] args) {

        int age=19;

        //For if
        if (age > 18){
            System.out.println("You can Vote");

        }else {
            System.out.println("You cannot Vote");
        }

        System.out.println(" ");

        //For else
        int age2=17;

        if (age2 > 18){
            System.out.println("You can Vote");

        }else {
            System.out.println("You cannot Vote");
        }


    }
}
