package ControlStatements;
import java.util.Scanner;
public class MoreonElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature :");
        int temp = sc.nextInt() ;
         if (temp >0){
             System.out.println("Freezing Weather");
         } else if(temp>=0 && temp == 15){
             System.out.println("Cold Weather");
         } else if (temp>=15 && temp ==25) {
             System.out.println("Worm Weather");
         } else if (temp>=25 && temp ==30) {
             System.out.println("Avg Weather");
         }else{
             System.out.println("Hot Weather");
         }

    }
}
