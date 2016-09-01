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
public class LibraryViewPanel extends javax.swing.JPanel
{

    private LibraryViewPanel()
    {
        super();
        super.setLayout(new java.awt.BorderLayout());
        libraryTab = LibraryViewTab.getInstance();
        super.add(libraryTab);
    }

    /**
     *
     * @return
     */
    public static LibraryViewPanel getInstance()
    {
        LibraryViewPanel instance = LibraryViewPanel.INSTANCE;
        if (instance == null)
        {
            synchronized (LibraryViewPanel.class)
            {
                instance = LibraryViewPanel.INSTANCE;
                if (instance == null)
                {
                    LibraryViewPanel.INSTANCE = instance = new LibraryViewPanel();
                }
            }
        }
        return instance;
    }

    private final LibraryViewTab libraryTab;

    private static volatile LibraryViewPanel INSTANCE;
}
