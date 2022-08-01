/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6;

/**
 *
 * @author Sean
 */
public class CloneTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee( //Creates the first Employee object 
                "Martinez", "Anthony");
        emp1.setSalary(40000.0); // Sets Salary 
        Employee emp2 = (Employee) emp1.clone(); //Creates a clone of the Employee object
        emp1.setLastName("Smith");// Changes the last name for the second Employee object
        System.out.println(emp1); // prints the 1st employee object
        System.out.println(emp2); //prints the 2nd employee object
    }
}

class Employee //The Employee class
{

    private String lastName;
    private String firstName;
    private Double salary;

    public Employee(String lastName,
            String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Object clone() //Overrides the clone method
    {
        Employee emp;
        emp = new Employee( //Creates a new Employee object
                this.lastName, this.firstName);
        emp.setSalary(this.salary); //Sets the new employee’s salary to the current object’s salary
        return emp; //prints the emplyee object 
    }

    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }
}
