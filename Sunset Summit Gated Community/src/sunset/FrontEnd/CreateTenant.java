/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunset.FrontEnd;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sunset.BackEnd.*;
import sunset.domain.*;

/* FILENAME: CreateTenant
 * DESCRIPTION: This class will be called from MainWindow in order to accomplish
 *              the task of creating a new tenant within the database.  
 * @author Jose
 */
public class CreateTenant extends javax.swing.JFrame {

    /**
     * Creates new form NewTenant
     */
    public CreateTenant() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        btHome = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        jlpTenantInfo = new javax.swing.JLayeredPane();
        tfFirstName = new javax.swing.JTextField();
        lbLastName = new javax.swing.JLabel();
        lbStreetAddress = new javax.swing.JLabel();
        tfStreetAddress = new javax.swing.JTextField();
        lbCity = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        lbState = new javax.swing.JLabel();
        lbZipCode = new javax.swing.JLabel();
        tfZipCode = new javax.swing.JTextField();
        lbTelephone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        lbFirstName = new javax.swing.JLabel();
        lbAptNum = new javax.swing.JLabel();
        tfApt = new javax.swing.JTextField();
        lbSpecialNeeds = new javax.swing.JLabel();
        tfSpecialNeeds = new javax.swing.JTextField();
        lbDOB = new javax.swing.JLabel();
        tfDOB = new javax.swing.JFormattedTextField();
        tfPhone = new javax.swing.JFormattedTextField();
        tfState = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        tfTenantID = new javax.swing.JTextField();
        jlpLeaseInfo = new javax.swing.JLayeredPane();
        lbDuration = new javax.swing.JLabel();
        tfDuration = new javax.swing.JTextField();
        lbStartDate = new javax.swing.JLabel();
        lbEndDate = new javax.swing.JLabel();
        tfStartDate = new javax.swing.JFormattedTextField();
        tfEndDate = new javax.swing.JFormattedTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lbRentCost = new javax.swing.JLabel();
        tfRentCost = new javax.swing.JFormattedTextField();
        lbDueDate = new javax.swing.JLabel();
        tfDueDate = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Tenant");

        btHome.setText("Home");
        btHome.setPreferredSize(new java.awt.Dimension(87, 65));
        btHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHomeActionPerformed(evt);
            }
        });

        btSave.setText("Save");
        btSave.setPreferredSize(new java.awt.Dimension(87, 65));
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btClear.setText("Clear");
        btClear.setPreferredSize(new java.awt.Dimension(87, 65));
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        jlpTenantInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tenant Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        lbLastName.setText("Last:");

        lbStreetAddress.setText("Street: ");

        lbCity.setText("City:");

        lbState.setText("State:");

        lbZipCode.setText("Zip Code:");

        lbTelephone.setText("Tel: ");

        lbEmail.setText("Email:");

        lbFirstName.setText("First: ");

        lbAptNum.setText("Apt #:");

        lbSpecialNeeds.setText("Special:");

        lbDOB.setText("DOB");

        tfDOB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        tfDOB.setToolTipText("");

        tfPhone.setColumns(10);
        try {
            tfPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tfState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY" }));

        jLabel1.setText("Tenant ID");

        tfTenantID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTenantIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jlpTenantInfoLayout = new javax.swing.GroupLayout(jlpTenantInfo);
        jlpTenantInfo.setLayout(jlpTenantInfoLayout);
        jlpTenantInfoLayout.setHorizontalGroup(
            jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpTenantInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jlpTenantInfoLayout.createSequentialGroup()
                        .addComponent(lbSpecialNeeds)
                        .addGap(18, 18, 18)
                        .addComponent(tfSpecialNeeds))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jlpTenantInfoLayout.createSequentialGroup()
                        .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbStreetAddress)
                            .addComponent(lbCity)
                            .addComponent(lbTelephone)
                            .addComponent(lbDOB)
                            .addComponent(lbFirstName))
                        .addGap(22, 22, 22)
                        .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpTenantInfoLayout.createSequentialGroup()
                                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jlpTenantInfoLayout.createSequentialGroup()
                                        .addComponent(tfStreetAddress)
                                        .addGap(55, 55, 55))
                                    .addGroup(jlpTenantInfoLayout.createSequentialGroup()
                                        .addComponent(tfCity)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbState)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbAptNum))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfApt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jlpTenantInfoLayout.createSequentialGroup()
                                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jlpTenantInfoLayout.createSequentialGroup()
                                        .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpTenantInfoLayout.createSequentialGroup()
                                        .addComponent(tfDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTenantID)
                                    .addComponent(tfLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpTenantInfoLayout.createSequentialGroup()
                                .addComponent(tfPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpTenantInfoLayout.setVerticalGroup(
            jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpTenantInfoLayout.createSequentialGroup()
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFirstName)
                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLastName)
                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDOB)
                    .addComponent(tfDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfTenantID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStreetAddress)
                    .addComponent(tfStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAptNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCity)
                        .addComponent(lbZipCode)
                        .addComponent(tfZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbState)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTelephone)
                        .addComponent(lbEmail)
                        .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSpecialNeeds)
                    .addComponent(tfSpecialNeeds, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpTenantInfo.setLayer(tfFirstName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbLastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbStreetAddress, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfStreetAddress, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbCity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfCity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbState, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbZipCode, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfZipCode, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbTelephone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfLastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbFirstName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbAptNum, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfApt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbSpecialNeeds, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfSpecialNeeds, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbDOB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfDOB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfPhone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfState, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfTenantID, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jlpLeaseInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lease Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        lbDuration.setText("Duration:");

        lbStartDate.setText("Start Date:");

        lbEndDate.setText("End Date:");

        tfStartDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        tfEndDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        javax.swing.GroupLayout jlpLeaseInfoLayout = new javax.swing.GroupLayout(jlpLeaseInfo);
        jlpLeaseInfo.setLayout(jlpLeaseInfoLayout);
        jlpLeaseInfoLayout.setHorizontalGroup(
            jlpLeaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpLeaseInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpLeaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jlpLeaseInfoLayout.createSequentialGroup()
                        .addComponent(lbDuration)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jlpLeaseInfoLayout.createSequentialGroup()
                        .addGroup(jlpLeaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbStartDate)
                            .addComponent(lbEndDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jlpLeaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(tfEndDate))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jlpLeaseInfoLayout.setVerticalGroup(
            jlpLeaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpLeaseInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpLeaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDuration)
                    .addComponent(tfDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpLeaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStartDate)
                    .addComponent(tfStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpLeaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndDate)
                    .addComponent(tfEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jlpLeaseInfo.setLayer(lbDuration, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpLeaseInfo.setLayer(tfDuration, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpLeaseInfo.setLayer(lbStartDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpLeaseInfo.setLayer(lbEndDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpLeaseInfo.setLayer(tfStartDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpLeaseInfo.setLayer(tfEndDate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rent Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 3, 13))); // NOI18N

        lbRentCost.setText("Rent Cost:");

        tfRentCost.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        lbDueDate.setText("Due Date:");

        tfDueDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDueDate)
                    .addComponent(lbRentCost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDueDate)
                    .addComponent(tfRentCost))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRentCost)
                    .addComponent(tfRentCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDueDate)
                    .addComponent(tfDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(lbRentCost, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tfRentCost, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lbDueDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tfDueDate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setText("All Dates must be Enter as the following YYYY-MM-DD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlpTenantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane1)
                            .addComponent(jlpLeaseInfo))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btHome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlpLeaseInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlpTenantInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btHome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * btHomeActionPerformed will send the GUI back to the home 
     * GUI menu
     * @param evt 
     */
    private void btHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHomeActionPerformed
        new MainWindow().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btHomeActionPerformed

    /**
     * btClearActionPerformed will clear all data fields 
     * @param evt 
     */
    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        this.tfApt.setText("");
        this.tfCity.setText("");
        this.tfDuration.setText("");
        this.tfEmail.setText("");
        this.tfEndDate.setText("");
        this.tfFirstName.setText("");
        this.tfLastName.setText("");
        this.tfStartDate.setText("");
        this.tfStreetAddress.setText("");
        this.tfPhone.setText("");
        this.tfZipCode.setText("");
        this.tfSpecialNeeds.setText("");
        this.tfDOB.setText("");
        this.tfTenantID.setText("");
        this.tfDueDate.setText("");
        this.tfRentCost.setText("");
        
    }//GEN-LAST:event_btClearActionPerformed

    /**
     * btSaveActionPerformed will save all of the data sending it to
     * the backend for processing into the database
     * @param evt 
     */
    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
      
        Tenant currentTenant = new Tenant();
        Residence lease = new Residence();
        
        currentTenant.setBirthDate(tfDOB.getText());
        currentTenant.setFirstName(tfFirstName.getText());
        currentTenant.setLastName(tfLastName.getText());
        currentTenant.setStreet(tfStreetAddress.getText());
        currentTenant.setCity(tfCity.getText());
        currentTenant.setState(tfState.getSelectedItem().toString());
        currentTenant.setPhoneNum(tfPhone.getText());
        currentTenant.setZip(tfZipCode.getText());
        currentTenant.setEmail(tfEmail.getText());
        currentTenant.setSpecNeeds(tfSpecialNeeds.getText());
        currentTenant.setTenantID(Integer.parseInt(tfTenantID.getText()));
        currentTenant.setApt(tfApt.getText());
        lease.setResID(Integer.parseInt(tfTenantID.getText()));
        lease.setEnd(tfEndDate.getText());
        lease.setStart(tfStartDate.getText());
        lease.setDuration(tfDuration.getText());
        lease.setRentCost(tfRentCost.getText());
        lease.setAptNum(tfApt.getText());
        
        currentTenant.setLease(lease);
        
        DBConnectionMgr connect = new DBConnectionMgr();
        boolean flag = false;
        try {
            flag = connect.addTenant(currentTenant);
            
        } catch (Exception ex) {
            Logger.getLogger(CreateTenant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
          if(flag){
              JOptionPane.showMessageDialog(null, "Tenant Added");
          }
          else
              JOptionPane.showMessageDialog(null, "Unable to add Tenant!");
                    
        } catch (Exception ex) {
            Logger.getLogger(CreateTenant.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        
        new MainWindow().setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_btSaveActionPerformed

    private void tfTenantIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTenantIDActionPerformed

    }//GEN-LAST:event_tfTenantIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : 
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateTenant.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateTenant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btHome;
    private javax.swing.JButton btSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLayeredPane jlpLeaseInfo;
    private javax.swing.JLayeredPane jlpTenantInfo;
    private javax.swing.JLabel lbAptNum;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbDOB;
    private javax.swing.JLabel lbDueDate;
    private javax.swing.JLabel lbDuration;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndDate;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbRentCost;
    private javax.swing.JLabel lbSpecialNeeds;
    private javax.swing.JLabel lbStartDate;
    private javax.swing.JLabel lbState;
    private javax.swing.JLabel lbStreetAddress;
    private javax.swing.JLabel lbTelephone;
    private javax.swing.JLabel lbZipCode;
    private javax.swing.JTextField tfApt;
    private javax.swing.JTextField tfCity;
    private javax.swing.JFormattedTextField tfDOB;
    private javax.swing.JFormattedTextField tfDueDate;
    private javax.swing.JTextField tfDuration;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JFormattedTextField tfEndDate;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JFormattedTextField tfPhone;
    private javax.swing.JFormattedTextField tfRentCost;
    private javax.swing.JTextField tfSpecialNeeds;
    private javax.swing.JFormattedTextField tfStartDate;
    private javax.swing.JComboBox tfState;
    private javax.swing.JTextField tfStreetAddress;
    private javax.swing.JTextField tfTenantID;
    private javax.swing.JTextField tfZipCode;
    // End of variables declaration//GEN-END:variables
}