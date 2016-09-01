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
public abstract class LibraryViewData
{

    public static void deserializeTables(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
    {
        BasegameForm.importTables((basegameTableModel) is.readObject());
        CyrodiilForm.importTables((cyrodiilTableModel) is.readObject());
        DarkBrotherhoodForm.importTables((darkBrotherhoodTableModel) is.readObject());
        OrsiniumForm.importTables((orsiniumTableModel) is.readObject());
        ThievesGuildForm.importTables((thievesGuildTableModel) is.readObject());
    }

    public static void serializeTables(java.io.ObjectOutputStream os) throws java.io.IOException
    {
        os.writeObject(BasegameForm.retrieveTables());
        os.writeObject(CyrodiilForm.retrieveTables());
        os.writeObject(DarkBrotherhoodForm.retrieveTables());
        os.writeObject(OrsiniumForm.retrieveTables());
        os.writeObject(ThievesGuildForm.retrieveTables());
    }

    // <editor-fold defaultstate="collapsed" desc="basegameTableModel source code">
    static class basegameTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 7575916695278992665L;

        // <editor-fold defaultstate="collapsed" desc="basegameTableModel getters">
        java.util.Vector getAbsouteTable()
        {
            return this.absouteDataVector;
        }

        java.util.Vector getAlliancesTable()
        {
            return this.alliancesDataVector;
        }

        java.util.Vector getDwarwenTable()
        {
            return this.dwarwenDataVector;
        }

        java.util.Vector getGlassTable()
        {
            return this.glassDataVector;
        }

        java.util.Vector getMercenaryTable()
        {
            return this.mercenaryDataVector;
        }

        java.util.Vector getRaresStylesTable()
        {
            return this.raresStylesDataVector;
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="basegameTableModel setters">
        void setAbsouteTable(javax.swing.table.TableModel table)
        {
            this.absouteDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setAlliancesTable(javax.swing.table.TableModel table)
        {
            this.alliancesDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setDwarwenTable(javax.swing.table.TableModel table)
        {
            this.dwarwenDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setGlassTable(javax.swing.table.TableModel table)
        {
            this.glassDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setMercenaryTable(javax.swing.table.TableModel table)
        {
            this.mercenaryDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setRaresStylesTable(javax.swing.table.TableModel table)
        {
            this.raresStylesDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="basegameTableModel serialization">
        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.absouteDataVector = (java.util.Vector) is.readObject();
            this.alliancesDataVector = (java.util.Vector) is.readObject();
            this.dwarwenDataVector = (java.util.Vector) is.readObject();
            this.glassDataVector = (java.util.Vector) is.readObject();
            this.mercenaryDataVector = (java.util.Vector) is.readObject();
            this.raresStylesDataVector = (java.util.Vector) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.absouteDataVector);
            os.writeObject(this.alliancesDataVector);
            os.writeObject(this.dwarwenDataVector);
            os.writeObject(this.glassDataVector);
            os.writeObject(this.mercenaryDataVector);
            os.writeObject(this.raresStylesDataVector);
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="basegameTableModel variables">
        private java.util.Vector absouteDataVector;
        private java.util.Vector alliancesDataVector;
        private java.util.Vector dwarwenDataVector;
        private java.util.Vector glassDataVector;
        private java.util.Vector mercenaryDataVector;
        private java.util.Vector raresStylesDataVector;
        // </editor-fold>

    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="cyrodiilTableModel source code">
    static class cyrodiilTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = -1939987236151515757L;

        // <editor-fold defaultstate="collapsed" desc="cyrodiilTableModel getters">
        java.util.Vector getAkaviriTable()
        {
            return this.akaviriDataVector;
        }

        java.util.Vector getAllianceTable()
        {
            return this.allianceDataVector;
        }

        java.util.Vector getDominionTable()
        {
            return this.dominionDataVector;
        }

        java.util.Vector getPactTable()
        {
            return this.pactDataVector;
        }

        java.util.Vector getXivkynTable()
        {
            return this.xivkynDataVector;
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="cyrodiilTableModel setters">
        void setAkaviriTable(javax.swing.table.TableModel table)
        {
            this.akaviriDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setAllianceTable(javax.swing.table.TableModel table)
        {
            this.allianceDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setDominionTable(javax.swing.table.TableModel table)
        {
            this.dominionDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setPactTable(javax.swing.table.TableModel table)
        {
            this.pactDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setXivkynTable(javax.swing.table.TableModel table)
        {
            this.xivkynDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="cyrodiilTableModel serialization">
        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.akaviriDataVector = (java.util.Vector) is.readObject();
            this.allianceDataVector = (java.util.Vector) is.readObject();
            this.dominionDataVector = (java.util.Vector) is.readObject();
            this.pactDataVector = (java.util.Vector) is.readObject();
            this.xivkynDataVector = (java.util.Vector) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.akaviriDataVector);
            os.writeObject(this.allianceDataVector);
            os.writeObject(this.dominionDataVector);
            os.writeObject(this.pactDataVector);
            os.writeObject(this.xivkynDataVector);
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="cyrodiilTableModel variables">
        private java.util.Vector akaviriDataVector;
        private java.util.Vector allianceDataVector;
        private java.util.Vector dominionDataVector;
        private java.util.Vector pactDataVector;
        private java.util.Vector xivkynDataVector;
        // </editor-fold>

    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="darkBrotherhoodDataVector source code">
    static class darkBrotherhoodTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 1666744782762404472L;

        // <editor-fold defaultstate="collapsed" desc="darkBrotherhoodTableModel getters">
        java.util.Vector getAssassinsLeagueTable()
        {
            return this.assassinsLeagueDataVector;
        }

        java.util.Vector getDarkBrotherhoodTable()
        {
            return this.darkBrotherhoodDataVector;
        }

        java.util.Vector getMinotaurTable()
        {
            return this.minotaurDataVector;
        }

        java.util.Vector getOrderHourTable()
        {
            return this.orderHourDataVector;
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="darkBrotherhoodTableModel setters">
        void setAssassinsLeagueTable(javax.swing.table.TableModel table)
        {
            this.assassinsLeagueDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setDarkBrotherhoodTable(javax.swing.table.TableModel table)
        {
            this.darkBrotherhoodDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setMinotaurTable(javax.swing.table.TableModel table)
        {
            this.minotaurDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setOrderHourTable(javax.swing.table.TableModel table)
        {
            this.orderHourDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="darkBrotherhoodTableModel serialization">
        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.assassinsLeagueDataVector = (java.util.Vector) is.readObject();
            this.darkBrotherhoodDataVector = (java.util.Vector) is.readObject();
            this.minotaurDataVector = (java.util.Vector) is.readObject();
            this.orderHourDataVector = (java.util.Vector) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.assassinsLeagueDataVector);
            os.writeObject(this.darkBrotherhoodDataVector);
            os.writeObject(this.minotaurDataVector);
            os.writeObject(this.orderHourDataVector);
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="darkBrotherhoodTableModel variables">
        private java.util.Vector assassinsLeagueDataVector;
        private java.util.Vector darkBrotherhoodDataVector;
        private java.util.Vector minotaurDataVector;
        private java.util.Vector orderHourDataVector;
        // </editor-fold>

    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="orsiniumTableModel source code">
    static class orsiniumTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 5824976911779676603L;

        // <editor-fold defaultstate="collapsed" desc="orsiniumTableModel getters">
        java.util.Vector getAncientsOrcsTable()
        {
            return this.ancientsOrcsDataVector;
        }

        java.util.Vector getMalacathTable()
        {
            return this.malacathDataVector;
        }

        java.util.Vector getTrinimacTable()
        {
            return this.trinimacDataVector;
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="orsiniumTableModel setters">
        void setAncientsOrcsTable(javax.swing.table.TableModel table)
        {
            this.ancientsOrcsDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setMalacathTable(javax.swing.table.TableModel table)
        {
            this.malacathDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setTrinimacTable(javax.swing.table.TableModel table)
        {
            this.trinimacDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="orsiniumTableModel serialization">
        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.ancientsOrcsDataVector = (java.util.Vector) is.readObject();
            this.malacathDataVector = (java.util.Vector) is.readObject();
            this.trinimacDataVector = (java.util.Vector) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.ancientsOrcsDataVector);
            os.writeObject(this.malacathDataVector);
            os.writeObject(this.trinimacDataVector);
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="orsiniumTableModel variables">
        private java.util.Vector ancientsOrcsDataVector;
        private java.util.Vector malacathDataVector;
        private java.util.Vector trinimacDataVector;
        // </editor-fold>

    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="thievesGuildDataVector source code">
    static class thievesGuildTableModel implements java.io.Serializable
    {

        private static final long serialVersionUID = 7707720467968494094L;

        // <editor-fold defaultstate="collapsed" desc="thievesGuildDataVector getters">
        java.util.Vector getAbahWatchTable()
        {
            return this.abahWatchDataVector;
        }

        java.util.Vector getDromAthraTable()
        {
            return this.dromAthraDataVector;
        }

        java.util.Vector getOutlawTable()
        {
            return this.outlawDataVector;
        }

        java.util.Vector getThievesGuildTable()
        {
            return this.thievesGuildDataVector;
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="thievesGuildDataVector setters">
        void setAbahWatchTable(javax.swing.table.TableModel table)
        {
            this.abahWatchDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setDromAthraTable(javax.swing.table.TableModel table)
        {
            this.dromAthraDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setOutlawTable(javax.swing.table.TableModel table)
        {
            this.outlawDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }

        void setThievesGuildTable(javax.swing.table.TableModel table)
        {
            this.thievesGuildDataVector = ((javax.swing.table.DefaultTableModel) table).getDataVector();
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="thievesGuildDataVector serialization">
        private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, ClassNotFoundException
        {
            this.abahWatchDataVector = (java.util.Vector) is.readObject();
            this.dromAthraDataVector = (java.util.Vector) is.readObject();
            this.outlawDataVector = (java.util.Vector) is.readObject();
            this.thievesGuildDataVector = (java.util.Vector) is.readObject();
        }

        private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException
        {
            os.writeObject(this.abahWatchDataVector);
            os.writeObject(this.dromAthraDataVector);
            os.writeObject(this.outlawDataVector);
            os.writeObject(this.thievesGuildDataVector);
        }// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="thievesGuildDataVector variables">
        private java.util.Vector abahWatchDataVector;
        private java.util.Vector dromAthraDataVector;
        private java.util.Vector outlawDataVector;
        private java.util.Vector thievesGuildDataVector;
        // </editor-fold>

    }// </editor-fold>

    private static basegameTableModel basegameTables;
    private static cyrodiilTableModel cyrodiilTables;
    private static darkBrotherhoodTableModel darkBrotherhoodTables;
    private static orsiniumTableModel orsiniumTables;
    private static thievesGuildTableModel thievesGuildTables;
}
