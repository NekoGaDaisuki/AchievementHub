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
        MainFrame instance = MainFrame.INSTANCE;
        if (instance == null)
        {
            synchronized (MainFrame.class)
            {
                instance = MainFrame.INSTANCE;
                if (instance == null)
                {
                    MainFrame.INSTANCE = instance = new MainFrame();
                }
            }
        }
        return instance;
    }

    private static volatile MainFrame INSTANCE;
}
