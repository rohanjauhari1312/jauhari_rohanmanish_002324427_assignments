/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import model.Person;
import model.PersonDirectory;
/**
 *
 * @author rohanjauhari
 */
public class CreateJPanel extends javax.swing.JPanel {
    Person person;
    PersonDirectory personDirectory;
    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(PersonDirectory pd) {
        personDirectory = pd;
        initComponents();
        if (personDirectory.getHistory().size()==0){
        Person person1 = personDirectory.addNewPerson();
            person1.setFirstName("Tony");
            person1.setAge("50".getBytes()[0]);
            person1.setLastName("Stark");
            person1.setSsn("123456789");
            person1.setHomeAddress("Malibu","California",Integer.valueOf("12345"),"Los Angeles",Integer.valueOf("1"),Long.valueOf("9876543210"));
            person1.setWorkAddress("Malibu","California",Integer.valueOf("12345"),"Los Angeles",Integer.valueOf("1"),Long.valueOf("9876543210"));
            
            Person person2 = personDirectory.addNewPerson();
            person2.setFirstName("Captain");
            person2.setAge("30".getBytes()[0]);
            person2.setLastName("America");
            person2.setSsn("123456789");
            person2.setHomeAddress("Brooklyn","New York",Integer.valueOf("12345"),"Brooklyn",Integer.valueOf("1"),Long.valueOf("9876543210"));
            person2.setWorkAddress("Brooklyn","New York",Integer.valueOf("12345"),"Brooklyn",Integer.valueOf("1"),Long.valueOf("9876543210"));
            
            Person person3 = personDirectory.addNewPerson();
            person3.setFirstName("Dr");
            person3.setAge("50".getBytes()[0]);
            person3.setLastName("Strange");
            person3.setSsn("123456789");
            person3.setHomeAddress("London","England",Integer.valueOf("12345"),"London",Integer.valueOf("1"),Long.valueOf("9876543210"));
            person3.setWorkAddress("London","England",Integer.valueOf("12345"),"London",Integer.valueOf("1"),Long.valueOf("9876543210"));
            
            Person person4 = personDirectory.addNewPerson();
            person4.setFirstName("Black");
            person4.setAge("30".getBytes()[0]);
            person4.setLastName("Panther");
            person4.setSsn("123456789");
            person4.setHomeAddress("Wakanda","Africa",Integer.valueOf("12345"),"Wakanda",Integer.valueOf("1"),Long.valueOf("9876543210"));
            person4.setWorkAddress("Wakanda","Africa",Integer.valueOf("12345"),"Wakanda",Integer.valueOf("1"),Long.valueOf("9876543210"));
            
            Person person5 = personDirectory.addNewPerson();
            person5.setFirstName("Thor");
            person5.setAge("30".getBytes()[0]);
            person5.setLastName("Odinson");
            person5.setSsn("123456789");
            person5.setHomeAddress("Asgard","Heaven",Integer.valueOf("12345"),"Asgard",Integer.valueOf("1"),Long.valueOf("9876543210"));
            person5.setWorkAddress("Asgard","Heaven",Integer.valueOf("12345"),"Asgard",Integer.valueOf("1"),Long.valueOf("9876543210"));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        pnlWorkAddress = new javax.swing.JPanel();
        txtPhoneW = new javax.swing.JTextField();
        txtStreetW = new javax.swing.JTextField();
        txtUnitW = new javax.swing.JTextField();
        txtZipW = new javax.swing.JTextField();
        txtCityW = new javax.swing.JTextField();
        txtStateW = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        pnlHomeAddress = new javax.swing.JPanel();
        txtPhoneH = new javax.swing.JTextField();
        txtStreetH = new javax.swing.JTextField();
        txtUnitH = new javax.swing.JTextField();
        txtZipH = new javax.swing.JTextField();
        txtCityH = new javax.swing.JTextField();
        txtStateH = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblHomeAddress = new javax.swing.JLabel();
        lblWorkAddress = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 197, 214));

        txtFirstName.setToolTipText("");

        txtLastName.setToolTipText("");

        txtSSN.setToolTipText("");

        txtAge.setToolTipText("");

        pnlWorkAddress.setBackground(new java.awt.Color(204, 255, 204));

        jLabel11.setText("Street");

        jLabel12.setText("Unit");

        jLabel13.setText("City");

        jLabel14.setText("State");

        jLabel15.setText("Zip");

        jLabel16.setText("Phone");

        javax.swing.GroupLayout pnlWorkAddressLayout = new javax.swing.GroupLayout(pnlWorkAddress);
        pnlWorkAddress.setLayout(pnlWorkAddressLayout);
        pnlWorkAddressLayout.setHorizontalGroup(
            pnlWorkAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWorkAddressLayout.createSequentialGroup()
                .addGroup(pnlWorkAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWorkAddressLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtZipW, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWorkAddressLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlWorkAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWorkAddressLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCityW, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWorkAddressLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStreetW, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))))
                .addGroup(pnlWorkAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlWorkAddressLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStateW, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(pnlWorkAddressLayout.createSequentialGroup()
                        .addGroup(pnlWorkAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlWorkAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhoneW, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnitW, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))))
        );
        pnlWorkAddressLayout.setVerticalGroup(
            pnlWorkAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWorkAddressLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlWorkAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreetW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnitW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(pnlWorkAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCityW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtStateW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGroup(pnlWorkAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWorkAddressLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(pnlWorkAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtZipW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWorkAddressLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlWorkAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(40, 40, 40))))
        );

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        pnlHomeAddress.setBackground(new java.awt.Color(204, 255, 204));
        pnlHomeAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setText("Street");

        jLabel6.setText("Unit");

        jLabel7.setText("City");

        jLabel8.setText("State");

        jLabel9.setText("Zip");

        jLabel10.setText("Phone");

        javax.swing.GroupLayout pnlHomeAddressLayout = new javax.swing.GroupLayout(pnlHomeAddress);
        pnlHomeAddress.setLayout(pnlHomeAddressLayout);
        pnlHomeAddressLayout.setHorizontalGroup(
            pnlHomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeAddressLayout.createSequentialGroup()
                .addGroup(pnlHomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeAddressLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeAddressLayout.createSequentialGroup()
                        .addGroup(pnlHomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlHomeAddressLayout.createSequentialGroup()
                                .addGroup(pnlHomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlHomeAddressLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHomeAddressLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlHomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCityH, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtZipH, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))))
                                .addGap(48, 48, 48))
                            .addGroup(pnlHomeAddressLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStreetH, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlHomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUnitH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlHomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPhoneH, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtStateH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        pnlHomeAddressLayout.setVerticalGroup(
            pnlHomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeAddressLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlHomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreetH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnitH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlHomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCityH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtStateH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(53, 53, 53)
                .addGroup(pnlHomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZipH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(23, 23, 23))
        );

        lblHomeAddress.setText("Home Address");

        lblWorkAddress.setText("Work Address");

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Social Security Number");

        jLabel4.setText("Age");

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel17.setText("Details of a person");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(pnlHomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(pnlWorkAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLastName)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblWorkAddress)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHomeAddress)
                    .addComponent(lblWorkAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlHomeAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlWorkAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        
        if (txtFirstName.getText().isBlank()||txtLastName.getText().isBlank()||txtAge.getText().isBlank()||txtSSN.getText().isBlank()||txtStreetH.getText().isBlank()||txtStateH.getText().isBlank()||txtZipH.getText().isBlank()||txtCityH.getText().isBlank()||txtUnitH.getText().isBlank()||txtPhoneW.getText().isBlank()||txtUnitW.getText().isBlank()||txtCityW.getText().isBlank()||txtZipW.getText().isBlank()||txtStateW.getText().isBlank()||txtStreetW.getText().isBlank())
            JOptionPane.showMessageDialog(this, "Something is empty..", "Information", JOptionPane. INFORMATION_MESSAGE) ;
        else{
            
            try{
                Integer.parseInt(txtAge.getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Age is not a number", "Warning", JOptionPane.WARNING_MESSAGE) ;
            return;
            }
            
            try{
                Integer.parseInt(txtSSN.getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "SSN is not a number", "Warning", JOptionPane.WARNING_MESSAGE) ;
            return;
            }
            
            try{
                Integer.parseInt(txtZipH.getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Home zip is not a number", "Warning", JOptionPane.WARNING_MESSAGE) ;
            return;
            }
            
            try{
                Integer.parseInt(txtZipW.getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Work zip is not a number", "Warning", JOptionPane.WARNING_MESSAGE) ;
            }
            
            try{
                Long.parseLong(txtPhoneH.getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Home Phone is not a number", "Warning", JOptionPane.WARNING_MESSAGE) ;
            return;
            }
            
            try{
                Long.parseLong(txtPhoneW.getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Work Phone is not a number", "Warning", JOptionPane.WARNING_MESSAGE) ;
            return;
            }
            
            try{
                Integer.parseInt(txtUnitH.getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Home unit is not a number", "Warning", JOptionPane.WARNING_MESSAGE) ;
            return;
            }
            
            try{
                Integer.parseInt(txtUnitW.getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Work unit is not a number", "Warning", JOptionPane.WARNING_MESSAGE) ;
            return;
            }
            
            
                Person person = personDirectory.addNewPerson();
                person.setFirstName(txtFirstName.getText());
                System.out.println(txtAge);
                person.setAge(Byte.valueOf(txtAge.getText()));
                person.setLastName(txtLastName.getText());
                person.setSsn(txtSSN.getText());
                person.setHomeAddress(txtStreetH.getText(),txtStateH.getText(),Integer.valueOf(txtZipH.getText()),txtCityH.getText(),Integer.valueOf(txtUnitH.getText()),Long.valueOf(txtPhoneH.getText()));
                person.setWorkAddress(txtStreetW.getText(),txtStateW.getText(),Integer.valueOf(txtZipW.getText()),txtCityW.getText(),Integer.valueOf(txtUnitW.getText()),Long.valueOf(txtPhoneW.getText()));
        
            JOptionPane.showMessageDialog(this, "Person successfully created.", "Information", JOptionPane. INFORMATION_MESSAGE) ;
            txtFirstName.setText("");
            txtLastName.setText("");
            txtAge.setText("");
            txtSSN.setText("");
            txtStreetH.setText("");
            txtStateH.setText("");
            txtZipH.setText("");
            txtCityH.setText("");
            txtUnitH.setText("");
            txtPhoneH.setText("");
            txtStreetW.setText("");
            txtStateW.setText("");
            txtZipW.setText("");
            txtCityW.setText("");
            txtUnitW.setText("");
            txtPhoneW.setText("");
        }
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblHomeAddress;
    private javax.swing.JLabel lblWorkAddress;
    private javax.swing.JPanel pnlHomeAddress;
    private javax.swing.JPanel pnlWorkAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCityH;
    private javax.swing.JTextField txtCityW;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneH;
    private javax.swing.JTextField txtPhoneW;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtStateH;
    private javax.swing.JTextField txtStateW;
    private javax.swing.JTextField txtStreetH;
    private javax.swing.JTextField txtStreetW;
    private javax.swing.JTextField txtUnitH;
    private javax.swing.JTextField txtUnitW;
    private javax.swing.JTextField txtZipH;
    private javax.swing.JTextField txtZipW;
    // End of variables declaration//GEN-END:variables
}
