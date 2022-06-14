package gis.JavaAssist.gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zachary Nichelson
 * @created 06/13/2022
 *
 * The goal of the UI Library, is to attempt to simplify and speed up the Java Graphical Interface process quicker
 * well also attempting to keep alot of the things the same! With this being said, a brief example is that when you create
 * a window with the createWin(), you can assign it to a variable as shown below, then change all of the properties
 * of the window as if they were actually created in the class your working in!
 *
 *      window w = new Window(); // Creating the instance of the window class
 *      JFrame win = w.createWin(WIDTH, HEIGHT, true); // Creating a Default Window
 *
 *
 *      win.setTitle("Hello World"); // Setting the title through regular JFrame methods
 *
 *      win.pack(); // Pack the JFrame as you have made changes and would like to refresh it.
 *
 * NOTE: Just a few things to note, anything that is run through the ui library automatically pack after you use the set(),
 * this is just to try and shorten the steps to get things done. 2. Checks have been added for weither or not you want to
 * use the JFrame .setLocationRelativeTo() or not. If you choose not to your window will remain in the same position. If you
 * set slrt (setLoctionRelativeTo) boolean to true it will recenter your window!
 */
public class ui {

    /**
     *
     * @param win  JFrame that you would like to collect the MenuItem Component
     * @param component Component you would like to add to the window
     * @param slrt If you would like to run the setLocationRelativeTo() or not
     */
    public void add(JFrame win, Component component, boolean slrt) {
        if (slrt) {
            win.add(component);
            win.pack();

            win.setLocationRelativeTo(null);
        }
        else{
            win.add(component);
            win.pack();
        }
    }

    /**
     *
     * @param win JFrame that you would like to collect the MenuItem Component
     * @param component Component you would like to remove from the window
     */
    public void remove(JFrame win, Component component){
        win.remove(component);
        win.pack();
    }


}
