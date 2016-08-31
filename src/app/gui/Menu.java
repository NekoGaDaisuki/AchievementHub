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
class Menu extends javax.swing.JMenuBar
{

    private Menu()
    {
        super();
        this.fileMenu = FileMenu.getInstance();
        super.add(this.fileMenu);
    }

    static Menu getInstance()
    {
        return INSTANCE;
    }

    final javax.swing.JMenu fileMenu;
    public javax.swing.JMenuItem openItem;
    private static final Menu INSTANCE = new Menu();
}
