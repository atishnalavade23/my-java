package ConstructorProgramming;

import org.w3c.dom.ls.LSOutput;

class GrandParent{
    GrandParent(){
        System.out.println("THis is GrandParent");
    }
}

class Parent extends GrandParent{
    Parent(){
        System.out.println("THis is Parent");
    }
}


public class ConstructorChaining extends Parent {
    ConstructorChaining(){
        System.out.println("THis is ConstructorChaining");
    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();
    }

    
}