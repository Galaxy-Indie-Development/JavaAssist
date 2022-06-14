package gis;
import gis.JavaAssist.gui.*;
import gis.JavaAssist.conversion.*;
import gis.JavaAssist.mathf.*;

import javax.swing.*;
import java.awt.*;

public class main {
    private static int WIDTH = 1000;
    private static int HEIGHT = 650;
    private static boolean isVisible = true;
    private static conv conv = new conv();
    private static equations mathf = new equations();

    public static void main(String[] args) throws Exception {

        System.out.println(mathf.cubewhole(10, 5));
























        //window win = new window(); // Instance of the class
        //JFrame defaultWin = win.createMenuWin(WIDTH, HEIGHT, isVisible); // Creating the default window -->> Returns a JFrame
        //JFrame testFrame = win.createWin(WIDTH, HEIGHT, isVisible);
        //JPanel panel = win.createDrawSurface(WIDTH, HEIGHT);
//
//
        ////win.add(defaultWin, panel, false);
        //win.add(testFrame, panel, false);
//
//
//
        //progressbar pb = new progressbar();
        //JProgressBar jpb = pb.createPBar(panel, 200, 100,50);


        //for(int i = 0; i <= 10; i++) {
        //    System.out.println(win.getMComp(defaultWin, i));
        //}
    }

}
