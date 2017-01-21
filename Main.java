package systemroom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame implements RoomList, TableModel, CustomersList, HistoryList {

    public Main() {   
       
        initComponents();
        setTableModel(Rtable);
        Rtable.setAutoCreateRowSorter(rootPaneCheckingEnabled);
        //Rtable.getColumnModel().getColumn(1).setPreferredWidth(200); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        by = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tab = new javax.swing.JTabbedPane();
        RoomTab = new javax.swing.JPanel();
        PaneTable = new javax.swing.JScrollPane();
        Rtable = new javax.swing.JTable();
        ShowRoom = new javax.swing.JComboBox<>();
        checkin = new javax.swing.JButton();
        checkout = new javax.swing.JButton();
        searchroomPanel = new javax.swing.JPanel();
        text_search_r = new javax.swing.JLabel();
        search_r = new javax.swing.JTextField();
        HistoryTab = new javax.swing.JPanel();
        searchhistoryPanel = new javax.swing.JPanel();
        text_search_ch = new javax.swing.JLabel();
        search_ch = new javax.swing.JTextField();
        HDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Htable = new javax.swing.JTable();
        CustomersTab = new javax.swing.JPanel();
        searchcustomersPanel = new javax.swing.JPanel();
        text_search_c = new javax.swing.JLabel();
        search_c = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ctable = new javax.swing.JTable();
        CDelete = new javax.swing.JButton();
        CEdit = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        add = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Room Rental");

        by.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel1.setText("Passakorn Rattanaprapan");

        javax.swing.GroupLayout byLayout = new javax.swing.GroupLayout(by);
        by.setLayout(byLayout);
        byLayout.setHorizontalGroup(
            byLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, byLayout.createSequentialGroup()
                .addContainerGap(566, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(54, 54, 54))
        );
        byLayout.setVerticalGroup(
            byLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        desktopPane.add(by);
        by.setBounds(-20, 370, 750, 30);

        Rtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Room Number", "Type of Room", "Price", "Status"
            }
        ){
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            public boolean isCellEditable(int row, int column){
                return false;
            };
            /*public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }*/
        });
        //MyTableModel model = new MyTableModel();
        Rtable.setRequestFocusEnabled(false);
        Rtable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Rtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RtableMouseClicked(evt);
            }
        });
        PaneTable.setViewportView(Rtable);
        Rtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        ShowRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Available Room", "Busy Room" }));
        ShowRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowRoomActionPerformed(evt);
            }
        });

        checkin.setText("Check In");
        checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinActionPerformed(evt);
            }
        });

        checkout.setText("Check Out");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        text_search_r.setForeground(new java.awt.Color(0, 0, 0));
        text_search_r.setText("Search Room  :");

        search_r.setDocument(new MaxLengthGeneric(4));
        search_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_rActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchroomPanelLayout = new javax.swing.GroupLayout(searchroomPanel);
        searchroomPanel.setLayout(searchroomPanelLayout);
        searchroomPanelLayout.setHorizontalGroup(
            searchroomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchroomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text_search_r)
                .addGap(10, 10, 10)
                .addComponent(search_r, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        searchroomPanelLayout.setVerticalGroup(
            searchroomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchroomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(text_search_r, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(search_r))
        );

        javax.swing.GroupLayout RoomTabLayout = new javax.swing.GroupLayout(RoomTab);
        RoomTab.setLayout(RoomTabLayout);
        RoomTabLayout.setHorizontalGroup(
            RoomTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoomTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RoomTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchroomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RoomTabLayout.createSequentialGroup()
                        .addGroup(RoomTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ShowRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        RoomTabLayout.setVerticalGroup(
            RoomTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchroomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RoomTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RoomTabLayout.createSequentialGroup()
                        .addComponent(ShowRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(checkin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkout))
                    .addComponent(PaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ShowRoom.getAccessibleContext().setAccessibleName("106");
        checkin.getAccessibleContext().setAccessibleName("106");
        checkout.getAccessibleContext().setAccessibleName("106");

        Tab.addTab("Room", RoomTab);

        text_search_ch.setForeground(new java.awt.Color(0, 0, 0));
        text_search_ch.setText("Search Customer  :");

        search_r.setDocument(new MaxLengthGeneric(4));
        search_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_chActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchhistoryPanelLayout = new javax.swing.GroupLayout(searchhistoryPanel);
        searchhistoryPanel.setLayout(searchhistoryPanelLayout);
        searchhistoryPanelLayout.setHorizontalGroup(
            searchhistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchhistoryPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text_search_ch)
                .addGap(10, 10, 10)
                .addComponent(search_ch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        searchhistoryPanelLayout.setVerticalGroup(
            searchhistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchhistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(text_search_ch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(search_ch))
        );

        HDelete.setText("Delete");
        HDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HDeleteActionPerformed(evt);
            }
        });

        jScrollPane3.setAutoscrolls(true);

        Htable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Card", "Room", "Check-In", "Check-Out", "Days", "Amount"
            }
        ){
            public boolean isCellEditable(int row, int column){
                return false;
            };
        });
        Htable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(Htable);

        javax.swing.GroupLayout HistoryTabLayout = new javax.swing.GroupLayout(HistoryTab);
        HistoryTab.setLayout(HistoryTabLayout);
        HistoryTabLayout.setHorizontalGroup(
            HistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchhistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HistoryTabLayout.createSequentialGroup()
                        .addComponent(HDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        HistoryTabLayout.setVerticalGroup(
            HistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchhistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HistoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HDelete))
                .addGap(38, 38, 38))
        );

        Tab.addTab("History", HistoryTab);

        text_search_c.setForeground(new java.awt.Color(0, 0, 0));
        text_search_c.setText("Search by Customer ID  :");

        search_r.setDocument(new MaxLengthGeneric(4));
        search_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_cActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchcustomersPanelLayout = new javax.swing.GroupLayout(searchcustomersPanel);
        searchcustomersPanel.setLayout(searchcustomersPanelLayout);
        searchcustomersPanelLayout.setHorizontalGroup(
            searchcustomersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchcustomersPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text_search_c)
                .addGap(10, 10, 10)
                .addComponent(search_c, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        searchcustomersPanelLayout.setVerticalGroup(
            searchcustomersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchcustomersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(text_search_c, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(search_c))
        );

        jScrollPane2.setAutoscrolls(true);

        Ctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ){
            public boolean isCellEditable(int row, int column){
                return false;
            };
        });
        Ctable.setFocusable(false);
        Ctable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(Ctable);

        CDelete.setText("Delete");
        CDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDeleteActionPerformed(evt);
            }
        });

        CEdit.setText("Edit");
        CEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CustomersTabLayout = new javax.swing.GroupLayout(CustomersTab);
        CustomersTab.setLayout(CustomersTabLayout);
        CustomersTabLayout.setHorizontalGroup(
            CustomersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomersTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CustomersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchcustomersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CustomersTabLayout.createSequentialGroup()
                        .addGroup(CustomersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        CustomersTabLayout.setVerticalGroup(
            CustomersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomersTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchcustomersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CustomersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomersTabLayout.createSequentialGroup()
                        .addComponent(CEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CDelete))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        Tab.addTab("Customers", CustomersTab);

        desktopPane.add(Tab);
        Tab.setBounds(0, 0, 700, 370);
        Tab.getAccessibleContext().setAccessibleName("106");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Room");

        add.setMnemonic('y');
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        editMenu.add(add);

        edit.setMnemonic('p');
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        editMenu.add(edit);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void checkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinActionPerformed
        new FormCheckIn().setVisible(true);
    }//GEN-LAST:event_checkinActionPerformed

    private void search_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_rActionPerformed
        if(search_r.getText().length() == 3){
            TRoomSearch.setRowCount(0);
            setTRoomSearch(new String[] {"No", "Type of Room", "Price", "Status"});
            
            for(int i=0;i<TRoomAll.getRowCount();i++){
                try{
                    if(TRoomBusy.getValueAt(i, 0).equals(search_r.getText())){
                        setTRoomSearch(new String[] {"No", "Type of Room", "Price", "Status" , "ID Card", "Check-In", "Check-out"});
                        TRoomSearch.addRow(new Object[] {TRoomBusy.getValueAt(i, 0),TRoomBusy.getValueAt(i, 1),TRoomBusy.getValueAt(i, 2),TRoomBusy.getValueAt(i, 3),TRoomBusy.getValueAt(i, 4),TRoomBusy.getValueAt(i, 5),TRoomBusy.getValueAt(i, 6)});
                        System.out.println("TRoomBusy"+TRoomBusy.getValueAt(i, 0));
                        break;
                    }
                }catch(Exception e){
                    System.out.println("Except");
                }
                
                if(TRoomAll.getValueAt(i, 0).equals(search_r.getText())){
                    if(TRoomAll.getValueAt(i, 3).equals("Busy")){ continue; }
                    TRoomSearch.addRow(new Object[] {TRoomAll.getValueAt(i, 0),TRoomAll.getValueAt(i, 1),TRoomAll.getValueAt(i, 2),TRoomAll.getValueAt(i, 3)}); 
                    System.out.println("TRoomAll"+TRoomAll.getValueAt(i, 0));
                    break;
                    
                }
                
            }
            Rtable.setModel(TRoomSearch);
        }
    }//GEN-LAST:event_search_rActionPerformed
    
    private void setTRoomSearch(String[] columns){
        TRoomSearch.setColumnCount(0);
        for(String column : columns){
            TRoomSearch.addColumn(column);
        }
    }
    
    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        new FormCheckOut().setVisible(true);
    }//GEN-LAST:event_checkoutActionPerformed

    private void ShowRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowRoomActionPerformed
        if(ShowRoom.getSelectedItem().toString().equals("All")){
            Rtable.setModel(TRoomAll);
        }else if(ShowRoom.getSelectedItem().toString().equals("Available Room")){
            Rtable.setModel(TRoomAvailable);
        }else if(ShowRoom.getSelectedItem().toString().equals("Busy Room")){
            Rtable.setModel(TRoomBusy);   
        }
    }//GEN-LAST:event_ShowRoomActionPerformed

    private void search_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_cActionPerformed
        if(!search_c.getText().isEmpty()){
            TCustomersSearch.setRowCount(0);
            for(Customers c : Customer){
                if(c.ID.equals(search_c.getText())){
                    TCustomersSearch.addRow(new Object[] {c.ID,c.FName,c.LName,c.Birthday,c.Sex,c.Tel,c.Ad});
                }
            }
            Ctable.setModel(TCustomersSearch);
        }else{
            Ctable.setModel(TCustomers);
        }
    }//GEN-LAST:event_search_cActionPerformed

    private void CDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDeleteActionPerformed
        if(Customer.size()>0){
        int row = Ctable.getSelectedRow();
        System.out.print(row);
        if(JOptionPane.showConfirmDialog(null, "Do you want delete customer?", "Delete Confirm", WIDTH)==0){
            for(Customers c : Customer){
                if(TCustomers.getValueAt(row, 0).equals(c.ID) ){
                    Customer.remove(c);
                    TCustomers.removeRow(row);
                    try{
                    TCustomersSearch.removeRow(row);
                    }catch(Exception e){}
                    break;
                }
            }
        }
        }
    }//GEN-LAST:event_CDeleteActionPerformed

    private void CEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEditActionPerformed
        int row = Ctable.getSelectedRow();
        if(Ctable.getSelectedRow()!=-1){
            if(Customer.size()>0){
                //if(JOptionPane.showConfirmDialog(null, "Do You Edit Customer?", "Edit Confirm", WIDTH)==0){
                for(Customers c : Customer){
                    if(TCustomers.getValueAt(row, 0).equals(c.ID) ){
                        new EditCustomer(c).setVisible(true);
                    }
                }
                //}
            }
        }
    }//GEN-LAST:event_CEditActionPerformed

    private void HDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HDeleteActionPerformed
        DateFormat DateFormat = new SimpleDateFormat("d/M/y");
        if(History.size()>0){
        int row = Htable.getSelectedRow();
        if(JOptionPane.showConfirmDialog(null, "Do you want delete history?", "Delete Confirm", WIDTH)==0){
            for(History h : History){
                System.out.println(h.CheckOut.toString());
                if(THistory.getValueAt(row, 0).equals(h.ID) && THistory.getValueAt(row, 1).equals(h.Room) && THistory.getValueAt(row, 2).equals(DateFormat.format(h.CheckIn)) && THistory.getValueAt(row, 3).equals(DateFormat.format(h.CheckOut)) ){
                    History.remove(h);
                    THistory.removeRow(row);
                    try{
                    THistorySearch.removeRow(row);
                    }catch(Exception e){}
                    System.out.println("Delete HR");
                }
            }
        }
        }
    }//GEN-LAST:event_HDeleteActionPerformed

    private void search_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_chActionPerformed
        DateFormat DateFormat = new SimpleDateFormat("d/M/y");
        System.out.println(search_c.getText().isEmpty());
        if(!search_ch.getText().isEmpty()){
            System.out.println("k");
            THistorySearch.setRowCount(0);
            for(History h : History){
                if(h.ID.equals(search_ch.getText())){
                    THistorySearch.addRow(new Object[] {h.ID,h.Room,DateFormat.format(h.CheckIn),DateFormat.format(h.CheckOut),h.Day,h.Amount});
                }
            }
            Htable.setModel(THistorySearch);
        }else{
            System.out.println("j");
            Htable.setModel(THistory);
        }
    }//GEN-LAST:event_search_chActionPerformed

    private void RtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RtableMouseClicked
        if(evt.getClickCount() == 2){
            int row = Rtable.rowAtPoint(evt.getPoint());
            String RID = Rtable.getValueAt(row,0).toString();
            String Status = Rtable.getValueAt(row,3).toString();
            if(Status.equals("Available")){
                for(Room r : RAll){
                    if(RID.equals(r.RID)){
                        System.out.println("Room : "+r.RID);
                        break;
                    }
                }
            }else{
                for(Room r : RAll){
                    if(RID.equals(r.RID)){
                        System.out.println("Room : "+r.RID);
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_RtableMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        new addRoom().setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        new editRoom().setVisible(true);
    }//GEN-LAST:event_editActionPerformed
    
    
    
    private void setTableModel(javax.swing.JTable Rtable) { 
        
        for(Room r : RAll){
            TRoomAll.addRow(new Object[] {r.RID,r.Type,r.Price,r.Status});
            if(r.Status.equals("Available")){
                TRoomAvailable.addRow(new Object[] {r.RID,r.Type,r.Price,r.Status});
                //RAvailable.add(r);
            }
        }
        if(Customer.size()!=0){
            for(Customers c : Customer){
                TCustomers.addRow(new Object[] {c.ID,c.FName,c.LName,c.Birthday,c.Sex,c.Tel,c.Ad});
            }
        }
        if(History.size()!=0){
            for(History h : History){
                THistory.addRow(new Object[] {h.ID,h.Room,h.CheckIn,h.CheckOut,h.Day,h.Amount});
            }
        }
        Rtable.setModel(TRoomAll);
        Ctable.setModel(TCustomers);
        Htable.setModel(THistory);
        
        
        
        //TCustomers.addRow(new Object[] {"asd","wer","rty","bnm","cxrrv","iyyu","ss"});
        //Customer.add(new Customers("asd","wer","rty","bnm","cxrrv","iyyu","ss"));
        //TCustomers.addRow(new Object[] {"sdf","ww","rty","bneem","cxv","ittyyu","ss"});
        //Customer.add(new Customers("sdf","ww","rty","bneem","cxv","ittyyu","ss"));
        
    }  
    
    class MaxLengthGeneric extends javax.swing.text.PlainDocument {

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

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CDelete;
    private javax.swing.JButton CEdit;
    private javax.swing.JTable Ctable;
    private javax.swing.JPanel CustomersTab;
    private javax.swing.JButton HDelete;
    private javax.swing.JPanel HistoryTab;
    private javax.swing.JTable Htable;
    private javax.swing.JScrollPane PaneTable;
    private javax.swing.JPanel RoomTab;
    private javax.swing.JTable Rtable;
    private javax.swing.JComboBox<String> ShowRoom;
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem add;
    private javax.swing.JPanel by;
    private javax.swing.JButton checkin;
    private javax.swing.JButton checkout;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem edit;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextField search_c;
    private javax.swing.JTextField search_ch;
    private javax.swing.JTextField search_r;
    private javax.swing.JPanel searchcustomersPanel;
    private javax.swing.JPanel searchhistoryPanel;
    private javax.swing.JPanel searchroomPanel;
    private javax.swing.JLabel text_search_c;
    private javax.swing.JLabel text_search_ch;
    private javax.swing.JLabel text_search_r;
    // End of variables declaration//GEN-END:variables

}

interface TableModel {
    DefaultTableModel TRoomAll = new DefaultTableModel(new Object [][] {},new String [] {"No", "Type of Room", "Price", "Status"}){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
        
    DefaultTableModel TRoomAvailable = new DefaultTableModel(new Object [][] {},new String [] {"No", "Type of Room", "Price", "Status"}){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
        
    DefaultTableModel TRoomBusy = new DefaultTableModel(new Object [][] {},new String [] { "No", "Type of Room", "Price", "Status" , "ID Card", "Check-In", "Check-out"}){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
        
    DefaultTableModel TRoomSearch = new DefaultTableModel(new Object [][] {},new String [] {"No", "Type of Room", "Price", "Status"}){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
        
    DefaultTableModel TCustomers = new DefaultTableModel(new Object [][] {},new String [] {"ID Card", "First Name", "Last Name", "Birthday", "Sex", "Tel Phone", "Address"}){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
                
            };
    
    DefaultTableModel TCustomersSearch = new DefaultTableModel(new Object [][] {},new String [] {"ID Card", "First Name", "Last Name", "Birthday", "Sex", "Tel Phone", "Address"}){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
                
            };
    
    DefaultTableModel THistory = new DefaultTableModel(new Object [][] {},new String [] {"ID Card", "Room", "Check-In", "Check-Out", "Days", "Amount"}){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
                
            };
    
    DefaultTableModel THistorySearch = new DefaultTableModel(new Object [][] {},new String [] {"ID Card", "Room", "Check-In", "Check-Out", "Days", "Amount"}){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
                
            };
    
}

