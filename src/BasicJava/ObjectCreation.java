package BasicJava;

 class ObjectCreation {
     public void eat(){
         System.out.println("The Dog is Eating");
     }

     public static void main(String[] args) {
         System.out.println("ObjectCreation");
         ObjectCreation gabbar = new ObjectCreation();
         gabbar.eat();//Calling Object
         gabbar.run();
     }
     public void run(){
         System.out.println("The Dog is Running");
     }
}
