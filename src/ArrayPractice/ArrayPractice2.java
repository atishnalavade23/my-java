package ArrayPractice;


//Find the sum of All numbers from array
public class ArrayPractice2 {
    public static void main(String[] args) {

        int[]arr={10,20,30,40,50,60};
        int sum =0;
        int i=0;

        for(i=0;i<arr.length;i++)
            sum=sum+arr[i];


        System.out.println("sum of all numbers is "+sum);
    }
}
