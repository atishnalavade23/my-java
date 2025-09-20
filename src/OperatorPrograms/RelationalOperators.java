package OperatorPrograms;

public class RelationalOperators {
    public static void main(String[] args) {

        // Equal to
        int a = 100;
        int b = 100;
        boolean checkEquality = (a == b);
        System.out.println("a is equal to b: " + checkEquality);
        boolean checkEquality1 = (a != b);
        System.out.println("a is not equal to b: " + checkEquality1);

        // Not Equal to
        int c = 100;
        int d = 200;
        boolean checkEquality2 = (c == d);
        System.out.println("c is equal to d: " + checkEquality2);
        boolean checkEquality3 = (c != d);
        System.out.println("c is not equal to d: " + checkEquality3);

        //Less Than(<)
        int aa=100;
        int bb=200;
        boolean checkEquality4 = (aa < bb);
        System.out.println("aa is less than bb: " + checkEquality4);

        //Less than or equal to
        int cc=100;
        int dd=100;
        boolean checkEquality5 = (aa <= bb);
        System.out.println("aa is less than bb: " + checkEquality5);

        //Greater than
        int aaa=100;
        int bbb=200;
        boolean checkEquality6 = (aaa > bbb);
        System.out.println("aaa is greater than bbb: " + checkEquality6);

        //Greater than or equal to
        int ccc=100;
        int ddd=100;
        boolean checkEquality7 = (ccc <= ddd);
        System.out.println("ccc is greater than ddd: " + checkEquality7);




    }
}
