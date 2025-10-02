package ControlStatementsPractice;

//Print a message based on temperature:
//< 0 → "Freezing"
//        0–20 → "Cold"
//        21–35 → "Warm"
//        35 → "Hot"
public class Problem7 {
    public static void main(String[] args) {
        int temp = 35;

        if (temp<0){
            System.out.println("Freezing");
        }else if(temp<=20){
            System.out.println("Cold");
        }else if(temp<=35){
            System.out.println("Warm");
        }else{
            System.out.println("Hot");
        }
    }

}
