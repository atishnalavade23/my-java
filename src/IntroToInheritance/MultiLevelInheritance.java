package IntroToInheritance;


class GreatGrandParent1{
    void test(){
        System.out.println("This is a GreatGrandParent Class");
    }
}

class GreatGrandChild1 extends GreatGrandParent1{
    void show(){
        System.out.println("This is Grand Parent Class");
    }
}

class parent1 extends GreatGrandChild1{
    void dummy (){
        System.out.println("This is a Parent Class");
    }
}

class Child1 extends parent1{
    void add(){
        System.out.println("This is a Child Class");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.show();
        obj.add();
        obj.dummy();
        obj.test();
    }
}
