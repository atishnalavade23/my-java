package Encapsulation;


class Employee2{
    private String name;
    private double salary;

   // NAme Getter Setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }


    // Salary Getter Setter
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Employee2 obj = new Employee2();
        obj.setName("Atish");
        obj.setSalary(15000.00);

        System.out.println("Name of Employee is :"+obj.getName());
        System.out.println("Salary is :"+obj.getSalary());
    }
}
