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
        Menu instance = Menu.INSTANCE;
        if (instance == null)
        {
            synchronized (Menu.class)
            {
                instance = Menu.INSTANCE;
                if (instance == null)
                {
                    Menu.INSTANCE = instance = new Menu();
                }
            }
        }
        return instance;
    }

    private final javax.swing.JMenu fileMenu;

    private static volatile Menu INSTANCE;
}
