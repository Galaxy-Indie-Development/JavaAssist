package gis.JavaAssist.gui;

import javax.swing.*;
import java.awt.*;

public class window {
    String title = "";
    int WIDTH = 0;
    int HEIGHT = 0;
    public window(){

    }

    public void createWin(String title, int WIDTH, int HEIGHT, boolean isVisible){
        JFrame win = new JFrame();

        win.setTitle(title);
        win.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        win.setVisible(isVisible);

    }
}
