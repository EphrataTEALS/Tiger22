package sampleCode.Inheritance.Person;

public class Employee extends Person {
     
double salary;  
public Employee(int id, String name, double salary){  
        super(id,name);//reusing parent constructor  
        this.salary=salary;  
}  
public void display() {
        System.out.println(id +", "+ name +", "+ salary);
} 
}  