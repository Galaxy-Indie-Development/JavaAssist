package gis;
import gis.JavaAssist.gui.button;
import gis.JavaAssist.gui.window;

import javax.swing.*;
import java.awt.*;

public class main {
    private static String title = "";
    private static int WIDTH = 1000;
    private static int HEIGHT = 650;
    private static ImageIcon img = new ImageIcon("ja.png");
    private static Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/gam3r//Desktop/Coding Projects/Java Programs/JavaAssist/src/main/java/gis/ja.png");
    private static boolean isVisible = true;

    public static void main(String[] args) throws Exception {
        window win = new window(); // Instance of the class
        JFrame defaultWin = win.createMenuWin(WIDTH, HEIGHT, isVisible); // Creating the default window -->> Returns a JFrame

        System.out.println(defaultWin.getJMenuBar().getComponent(1));
        System.out.println(defaultWin.getJMenuBar().getMenu(0).getItem(0));
        System.out.println(win.getMComp(defaultWin, 0));
        System.out.println(win.getMComp(defaultWin, 0, 1));


        //for(int i = 0; i <= 10; i++) {
        //    System.out.println(win.getMComp(defaultWin, i));
        //}
    }

}
