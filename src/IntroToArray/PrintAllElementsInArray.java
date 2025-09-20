package IntroToArray;

public class PrintAllElementsInArray {
    public static void main(String[] args) {


        int[] arr = {10,20,30,40,50,60,70,80,90,100};

//        for (initialization; termination_condition; increment/decrement;)
//        initialization=> starting point to print
//        termination_condition=> Passing the condition(i<10)
//        increment/decrement => for printing the values upto condition met


        for (int i = 0; i<arr.length;i++){
            System.out.println("Array Present at index " + i + " is "+arr[i]);
        }
    }
}
