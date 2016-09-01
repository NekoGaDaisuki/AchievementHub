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
class FileMenu extends javax.swing.JMenu
{

    private FileMenu()
    {
        super("Fichier");
        this.fileChooser = new javax.swing.JFileChooser();
        this.openItem = new javax.swing.JMenuItem("Ouvrir");
        this.openItem.addActionListener(openFile.getInstance());
        super.add(this.openItem);
        this.saveItem = new javax.swing.JMenuItem("Sauvegarder");
        this.saveItem.addActionListener(saveFile.getInstance());
        super.add(this.saveItem);
        this.exitItem = new javax.swing.JMenuItem("Quitter");
        this.exitItem.addActionListener(exitApp.getInstance());
        super.add(this.exitItem);
    }

    static FileMenu getInstance()
    {
        FileMenu instance = FileMenu.INSTANCE;
        if (instance == null)
        {
            synchronized (FileMenu.class)
            {
                instance = FileMenu.INSTANCE;
                if (instance == null)
                {
                    FileMenu.INSTANCE = instance = new FileMenu();
                }
            }
        }
        return instance;
    }

    // <editor-fold defaultstate="collapsed" desc="exitApp Class Code">
    private static class exitApp implements java.awt.event.ActionListener
    {

        private exitApp()
        {

        }

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e)
        {
            System.exit(0);
        }

        static exitApp getInstance()
        {
            return INSTANCE;
        }

        private static final exitApp INSTANCE = new exitApp();
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="openFile Class Code">
    private static class openFile implements java.awt.event.ActionListener
    {

        private openFile()
        {

        }

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e)
        {
            int retVal = FileMenu.getInstance().fileChooser.showOpenDialog(MainFrame.getInstance());
            if (retVal == javax.swing.JFileChooser.APPROVE_OPTION)
            {
                try
                {
                    System.out.println("app.gui.FileMenu.openFile.actionPerformed()#start");
                    java.io.InputStream file = new java.io.FileInputStream(FileMenu.getInstance().fileChooser.getSelectedFile().getAbsolutePath());
                    java.io.InputStream buffer = new java.io.BufferedInputStream(file);
                    java.io.ObjectInput input = new java.io.ObjectInputStream(buffer);
                } catch (java.io.FileNotFoundException ex)
                {
                    System.out.println("app.gui.FileMenu.openFile.actionPerformed()#java.io.FileNotFoundException");
                } catch (java.io.IOException ex)
                {
                    System.out.println("app.gui.FileMenu.openFile.actionPerformed()#java.io.IOException");
                }
            }
        }

        static openFile getInstance()
        {
            return INSTANCE;
        }

        private final static openFile INSTANCE = new openFile();
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="saveFile Class Code">
    private static class saveFile implements java.awt.event.ActionListener
    {

        private saveFile()
        {

        }

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e)
        {
            int retVal = FileMenu.getInstance().fileChooser.showOpenDialog(MainFrame.getInstance());
            if (retVal == javax.swing.JFileChooser.APPROVE_OPTION)
            {
                try
                {
                    System.out.println("app.gui.FileMenu.saveFile.actionPerformed()#start");
                    java.io.OutputStream file = new java.io.FileOutputStream(FileMenu.getInstance().fileChooser.getSelectedFile().getAbsolutePath());
                    java.io.OutputStream buffer = new java.io.BufferedOutputStream(file);
                    java.io.ObjectOutput output = new java.io.ObjectOutputStream(buffer);
                    //output.flush();
                    //buffer.flush();
                    //file.flush();
                    //output.close();
                    //buffer.close();
                    //file.close();
                } catch (java.io.FileNotFoundException ex)
                {
                    System.out.println("app.gui.FileMenu.saveFile.actionPerformed()#java.io.FileNotFoundException");
                } catch (java.io.IOException ex)
                {
                    System.out.println("app.gui.FileMenu.saveFile.actionPerformed()#java.io.IOException");
                }
            }
        }

        static saveFile getInstance()
        {
            return INSTANCE;
        }

        private final static saveFile INSTANCE = new saveFile();
    }// </editor-fold>

    private final javax.swing.JMenuItem exitItem;
    private final javax.swing.JFileChooser fileChooser;
    private final javax.swing.JMenuItem openItem;
    private final javax.swing.JMenuItem saveItem;

    private static volatile FileMenu INSTANCE;
}
