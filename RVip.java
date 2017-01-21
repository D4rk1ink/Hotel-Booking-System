
package systemroom;

public class RVip extends Room implements RoomList{
    
    public RVip(String RID){
        super.RID = RID;
        super.Type = "Vip";
        super.Price = RPrice[3];
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
