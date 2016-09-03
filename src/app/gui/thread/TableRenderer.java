package app.gui.thread;

public class TableRenderer implements Runnable
{

    private TableRenderer(java.util.Vector data, javax.swing.JTable table)
    {
        this.src = data;
        this.model = table;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < this.src.size(); ++i)
        {
            for (int j = 1; j < ((java.util.Vector) this.src.elementAt(i)).size(); ++j)
            {
                this.model.setValueAt(((java.util.Vector) this.src.elementAt(i)).elementAt(j), i, j);
            }
        }
    }

    public static void dispatchOperations()
    {
        for (Object operation : PENDING)
        {
            ((Thread) operation).start();
        }
        PENDING.clear();
    }

    public static void addOperation(java.util.Vector data, javax.swing.JTable table)
    {
        PENDING.add(new Thread(new TableRenderer(data, table)));
    }

    private javax.swing.JTable model;
    private java.util.Vector src;

    private static final java.util.Vector PENDING = new java.util.Vector();
}
