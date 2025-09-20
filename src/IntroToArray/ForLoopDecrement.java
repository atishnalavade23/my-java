package IntroToArray;

public class ForLoopDecrement {
    public static void main(String[] args) {


        int[] array = {10,20,30,40,50,60,70,80,90,100};


        for (int i=array.length-1;i>=0;i--){
            System.out.println("Array Present at index " + i + " is "+array[i]);
        }
    }
}
