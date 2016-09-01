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
public class ResearchViewPanel extends javax.swing.JPanel
{

    private ResearchViewPanel()
    {
        super();
        super.setLayout(new java.awt.BorderLayout());
        researchTab = ResearchViewTab.getInstance();
        super.add(researchTab);
    }

    /**
     *
     * @return
     */
    public static ResearchViewPanel getInstance()
    {
        ResearchViewPanel instance = ResearchViewPanel.INSTANCE;
        if (instance == null)
        {
            synchronized (ResearchViewPanel.class)
            {
                instance = ResearchViewPanel.INSTANCE;
                if (instance == null)
                {
                    ResearchViewPanel.INSTANCE = instance = new ResearchViewPanel();
                }
            }
        }
        return instance;
    }

    private final ResearchViewTab researchTab;

    private static volatile ResearchViewPanel INSTANCE;
}
