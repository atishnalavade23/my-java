package Static;

public class StaticInto {
    static int num = 100; // Static variable
    int a = 300;          // Instance variable

    public static void main(String[] args) {
        StaticInto obj1 = new StaticInto();
        StaticInto obj2 = new StaticInto();
        StaticInto obj3 = new StaticInto();

        obj1.num = 101;
        obj2.num = 102;
        obj3.num = 103;

        obj1.a = 301;
        obj2.a = 302;
        obj3.a = 303;


        System.out.println("For obj1 -> Static value is " + num + " and Instance value is " + obj1.a);
        System.out.println("For obj2 -> Static value is " + num + " and Instance value is " + obj2.a);
        System.out.println("For obj3 -> Static value is " + num + " and Instance value is " + obj3.a);

        // here Static value is not changes for all methods because of last modified value is apply to all the methods(obj3)
    }
}
