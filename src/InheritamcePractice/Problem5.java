package InheritamcePractice;

//Create a base class Bank with a method getInterestRate().
//Create subclasses SBI, ICICI, and Axis that override this method with different values.
//Display each bank’s interest rate.

class Bank{
    int getInterestRate(){
        return 0;
    }

}

class SBI extends Bank{
    int getInterestRate(){
        return 5;
    }
}
class ICICI extends Bank{
    int getInterestRate(){
        return 7;
    }
}
class Axis extends Bank{
    int getInterestRate(){
        return 9;
    }
}

public class Problem5 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        Axis a = new Axis();

        System.out.println("SBI interent is "+s.getInterestRate());
        System.out.println("ICICI interent is "+i.getInterestRate());
        System.out.println("Axis interent is "+a.getInterestRate());

    }
}

