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
public class ResearchViewData
{

    private ResearchViewData()
    {
//        this.blacksmithingForm = app.gui.research_view.BlacksmithingForm.getInstance();
//        this.clothingData = app.gui.research_view.ClothingForm.getInstance();
//        this.woodworkingData = app.gui.research_view.WoodworkingForm.getInstance();
    }

    public static ResearchViewData getInstance()
    {
        ResearchViewData INSTANCE = ResearchViewData.INSTANCE;
        if (INSTANCE == null)
        {
            synchronized (ResearchViewData.class)
            {
                INSTANCE = ResearchViewData.INSTANCE;
                if (INSTANCE == null)
                {
                    ResearchViewData.INSTANCE = INSTANCE = new ResearchViewData();
                }
            }
        }
        return INSTANCE;
    }

    static class blacksmithingTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 4412049424526401008L;

        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.heavyArmorTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.weaponTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.heavyArmorTableModel);
            os.writeObject(this.weaponTableModel);
        }

        private javax.swing.table.DefaultTableModel heavyArmorTableModel;
        private javax.swing.table.DefaultTableModel weaponTableModel;
    }

    static class clothingTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 6423694439993817867L;

        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.lightArmorTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.mediumArmorTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.lightArmorTableModel);
            os.writeObject(this.mediumArmorTableModel);
        }

        private javax.swing.table.DefaultTableModel lightArmorTableModel;
        private javax.swing.table.DefaultTableModel mediumArmorTableModel;
    }

    static class woodworkingTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 7908212522829630259L;

        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.apparelTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.weaponTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.apparelTableModel);
            os.writeObject(this.weaponTableModel);
        }

        private javax.swing.table.DefaultTableModel apparelTableModel;
        private javax.swing.table.DefaultTableModel weaponTableModel;
    }

    private static volatile ResearchViewData INSTANCE;
}
