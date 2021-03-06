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
class ClothingForm extends javax.swing.JPanel
{

    /**
     * Creates new form ClothingForm
     */
    private ClothingForm()
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

        lightArmorPane = new javax.swing.JScrollPane();
        lightArmorTable = new javax.swing.JTable();
        mediumArmorPane = new javax.swing.JScrollPane();
        mediumArmorTable = new javax.swing.JTable();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lightArmorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"Solide", null, null, null, null, null, null, null},
                {"Impénétrable", null, null, null, null, null, null, null},
                {"Renforcé", null, null, null, null, null, null, null},
                {"Ajusté", null, null, null, null, null, null, null},
                {"Entraînement", null, null, null, null, null, null, null},
                {"Infusé", null, null, null, null, null, null, null},
                {"Prospère", null, null, null, null, null, null, null},
                {"Divins", null, null, null, null, null, null, null},
                {"Trempe de Nirn", null, null, null, null, null, null, null}
            },
            new String []
            {
                "Léger", "Robe & Pourpoint", "Chaussures", "Gants", "Chapeau", "Braies", "Épaulettes", "Baudrier"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean []
            {
                false, true, true, true, true, true, true, true
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
        lightArmorTable.getTableHeader().setReorderingAllowed(false);
        lightArmorPane.setViewportView(lightArmorTable);
        if (lightArmorTable.getColumnModel().getColumnCount() > 0)
        {
            lightArmorTable.getColumnModel().getColumn(0).setResizable(false);
            lightArmorTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            lightArmorTable.getColumnModel().getColumn(1).setResizable(false);
            lightArmorTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            lightArmorTable.getColumnModel().getColumn(2).setResizable(false);
            lightArmorTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            lightArmorTable.getColumnModel().getColumn(3).setResizable(false);
            lightArmorTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            lightArmorTable.getColumnModel().getColumn(4).setResizable(false);
            lightArmorTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            lightArmorTable.getColumnModel().getColumn(5).setResizable(false);
            lightArmorTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            lightArmorTable.getColumnModel().getColumn(6).setResizable(false);
            lightArmorTable.getColumnModel().getColumn(6).setPreferredWidth(100);
            lightArmorTable.getColumnModel().getColumn(7).setResizable(false);
            lightArmorTable.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        mediumArmorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"Solide", null, null, null, null, null, null, null},
                {"Impénétrable", null, null, null, null, null, null, null},
                {"Renforcé", null, null, null, null, null, null, null},
                {"Ajusté", null, null, null, null, null, null, null},
                {"Entraînement", null, null, null, null, null, null, null},
                {"Infusé", null, null, null, null, null, null, null},
                {"Prospère", null, null, null, null, null, null, null},
                {"Divins", null, null, null, null, null, null, null},
                {"Trempe de Nirn", null, null, null, null, null, null, null}
            },
            new String []
            {
                "Moyen", "Gilet", "Bottes", "Brassards", "Casque", "Gardes", "Coques d'Épaules", "Ceinture"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean []
            {
                false, true, true, true, true, true, true, true
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
        mediumArmorPane.setViewportView(mediumArmorTable);
        if (mediumArmorTable.getColumnModel().getColumnCount() > 0)
        {
            mediumArmorTable.getColumnModel().getColumn(0).setResizable(false);
            mediumArmorTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            mediumArmorTable.getColumnModel().getColumn(1).setResizable(false);
            mediumArmorTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            mediumArmorTable.getColumnModel().getColumn(2).setResizable(false);
            mediumArmorTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            mediumArmorTable.getColumnModel().getColumn(3).setResizable(false);
            mediumArmorTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            mediumArmorTable.getColumnModel().getColumn(4).setResizable(false);
            mediumArmorTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            mediumArmorTable.getColumnModel().getColumn(5).setResizable(false);
            mediumArmorTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            mediumArmorTable.getColumnModel().getColumn(6).setResizable(false);
            mediumArmorTable.getColumnModel().getColumn(6).setPreferredWidth(100);
            mediumArmorTable.getColumnModel().getColumn(7).setResizable(false);
            mediumArmorTable.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mediumArmorPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
                    .addComponent(lightArmorPane, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lightArmorPane, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(mediumArmorPane, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    static ClothingForm getInstance()
    {
        ClothingForm instance = ClothingForm.INSTANCE;
        if (instance == null)
        {
            synchronized (ClothingForm.class)
            {
                instance = ClothingForm.INSTANCE;
                if (instance == null)
                {
                    ClothingForm.INSTANCE = instance = new ClothingForm();
                }
            }
        }
        return instance;
    }

    // <editor-fold defaultstate="collapsed" desc="importTables Code">
    static void importTables(ResearchViewData.clothingTableModel clothingTableModel)
    {
        java.util.Vector lightArmorData = clothingTableModel.getLightArmorTable();
        for (int i = 0; i < lightArmorData.size(); ++i)
        {
            for (int j = 1; j < ((java.util.Vector) lightArmorData.elementAt(i)).size(); ++j)
            {
                getInstance().lightArmorTable.setValueAt(((java.util.Vector) lightArmorData.elementAt(i)).elementAt(j), i, j);
            }
        }
        java.util.Vector mediumArmorData = clothingTableModel.getMediumArmorTable();
        for (int i = 0; i < mediumArmorData.size(); ++i)
        {
            for (int j = 1; j < ((java.util.Vector) mediumArmorData.elementAt(i)).size(); ++j)
            {
                getInstance().mediumArmorTable.setValueAt(((java.util.Vector) mediumArmorData.elementAt(i)).elementAt(j), i, j);
            }
        }
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="retrieveTables Code">
    static ResearchViewData.clothingTableModel retrieveTables()
    {
        ResearchViewData.clothingTableModel tables = new ResearchViewData.clothingTableModel();
        tables.setLightArmorTable(getInstance().lightArmorTable.getModel());
        tables.setMediumArmorTable(getInstance().mediumArmorTable.getModel());
        return tables;
    }// </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane lightArmorPane;
    private javax.swing.JTable lightArmorTable;
    private javax.swing.JScrollPane mediumArmorPane;
    private javax.swing.JTable mediumArmorTable;
    // End of variables declaration//GEN-END:variables

    private static volatile ClothingForm INSTANCE;
}
