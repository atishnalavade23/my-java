package SwitchStatementsPractice;

//Write a Program that takes a grade(A,B,C,D,F)
//print FeedBack
public class Problem2 {
    public static void main(String[] args) {
        char  grade= 'C';


        switch (grade){
            case 'A' :
                System.out.println("Excellent Performance");
                break;
            case 'B' :
                System.out.println("Good Job");
                break;
            case 'C' :
                System.out.println("Well Done");
                break;
            case 'D' :
                System.out.println("You are Passed");
                break;
            case 'F' :
                System.out.println("You are Failed");
                break;
            default :
                System.out.println("Invalid");
        }
    }


}
