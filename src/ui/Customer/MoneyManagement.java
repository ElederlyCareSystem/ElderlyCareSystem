/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Customer;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author snehalchavan
 */
public class MoneyManagement extends javax.swing.JPanel {

    /**
     * Creates new form MoneyManagement
     */
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount userAccount;
    JSplitPane servicesSplitPane;
    public MoneyManagement(JPanel userProcessContainer,EcoSystem system, UserAccount userAccount,JSplitPane servicesSplitPane) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.servicesSplitPane = servicesSplitPane;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        ImageHeader = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonAppointment = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(178, 215, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHeader.setBackground(new java.awt.Color(255, 255, 255));

        ImageHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/helpingHandsLogo.jpeg"))); // NOI18N

        Title.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        Title.setText("Helping Hands");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addComponent(ImageHeader)
                .addGap(20, 20, 20)
                .addComponent(Title)
                .addGap(0, 977, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

        jLabel1.setFont(new java.awt.Font("Palatino", 1, 24)); // NOI18N
        jLabel1.setText("Money Management");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 144, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Financial security goes hand-in-hand with peace of mind.\n\nFor many people, however, such security is elusive. Minor physical limitations, normal to the aging process, can be a threat to one's financial status. \nWe recognize that monthly bill paying and budgeting can sometimes be overwhelming. \nWith visual and/or dexterity impairments or short-term memory lapses,household bills pile up and credit card debt soon mounts. \nThe Money Management program helps people maintain their independence at home. \nTrained and insured volunteers work one-on-one with the consumer for a few hours each month to: ");
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 597, 901, 132));

        jButtonAppointment.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAppointment.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jButtonAppointment.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAppointment.setText("Book your Appointment");
        jButtonAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAppointmentActionPerformed(evt);
            }
        });
        add(jButtonAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 755, -1, 38));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Bank Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 755, 246, 38));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/moneyDesktop.jpeg"))); // NOI18N
        add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 189, 901, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAppointmentActionPerformed
        // TODO add your handling code here:
        MoneyAdviceAppointment adviceApointment = new MoneyAdviceAppointment(userProcessContainer,system,userAccount,servicesSplitPane);
        servicesSplitPane.setRightComponent(adviceApointment);
    }//GEN-LAST:event_jButtonAppointmentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BankDetails bankDetails = new BankDetails(userProcessContainer,system,userAccount,servicesSplitPane);
        servicesSplitPane.setRightComponent(bankDetails);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHeader;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAppointment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
