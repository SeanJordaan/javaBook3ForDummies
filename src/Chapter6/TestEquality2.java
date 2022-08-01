/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6;

/**
 *
 * @author Sean
 */
public class TestEquality2 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(//  Creates an Employee objec
                "Martinez", "Anthony");
        Employee emp2 = new Employee(// Creates another Employee objec
                "Martinez", "Anthony");
        if (emp1.equals(emp2)) // Compares the two Employee objects
        {
            System.out.println(
                    "These employees are the same.");
        } else {
            System.out.println(
                    "These are different employees.");
        }
    }
}

class Employee // The Employee class
{

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public boolean equals(Object obj)// The overridden equals method.
    {
        // an object must equal itself
        if (this == obj) //Returns true if the same object instances are being compared
        {
            return true;
        }
        // no object equals null
        if (this == null) //Returns false if the object being compared is null. This meets the last 
                          //equality test: that nothing is equal to null
        {
            return false;
        }
        // objects of different types are never equal
        if (this.getClass() != obj.getClass())// 
        {
            return false;
        }
        // cast to an Employee, then compare the fields
        Employee emp = (Employee) obj; // cast the other object to an Employee
        return this.lastName.equals(emp.getLastName())// compared, and the result of the compound comparison is returned
                && this.firstName.equals(emp.getFirstName());
    }
}
