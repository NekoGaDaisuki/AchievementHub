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
public class LibraryViewData
{

    private LibraryViewData()
    {

    }

    public static LibraryViewData getInstance()
    {
        LibraryViewData INSTANCE = LibraryViewData.INSTANCE;
        if (INSTANCE == null)
        {
            synchronized (LibraryViewData.class)
            {
                INSTANCE = LibraryViewData.INSTANCE;
                if (INSTANCE == null)
                {
                    LibraryViewData.INSTANCE = INSTANCE = new LibraryViewData();
                }
            }
        }
        return INSTANCE;
    }

    static class basegameTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 7575916695278992665L;

        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.absouteTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.alliancesTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.dwarwenTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.glassTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.mercenaryTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.raresStylesTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.absouteTableModel);
            os.writeObject(this.alliancesTableModel);
            os.writeObject(this.dwarwenTableModel);
            os.writeObject(this.glassTableModel);
            os.writeObject(this.mercenaryTableModel);
            os.writeObject(this.raresStylesTableModel);
        }

        private javax.swing.table.DefaultTableModel absouteTableModel;
        private javax.swing.table.DefaultTableModel alliancesTableModel;
        private javax.swing.table.DefaultTableModel dwarwenTableModel;
        private javax.swing.table.DefaultTableModel glassTableModel;
        private javax.swing.table.DefaultTableModel mercenaryTableModel;
        private javax.swing.table.DefaultTableModel raresStylesTableModel;
    }

    static class cyrodiilTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = -1939987236151515757L;

        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.akaviriTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.allianceTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.dominionTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.pactTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.xivkynTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.akaviriTableModel);
            os.writeObject(this.allianceTableModel);
            os.writeObject(this.dominionTableModel);
            os.writeObject(this.pactTableModel);
            os.writeObject(this.xivkynTableModel);
        }

        private javax.swing.table.DefaultTableModel akaviriTableModel;
        private javax.swing.table.DefaultTableModel allianceTableModel;
        private javax.swing.table.DefaultTableModel dominionTableModel;
        private javax.swing.table.DefaultTableModel pactTableModel;
        private javax.swing.table.DefaultTableModel xivkynTableModel;
    }

    static class darkBrotherhoodTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 1666744782762404472L;

        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.assassinsLeagueTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.darkBrotherhoodTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.minotaurTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.orderHourTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.assassinsLeagueTableModel);
            os.writeObject(this.darkBrotherhoodTableModel);
            os.writeObject(this.minotaurTableModel);
            os.writeObject(this.orderHourTableModel);
        }

        private javax.swing.table.DefaultTableModel assassinsLeagueTableModel;
        private javax.swing.table.DefaultTableModel darkBrotherhoodTableModel;
        private javax.swing.table.DefaultTableModel minotaurTableModel;
        private javax.swing.table.DefaultTableModel orderHourTableModel;
    }

    static class orsiniumTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 5824976911779676603L;

        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.anciensOrcsTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.malacatchTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.trinimacTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.anciensOrcsTableModel);
            os.writeObject(this.malacatchTableModel);
            os.writeObject(this.trinimacTableModel);
        }
        private javax.swing.table.DefaultTableModel anciensOrcsTableModel;
        private javax.swing.table.DefaultTableModel malacatchTableModel;
        private javax.swing.table.DefaultTableModel trinimacTableModel;
    }

    static class thievesGuildTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 7707720467968494094L;

        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.abahWatchTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.dromAthraTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.outlawTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
            this.thievesGuildTableModel = (javax.swing.table.DefaultTableModel) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.abahWatchTableModel);
            os.writeObject(this.dromAthraTableModel);
            os.writeObject(this.outlawTableModel);
            os.writeObject(this.thievesGuildTableModel);
        }
        private javax.swing.table.DefaultTableModel abahWatchTableModel;
        private javax.swing.table.DefaultTableModel dromAthraTableModel;
        private javax.swing.table.DefaultTableModel outlawTableModel;
        private javax.swing.table.DefaultTableModel thievesGuildTableModel;
    }

    private static LibraryViewData INSTANCE;
}
