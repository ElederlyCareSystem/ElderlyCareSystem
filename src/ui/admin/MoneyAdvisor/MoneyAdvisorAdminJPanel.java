/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin.MoneyAdvisor;

import Business.EcoSystem;
import Business.Organization.LegalServicesOrganization;
import Business.Organization.MoneyManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author snehalchavan
 */
public class MoneyAdvisorAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form adminHomeJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount userAccount;
    MoneyManagementOrganization moneyOrganization;
    LegalServicesOrganization legalOrganization;
    JSplitPane adminSplitPane;
   Organization organization1;

    MoneyAdvisorAdminJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system, MoneyManagementOrganization moneyOrganization,JSplitPane adminSplitPane, Icon img) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
//        this.organization = (MoneyManagementOrganization) organization;
        this.moneyOrganization = moneyOrganization;
        
        String name = moneyOrganization.getName();
        
        this.adminSplitPane = adminSplitPane;
//        
//        if(organization.getName().equals("MoneyManagement")){
//            this.moneyOrganization = (MoneyManagementOrganization) organization;
//            
//            
//        }else if(organization.getName().equals("LegalServices")){
//            this.legalOrganization = (LegalServicesOrganization) organization;
//        }
        
        System.out.println("home jpanel..."+moneyOrganization.getName());
        jLabel_OrganizationName.setText(moneyOrganization.getName());
        jLabel_image.setIcon(img);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel3 = new javax.swing.JPanel();
        ImageHeader4 = new javax.swing.JLabel();
        Title4 = new javax.swing.JLabel();
        jLabel_OrganizationName = new javax.swing.JLabel();
        jLabel_image = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1480, 800));
        setSize(new java.awt.Dimension(1480, 800));
        setBackground(new java.awt.Color(178, 215, 229));

        HeaderPanel3.setBackground(new java.awt.Color(255, 255, 255));
        HeaderPanel3.setPreferredSize(new java.awt.Dimension(1254, 116));
        HeaderPanel3.setSize(new java.awt.Dimension(1254, 116));

        ImageHeader4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/helpingHandsLogo.jpeg"))); // NOI18N

        Title4.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        Title4.setText("Helping Hands");

        javax.swing.GroupLayout HeaderPanel3Layout = new javax.swing.GroupLayout(HeaderPanel3);
        HeaderPanel3.setLayout(HeaderPanel3Layout);
        HeaderPanel3Layout.setHorizontalGroup(
            HeaderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanel3Layout.createSequentialGroup()
                .addComponent(ImageHeader4)
                .addGap(20, 20, 20)
                .addComponent(Title4)
                .addGap(0, 977, Short.MAX_VALUE))
        );
        HeaderPanel3Layout.setVerticalGroup(
            HeaderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanel3Layout.createSequentialGroup()
                .addGroup(HeaderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HeaderPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Title4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_OrganizationName.setFont(new java.awt.Font("Palatino", 1, 28)); // NOI18N
        jLabel_OrganizationName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OrganizationName.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1480, Short.MAX_VALUE)
            .addComponent(jLabel_OrganizationName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel_OrganizationName)
                .addGap(30, 30, 30)
                .addComponent(jLabel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel3;
    private javax.swing.JLabel ImageHeader4;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel jLabel_OrganizationName;
    private javax.swing.JLabel jLabel_image;
    // End of variables declaration//GEN-END:variables
}
