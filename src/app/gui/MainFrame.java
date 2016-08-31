/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.gui;

/**
 *
 * @author Lexi
 */
public class MainFrame extends javax.swing.JFrame
{

    private MainFrame()
    {
        super("Achievement Hub");
        super.setSize(1280, 1024);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        super.setJMenuBar(Menu.getInstance());
        super.getContentPane().add(MainTab.getInstance());
    }

    public static MainFrame getInstance()
    {
        return INSTANCE;
    }

    private static final MainFrame INSTANCE = new MainFrame();
}
