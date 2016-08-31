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
class BlacksmithingForm extends javax.swing.JPanel
{

    /**
     * Creates new form BlacksmithingForm
     */
    private BlacksmithingForm()
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

        weaponPane = new javax.swing.JScrollPane();
        weaponTable = new javax.swing.JTable();
        heavyArmorPane = new javax.swing.JScrollPane();
        heavyArmorTable = new javax.swing.JTable();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        weaponTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"Énergisé", null, null, null, null, null, null, null},
                {"Chargé", null, null, null, null, null, null, null},
                {"Précis", null, null, null, null, null, null, null},
                {"Infusé", null, null, null, null, null, null, null},
                {"Défenseur", null, null, null, null, null, null, null},
                {"Entrainement", null, null, null, null, null, null, null},
                {"Acéré", null, null, null, null, null, null, null},
                {"Décisif", null, null, null, null, null, null, null},
                {"Trempe de Nirn", null, null, null, null, null, null, null}
            },
            new String []
            {
                "Arme", "Hache", "Masse", "Épée", "Hache de Bataille", "Masse d'arme", "Épée Longue", "Dague"
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
        weaponTable.getTableHeader().setReorderingAllowed(false);
        weaponPane.setViewportView(weaponTable);
        if (weaponTable.getColumnModel().getColumnCount() > 0)
        {
            weaponTable.getColumnModel().getColumn(0).setResizable(false);
            weaponTable.getColumnModel().getColumn(1).setResizable(false);
            weaponTable.getColumnModel().getColumn(2).setResizable(false);
            weaponTable.getColumnModel().getColumn(3).setResizable(false);
            weaponTable.getColumnModel().getColumn(4).setResizable(false);
            weaponTable.getColumnModel().getColumn(5).setResizable(false);
            weaponTable.getColumnModel().getColumn(6).setResizable(false);
            weaponTable.getColumnModel().getColumn(7).setResizable(false);
        }

        heavyArmorTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Lourd", "Cuirasse", "Solerets", "Gantelets", "Heaume", "Grèves", "Spallière", "Gaine"
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
        heavyArmorPane.setViewportView(heavyArmorTable);
        if (heavyArmorTable.getColumnModel().getColumnCount() > 0)
        {
            heavyArmorTable.getColumnModel().getColumn(0).setResizable(false);
            heavyArmorTable.getColumnModel().getColumn(1).setResizable(false);
            heavyArmorTable.getColumnModel().getColumn(2).setResizable(false);
            heavyArmorTable.getColumnModel().getColumn(3).setResizable(false);
            heavyArmorTable.getColumnModel().getColumn(4).setResizable(false);
            heavyArmorTable.getColumnModel().getColumn(5).setResizable(false);
            heavyArmorTable.getColumnModel().getColumn(6).setResizable(false);
            heavyArmorTable.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weaponPane, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
            .addComponent(heavyArmorPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(weaponPane, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(heavyArmorPane, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    static BlacksmithingForm getInstance()
    {
        return INSTANCE;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane heavyArmorPane;
    private javax.swing.JTable heavyArmorTable;
    private javax.swing.JScrollPane weaponPane;
    private javax.swing.JTable weaponTable;
    // End of variables declaration//GEN-END:variables

    private static final BlacksmithingForm INSTANCE = new BlacksmithingForm();
}
