
package systemroom;

public abstract class Room {
    protected String RID;
    protected String Type;
    protected double Price;
    protected String Status;
    protected String Option;
    abstract String[] info();
    abstract void StatusEdit(String newStatus);
    abstract void Edit(double newPrice);

}
