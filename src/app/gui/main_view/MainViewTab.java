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
class MainViewTab extends javax.swing.JTabbedPane
{

    private MainViewTab()
    {
        super();
        super.setTabLayoutPolicy(javax.swing.JTabbedPane.WRAP_TAB_LAYOUT);
    }

    static MainViewTab getInstance()
    {
        MainViewTab instance = MainViewTab.INSTANCE;
        if (instance == null)
        {
            synchronized (MainViewTab.class)
            {
                instance = MainViewTab.INSTANCE;
                if (instance == null)
                {
                    MainViewTab.INSTANCE = instance = new MainViewTab();
                }
            }
        }
        return instance;
    }

    private static volatile MainViewTab INSTANCE;
}
