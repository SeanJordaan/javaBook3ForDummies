/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6;

/**
 *
 * @author Sean
 */
public class CloneTest2

{

    public static void main(String[] args) {
        Employee emp1 = new Employee( //→5
                "Martinez", "Anthony");
        emp1.setSalary(40000.0);
        emp1.address = new Address( //→8
                "1300 N. First Street",
                "Fresno", "CA", "93702");
        Employee emp2 = (Employee) emp1.clone(); //→11
        System.out.println( //→13
                "**** after cloning ****\n");
        printEmployee(emp1);
        printEmployee(emp2);
        emp2.setLastName("Smith"); //→18
        emp2.address = new Address(// →19
                "2503 N. 6th Street",
                "Fresno", "CA", "93722");
        System.out.println( //→23
                "**** after changing emp2 ****\n");
        printEmployee(emp1);
        printEmployee(emp2);
    }

    private static void printEmployee(Employee e)// →30
    {
        System.out.println(e.getFirstName()
                + " " + e.getLastName());
        System.out.println(e.address.getAddress());
        System.out.println("Salary: " + e.getSalary());
        System.out.println();
    }
}

class Employee implements Cloneable //→40
{

    private String lastName;
    private String firstName;
    private Double salary;
    public Address address; //→46

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = new Address();
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

    public Object clone() //→85
    {
        Employee emp;
        try {
            emp = (Employee) super.clone();// →90
            emp.address = (Address) address.clone(); //→91
        } catch (CloneNotSupportedException e) //→93
        {
            return null; // will never happen
        }
        return emp;// →97
    }

    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }
}

class Address implements Cloneable //→109
{

    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

    public Address(String street, String city,
            String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Object clone() //→133
    {
        try {
            return super.clone(); //→137
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
    }

    public String getAddress() {
        return this.street + "\n"
                + this.city + ", "
                + this.state + " "
                + this.zipCode;
    }
}
