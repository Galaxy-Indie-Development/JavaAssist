package gis.JavaAssist.gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zachary Nichelson
 * Created 6/13/2022
 */
public class progressbar extends ui{
    public progressbar(){

    }

    public JProgressBar createPBar(JPanel panel, int width, int height, int value){
        JProgressBar bar = new JProgressBar();

        bar.setSize(width, height);
        bar.setValue(value);
        bar.setStringPainted(true);

        bar.setFont(new Font("MV Boli", Font.BOLD, 22));
        bar.setForeground(Color.GREEN);
        bar.setBackground(Color.DARK_GRAY);

        panel.add(bar);



        return bar;
    }
}
