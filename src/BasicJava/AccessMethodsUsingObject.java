package BasicJava;

public class AccessMethodsUsingObject {
    int age = 100;
    String name = "Java";

    void test(){
        System.out.println("test successful");
    }
    public static void main(String[] args) {
        AccessMethodsUsingObject obj = new AccessMethodsUsingObject();
        int a = obj.age;
        System.out.println("Access variable a using obj:"+obj.age);
        System.out.println("Access variable name using obj:"+obj.name);

        obj.test();




    }
}
