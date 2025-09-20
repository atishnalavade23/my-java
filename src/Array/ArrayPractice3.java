package Array;


//Count the Even and odd Numbers
public class ArrayPractice3 {

    public static void main(String[] args) {
        int[]arr={23,45,32,2,67,43,2,4,78,9};

        int even=0;
        int odd=0;
        int i;

        for(i=0; i<arr.length;i++)
            if(arr[i]%2==0){
                even++;

            }else{
                odd++;
            }

        System.out.println("Even Numbers are "+even);
        System.out.println("Odd Numbers are "+odd);
    }
}
