package ArrayPractice;
//Find the Max and Min From list of Array

public class ArrayPractice1 {
    public static void main(String[] args) {

        int[]arr={23,34,65,1,2,45,87};

        int i =0;
        int imax=arr[0];
        int imin=arr[0];

        for(i=0;i<arr.length;i++){

            if(arr[i]>imax){
                imax=arr[i];
            }
            System.out.println("The Maximum Number is :"+imax);

            for(i=0;i<arr.length;i++){
                if(arr[i]<imin){
                    imin=arr[i];
                    System.out.println("THe Minimun number is : "+imin);
                }


            }
        }
    }
}

