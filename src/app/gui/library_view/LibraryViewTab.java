/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.gui.library_view;

/**
 *
 * @author Lexi
 */
class LibraryViewTab extends javax.swing.JTabbedPane
{

    private LibraryViewTab()
    {
        super();
        super.setTabLayoutPolicy(javax.swing.JTabbedPane.WRAP_TAB_LAYOUT);
        this.baseGamePanel = BasegameForm.getInstance();
        super.addTab("Motifs Artisanaux (Jeu de Base)", new javax.swing.JScrollPane(baseGamePanel));
        this.cyrodiilPanel = CyrodiilForm.getInstance();
        super.addTab("Motifs Artisanaux (Cyrodiil & Imperial City)", new javax.swing.JScrollPane(cyrodiilPanel));
        this.orsiniumPanel = OrsiniumForm.getInstance();
        super.addTab("Motifs Artisanaux (Orsinium)", new javax.swing.JScrollPane(orsiniumPanel));
        this.thievesGuildPanel = ThievesGuildForm.getInstance();
        super.addTab("Motifs Artisanaux (Thieves Guild)", new javax.swing.JScrollPane(thievesGuildPanel));
        this.darkBrotherhoodPanel = DarkBrotherhoodForm.getInstance();
        super.addTab("Motifs Artisanaux (Dark Brotherhood)", new javax.swing.JScrollPane(darkBrotherhoodPanel));
    }

    static LibraryViewTab getInstance()
    {
        LibraryViewTab instance = LibraryViewTab.INSTANCE;
        if (instance == null)
        {
            synchronized (LibraryViewTab.class)
            {
                instance = LibraryViewTab.INSTANCE;
                if (instance == null)
                {
                    LibraryViewTab.INSTANCE = instance = new LibraryViewTab();
                }
            }
        }
        return instance;
    }

    private final BasegameForm baseGamePanel;
    private final CyrodiilForm cyrodiilPanel;
    private final OrsiniumForm orsiniumPanel;
    private final ThievesGuildForm thievesGuildPanel;
    private final DarkBrotherhoodForm darkBrotherhoodPanel;

    private static volatile LibraryViewTab INSTANCE;
}
