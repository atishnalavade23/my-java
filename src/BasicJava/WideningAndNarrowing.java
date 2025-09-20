package BasicJava;

public class WideningAndNarrowing {
    public static void main(String[] args) {
        double myDouble = 10.75;
        int myInt = (int) myDouble;
        System.out.println("Value of int:" +myInt);

        int largeInt = 200;
        byte myByte = (byte) largeInt;
        System.out.println("Value of byte:" +myByte);
    }
}