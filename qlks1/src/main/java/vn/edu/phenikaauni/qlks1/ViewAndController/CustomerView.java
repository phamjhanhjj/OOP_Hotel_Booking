
package vn.edu.phenikaauni.qlks1.ViewAndController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import vn.edu.phenikaauni.qlks1.Dao.CustomerDao;
import vn.edu.phenikaauni.qlks1.Dao.RoomDao;
import vn.edu.phenikaauni.qlks1.Entity.Customer;
import vn.edu.phenikaauni.qlks1.Entity.Room;

public final class CustomerView extends javax.swing.JFrame {

    public CustomerView() {
        initComponents();
        showDataCustomerTable();
        showDataRoomStatusTable();
        getDataFromTable();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cccdTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        payLabel = new javax.swing.JLabel();
        payTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        roomTypeComboBox = new javax.swing.JComboBox<>();
        roomNumberComboBox = new javax.swing.JComboBox<>();
        deleteButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        sortByNameButton = new javax.swing.JButton();
        sortByCccdButton = new javax.swing.JButton();
        payButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        roomStatusTable = new javax.swing.JTable();
        historyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        jLabel1.setText("MANAGE HOTEL RESERVATIONS");

        jLabel2.setText("Name");

        jLabel3.setText("CCCD");

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "CCCD", "Phone Number", "Room Type", "Room Number", "CheckIn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCustomer);

        jLabel7.setText("Booking Information");

        jLabel4.setText("Phone Number");

        jLabel5.setText("Room Type");

        jLabel9.setText("Room Number");

        jLabel6.setText("Search");

        jLabel8.setText("Total Payment");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        roomTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Single Room", "Double Room", "VIP Room" }));
        roomTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeComboBoxActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        sortByNameButton.setText("Sort By Name");
        sortByNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByNameButtonActionPerformed(evt);
            }
        });

        sortByCccdButton.setText("Sort By CCCD");
        sortByCccdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByCccdButtonActionPerformed(evt);
            }
        });

        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        roomStatusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(roomStatusTable);
        if (roomStatusTable.getColumnModel().getColumnCount() > 0) {
            roomStatusTable.getColumnModel().getColumn(0).setResizable(false);
            roomStatusTable.getColumnModel().getColumn(1).setResizable(false);
        }

        historyButton.setText("History");
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(payLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(historyButton)
                                        .addGap(12, 12, 12))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cccdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(roomTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(roomNumberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(sortByNameButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(sortByCccdButton))))
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(cccdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(roomTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roomNumberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchButton))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(sortByNameButton)
                                    .addComponent(sortByCccdButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(payTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(payLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(historyButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payButton)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //hien thi thong bao duoc nhap vao 
    public void showMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
    //lay du lieu khach hang dang duoc nhap trong textfield
    public Customer getCustomerFromTextField(){
        return new Customer(nameTextField.getText(), cccdTextField.getText(), phoneNumberTextField.getText(), roomTypeComboBox.getSelectedItem().toString(), roomNumberComboBox.getSelectedItem().toString(), LocalDateTime.now().toString());
    }
    
    //kiem tra cac truong thong tin co de trong hay khong
    public boolean validateName(){
        if (nameTextField.getText().equals("") || nameTextField.getText() == null){
            showMessage("Name cannot be blank!");
            nameTextField.requestFocus();
            return false;
        }
        return true;
    }
    public boolean validateCCCD(){
        if (cccdTextField.getText().equals("") || cccdTextField.getText() == null){
            showMessage("CCCD cannot be blank!");
            cccdTextField.requestFocus();
            return false;
        }
        return true;
    }
    public boolean validatePhoneNumber(){
        if (phoneNumberTextField.getText().equals("") || phoneNumberTextField.getText() == null){
            showMessage("Phone number cannot be blank!");
            phoneNumberTextField.requestFocus();
            return false;
        }
        return true;
    }
    public boolean validateRoomType(){
        if (roomTypeComboBox.getSelectedItem().toString().length() < 2){
            showMessage("Room type cannot be blank!");
            return false;
        }
        return true;
    }
    public boolean validateRoomNumber(){
        if (roomNumberComboBox.getSelectedItem().toString().length() < 2 || roomNumberComboBox.getSelectedItem()== null){
            showMessage("Room number cannot be blank!");
            return false;
        }
        return true;
    }
    public boolean checkValidateInfo(){
        if (validateName() && validateCCCD() && validatePhoneNumber() && validateRoomType() && validateRoomNumber()){
            return true;
        }
        return false;
    }
    
    //clear thong tin dang duoc nhap tai textfield
    public void clearTextField(){
        nameTextField.setText(null);
        cccdTextField.setText(null);
        phoneNumberTextField.setText(null);
        roomTypeComboBox.setSelectedIndex(0);
        roomNumberComboBox.removeAllItems();
        payTextField.setText(null);
    }
    
    //cap nhat du lieu customerTable
    public void showDataCustomerTable(){
        String[] columnName = {"Name", "CCCD", "Phone Number", "Room Type", "Room Number", "CheckIn"};
        DefaultTableModel model = new DefaultTableModel(columnName, 0);
        List<Customer> listCustomer = CustomerDao.readCustomerXML();
        for (Customer customer:listCustomer){
            model.addRow(new Object[]{customer.getName(), customer.getCccd(), customer.getPhoneNumber(), customer.getRoomType(), customer.getRoomNumber(), customer.getBookingDate()});
        }
        tableCustomer.setModel(model);
    }
    
    //lay du lieu tu dong duoc click tren table sau do hien thi len textfield
    public void getDataFromTable(){
        tableCustomer.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
           @Override
           public void valueChanged(ListSelectionEvent e) {
               addButton.setEnabled(false);
               if (!e.getValueIsAdjusting()) {
                   int selectedRow = tableCustomer.getSelectedRow();
                   if (selectedRow != -1) {
                       String cccd = (String)tableCustomer.getValueAt(selectedRow, 1);
                       List<Customer> listCustomer = CustomerDao.readCustomerXML();
                       for (Customer c:listCustomer){
                           if (c.getCccd().equals(cccd)){
                               nameTextField.setText(c.getName());
                               cccdTextField.setText(c.getCccd());
                               phoneNumberTextField.setText(c.getPhoneNumber());
                               roomTypeComboBox.setSelectedItem(c.getRoomType());
                               roomNumberComboBox.removeAllItems();
                               roomNumberComboBox.addItem(c.getRoomNumber());
                               payTextField.setText(""+getMoney(c));
                               break;
                           }
                       }
                   }
               }
           }
       });
    };
    
    //tinh so tien phai tra
    public double getMoney(Customer customer){
        LocalDateTime bookingDate = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        bookingDate = LocalDateTime.parse(customer.getBookingDate(), dateTimeFormatter);
        double price = customer.getRoomType().equals("Single Room")?200:(customer.getRoomType().equals("Double Room")?300:500);
        return price * (bookingDate.until(LocalDateTime.now(), ChronoUnit.HOURS) + 1);
    }    
    
    //kiem tra can cuoc cong dan da ton tai hay chua
    private boolean checkIdExist(){
        List<Customer> listCustomer = CustomerDao.readCustomerXML();
            for (Customer c:listCustomer){
                if (c.getCccd().equals(cccdTextField.getText())){
                    showMessage("CCCD already exists");
                    return true;
                }
            }
        return false;
    }
    
    //cap nhat du lieu roomStatusTable
    private void showDataRoomStatusTable(){
        String[] columnName = {"Name", "Status"};
        DefaultTableModel model = new DefaultTableModel(columnName, 0);
        List<Room> listRoom = RoomDao.readRoomXML();
        for (Room room:listRoom){
            model.addRow(new Object[]{room.getRoomNumber(), room.getRoomStatus()? ("unavailable"): ("available")});
        }
        roomStatusTable.setModel(model);        
    }
    private void roomTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeComboBoxActionPerformed
        roomNumberComboBox.removeAllItems();        //clear danh sach phong
        List<Room> listRoom = RoomDao.readRoomXML();
        String roomType = roomTypeComboBox.getSelectedItem().toString();
        for (Room r:listRoom){                                                  //kiem tra xem phong nao chua dung thi hien thi        
            if (r.getRoomType().equals(roomType) && !r.getRoomStatus()){        //
                roomNumberComboBox.addItem(r.getRoomNumber());                  //
            }
        }
    }//GEN-LAST:event_roomTypeComboBoxActionPerformed
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (checkValidateInfo() && !checkIdExist()){                  //kiem tra nhap du thong tin va check cccd trung lap
            Customer customer = getCustomerFromTextField();                                  
            CustomerDao.addCustomer(customer);
            RoomDao.changeRoomStatus(roomNumberComboBox.getSelectedItem().toString());
            clearTextField();
            showDataRoomStatusTable();
            showDataCustomerTable();
            showMessage("Addition successful!");
        }
    }//GEN-LAST:event_addButtonActionPerformed
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearTextField();
        tableCustomer.clearSelection();
        addButton.setEnabled(true);
    }//GEN-LAST:event_clearButtonActionPerformed
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        addButton.setEnabled(true);
        if (checkValidateInfo()){                                                           //cap nhat thong tin khach hang 
            Customer customer = getCustomerFromTextField();
            List<Customer> listCustomer = CustomerDao.readCustomerXML();
            for (Customer c:listCustomer){
                if (c.getCccd().equals(cccdTextField.getText())){
                    if (!c.getRoomNumber().equals(customer.getRoomNumber())){
                        RoomDao.changeRoomStatus(c.getRoomNumber());
                        RoomDao.changeRoomStatus(customer.getRoomNumber());
                    }
                    listCustomer.remove(c);
                    break;
                }
            }
            listCustomer.add(customer);
            CustomerDao.writeCustomerXML(listCustomer);
            clearTextField();
            showDataCustomerTable();
            showMessage("Edited Successfully!");
        }
    }//GEN-LAST:event_editButtonActionPerformed
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        if (tableCustomer.getSelectedRow() == -1){            //kiem tra da click doi tuong nao trong table chua
            addButton.setEnabled(true);
            return ;
        }
        int reply = JOptionPane.showConfirmDialog(null,  "The customer has not yet paid, will you continue ?", "", JOptionPane.YES_NO_OPTION);
        if (reply != 0){              //xac dinh lua chon xoa
            clearTextField();
            tableCustomer.clearSelection();
            addButton.setEnabled(true);
            return ;
        }
        if (checkValidateInfo()){
            Customer customer = new Customer(nameTextField.getText(), cccdTextField.getText(), phoneNumberTextField.getText(), roomTypeComboBox.getSelectedItem().toString(), roomNumberComboBox.getSelectedItem().toString(), LocalDateTime.now().toString(), LocalDateTime.now().toString());
            List<Customer> listCustomer = CustomerDao.readCustomerXML();
            RoomDao.changeRoomStatus(customer.getRoomNumber());
            for (Customer c:listCustomer){
               if (c.getCccd().equals(customer.getCccd())){
                   listCustomer.remove(c);
                   break;
               }
            }
            CustomerDao.writeCustomerXML(listCustomer);
        }
        showDataCustomerTable();
        showDataRoomStatusTable();
        clearTextField();
        showMessage("Deleted Successfully!");
        tableCustomer.clearSelection();
        addButton.setEnabled(true);
         
    }//GEN-LAST:event_deleteButtonActionPerformed
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String str = searchTextField.getText().toLowerCase();       //lay thong tin tim kiem
        List<Customer> listCustomers = CustomerDao.readCustomerXML();
        List<Customer> newListCustomer = new ArrayList<Customer>();
        for (Customer c:listCustomers){
            if (c.getName().toLowerCase().contains(str) || c.getCccd().toLowerCase().contains(str)){
                newListCustomer.add(c);
            }
        }
        
        //hien thi doi tuong tim kiem
        String[] columnName = {"Name", "CCCD", "Phone Number", "Room Type", "Room Number", "Booking Date"};
        DefaultTableModel model = new DefaultTableModel(columnName, 0);
        for (Customer customer:newListCustomer){
            model.addRow(new Object[]{customer.getName(), customer.getCccd(), customer.getPhoneNumber(), customer.getRoomType(), customer.getRoomNumber(), customer.getBookingDate()});
        }
        tableCustomer.setModel(model);
    }//GEN-LAST:event_searchButtonActionPerformed
    private void sortByNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByNameButtonActionPerformed
        List<Customer> listCustomer = CustomerDao.readCustomerXML();
        CustomerDao.sortByCustomerName(listCustomer);
        CustomerDao.writeCustomerXML(listCustomer);
        showDataCustomerTable();
    }//GEN-LAST:event_sortByNameButtonActionPerformed
    private void sortByCccdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByCccdButtonActionPerformed
        List<Customer> listCustomer = CustomerDao.readCustomerXML();
        CustomerDao.sortByCCCD(listCustomer);
        CustomerDao.writeCustomerXML(listCustomer);
        showDataCustomerTable();
    }//GEN-LAST:event_sortByCccdButtonActionPerformed
    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        if (tableCustomer.getSelectedRow() == -1){
            return ;
        }
        showMessage("The customer has paid!");
        Customer customer = new Customer(nameTextField.getText(), cccdTextField.getText(), phoneNumberTextField.getText(), roomTypeComboBox.getSelectedItem().toString(), roomNumberComboBox.getSelectedItem().toString(), LocalDateTime.now().toString(), LocalDateTime.now().toString());
            List<Customer> listCustomer = CustomerDao.readCustomerXML();
            RoomDao.changeRoomStatus(customer.getRoomNumber());
            for (Customer c:listCustomer){
               if (c.getCccd().equals(customer.getCccd())){
                   c.setPayingDate(LocalDateTime.now().toString());
                   CustomerDao.writeCustomerHistory(c);
                   listCustomer.remove(c);
                   break;
               }
            }
            CustomerDao.writeCustomerXML(listCustomer);
        showDataCustomerTable();
        showDataRoomStatusTable();
        clearTextField();
        addButton.setEnabled(true);
    }//GEN-LAST:event_payButtonActionPerformed

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        JFrame historyFrame = new JFrame("History");
        historyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        String[] columnName = {"Name", "CCCD", "Phone Number", "Room Type", "Room Number", "CheckIn", "CheckOut"};
        DefaultTableModel model = new DefaultTableModel(columnName, 0);
        List<Customer> listCustomer = CustomerDao.readCustomerXMLToHistory();
        for (Customer customer : listCustomer) {
            model.addRow(new Object[]{
                    customer.getName(),
                    customer.getCccd(),
                    customer.getPhoneNumber(),
                    customer.getRoomType(),
                    customer.getRoomNumber(),
                    customer.getBookingDate(),
                    customer.getPayingDate()
            });
        }
        JTable newTable = new JTable(model);
        for (int i = 0; i < columnName.length; i++) {
            newTable.getColumnModel().getColumn(i).setPreferredWidth(150);
        }
        JScrollPane scrollPane = new JScrollPane(newTable);
        historyFrame.getContentPane().add(scrollPane);
        historyFrame.setSize(800, 600);
        historyFrame.setVisible(true);

    }//GEN-LAST:event_historyButtonActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField cccdTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton historyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton payButton;
    private javax.swing.JLabel payLabel;
    private javax.swing.JTextField payTextField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JComboBox<String> roomNumberComboBox;
    private javax.swing.JTable roomStatusTable;
    private javax.swing.JComboBox<String> roomTypeComboBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton sortByCccdButton;
    private javax.swing.JButton sortByNameButton;
    private javax.swing.JTable tableCustomer;
    // End of variables declaration//GEN-END:variables
  
}
