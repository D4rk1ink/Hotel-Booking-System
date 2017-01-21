
package systemroom;

import java.util.ArrayList;
import java.util.Date;

public class History {
    public String ID;
    public String Room;
    public Date CheckIn;
    public Date CheckOut;
    public int Day;
    public double Amount;
    
    History(String ID,String Room,Date CheckIn,Date CheckOut,int Day,double Amount){
        this.ID = ID;
        this.Room = Room;
        this.CheckIn = CheckIn;
        this.CheckOut = CheckOut;
        this.Day = Day;
        this.Amount = Amount;
    }
    
}

interface HistoryList{
    ArrayList<History> History = new ArrayList<>();
} 
