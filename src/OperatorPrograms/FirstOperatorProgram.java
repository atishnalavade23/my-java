package OperatorPrograms;

public class FirstOperatorProgram {

    public static void main(String[] args) {

        int a = 10;
        a = a+ 20 ;
        System.out.println(a);  // 30
        System.out.println(" ");

        int b = 100;
        b = b - 20 ;
        System.out.println(b);
        System.out.println(" ");


        // ++Operator use
        // Increments the Value of Variable by 1

        //Post Increment : Uses Value fist , Then Increment

        int c = 100;
        System.out.println("These is Post Increment ");
        System.out.println(c++);
        System.out.println(c);
        System.out.println(" ");

        // Pre Increment : First Increment then uses Value
        int d = 200;
        System.out.println("These is Pre Increment ");
        System.out.println(++d);
        System.out.println(d);
        System.out.println(" ");


        //test code
        int e = 2000;
        System.out.println("Confusing Question");

        System.out.println(++e);
        System.out.println(e++);
        System.out.println(e);
        System.out.println(" ");

        //Invert OOperators (refers to operators that reverse or invert a value)
        System.out.println("Invert Operator");
        boolean t = true;
        System.out.println(!t);
        boolean f = false;
        System.out.println(!f);

    }
}


// Same for Decrement operators ( It will minimize values)
// Opposite to Increment Operator




