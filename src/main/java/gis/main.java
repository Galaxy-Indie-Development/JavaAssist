package gis;
import gis.JavaAssist.file.file;
import gis.JavaAssist.gui.*;
import gis.JavaAssist.conversion.*;
import gis.JavaAssist.mathf.*;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class main {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 650;
    private static final boolean isVisible = true;
    private static final conv conv = new conv();
    private static final equations mathf = new equations();

    public static void main(String[] args) throws Exception {
        window win = new window();

        text test = new text();
        JFrame wind = win.createWin(WIDTH, HEIGHT, isVisible);
        JPanel bg = win.createDrawSurface(WIDTH, HEIGHT);

        win.add(wind, bg, false);
        bg.add(test.createTxtField("Enter your name", 16,100,100,100,100));

























































        // file f = new file();
        // String path = "C:/Users/gam3r/Desktop/Coding Projects/Java Programs/TestLang/src/main/java/gis/test.tl";
        // FileReader fr = new FileReader(path);
        // int ch = 0;
//
        //f.read(fr, ch, path);
        // f.write(path,"Well crap this actually worked", true);
        // f.read(fr, ch, path);


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
