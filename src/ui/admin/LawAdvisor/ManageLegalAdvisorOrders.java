/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin.LawAdvisor;

import Business.EcoSystem;
import Business.Organization.LegalServicesOrganization;
import Business.Organization.MoneyManagementOrganization;
import Business.Organization.NursingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LawFirmWorkRequest;
import Business.WorkQueue.MoneyWorkRequest;
import Business.WorkQueue.NursingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshikag
 */
public class ManageLegalAdvisorOrders extends javax.swing.JPanel {

    /**
     * Creates new form ManageLegalAdvisorOrders
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Organization organization;
    private LegalServicesOrganization legalOrganization;
    private LawFirmWorkRequest selectedDir;
    DefaultTableModel model;
    DefaultTableModel ordersModel;

    public ManageLegalAdvisorOrders(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system, Organization organization, JSplitPane adminSplitPane) {
        initComponents();
        assignLabel.setVisible(false);
        assignCombo.setVisible(false);
        finishBtn.setVisible(false);
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.legalOrganization = (LegalServicesOrganization) organization;
        model = new DefaultTableModel();
        ordersModel = new DefaultTableModel();
        orderTable.setModel(model);
        orderListTable.setModel(ordersModel);
        model.addColumn("Customer Username");
        model.addColumn("Date");
        model.addColumn("Time");
        model.addColumn("Cost");
        ordersModel.addColumn("Id");
        ordersModel.addColumn("Date");
        ordersModel.addColumn("Time");
        ordersModel.addColumn("Cost");
        ordersModel.addColumn("Status");
        viewOrderDirList();
        showUpdateList();
    }

    public void showUpdateList() {
//        System.out.println("nursingOrganization.getNurseEmployeeList() " + nursingOrganization.getNurseEmployeeList().get(0).getUsername());
        for (int i = 0; i < legalOrganization.getConsultationAdvisor().size(); i++) {
            assignCombo.addItem(legalOrganization.getConsultationAdvisor().get(i).getUsername());
        }
    }

    public void viewOrderDirList() {
        ordersModel.getDataVector().removeAllElements();
        for (int i = 0; i < legalOrganization.getWorkQueue().getWorkRequestList().size(); i++) {
            LawFirmWorkRequest advisor = (LawFirmWorkRequest) legalOrganization.getWorkQueue().getWorkRequestList().get(i);
            
            ordersModel.addRow(new Object[]{
                legalOrganization.getWorkQueue().getWorkRequestList().get(i).getId(),
                advisor.getDate(),
                advisor.getTimeSlot(),
                advisor.getConsultationFee(),
                legalOrganization.getWorkQueue().getWorkRequestList().get(i).getStatus()
            });
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

        finishBtn = new javax.swing.JButton();
        assignCombo = new javax.swing.JComboBox<>();
        rejectBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        acceptBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderListTable = new javax.swing.JTable();
        assignLabel = new javax.swing.JLabel();
        selectedButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        HeaderPanel = new javax.swing.JPanel();
        ImageHeader1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();

        setBackground(new java.awt.Color(178, 215, 229));

        finishBtn.setBackground(new java.awt.Color(0, 0, 0));
        finishBtn.setForeground(new java.awt.Color(255, 255, 255));
        finishBtn.setText("Finish");
        finishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishBtnActionPerformed(evt);
            }
        });

        assignCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignComboActionPerformed(evt);
            }
        });

        rejectBtn.setBackground(new java.awt.Color(0, 0, 0));
        rejectBtn.setForeground(new java.awt.Color(255, 255, 255));
        rejectBtn.setText("Reject");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View Selected Order");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(orderTable);

        acceptBtn.setBackground(new java.awt.Color(0, 0, 0));
        acceptBtn.setForeground(new java.awt.Color(255, 255, 255));
        acceptBtn.setText("Accept");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        orderListTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(orderListTable);

        assignLabel.setFont(new java.awt.Font("Palatino", 1, 14)); // NOI18N
        assignLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        assignLabel.setText("Assign Employee");

        selectedButton.setBackground(new java.awt.Color(0, 0, 0));
        selectedButton.setForeground(new java.awt.Color(255, 255, 255));
        selectedButton.setText("View Selected Order");
        selectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Orders");

        HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));

        ImageHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/helpingHandsLogo.jpeg"))); // NOI18N

        Title1.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        Title1.setText("Helping Hands");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addComponent(ImageHeader1)
                .addGap(20, 20, 20)
                .addComponent(Title1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Title1))
        );

        Title.setFont(new java.awt.Font("Palatino", 1, 28)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Manage Orders");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(assignLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(assignCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(finishBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(selectedButton)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn)
                    .addComponent(rejectBtn))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignLabel))
                .addGap(18, 18, 18)
                .addComponent(finishBtn)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void finishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishBtnActionPerformed
        // TODO add your handling code here:
        if (assignCombo.getSelectedItem() != null && selectedDir != null) {
            String selectedItem = (String) assignCombo.getSelectedItem();
            for (int j = 0; j < legalOrganization.getConsultationAdvisor().size(); j++) {
                if (legalOrganization.getConsultationAdvisor().get(j).getUsername().equals(selectedItem)) {
                    selectedDir.setReceiver(legalOrganization.getConsultationAdvisor().get(j));
                    selectedDir.setStatus("Accepted");
                    viewOrderDirList();
                    JOptionPane.showMessageDialog(this, "Service accepted and advisor assigned");
                    return;
                } 
            }
        }else {
                    JOptionPane.showMessageDialog(this, "Unable to assign a v currently");
        }
    }//GEN-LAST:event_finishBtnActionPerformed

    private void assignComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assignComboActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        // TODO add your handling code here:
        if (selectedDir != null) {
            assignLabel.setVisible(false);
            assignCombo.setVisible(false);
            finishBtn.setVisible(false);
            ordersModel.removeRow(orderListTable.getSelectedRow());
            selectedDir.setStatus("Rejected");
            for (int i = 0; i < legalOrganization.getWorkQueue().getWorkRequestList().size(); i++) {
                if (legalOrganization.getWorkQueue().getWorkRequestList().get(i).getId() == (selectedDir.getId())) {
                    legalOrganization.getWorkQueue().getWorkRequestList().remove(i);
                    JOptionPane.showMessageDialog(this, "Service rejected");
                    viewOrderDirList();
                    break;
                }
            }
        }
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        // TODO add your handling code here:
        if (selectedDir != null) {
//            selectedDir.setStatus("Accepted");
            assignLabel.setVisible(true);
            assignCombo.setVisible(true);
            finishBtn.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Select a order first");
        }
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void selectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedButtonActionPerformed
        // TODO add your handling code here:
        if (orderListTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        String b = String.valueOf(ordersModel.getValueAt(orderListTable.getSelectedRow(), 4));
        if (!b.equalsIgnoreCase("Ordered")) {
            JOptionPane.showMessageDialog(this, "Cant select a completed service");
            return;
        }
//        String a = String.valueOf(ordersModel.getValueAt(orderListTable.getSelectedRow(), 1));
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        selectedDir = (LawFirmWorkRequest) legalOrganization.getWorkQueue().getWorkRequestList().get(orderListTable.getSelectedRow());
        model.addRow(new Object[]{
            selectedDir.getSender().getUsername(),
            selectedDir.getDate(),
            selectedDir.getTimeSlot(),
            selectedDir.getConsultationFee()
        });
    }//GEN-LAST:event_selectedButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel ImageHeader1;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JButton acceptBtn;
    private javax.swing.JComboBox<String> assignCombo;
    private javax.swing.JLabel assignLabel;
    private javax.swing.JButton finishBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable orderListTable;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JButton selectedButton;
    // End of variables declaration//GEN-END:variables
}
