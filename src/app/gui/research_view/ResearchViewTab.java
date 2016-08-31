/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.gui.research_view;

/**
 *
 * @author Lexi
 */
class ResearchViewTab extends javax.swing.JTabbedPane
{

    private ResearchViewTab()
    {
        super();
        super.setTabLayoutPolicy(javax.swing.JTabbedPane.WRAP_TAB_LAYOUT);
        this.clothingPanel = ClothingForm.getInstance();
        super.addTab("Traits Recherchés (Couture)", clothingPanel);
        this.blacksmithingPanel = BlacksmithingForm.getInstance();
        super.addTab("Traits Recherchés (Forge)", blacksmithingPanel);
        this.woodworkingPanel = WoodworkingForm.getInstance();
        super.addTab("Traits Recherchés (Travail du Bois)", woodworkingPanel);
    }

    static ResearchViewTab getInstance()
    {
        return INSTANCE;
    }

    private final ClothingForm clothingPanel;
    private final BlacksmithingForm blacksmithingPanel;
    private final WoodworkingForm woodworkingPanel;

    private static final ResearchViewTab INSTANCE = new ResearchViewTab();
}