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
        return INSTANCE;
    }

    private final LibraryViewTab libraryTab;

    private static final LibraryViewPanel INSTANCE = new LibraryViewPanel();
}
