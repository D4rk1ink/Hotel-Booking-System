/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemroom;

import static java.awt.image.ImageObserver.WIDTH;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class FormCheckIn extends javax.swing.JFrame implements RoomList, CustomersList, HistoryList, TableModel {
    
    private DateFormat DateFormat = new SimpleDateFormat("d/M/y");
    private String IDCard;
    private String FName;
    private String LName;
    private String Sex;
    private String Tel;
    private String Ad;
    private String Birthday;
    
    private String oIDCard;
    private String oFName;
    private String oLName;
    private String oSex;
    private String oTel;
    private String oAd;
    private Customers CustomerSelect;
    private Room roomSelect;
    private int Day;
    private double PAmount;
    private Date DCheckOut;
    private Date DCheckIn;
    //private javax.swing.JFrame frame;
    public FormCheckIn() {
        initComponents();   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Room = new javax.swing.JLabel();
        inputRoom = new javax.swing.JTextField();
        checkroom = new javax.swing.JLabel();
        RInfoPanel = new javax.swing.JPanel();
        No = new javax.swing.JLabel();
        NoShow = new javax.swing.JLabel();
        Type = new javax.swing.JLabel();
        TypeShow = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        PriceShow = new javax.swing.JLabel();
        checkdate = new javax.swing.JPanel();
        Labelcheckin = new javax.swing.JLabel();
        DateCheckIn = new com.toedter.calendar.JDateChooser();
        Labelcheckout = new javax.swing.JLabel();
        DateCheckOut = new com.toedter.calendar.JDateChooser();
        CInfoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputIDCard = new javax.swing.JTextField();
        FNameLabel = new javax.swing.JLabel();
        inputFName = new javax.swing.JTextField();
        LNameLabel = new javax.swing.JLabel();
        inputLName = new javax.swing.JTextField();
        BirthdayLable = new javax.swing.JLabel();
        inputBirthday = new com.toedter.calendar.JDateChooser();
        sex = new javax.swing.JLabel();
        inputSex = new javax.swing.JComboBox<>();
        tel = new javax.swing.JLabel();
        inputTel = new javax.swing.JTextField();
        ad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputAd = new javax.swing.JTextArea();
        submit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Amount = new javax.swing.JLabel();
        alert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Check-In");

        Room.setText("Room :");

        inputRoom.setDocument(new MaxLengthGeneric(4));
        inputRoom.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                inputRoomCaretUpdate(evt);
            }
        });
        inputRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRoomActionPerformed(evt);
            }
        });

        RInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        No.setText("No : ");

        NoShow.setText("       ");

        Type.setText("Type : ");

        TypeShow.setText("        ");

        Price.setText("Price : ");

        PriceShow.setText("       ");

        javax.swing.GroupLayout RInfoPanelLayout = new javax.swing.GroupLayout(RInfoPanel);
        RInfoPanel.setLayout(RInfoPanelLayout);
        RInfoPanelLayout.setHorizontalGroup(
            RInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RInfoPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(No)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoShow, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Type)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TypeShow, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Price)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PriceShow, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RInfoPanelLayout.setVerticalGroup(
            RInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RInfoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(RInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(No, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NoShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TypeShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PriceShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        checkdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Labelcheckin.setText("Check In : ");

        DateCheckIn.setDateFormatString("d/M/y");
        DateCheckIn.setEnabled(false);
        DateCheckIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateCheckInPropertyChange(evt);
            }
        });

        Labelcheckout.setText("Check Out : ");

        DateCheckOut.setDateFormatString("d/M/y");
        DateCheckOut.setEnabled(false);
        DateCheckOut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateCheckOutPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout checkdateLayout = new javax.swing.GroupLayout(checkdate);
        checkdate.setLayout(checkdateLayout);
        checkdateLayout.setHorizontalGroup(
            checkdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkdateLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Labelcheckin)
                .addGap(1, 1, 1)
                .addComponent(DateCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Labelcheckout)
                .addGap(0, 0, 0)
                .addComponent(DateCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        checkdateLayout.setVerticalGroup(
            checkdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkdateLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(checkdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Labelcheckin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Labelcheckout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        CInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CInfoPanel.setFocusable(false);

        jLabel1.setText("ID card : ");

        inputIDCard.setEnabled(false);

        FNameLabel.setText("First Name : ");

        inputFName.setEnabled(false);

        LNameLabel.setText("Last Name : ");

        inputLName.setEnabled(false);

        BirthdayLable.setText("Birthday : ");

        inputBirthday.setDateFormatString("d/M/y");
        inputBirthday.setEnabled(false);

        sex.setText("Gender : ");

        inputSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        inputSex.setEnabled(false);

        tel.setText("Tel : ");

        inputTel.setEnabled(false);

        ad.setText("Address : ");

        inputAd.setColumns(20);
        inputAd.setRows(5);
        inputAd.setEnabled(false);
        jScrollPane1.setViewportView(inputAd);

        javax.swing.GroupLayout CInfoPanelLayout = new javax.swing.GroupLayout(CInfoPanel);
        CInfoPanel.setLayout(CInfoPanelLayout);
        CInfoPanelLayout.setHorizontalGroup(
            CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CInfoPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BirthdayLable)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(tel)
                        .addComponent(FNameLabel))
                    .addGroup(CInfoPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(ad)))
                .addGroup(CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputIDCard, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CInfoPanelLayout.createSequentialGroup()
                        .addGroup(CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputFName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CInfoPanelLayout.createSequentialGroup()
                                .addComponent(sex)
                                .addGap(1, 1, 1)
                                .addComponent(inputSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CInfoPanelLayout.createSequentialGroup()
                                .addComponent(LNameLabel)
                                .addGap(0, 0, 0)
                                .addComponent(inputLName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addGap(0, 0, 0))
        );
        CInfoPanelLayout.setVerticalGroup(
            CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CInfoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputIDCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FNameLabel)
                    .addComponent(inputFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNameLabel)
                    .addComponent(inputLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sex)
                        .addComponent(inputSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BirthdayLable)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel)
                    .addComponent(inputTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ad))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Amount : ");

        Amount.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        alert.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Room)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inputRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkroom, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(checkdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RInfoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(CInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alert, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submit)))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkroom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Room, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(RInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputRoomCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_inputRoomCaretUpdate
        if(inputRoom.getText().length() == 3){
            for(Room R : RAll){
                if(R.RID.equals(inputRoom.getText()) && R.Status.equals("Available")){
                    roomSelect = R;
                    checkroom.setText("Available");
                    NoShow.setText(roomSelect.RID);
                    TypeShow.setText(roomSelect.Type);
                    PriceShow.setText(Double.toString(roomSelect.Price));
                    DateCheckIn.setEnabled(true);
                    DateCheckOut.setEnabled(true);
                    inputIDCard.setEnabled(true);
                    inputFName.setEnabled(true);
                    inputLName.setEnabled(true);
                    inputBirthday.setEnabled(true);
                    inputSex.setEnabled(true);
                    inputTel.setEnabled(true);
                    inputAd.setEnabled(true);
                    break;
                }else{
                    setText();
                }
            }
        }else{
            setText();
        }
    }//GEN-LAST:event_inputRoomCaretUpdate

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
        if(JOptionPane.showConfirmDialog(null, "Do you want check-in "+roomSelect.RID+" ?", "Delete Confirm", WIDTH)==0){
            IDCard = inputIDCard.getText();
            FName = inputFName.getText();
            LName = inputLName.getText();
            Sex = inputSex.getSelectedItem().toString();
            Tel = inputTel.getText();
            Ad = inputAd.getText();
            if(checkText()){
                /////////////////////////////////////////////////
                boolean found = false;
                for(Customers c :Customer){
                    if(c.ID.equals(IDCard)){
                        CustomerSelect = c;
                        oIDCard = c.ID;
                        oFName = c.FName;
                        oLName = c.LName;
                        oSex = c.Sex;
                        oTel = c.Tel;
                        oAd = c.Ad;
                        found = true;
                        break;
                    }
                }
                if(!found){
                    add(!found);
                }else{
                    if(!oFName.equals(FName)||!oLName.equals(LName)||!oSex.equals(Sex)||!oTel.equals(Tel)||!oAd.equals(Ad)){
                        int comfirm = JOptionPane.showConfirmDialog(null, "We have your Information. Do you want to replace it?", "Replace Account", WIDTH);
                        if(comfirm==0){
                            CustomerSelect.Edit(IDCard,FName,LName,Birthday,Sex,Tel,Ad);
                            add(!found);
                            re();

                        }else if(comfirm==1){
                            add(!found);
                        }
                    }else{
                        add(!found);
                    }
                }
            }
            else{
                alert.setText("Please complete the following information!!");
            }
        }
    }//GEN-LAST:event_submitActionPerformed
    
    private void re(){
        for(int i=0;i<THistory.getRowCount();i++){
            if(TCustomers.getValueAt(i,0).equals(oIDCard)){
                TCustomers.setValueAt(IDCard, i, 0);
                TCustomers.setValueAt(FName, i,1);
                TCustomers.setValueAt(LName, i,2);
                TCustomers.setValueAt(Birthday, i,3);
                TCustomers.setValueAt(Sex, i,4);
                TCustomers.setValueAt(Tel, i,5);
                    TCustomers.setValueAt(Ad, i,6);
            }
        }
        for(Customers c : Customer){
            if(c.ID.equals(oIDCard)){
                c.Edit(IDCard, FName, LName, Birthday, Sex, Tel, Ad);
            }
        }
    }
    
    private void add(boolean add){
        
                Birthday = DateFormat.format(inputBirthday.getDate());
                String SDCheckIn = DateFormat.format(DCheckIn);
                String SDCheckOut = DateFormat.format(DCheckOut);


                ////////////////////////////////// Customer
                if(add){
                    Customer.add(new Customers(IDCard,FName,LName,Birthday,Sex,Tel,Ad));
                    TCustomers.addRow(new Object[] {IDCard,FName,LName,Birthday,Sex,Tel,Ad});
                }
                History.add(new History(IDCard,roomSelect.RID,DateCheckIn.getDate(),DateCheckOut.getDate(),Day,PAmount));
                THistory.addRow(new Object[] {IDCard,roomSelect.RID,SDCheckIn,SDCheckOut,Day,PAmount});
                ////////////////////////////////// Room
                roomSelect.StatusEdit("Busy");
                TRoomBusy.addRow(new Object[] {roomSelect.RID,roomSelect.Type,roomSelect.Price,roomSelect.Status,inputIDCard.getText(),SDCheckIn,SDCheckOut});
                RBusy.add(new RBusy(roomSelect.RID,roomSelect.Type,roomSelect.Price,roomSelect.Option,inputIDCard.getText(),SDCheckIn,SDCheckOut));
                //RAvailable.remove(roomSelect); ///Remove RAvailable
                ////////////////////////////////// History
                

                int count = TRoomAll.getRowCount();
                for(int i=0;i<count;i++){
                    if(TRoomAll.getValueAt(i,0).equals(inputRoom.getText())){
                        TRoomAll.setValueAt("Busy", i, 3);
                    }
                    try{
                        if(TRoomAvailable.getValueAt(i,0).equals(inputRoom.getText())){
                            TRoomAvailable.removeRow(i);
                        }
                    }catch(Exception e){

                    }
                }
            setVisible(false);
            
    }
    
    private boolean checkText(){

        if(!IDCard.isEmpty()&&!FName.isEmpty()&&!LName.isEmpty()&&!Tel.isEmpty()&&!Ad.isEmpty()&&inputBirthday.getDate()!=null){
            return true;
        }
        return false;
    }
    
    private void DateCheckOutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateCheckOutPropertyChange
        CalDateCheck();
    }//GEN-LAST:event_DateCheckOutPropertyChange

    private void DateCheckInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateCheckInPropertyChange
        CalDateCheck();
    }//GEN-LAST:event_DateCheckInPropertyChange

    private void inputRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRoomActionPerformed
    
    private void CalDateCheck(){
        DCheckIn = DateCheckIn.getDate();
        DCheckOut = DateCheckOut.getDate();
        if(DCheckIn!=null && DCheckOut!=null){
            Day = (int) ((DCheckOut.getTime()-DCheckIn.getTime())/(1000 * 60 * 60 * 24));
            //System.out.println(Day);
            if(Day>0){
                submit.setEnabled(true);
                //Day = (int) ((DCheckOut.getTime()-DCheckIn.getTime())/(1000 * 60 * 60 * 24));
                PAmount = roomSelect.Price*Day;
                Amount.setText(Double.toString(PAmount));
            }else{
                submit.setEnabled(false);
                Amount.setText("");
            }
        }else{
            submit.setEnabled(false);
            Amount.setText("");
        }
    }
    private void setText(){
        checkroom.setText("");
        NoShow.setText("");
        TypeShow.setText("");
        PriceShow.setText("");
        DateCheckIn.setEnabled(false);
        DateCheckOut.setEnabled(false);
        inputIDCard.setEnabled(false);
        inputFName.setEnabled(false);
        inputLName.setEnabled(false);
        inputBirthday.setEnabled(false);
        inputSex.setEnabled(false);
        inputTel.setEnabled(false);
        inputAd.setEnabled(false);
        submit.setEnabled(false);
    }
            
    private class MaxLengthGeneric extends javax.swing.text.PlainDocument {

        private int maxChars;

        public MaxLengthGeneric(int limit) {
            super();
            this.maxChars = limit;
        }

        public void insertString(int offs, String str, AttributeSet a)
                throws BadLocationException {
            if (str != null && (getLength() + str.length() < maxChars)) {
                super.insertString(offs, str, a);
            }
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JLabel BirthdayLable;
    private javax.swing.JPanel CInfoPanel;
    private com.toedter.calendar.JDateChooser DateCheckIn;
    private com.toedter.calendar.JDateChooser DateCheckOut;
    private javax.swing.JLabel FNameLabel;
    private javax.swing.JLabel LNameLabel;
    private javax.swing.JLabel Labelcheckin;
    private javax.swing.JLabel Labelcheckout;
    private javax.swing.JLabel No;
    private javax.swing.JLabel NoShow;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel PriceShow;
    private javax.swing.JPanel RInfoPanel;
    private javax.swing.JLabel Room;
    private javax.swing.JLabel Type;
    private javax.swing.JLabel TypeShow;
    private javax.swing.JLabel ad;
    private javax.swing.JLabel alert;
    private javax.swing.JPanel checkdate;
    private javax.swing.JLabel checkroom;
    private javax.swing.JTextArea inputAd;
    private com.toedter.calendar.JDateChooser inputBirthday;
    private javax.swing.JTextField inputFName;
    private javax.swing.JTextField inputIDCard;
    private javax.swing.JTextField inputLName;
    private javax.swing.JTextField inputRoom;
    private javax.swing.JComboBox<String> inputSex;
    private javax.swing.JTextField inputTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel sex;
    private javax.swing.JButton submit;
    private javax.swing.JLabel tel;
    // End of variables declaration//GEN-END:variables
}


