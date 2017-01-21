
package systemroom;

import java.util.ArrayList;

public class RNormal extends Room implements RoomList{
    private String option;
    public RNormal(String RID,String option){
        super.RID = RID;
        super.Type = "Normal";
        super.Price = RPrice[0];
        super.Status = "Available";
        this.option = option;
        if(option.equals("Air")){
            super.Price = RPrice[1];
        }
    }
    public String[] info(){
        String[] detail = {RID,Type,Double.toString(Price),option};
        return detail;
    }
    public void StatusEdit(String newStatus){
        this.Status = newStatus;
    }
    public void Edit(double newPrice){
        Price = newPrice;
    }
    
}
