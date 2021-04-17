/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Customer;

import Business.EcoSystem;
import Business.Organization.NursingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CovidCareWorkRequest;
import Business.WorkQueue.NursingWorkRequest;
import Business.WorkQueue.TherapyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshikag
 */
public class ServiceCart extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    DefaultTableModel nurseModel;
    DefaultTableModel therapyModel;
    DefaultTableModel covidModel;
    NursingOrganization org;
    UserAccount userAccount;
    NursingWorkRequest nurseRequest;
    TherapyWorkRequest therapyRequest;
    CovidCareWorkRequest covidCareRequest;

    /**
     * Creates new form ServiceCart
     */
    public ServiceCart(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount) {
        initComponents();
        this.userAccount = userAccount;
        this.system = business;
        this.userProcessContainer = userProcessContainer;
        createModel();
        createTherapyModel();
        createCovidModel();

        viewNursingData();
        viewTherapyData();
        viewCovidCareData();
    }

    public void createCovidModel() {
        covidModel = new DefaultTableModel();
        covidCareTable.setModel(covidModel);
        covidModel.addColumn("Request Id");
        covidModel.addColumn("Appointment Date");
    }

    public void createModel() {
        nurseModel = new DefaultTableModel();
        nursingTable.setModel(nurseModel);
        nurseModel.addColumn("Request Id");
        nurseModel.addColumn("Category");
        nurseModel.addColumn("Price");
    }

    public void createTherapyModel() {
        therapyModel = new DefaultTableModel();
        therapyTable.setModel(therapyModel);
        therapyModel.addColumn("Request Id");
        therapyModel.addColumn("Category");
        therapyModel.addColumn("Price");
    }

    public void viewNursingData() {
        for (WorkRequest workrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workrequest instanceof NursingWorkRequest) {
                nurseRequest = ((NursingWorkRequest) workrequest);
                nurseModel.addRow(new Object[]{
                    nurseRequest.getId(), nurseRequest.getServiceCategory(), nurseRequest.getPrice()
                });
            }
        }
    }

    public void viewTherapyData() {
        for (WorkRequest workrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workrequest instanceof TherapyWorkRequest) {
                therapyRequest = ((TherapyWorkRequest) workrequest);
                therapyModel.addRow(new Object[]{
                    therapyRequest.getId(), therapyRequest.getServiceCategory(), therapyRequest.getPrice()
                });
            }
        }
    }

    public void viewCovidCareData() {
        for (WorkRequest workrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workrequest instanceof CovidCareWorkRequest) {
                covidCareRequest = ((CovidCareWorkRequest) workrequest);
                covidModel.addRow(new Object[]{
                    covidCareRequest.getId(), covidCareRequest.getAppointmentDate()
                });
            }
        }
    }

    public void removeWorkRequest(DefaultTableModel model, JTable table, int id) {
        for (WorkRequest workrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workrequest.getId() == id) {
                System.out.println(workrequest.getId() + " req");
                userAccount.getWorkQueue().getWorkRequestList().remove(workrequest);
                model.removeRow(table.getSelectedRow());
                break;
            }
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

        headerPanel = new javax.swing.JPanel();
        ImageHeader1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        NursingPanel = new javax.swing.JPanel();
        nursingTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nursingTable = new javax.swing.JTable();
        removeNurseReqBtn = new javax.swing.JButton();
        cartTitle = new javax.swing.JLabel();
        TherapyPanel = new javax.swing.JPanel();
        therapyTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        therapyTable = new javax.swing.JTable();
        removeTherapyReqBtn = new javax.swing.JButton();
        CovidCarePanel = new javax.swing.JPanel();
        covidCareTitle = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        covidCareTable = new javax.swing.JTable();
        removeCovidCareReqBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(178, 215, 229));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        ImageHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/helpingHandsLogo.jpeg"))); // NOI18N

        Title1.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        Title1.setText("Helping Hands");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(ImageHeader1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(ImageHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(178, 215, 229));

        NursingPanel.setOpaque(false);

        nursingTitle.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        nursingTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nursingTitle.setText("Nursing Services");

        nursingTable.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        nursingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(nursingTable);

        removeNurseReqBtn.setBackground(new java.awt.Color(0, 0, 0));
        removeNurseReqBtn.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        removeNurseReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeNurseReqBtn.setText("Remove Selected Request");
        removeNurseReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNurseReqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NursingPanelLayout = new javax.swing.GroupLayout(NursingPanel);
        NursingPanel.setLayout(NursingPanelLayout);
        NursingPanelLayout.setHorizontalGroup(
            NursingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NursingPanelLayout.createSequentialGroup()
                .addGroup(NursingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NursingPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(removeNurseReqBtn)
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(nursingTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        NursingPanelLayout.setVerticalGroup(
            NursingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NursingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nursingTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(removeNurseReqBtn)
                .addContainerGap())
        );

        cartTitle.setFont(new java.awt.Font("Palatino", 1, 24)); // NOI18N
        cartTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartTitle.setText("My Cart");

        TherapyPanel.setOpaque(false);

        therapyTitle.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        therapyTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        therapyTitle.setText("Therapy Services");

        therapyTable.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        therapyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(therapyTable);

        removeTherapyReqBtn.setBackground(new java.awt.Color(0, 0, 0));
        removeTherapyReqBtn.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        removeTherapyReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeTherapyReqBtn.setText("Remove Selected Request");
        removeTherapyReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTherapyReqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TherapyPanelLayout = new javax.swing.GroupLayout(TherapyPanel);
        TherapyPanel.setLayout(TherapyPanelLayout);
        TherapyPanelLayout.setHorizontalGroup(
            TherapyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TherapyPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(removeTherapyReqBtn)
                .addContainerGap(85, Short.MAX_VALUE))
            .addComponent(therapyTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TherapyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        TherapyPanelLayout.setVerticalGroup(
            TherapyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TherapyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(therapyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(removeTherapyReqBtn)
                .addContainerGap())
        );

        CovidCarePanel.setOpaque(false);

        covidCareTitle.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        covidCareTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        covidCareTitle.setText("Covid Care Services");

        covidCareTable.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        covidCareTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(covidCareTable);

        removeCovidCareReqBtn.setBackground(new java.awt.Color(0, 0, 0));
        removeCovidCareReqBtn.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        removeCovidCareReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeCovidCareReqBtn.setText("Remove Selected Request");
        removeCovidCareReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCovidCareReqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CovidCarePanelLayout = new javax.swing.GroupLayout(CovidCarePanel);
        CovidCarePanel.setLayout(CovidCarePanelLayout);
        CovidCarePanelLayout.setHorizontalGroup(
            CovidCarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CovidCarePanelLayout.createSequentialGroup()
                .addGroup(CovidCarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CovidCarePanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(removeCovidCareReqBtn)
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(covidCareTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        CovidCarePanelLayout.setVerticalGroup(
            CovidCarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CovidCarePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(covidCareTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(removeCovidCareReqBtn)
                .addContainerGap())
        );

        confirmBtn.setBackground(new java.awt.Color(0, 0, 0));
        confirmBtn.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        confirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmBtn.setText("Confirm Order");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NursingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(TherapyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(CovidCarePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cartTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmBtn)
                .addGap(460, 460, 460))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cartTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                            .addComponent(NursingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CovidCarePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(TherapyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addComponent(confirmBtn)
                .addContainerGap(481, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeNurseReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNurseReqBtnActionPerformed
        // TODO add your handling code here:
        if (nursingTable.getSelectedRow() >= 0) {
            int id = Integer.parseInt(String.valueOf(nursingTable.getValueAt(nursingTable.getSelectedRow(), 0)));
            removeWorkRequest(nurseModel, nursingTable, id);
            JOptionPane.showMessageDialog(this, "Entry removed successfully");
        } else {
            JOptionPane.showMessageDialog(this, "No service list to remove");
        }

    }//GEN-LAST:event_removeNurseReqBtnActionPerformed

    private void removeTherapyReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTherapyReqBtnActionPerformed
        // TODO add your handling code here:
        if (therapyTable.getSelectedRow() >= 0) {
            int id = Integer.parseInt(String.valueOf(therapyTable.getValueAt(therapyTable.getSelectedRow(), 0)));
            removeWorkRequest(therapyModel, therapyTable, id);
            JOptionPane.showMessageDialog(this, "Entry removed successfully");
        } else {
            JOptionPane.showMessageDialog(this, "No service list to remove");
        }
    }//GEN-LAST:event_removeTherapyReqBtnActionPerformed

    private void removeCovidCareReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCovidCareReqBtnActionPerformed
        // TODO add your handling code here:
        if (covidCareTable.getSelectedRow() >= 0) {
            int id = Integer.parseInt(String.valueOf(covidCareTable.getValueAt(covidCareTable.getSelectedRow(), 0)));
            removeWorkRequest(covidModel, covidCareTable, id);
            JOptionPane.showMessageDialog(this, "Entry removed successfully");
        } else {
            JOptionPane.showMessageDialog(this, "No service list to remove");
        }
    }//GEN-LAST:event_removeCovidCareReqBtnActionPerformed

    public void setWorkRequest(String enterprise, String organization) {
        Organization therapyOrganization = system.getNetwork().getEnterpriseDirectory().getOrganizationByType(enterprise, organization);
        if (therapyOrganization != null) {
            therapyOrganization.getWorkQueue().setWorkRequestList(userAccount.getWorkQueue().getWorkRequestList());
        }
    }
    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        setWorkRequest("Medical", "Therapy Organization");
        setWorkRequest("Medical", "Nurse Organization");
        setWorkRequest("Medical", "CovidCare Organization");

        if (userAccount.getWorkQueue().getWorkRequestList().size() > 0) {
            setWorkRequest("Medical", "Therapy Organization");
            setWorkRequest("Medical", "Nurse Organization");
            setWorkRequest("Medical", "CovidCare Organization");
            JOptionPane.showMessageDialog(this, "Order Confirmed");
        } else {
            JOptionPane.showMessageDialog(this, "No Order Placed");
        }
    }//GEN-LAST:event_confirmBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CovidCarePanel;
    private javax.swing.JLabel ImageHeader1;
    private javax.swing.JPanel NursingPanel;
    private javax.swing.JPanel TherapyPanel;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel cartTitle;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JTable covidCareTable;
    private javax.swing.JLabel covidCareTitle;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable nursingTable;
    private javax.swing.JLabel nursingTitle;
    private javax.swing.JButton removeCovidCareReqBtn;
    private javax.swing.JButton removeNurseReqBtn;
    private javax.swing.JButton removeTherapyReqBtn;
    private javax.swing.JTable therapyTable;
    private javax.swing.JLabel therapyTitle;
    // End of variables declaration//GEN-END:variables
}
