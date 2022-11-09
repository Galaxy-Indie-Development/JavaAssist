package gis.JavaAssist.gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zachary Nichelson
 * created 06/13/2022
 */
public class button extends ui{

    /**
     *
     * @param width Sets the width of the Button
     * @param height Sets the height of the Button
     * @param isVisible Sets if the Button is visible
     * @return
     */
    public JButton createBtn(int width, int height, boolean isVisible){
        JButton btn = new JButton();

        btn.setText("Button");
        btn.setSize(new Dimension(width, height));
        // btn.setLocation(x, y);
        btn.setVisible(isVisible);

        return btn;
    }
}
