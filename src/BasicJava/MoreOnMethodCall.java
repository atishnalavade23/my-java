package BasicJava;

public class MoreOnMethodCall {
    int addition(int a, int b , int c){
        return a+b+c;
    }

    void returnNothing(int a, boolean b){
        System.out.println("These are the nothing");
    }

    public static void main(String[] args) {
        MoreOnMethodCall obj = new MoreOnMethodCall();
        obj.addition(100,200,300);
        obj.returnNothing(1,true);
    }
}
