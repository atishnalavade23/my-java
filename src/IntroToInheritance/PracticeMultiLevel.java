package IntroToInheritance;

class DefiningNumbers{
    int a =20;
    int b =40;

    void displayNumbers(){
        System.out.println("First Number is :"+a);
        System.out.println("Second Number is :"+b);

    }
}
class Addition extends DefiningNumbers{
    int sum;
    void addition(){
        sum=a+b;
        System.out.println("Addition is : "+sum);


    }
}

class DisplayOutput extends Addition{
    void displayOutput(){
        System.out.println("Addition Done Successfully");
    }
}

class Child extends DisplayOutput{
    void displaychild(){
        System.out.println("Display Child Successfully");
    }
}

public class PracticeMultiLevel {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.displayNumbers();
        obj.addition();
        obj.displayOutput();
        obj.displaychild();
    }
}