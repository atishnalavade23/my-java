package IntroToArray;

public class SwapPositionOfElements {
    public static void main(String[] args) {


        int[] arr ={101,202};

        for(int i=0; i<arr.length;i++){
            System.out.println("Element Present at index " + i + " is:" +arr[i]);
        }


        System.out.println("After Swap the elements");
        int temp=0;
        temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;

        for(int j=0;j<arr.length;j++){
            System.out.println("Element Present at index " + j + " is:" +arr[j]);
        }

    }
}
