/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter7;

/**
 *
 * @author Sean
 */
import java.awt.event.*;
import javax.swing.*;

public class TickTockInner {

    private String tickMessage = "Tick...";// →6
    /*
    The String variables named tickMessage and tockMessage (line 7) 
    contain the messages to be printed on the console. Note that these 
    variables are defined as fields of the outer class*/
   
    private String tockMessage = "Tock..."; //→7 

    public static void main(String[] args) {
        TickTockInner t = new TickTockInner(); //→11  Because an inner class can be used only by an instantiated object, you 
                                              //can’t use it directly from the static main method
        t.go(); //→12 This line executes the go method of the new instance
    }

    private void go() //→15 This line is the go method, called from line 12.
    {
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000, new Ticker()); //→19 This line creates an instance of the Timer class with the timer interval 
                                                //set to 1,000 milliseconds
        t.start();
        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null,// →24 This line displayes the dialog box 
                "Click OK to exit program");
        System.exit(0);// →26 this is to exit the timer, if you leave it out then the timer will run for a few extra seconds 
    }

    class Ticker implements ActionListener //→29 This line is the declaration for the inner class named Ticker
    {

        private boolean tick = true;

        public void actionPerformed(ActionEvent event) //→33 calls the timer object that runs for 1 second each time 
        {
            if (tick) {
                System.out.println(tickMessage); //→37
            } else {                            //these 2 lines access the outer class.
                System.out.println(tockMessage); //→41
            }
            tick = !tick;
        }
    }
}
