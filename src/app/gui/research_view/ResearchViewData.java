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
public abstract class ResearchViewData
{

    public static void deserializeTables(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
    {
        BlacksmithingForm.importTables((blacksmithingTableModel) is.readObject());
        ClothingForm.importTables((clothingTableModel) is.readObject());
        WoodworkingForm.importTables((woodworkingTableModel) is.readObject());
    }

    public static void serializeTables(java.io.ObjectOutputStream os) throws java.io.IOException
    {
        System.out.println("app.gui.research_view.ResearchViewData.serializeTables()#start");
        os.writeObject(BlacksmithingForm.retrieveTables());
        System.out.println("app.gui.research_view.ResearchViewData.serializeTables()#afterBlacksmithing");
        os.writeObject(ClothingForm.retrieveTables());
        System.out.println("app.gui.research_view.ResearchViewData.serializeTables()#afterClothing");
        os.writeObject(WoodworkingForm.retrieveTables());
    }

    // <editor-fold defaultstate="collapsed" desc="blacksmithingTableModel source code">
    static class blacksmithingTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 4412049424526401008L;

        // <editor-fold defaultstate="collapsed" desc="blacksmithingTableModel getters">
        java.util.Vector getHeavyArmorTable()
        {
            return this.heavyArmorDataVector;
        }

        java.util.Vector getWeaponTable()
        {
            return this.weaponDataVector;
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="blacksmithingTableModel setters">
        void setHeavyArmorTable(javax.swing.table.TableModel table)
        {
            this.heavyArmorDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setWeaponTable(javax.swing.table.TableModel table)
        {
            this.weaponDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="blacksmithingTableModel serialization">
        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.heavyArmorDataVector = (java.util.Vector) is.readObject();
            this.weaponDataVector = (java.util.Vector) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            System.out.println("app.gui.research_view.ResearchViewData.blacksmithingTableModel.writeObject()");
            os.writeObject(this.heavyArmorDataVector);
            os.writeObject(this.weaponDataVector);
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="blacksmithingTableModel variables">
        private java.util.Vector heavyArmorDataVector;
        private java.util.Vector weaponDataVector;
        // </editor-fold>

    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="clothingTableModel source code">
    static class clothingTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 6423694439993817867L;

        // <editor-fold defaultstate="collapsed" desc="clothingTableModel getters">
        java.util.Vector getLightArmorTable()
        {
            return this.lightArmorDataVector;
        }

        java.util.Vector getMediumArmorTable()
        {
            return this.mediumArmorDataVector;
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="clothingTableModel setters">
        void setLightArmorTable(javax.swing.table.TableModel table)
        {
            this.lightArmorDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();;
        }

        void setMediumArmorTable(javax.swing.table.TableModel table)
        {
            this.mediumArmorDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();;
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="clothingTableModel serialization">
        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.lightArmorDataVector = (java.util.Vector) is.readObject();
            this.mediumArmorDataVector = (java.util.Vector) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.lightArmorDataVector);
            os.writeObject(this.mediumArmorDataVector);
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="clothingTableModel variables">
        private java.util.Vector lightArmorDataVector;
        private java.util.Vector mediumArmorDataVector;
        // </editor-fold>

    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="woodworkingTableModel source code">
    static class woodworkingTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 7908212522829630259L;

        // <editor-fold defaultstate="collapsed" desc="woodworkingTableModel getters">
        java.util.Vector getApparelTable()
        {
            return this.apparelDataVector;
        }

        java.util.Vector getWeaponTable()
        {
            return this.weaponDataVector;
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="woodworkingTableModel setters">
        void setApparelTable(javax.swing.table.TableModel table)
        {
            this.apparelDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setWeaponTable(javax.swing.table.TableModel table)
        {
            this.weaponDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="woodworkingTableModel serialization">
        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.apparelDataVector = (java.util.Vector) is.readObject();
            this.weaponDataVector = (java.util.Vector) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.apparelDataVector);
            os.writeObject(this.weaponDataVector);
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="woodworkingTableModel variables">
        private java.util.Vector apparelDataVector;
        private java.util.Vector weaponDataVector;
        // </editor-fold>

    }// </editor-fold>

    private static blacksmithingTableModel blacksmithingTables;
    private static clothingTableModel clothingTables;
    private static woodworkingTableModel woodworkingTables;
}
