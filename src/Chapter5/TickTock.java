/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author Sean
 */
import java.awt.event.*;//The ActionListener interface is part of the java.awt.event package,so this import statement is required
import javax.swing.*;//The Timer class is part of the javax.swing package in order to run the timer 

public class TickTock {

    public static void main(String[] args) {
        // create a timer that calls the Ticker class
        // at one second interva
        Timer t = new Timer(1000, new Ticker());//The timer calls this object’s actionPerformed method at each timer tick starts on line 28
        t.start();//This statement calls the start method to kick the timer into action
        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null, //The JOptionPane class is used to display a dialog box, the timer runs while the dialog box is displayed 
                "Click OK to exit program");
    }
}

class Ticker implements ActionListener {//This line is the declaration of the Ticker class

    private boolean tick = true;// activates a boolean class, Each time the actionPerformed method is called

    public void actionPerformed(ActionEvent event) {// this line is called everytime the timer runs 
        if (tick) {
            System.out.println("Tick...");
        } else {
            System.out.println("Tock...");
        }
        //everytime the boolean is true it displayes Tick and every other time false it displayes tock 
        tick = !tick;//In other words, if tick is true, it’s set to false. If tick is false, it’s set to true(understandable but confusing) 
    }
}
