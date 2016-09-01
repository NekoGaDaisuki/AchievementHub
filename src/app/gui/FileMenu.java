/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.gui;

import app.gui.library_view.LibraryViewData;
import app.gui.research_view.ResearchViewData;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    // <editor-fold defaultstate="collapsed" desc="exitApp source code">
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
            exitApp instance = exitApp.INSTANCE;
            if (instance == null)
            {
                synchronized (exitApp.class)
                {
                    instance = exitApp.INSTANCE;
                    if (instance == null)
                    {
                        exitApp.INSTANCE = instance = new exitApp();
                    }
                }
            }
            return instance;
        }

        private static volatile exitApp INSTANCE;
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="openFile source code">
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
                    java.io.ObjectInputStream is = new java.io.ObjectInputStream(buffer);
                    ResearchViewData.deserializeTables(is);
                    LibraryViewData.deserializeTables(is);
                    is.close();
                    buffer.close();
                    file.close();
                } catch (java.io.FileNotFoundException ex)
                {
                    System.out.println("app.gui.FileMenu.openFile.actionPerformed()#java.io.FileNotFoundException");
                } catch (java.io.IOException ex)
                {
                    System.out.println("app.gui.FileMenu.openFile.actionPerformed()#java.io.IOException");
                } catch (ClassNotFoundException ex)
                {
                    System.out.println("app.gui.FileMenu.openFile.actionPerformed()#ClassNotFoundException");
                }
            }
        }

        static openFile getInstance()
        {
            openFile instance = openFile.INSTANCE;
            if (instance == null)
            {
                synchronized (openFile.class)
                {
                    instance = openFile.INSTANCE;
                    if (instance == null)
                    {
                        openFile.INSTANCE = instance = new openFile();
                    }
                }
            }
            return instance;
        }

        private static volatile openFile INSTANCE;
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="saveFile source code">
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
                    java.io.ObjectOutputStream os = new java.io.ObjectOutputStream(buffer);
                    System.out.println("app.gui.FileMenu.saveFile.actionPerformed()#beforeSerialize");
                    ResearchViewData.serializeTables(os);
                    LibraryViewData.serializeTables(os);
                    System.out.println("app.gui.FileMenu.saveFile.actionPerformed()#afterSerialize");
                    os.flush();
                    buffer.flush();
                    file.flush();
                    os.close();
                    buffer.close();
                    file.close();
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
            saveFile instance = saveFile.INSTANCE;
            if (instance == null)
            {
                synchronized (saveFile.class)
                {
                    instance = saveFile.INSTANCE;
                    if (instance == null)
                    {
                        saveFile.INSTANCE = instance = new saveFile();
                    }
                }
            }
            return instance;
        }

        private static volatile saveFile INSTANCE;
    }// </editor-fold>

    private final javax.swing.JMenuItem exitItem;
    private final javax.swing.JFileChooser fileChooser;
    private final javax.swing.JMenuItem openItem;
    private final javax.swing.JMenuItem saveItem;

    private static volatile FileMenu INSTANCE;
}
