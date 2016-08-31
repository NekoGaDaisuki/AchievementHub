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
        super.addTab("Motifs Artisanaux (Jeu de Base)", baseGamePanel);
        this.cyrodiilPanel = CyrodiilForm.getInstance();
        super.addTab("Motifs Artisanaux (Cyrodiil & Imperial City)", cyrodiilPanel);
        this.orsiniumPanel = OrsiniumForm.getInstance();
        super.addTab("Motifs Artisanaux (Orsinium)", orsiniumPanel);
        this.thievesGuildPanel = ThievesGuildForm.getInstance();
        super.addTab("Motifs Artisanaux (Thieves Guild)", thievesGuildPanel);
        this.darkBrotherhoodPanel = DarkBrotherhoodForm.getInstance();
        super.addTab("Motifs Artisanaux (Dark Brotherhood)", darkBrotherhoodPanel);
    }

    static LibraryViewTab getInstance()
    {
        return INSTANCE;
    }

    private final BasegameForm baseGamePanel;
    private final CyrodiilForm cyrodiilPanel;
    private final OrsiniumForm orsiniumPanel;
    private final ThievesGuildForm thievesGuildPanel;
    private final DarkBrotherhoodForm darkBrotherhoodPanel;

    private static final LibraryViewTab INSTANCE = new LibraryViewTab();
}
