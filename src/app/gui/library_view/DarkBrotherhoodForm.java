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
class DarkBrotherhoodForm extends javax.swing.JPanel
{

    /**
     * Creates new form DarkBrotherhoodForm
     */
    private DarkBrotherhoodForm()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        assassinsLeagueStylePane = new javax.swing.JScrollPane();
        assassinsLeagueStyleTable = new javax.swing.JTable();
        darkBrotherhoodStylePane = new javax.swing.JScrollPane();
        darkBrotherhoodStyleTable = new javax.swing.JTable();
        orderHourStylePane = new javax.swing.JScrollPane();
        orderHourStyleTable = new javax.swing.JTable();
        minotaurStylePane = new javax.swing.JScrollPane();
        minotaurStyleTable = new javax.swing.JTable();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        assassinsLeagueStyleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"Motifs Artisanaux 34, Ch. 1 : Les Haches de la Ligue des Assassins", null},
                {"Motifs Artisanaux 34, Ch. 2 : Les Ceintures de la Ligue des Assassins", null},
                {"Motifs Artisanaux 34, Ch. 3 : Les Bottes de la Ligue des Assassins", null},
                {"Motifs Artisanaux 34, Ch. 4 : Les Arcs de la Ligue des Assassins", null},
                {"Motifs Artisanaux 34, Ch. 5 : Les Plastrons de la Ligue des Assassins", null},
                {"Motifs Artisanaux 34, Ch. 6 : Les Dagues de la Ligue des Assassins", null},
                {"Motifs Artisanaux 34, Ch. 7 : Les Gants de la Ligue des Assassins", null},
                {"Motifs Artisanaux 34, Ch. 8 : Les Casques de la Ligue des Assassins", null},
                {"Motifs Artisanaux 34, Ch. 9 : Les Jambières de la Ligue des Assassins", null},
                {"Motifs Artisanaux 34, Ch. 10 : Les Masses de la Ligue des Assassins", null},
                {"Motifs Artisanaux 34, Ch. 11 : Les Boucliers de la Ligue des Assassins", null},
                {"Motifs Artisanaux 34, Ch. 12 : Les Épaulières de la Ligue des Assassins", null},
                {"Motifs Artisanaux 34, Ch. 13 : Les Bâtons de la Ligue des Assassins", null},
                {"Motifs Artisanaux 34, Ch. 14 : Les Épées de la Ligue des Assassins", null}
            },
            new String []
            {
                "", ""
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean []
            {
                false, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        assassinsLeagueStyleTable.getTableHeader().setReorderingAllowed(false);
        assassinsLeagueStylePane.setViewportView(assassinsLeagueStyleTable);
        if (assassinsLeagueStyleTable.getColumnModel().getColumnCount() > 0)
        {
            assassinsLeagueStyleTable.getColumnModel().getColumn(0).setResizable(false);
            assassinsLeagueStyleTable.getColumnModel().getColumn(0).setPreferredWidth(350);
            assassinsLeagueStyleTable.getColumnModel().getColumn(1).setResizable(false);
            assassinsLeagueStyleTable.getColumnModel().getColumn(1).setPreferredWidth(60);
        }

        darkBrotherhoodStyleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"Motifs Artisanaux 36, Ch. 1 : Les Haches de la Confrérie Noire", null},
                {"Motifs Artisanaux 36, Ch. 2 : Les Ceintures de la Confrérie Noire", null},
                {"Motifs Artisanaux 36, Ch. 3 : Les Bottes de la Confrérie Noire", null},
                {"Motifs Artisanaux 36, Ch. 4 : Les Arcs de la Confrérie Noire", null},
                {"Motifs Artisanaux 36, Ch. 5 : Les Plastrons de la Confrérie Noire", null},
                {"Motifs Artisanaux 36, Ch. 6 : Les Dagues de la Confrérie Noire", null},
                {"Motifs Artisanaux 36, Ch. 7 : Les Gants de la Confrérie Noire", null},
                {"Motifs Artisanaux 36, Ch. 8 : Les Casques de la Confrérie Noire", null},
                {"Motifs Artisanaux 36, Ch. 9 : Les Jambières de la Confrérie Noire", null},
                {"Motifs Artisanaux 36, Ch. 10 : Les Masses de la Confrérie Noire", null},
                {"Motifs Artisanaux 36, Ch. 11 : Les Boucliers de la Confrérie Noire", null},
                {"Motifs Artisanaux 36, Ch. 12 : Les Épaulières de la Confrérie Noire", null},
                {"Motifs Artisanaux 36, Ch. 13 : Les Bâtons de la Confrérie Noire", null},
                {"Motifs Artisanaux 36, Ch. 14 : Les Épées de la Confrérie Noire", null}
            },
            new String []
            {
                "", ""
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean []
            {
                false, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        darkBrotherhoodStyleTable.getTableHeader().setReorderingAllowed(false);
        darkBrotherhoodStylePane.setViewportView(darkBrotherhoodStyleTable);
        if (darkBrotherhoodStyleTable.getColumnModel().getColumnCount() > 0)
        {
            darkBrotherhoodStyleTable.getColumnModel().getColumn(0).setResizable(false);
            darkBrotherhoodStyleTable.getColumnModel().getColumn(0).setPreferredWidth(350);
            darkBrotherhoodStyleTable.getColumnModel().getColumn(1).setResizable(false);
            darkBrotherhoodStyleTable.getColumnModel().getColumn(1).setPreferredWidth(60);
        }

        orderHourStyleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"Motifs Artisanaux 40, Ch. 1 : Les Haches de l'Ordre des Heures", null},
                {"Motifs Artisanaux 40, Ch. 2 : Les Ceintures de l'Ordre des Heures", null},
                {"Motifs Artisanaux 40, Ch. 3 : Les Bottes de l'Ordre des Heures", null},
                {"Motifs Artisanaux 40, Ch. 4 : Les Arcs de l'Ordre des Heures", null},
                {"Motifs Artisanaux 40, Ch. 5 : Les Plastrons de l'Ordre des Heures", null},
                {"Motifs Artisanaux 40, Ch. 6 : Les Dagues de l'Ordre des Heures", null},
                {"Motifs Artisanaux 40, Ch. 7 : Les Gants de l'Ordre des Heures", null},
                {"Motifs Artisanaux 40, Ch. 8 : Les Casques de l'Ordre des Heures", null},
                {"Motifs Artisanaux 40, Ch. 9 : Les Jambières de l'Ordre des Heures", null},
                {"Motifs Artisanaux 40, Ch. 10 : Les Masses de l'Ordre des Heures", null},
                {"Motifs Artisanaux 40, Ch. 11 : Les Boucliers de l'Ordre des Heures", null},
                {"Motifs Artisanaux 40, Ch. 12 : Les Épaulières de l'Ordre des Heures", null},
                {"Motifs Artisanaux 40, Ch. 13 : Les Bâtons de l'Ordre des Heures", null},
                {"Motifs Artisanaux 40, Ch. 14 : Les Épées de l'Ordre des Heures", null}
            },
            new String []
            {
                "", ""
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean []
            {
                false, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        orderHourStyleTable.getTableHeader().setReorderingAllowed(false);
        orderHourStylePane.setViewportView(orderHourStyleTable);
        if (orderHourStyleTable.getColumnModel().getColumnCount() > 0)
        {
            orderHourStyleTable.getColumnModel().getColumn(0).setResizable(false);
            orderHourStyleTable.getColumnModel().getColumn(0).setPreferredWidth(350);
            orderHourStyleTable.getColumnModel().getColumn(1).setResizable(false);
            orderHourStyleTable.getColumnModel().getColumn(1).setPreferredWidth(60);
        }

        minotaurStyleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"Motifs Artisanaux 39, Ch. 1 : Les Haches de Minotaure", null},
                {"Motifs Artisanaux 39, Ch. 2 : Les Ceintures de Minotaure", null},
                {"Motifs Artisanaux 39, Ch. 3 : Les Bottes de Minotaure", null},
                {"Motifs Artisanaux 39, Ch. 4 : Les Arcs de Minotaure", null},
                {"Motifs Artisanaux 39, Ch. 5 : Les Plastrons de Minotaure", null},
                {"Motifs Artisanaux 39, Ch. 6 : Les Dagues de Minotaure", null},
                {"Motifs Artisanaux 39, Ch. 7 : Les Gants de Minotaure", null},
                {"Motifs Artisanaux 39, Ch. 8 : Les Casques de Minotaure", null},
                {"Motifs Artisanaux 39, Ch. 9 : Les Jambières de Minotaure", null},
                {"Motifs Artisanaux 39, Ch. 10 : Les Masses de Minotaure", null},
                {"Motifs Artisanaux 39, Ch. 11 : Les Boucliers de Minotaure", null},
                {"Motifs Artisanaux 39, Ch. 12 : Les Épaulières de Minotaure", null},
                {"Motifs Artisanaux 39, Ch. 13 : Les Bâtons de Minotaure", null},
                {"Motifs Artisanaux 39, Ch. 14 : Les Épées de Minotaure", null}
            },
            new String []
            {
                "", ""
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean []
            {
                false, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        minotaurStyleTable.getTableHeader().setReorderingAllowed(false);
        minotaurStylePane.setViewportView(minotaurStyleTable);
        if (minotaurStyleTable.getColumnModel().getColumnCount() > 0)
        {
            minotaurStyleTable.getColumnModel().getColumn(0).setResizable(false);
            minotaurStyleTable.getColumnModel().getColumn(0).setPreferredWidth(350);
            minotaurStyleTable.getColumnModel().getColumn(1).setResizable(false);
            minotaurStyleTable.getColumnModel().getColumn(1).setPreferredWidth(60);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minotaurStylePane, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assassinsLeagueStylePane, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(darkBrotherhoodStylePane, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderHourStylePane, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(assassinsLeagueStylePane, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(darkBrotherhoodStylePane, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderHourStylePane, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minotaurStylePane, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    static DarkBrotherhoodForm getInstance()
    {
        DarkBrotherhoodForm instance = DarkBrotherhoodForm.INSTANCE;
        if (instance == null)
        {
            synchronized (DarkBrotherhoodForm.class)
            {
                instance = DarkBrotherhoodForm.INSTANCE;
                if (instance == null)
                {
                    DarkBrotherhoodForm.INSTANCE = instance = new DarkBrotherhoodForm();
                }
            }
        }
        return instance;
    }

    // <editor-fold defaultstate="collapsed" desc="importTables Code">
    static void importTables(LibraryViewData.darkBrotherhoodTableModel darkBrotherhoodTableModel)
    {
        java.util.Vector assassinsLeagueData = darkBrotherhoodTableModel.getAssassinsLeagueTable();
        for (int i = 0; i < assassinsLeagueData.size(); ++i)
        {
            for (int j = 1; j < ((java.util.Vector) assassinsLeagueData.elementAt(i)).size(); ++j)
            {
                getInstance().assassinsLeagueStyleTable.setValueAt(((java.util.Vector) assassinsLeagueData.elementAt(i)).elementAt(j), i, j);
            }
        }
        java.util.Vector darkBrotherhoodData = darkBrotherhoodTableModel.getDarkBrotherhoodTable();
        for (int i = 0; i < darkBrotherhoodData.size(); ++i)
        {
            for (int j = 1; j < ((java.util.Vector) darkBrotherhoodData.elementAt(i)).size(); ++j)
            {
                getInstance().darkBrotherhoodStyleTable.setValueAt(((java.util.Vector) darkBrotherhoodData.elementAt(i)).elementAt(j), i, j);
            }
        }
        java.util.Vector minotaurData = darkBrotherhoodTableModel.getMinotaurTable();
        for (int i = 0; i < minotaurData.size(); ++i)
        {
            for (int j = 1; j < ((java.util.Vector) minotaurData.elementAt(i)).size(); ++j)
            {
                getInstance().minotaurStyleTable.setValueAt(((java.util.Vector) minotaurData.elementAt(i)).elementAt(j), i, j);
            }
        }
        java.util.Vector orderHourData = darkBrotherhoodTableModel.getOrderHourTable();
        for (int i = 0; i < orderHourData.size(); ++i)
        {
            for (int j = 1; j < ((java.util.Vector) orderHourData.elementAt(i)).size(); ++j)
            {
                getInstance().orderHourStyleTable.setValueAt(((java.util.Vector) orderHourData.elementAt(i)).elementAt(j), i, j);
            }
        }
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="retrieveTables Code">
    static LibraryViewData.darkBrotherhoodTableModel retrieveTables()
    {
        LibraryViewData.darkBrotherhoodTableModel tables = new LibraryViewData.darkBrotherhoodTableModel();
        tables.setAssassinsLeagueTable(getInstance().assassinsLeagueStyleTable.getModel());
        tables.setDarkBrotherhoodTable(getInstance().darkBrotherhoodStyleTable.getModel());
        tables.setMinotaurTable(getInstance().minotaurStyleTable.getModel());
        tables.setOrderHourTable(getInstance().orderHourStyleTable.getModel());
        return tables;
    }// </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane assassinsLeagueStylePane;
    private javax.swing.JTable assassinsLeagueStyleTable;
    private javax.swing.JScrollPane darkBrotherhoodStylePane;
    private javax.swing.JTable darkBrotherhoodStyleTable;
    private javax.swing.JScrollPane minotaurStylePane;
    private javax.swing.JTable minotaurStyleTable;
    private javax.swing.JScrollPane orderHourStylePane;
    private javax.swing.JTable orderHourStyleTable;
    // End of variables declaration//GEN-END:variables

    private static volatile DarkBrotherhoodForm INSTANCE;
}
