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
class MainTab extends javax.swing.JTabbedPane
{

    private MainTab()
    {
        super();
        super.setTabLayoutPolicy(javax.swing.JTabbedPane.WRAP_TAB_LAYOUT);
        this.generalPanel = app.gui.main_view.MainViewPanel.getInstance();
        super.addTab("Vue Générale", generalPanel);
        this.researchPanel = app.gui.research_view.ResearchViewPanel.getInstance();
        super.addTab("Suivi des Recherches", researchPanel);
        this.libraryPanel = app.gui.library_view.LibraryViewPanel.getInstance();
        super.addTab("Motifs Artisanaux", libraryPanel);
    }

    static MainTab getInstance()
    {
        MainTab instance = MainTab.INSTANCE;
        if (instance == null)
        {
            synchronized (MainTab.class)
            {
                instance = MainTab.INSTANCE;
                if (instance == null)
                {
                    MainTab.INSTANCE = instance = new MainTab();
                }
            }
        }
        return instance;
    }

    private final app.gui.main_view.MainViewPanel generalPanel;
    private final app.gui.research_view.ResearchViewPanel researchPanel;
    private final app.gui.library_view.LibraryViewPanel libraryPanel;

    private static volatile MainTab INSTANCE;
}
