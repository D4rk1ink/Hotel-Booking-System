/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemroom;

import java.util.ArrayList;

public class ArrayListR {
    //double[] RPrice = {500,600,800,1000};
    ArrayList<Room> RAll = new ArrayList<>();
    ArrayList<Room> RAvailable = new ArrayList<>();
    public ArrayListR(){
        RAll.add(new RNormal("A01","Fan"));
        RAll.add(new RNormal("A02","Fan"));
        RAll.add(new RNormal("A03","Fan"));
        RAll.add(new RNormal("A04","Fan"));
        RAll.add(new RNormal("A05","Air"));
        RAll.add(new RNormal("A06","Air"));
        RAll.add(new RNormal("A07","Air"));
        RAll.add(new RNormal("A08","Air"));
        RAll.add(new RNormal("A09","Air"));
        RAll.add(new RNormal("A10","Air"));
        RAll.add(new RFamily("A11"));
        RAll.add(new RFamily("A12"));
        RAll.add(new RFamily("A13"));
        RAll.add(new RFamily("A14"));
        RAll.add(new RFamily("A15"));
        RAll.add(new RFamily("A16"));
        RAll.add(new RFamily("A17"));
        RAll.add(new RFamily("A18"));
        RAll.add(new RFamily("A19"));
        RAll.add(new RFamily("A20"));
        RAll.add(new RVip("A21"));
        RAll.add(new RVip("A22"));
        RAll.add(new RVip("A23"));
        RAll.add(new RVip("A24"));
        RAll.add(new RVip("A25"));
        RAll.add(new RVip("A26"));
        RAll.add(new RVip("A25"));
        RAll.add(new RVip("A26"));
        RAll.add(new RVip("A27"));
    }
}

class RBusy{
    protected String RID;
    protected String Type;
    protected double Price;
    protected String Status;
    protected String Option;
    protected String IDCard;
    protected String CheckIn;
    protected String CheckOut;

    
    RBusy(String RID,String Type,double Price,String Option,String IDCard,String CheckIn,String CheckOut){
        this.RID = RID;
        this.Type = Type;
        this.Price = Price;
        this.Option = Option;
        this.IDCard = IDCard;
        this.CheckIn = CheckIn;
        this.CheckOut = CheckOut;
        
    }
}
interface RoomList {
    double[] RPrice = {500,600,800,1000};
    ArrayListR Room = new ArrayListR();
    
    ArrayList<Room> RAll = Room.RAll;
    ArrayList<RBusy> RBusy = new ArrayList<RBusy>();
    ArrayList<Room> RAvailable = Room.RAvailable;
    
}
