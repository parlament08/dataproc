package courseJava.chapters.chapter3.chapter3_13;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Double getRaise(double salary){
        return salary + salary*0.1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
