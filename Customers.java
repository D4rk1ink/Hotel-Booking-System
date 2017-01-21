/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemroom;

import java.util.ArrayList;


public class Customers {
    public String ID;
    public String FName;
    public String LName;
    public String Birthday;
    public String Sex;
    public String Tel;
    public String Ad;
    Customers(String ID,String FName,String LName,String Birthday,String Sex,String Tel,String Ad){
        this.ID = ID;
        this.FName = FName;
        this.LName = LName;
        this.Birthday = Birthday;
        this.Sex = Sex;
        this.Tel = Tel;
        this.Ad = Ad;  
    }
    
    public void Edit(String ID,String FName,String LName,String Birthday,String Sex,String Tel,String Ad){
        this.ID = ID;
        this.FName = FName;
        this.LName = LName;
        this.Birthday = Birthday;
        this.Sex = Sex;
        this.Tel = Tel;
        this.Ad = Ad;  
    }


}

interface CustomersList {
    ArrayList<Customers> Customer = new ArrayList<>();
    
}
