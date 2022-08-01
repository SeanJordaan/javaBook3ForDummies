/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3;

/**
 *
 * @author Sean
 */
public class CountTestApp {//his line is the start of the CountTestApp class

    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {
            CountTest c1 = new CountTest();//This line creates an instance of the CountTest class. Because this code is 
                                           //contained in a for loop,and it does 10 counts as seen in the line above
            printCount();//this line prints the count 
            
            
        }
    }

    private static void printCount() {
        System.out.println("There are now "
                + CountTest.getInstanceCount()// This line prints a message indicating how many CountTest objects have 
                                              //been created so far and it calls the method on line 39 
                + " instances of the CountTest class."
        );
    }
}

class CountTest {//This line is the start of the CountTest class.

    private static int instanceCount = 0; //The static instanceCount variable stores the instance count.

    public CountTest() {//each time a new instance of the class is created, the instance count 
                        //is incremented, because it is incremented within the constructor 
        instanceCount++;
    }

    public static int getInstanceCount() { //The static getInstanceCount method simply returns the value of line 37
        return instanceCount;
    }
}


