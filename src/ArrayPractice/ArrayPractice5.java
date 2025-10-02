package ArrayPractice;


//Search The Number from the list
public class ArrayPractice5 {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50,60};

        int search = 30;
        boolean found = false;

        for(int i=0; i<arr.length;i++) {
            if (arr[i] == search) {
                System.out.println("Element" + search + "is found at index " + i);

                break;
            }
        }
    }
}
