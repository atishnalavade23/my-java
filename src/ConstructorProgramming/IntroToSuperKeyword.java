package ConstructorProgramming;

class ParentConstructor {
    // Parent class constructor
    ParentConstructor() {
        System.out.println("This is Parent");
    }
}

class ChildConstructor extends ParentConstructor {
    // Child class constructor
    ChildConstructor() {
          // calls ParentConstructor()
        System.out.println("This is Child");
    }
}

public class IntroToSuperKeyword {
    public static void main(String[] args) {
        // Creating Child object will automatically call Parent + Child constructor
        ChildConstructor obj = new ChildConstructor();
    }
}
