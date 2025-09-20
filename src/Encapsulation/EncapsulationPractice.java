package Encapsulation;

class Employee {
    private String empName;
    private double salary;

    // getter and setter
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= 10000) {   // validation
            this.salary = salary;
        } else {
            System.out.println("Salary must be at least 10,000");
        }
    }
}

public class EncapsulationPractice {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpName("Atish");
        e.setSalary(15000);

        System.out.println("Employee: " + e.getEmpName());
        System.out.println("Salary: " + e.getSalary());
    }
}

