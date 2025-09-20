package OperatorPrograms;

public class LogicalOperators {
    public static void main(String[] args) {
        int aa=100;
        int bb=200;
        int cc=300;

        //Logical And : Returns true when both conditions are true
        boolean LogicalAnd = (aa<bb)&&(bb<cc);
        System.out.println("Is it logical and or not: " + LogicalAnd);
        boolean LogicalAnd2 = (aa>bb)&&(bb<cc);
        System.out.println("Is it logical and or not: " + LogicalAnd2);
        System.out.println(" ");

        // Logical Or : Returns true when one of them condition is true
        boolean LogicalOr = (aa>cc)||(bb<cc);
        System.out.println("Is it logical or / not: " + LogicalOr);
        boolean LogicalOr1 = (aa>cc)||(bb>cc);
        System.out.println("Is it logical or / not: " + LogicalOr1);
        System.out.println(" ");



        // Logical NOT: Returns true when the condition is false or vice versa.
        boolean LogicalNot = !(aa>cc)||(bb<cc);
        System.out.println("Is it logical not: " + LogicalNot);
        boolean LogicalNot1 = !(aa<cc)||(bb>cc);
        System.out.println("Is it logical not: " + LogicalNot1);
    }
}
