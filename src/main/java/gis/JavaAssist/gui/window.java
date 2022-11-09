package gis.JavaAssist.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * @author Zachary Nichelson
 * Created on 06/16/22
 */
public class window extends ui{
    String title = "";
    Image ic = Toolkit.getDefaultToolkit().getImage("C:/Users/gam3r//Desktop/Coding Projects/Java Programs/JavaAssist/src/main/java/gis/ja.png");
    JFrame win;

    public window(){
        JPanel panel = null;
    }

    /**
     * Default Title = Java Toolbox
     * Default WIDTH = 500
     * Default HEIGHT = 300
     * Default Close Op = Dispose on Close
     *
     * @param WIDTH This is setting the WIDTH of the window
     * @param HEIGHT This is setting the HEIGHT of the window
     * @param isVisible This is setting if the window isVisible
     *
     *
     * @return Returns a JFrame
     */
    public JFrame createWin(int WIDTH,int HEIGHT, boolean isVisible){
        win = new JFrame();

        win.setTitle("Java Assist");
        win.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        win.setVisible(isVisible);
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Users/gam3r//Desktop/Coding Projects/Java Programs/JavaAssist/src/main/java/gis/ja.png"));

        win.pack();

        win.setLocationRelativeTo(null);

        return win;
    }

    public JLabel createBG(String fn, int width, int height){
        Image bgimg = Toolkit.getDefaultToolkit().getImage(fn);
        ImageIcon ic = new ImageIcon(bgimg);

        JLabel bg = new JLabel();
        bg.setBounds(0, 0, width, height);
        bg.setIcon(ic);

        return bg;
    }


    /**
     *
     * @param WIDTH Sets the height of the default Menu Window
     * @param HEIGHT Sets the height of the default Menu Window
     * @param isVisible Sets if the default Menu Window is visible
     * @return returns the JFrame
     */
    public JFrame createMenuWin(int WIDTH, int HEIGHT, boolean isVisible){
        win = new JFrame();

        win.setTitle("Java Assist");
        win.setSize(WIDTH, HEIGHT);
        win.setVisible(isVisible);
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setIconImage(ic);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        win.add(menuBar);

        win.setJMenuBar(menuBar);

        win.setLocationRelativeTo(null);

        return win;
    }

    public JPanel createDrawSurface(int WIDTH, int HEIGHT){
        JPanel panel = new JPanel();

        panel.setBackground(Color.BLACK);
        panel.setSize(WIDTH, HEIGHT);
        //panel.setLayout(null);


        return panel;
    }

    /**
     *
     * @param win JFrame that you would like to collect the MenuItem Component
     * @param i Index of the Menu you would like to get the child of
     * @return returns the JFrame
     */
    public Component getMComp(JFrame win, int i) {
        Component comp = win.getJMenuBar().getComponent(i);
        return comp;
    }

    /**
     *
     * @param win JFrame that you would like to collect the MenuItem Component
     * @param i Index of the Menu you would like to get the child of
     * @param j Index of the MenuItem you would like to get
     * @return returns the JFrame
     */
    public Component getMComp(JFrame win, int i, int j) {
        Component comp = win.getJMenuBar().getMenu(i).getItem(j);
        return comp;
    }

    /**
     *
     * @param win JFrame that you would like to change the title for
     * @param slrt Checking if you would like to use the setRelativeLocationTo() or not
     * @param title What the new title should be
     */
    public void set(JFrame win,boolean slrt, String title){
        if(slrt) {
            win.setTitle(title);
            win.pack();
            win.setLocationRelativeTo(null);
        }
        else{
            win.setTitle(title);
            win.pack();
        }
    }

    /**
     *
     * @param win JFrame that you would like to change the width and height for
     * @param slrt Checking if you would like to use the setRelativeLocationTo() or not
     * @param isMenuWindow Checking if it is a menu window or a regular window. NOTE: When testing setPreferedSize wouldn't work with menu windows. FIX: Added isMenuWindow check
     * @param width Sets the width of the window
     * @param height Sets the height of the window
     */
    public void set(JFrame win,boolean slrt,  boolean isMenuWindow, int width, int height){
        if(isMenuWindow){
            if(slrt) {
                win.setSize(width, height);
                win.pack();
                win.setLocationRelativeTo(null);
            }
            else{
                win.setSize(width, height);
                win.pack();
            }
        }
        else{
            if(slrt) {
                win.setPreferredSize(new Dimension(width, height));
                win.pack();
                win.setLocationRelativeTo(null);
            }
            else{
                win.setPreferredSize(new Dimension(width, height));
                win.pack();
            }
        }
    }

    /**
     *
     * @param win JFrame that you would like to set if visible
     * @param slrt Checking if you would like to use the setRelativeLocationTo() or not
     * @param isVisible Setting if the window is visible
     */
    public void set(JFrame win,boolean slrt, boolean isVisible){
        if(slrt) {
            win.setVisible(isVisible);
            win.pack();
            win.setLocationRelativeTo(null);
        }
        else{
            win.setVisible(isVisible);
            win.pack();
        }
    }

    /**
     *
     * @param win JFrame that you would like to collect the MenuItem Component
     * @param slrt Checking if you would like to use the setRelativeLocationTo() or not
     * @param ic Setting Icon of window
     */
    public void set(JFrame win, boolean slrt, Image ic){
        if(slrt) {
            win.setIconImage(ic);
            win.pack();
            win.setLocationRelativeTo(null);
        }
        else{
            win.setIconImage(ic);
            win.pack();
        }
    }

    /**
     *
     * @param win JFrame that you would like to collect the MenuItem Component
     * @param slrt Checking if you would like to use the setRelativeLocationTo() or not
     * @param isMenuWindow Checking if the window is a menu window
     * @param title setting the title
     * @param width setting the width
     * @param height setting the height
     * @param isVisible setting if the window is visible
     * @param ic setting the icon
     */
    public void set(JFrame win, boolean slrt, boolean isMenuWindow, String title, int width, int height, boolean isVisible, Image ic){
        if(isMenuWindow) {
            if(slrt) {
                win.setTitle(title);
                win.setSize(width, height);
                win.setVisible(isVisible);
                win.setIconImage(ic);

                win.pack();

                win.setLocationRelativeTo(null);
            }
            else{
                win.setTitle(title);
                win.setSize(width, height);
                win.setVisible(isVisible);
                win.setIconImage(ic);

                win.pack();
            }
        }
        else{
            if(slrt) {
                win.setTitle(title);
                win.setPreferredSize(new Dimension(width, height));
                win.setVisible(isVisible);
                win.setIconImage(ic);

                win.pack();

                win.setLocationRelativeTo(null);
            }
            else{
                win.setTitle(title);
                win.setPreferredSize(new Dimension(width, height));
                win.setVisible(isVisible);
                win.setIconImage(ic);

                win.pack();
            }
        }
    }
}
