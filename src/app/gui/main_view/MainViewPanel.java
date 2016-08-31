/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.gui.main_view;

/**
 *
 * @author Lexi
 */
public class MainViewPanel extends javax.swing.JPanel
{

    private MainViewPanel()
    {
        super();
        super.setLayout(new java.awt.BorderLayout());
        generalTab = MainViewTab.getInstance();
        super.add(generalTab);
    }

    /**
     *
     * @return
     */
    public static MainViewPanel getInstance()
    {
        return INSTANCE;
    }

    private final MainViewTab generalTab;

    private static final MainViewPanel INSTANCE = new MainViewPanel();
}
