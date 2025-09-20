package IntroToArray;

public class OddEvenElements {
    public static void main(String[] args) {
        int[] arr = {10, 34, 55, 23, 44, 77, 66, 8, 66};


        for (int i = 0; i<arr.length;i++){

            if(arr[i]%2==0){
                System.out.println("Element "+arr[i]+" is Even Number");
            }else{
                System.out.println("Element "+arr[i]+" is Odd Number");
            }
        }

    }
}
