/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter7;

/**
 *
 * @author Sean
 */


//there are only 3 diffrences is this code compared to the other Tik tok one before 
import java.awt.event.*;
import javax.swing.*;

public class TickTockStatic {

    private static String tickMessage = "Tick..."; //→6 The tickMessage field is declared as static.
    private static String tockMessage = "Tock..."; //→7 The tockMessage field is also declared as static

    public static void main(String[] args) {
        TickTockStatic t = new TickTockStatic();
        t.go();
    }

    private void go() {
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();
        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);
    }

    static class Ticker implements ActionListener //→29 The Ticker class is declared as static
    {

        private boolean tick = true;

        public void actionPerformed(
                ActionEvent event) {
            if (tick) {
                System.out.println(tickMessage);
            } else {
                System.out.println(tockMessage);
            }
            tick = !tick;
        }
    }
}
