
package systemroom;

public class RFamily extends Room implements RoomList{
    
    public RFamily(String RID){
        super.RID = RID;
        super.Type = "Family";
        super.Price = RPrice[2];
        super.Status = "Available";
        super.Option = "Air";
    }
    public String[] info(){
        String[] detail = {RID,Type,Double.toString(Price),Status,};
        return detail;
    }
    public void StatusEdit(String newStatus){
        this.Status = newStatus;
    }
    public void Edit(double newPrice){
        Price = newPrice;
    }

}
