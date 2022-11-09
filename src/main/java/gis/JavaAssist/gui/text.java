package gis.JavaAssist.gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zachary Nichelson
 * Created on 06/18/22
 */
public class text extends ui{
    public text(){

    }

    /**
     * Creates text on the screen
     * @param text
     * @param x
     * @param y
     * @param width
     * @param height
     * @return JLabel
     */
    public JLabel createTxt(String text, int x, int y, int width, int height){
        JLabel txt = new JLabel();
        txt.setText(text);
        txt.setFont(new Font("", Font.PLAIN, 22));
        txt.setBounds(x, y, width, height);

        return txt;
    }

    /**
     *
     * @param text
     * @param columns
     * @param x
     * @param y
     * @param x1
     * @param y1
     * @return JTextField
     */
    public JTextField createTxtField(String text, int columns, int x, int y, int x1, int y1){
        JTextField txtfield =  new JTextField(columns);

        txtfield.setText(text);
        txtfield.setBounds(x,y,x1,y1);
        txtfield.setVisible(true);

        return txtfield;
    }
}
