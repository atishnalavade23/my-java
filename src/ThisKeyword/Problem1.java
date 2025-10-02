package ThisKeyword;


//Create a class Employee with instance variables id and name.
// Write a constructor that uses this to differentiate between local and instance variables.

class Employee{
    int id=10 ;
    String name="A" ;

    Employee(int i, String n){
        this.id = i;
        this.name = n;
    }
    void display(){
        System.out.println("Id is "+id+" and Name is "+name);
    }
}
public class Problem1 {

    public static void main(String[] args) {
        Employee obj = new Employee(1,"Atish");
        obj.display();
    }
}
