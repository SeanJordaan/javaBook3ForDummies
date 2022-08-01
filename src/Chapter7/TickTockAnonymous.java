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

public class TickTockAnonymous {

    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args)// → Anonymous classes won’t work in a static context, so the main method 
                                          //creates an instance of the TickTockAnonymous class and executes the 
                                          //go method.
    {
        TickTockAnonymous t = new TickTockAnonymous();
        t.go();
    }

    private void go() { //this go method is called by the main method. 
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000, //→ In the go method, an instance of the Timer class is created
                new ActionListener() //→ this object is created via the anonymous class 
        { // the beginning of the body of the anonymous class
            private boolean tick = true;

            public void actionPerformed( //→ this method can freely access fields defined in the 
                                         //outer class and starts the 1 second timer 
                    ActionEvent event) {
                if (tick) {
                    System.out.println(tickMessage);
                } else {
                    System.out.println(tockMessage);
                }
                tick = !tick;
            }
        }); //→this line marks the end of the body of the anonymous class. Then the right parenthesis marks the end 
            //of the parameter
        t.start();
        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);
    }
}
