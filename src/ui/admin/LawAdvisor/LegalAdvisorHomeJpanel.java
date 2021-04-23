/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin.LawAdvisor;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Organization.LegalServicesOrganization;
import Business.Organization.MoneyManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import ui.LoginJpanel;
import ui.admin.MoneyAdvisor.ManageMoneyAdvisorOrders;
import ui.admin.MoneyAdvisor.MoneyAdvisorAdminJPanel;

/**
 *
 * @author snehalchavan
 */
public class LegalAdvisorHomeJpanel extends javax.swing.JPanel {

    /**
     * Creates new form LegalAdvisorHomeJpanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Organization organization;
    private LegalServicesOrganization legalOrganization;
    String img="legalservices.jpeg";
    ImageIcon icon;
    DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public LegalAdvisorHomeJpanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = system;
        this.organization = organization;
        if (organization instanceof LegalServicesOrganization) {
                legalOrganization = ((LegalServicesOrganization) organization);
            }
//        getImageforOrganization(this.organization);
        icon = new ImageIcon(img);
        
        LegalAdvisorAdminJPanel home = new LegalAdvisorAdminJPanel(userProcessContainer,userAccount,system,legalOrganization,adminSplitPane,icon);
        adminSplitPane.setRightComponent(home);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminSplitPane = new javax.swing.JSplitPane();
        ServicesPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        EmployeeButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        OrdersButton = new javax.swing.JButton();
        profileIcon = new javax.swing.JLabel();
        profileNameText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        profileButton = new javax.swing.JButton();
        jPanelAdmin = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1480, 800));
        setRequestFocusEnabled(false);
        setSize(new java.awt.Dimension(1480, 800));

        adminSplitPane.setBorder(null);
        adminSplitPane.setDividerSize(0);
        adminSplitPane.setPreferredSize(new java.awt.Dimension(1480, 800));
        adminSplitPane.setSize(new java.awt.Dimension(1480, 800));

        ServicesPanel.setBackground(new java.awt.Color(102, 102, 102));

        homeButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        EmployeeButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        EmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeButton.setText("Manage Employee");
        EmployeeButton.setBorderPainted(false);
        EmployeeButton.setContentAreaFilled(false);
        EmployeeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeButtonActionPerformed(evt);
            }
        });

        LogoutButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutButton.setText("LogOut");
        LogoutButton.setBorderPainted(false);
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        OrdersButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        OrdersButton.setForeground(new java.awt.Color(255, 255, 255));
        OrdersButton.setText("Manage Orders");
        OrdersButton.setBorderPainted(false);
        OrdersButton.setContentAreaFilled(false);
        OrdersButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        OrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersButtonActionPerformed(evt);
            }
        });

        profileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/download_1_75x75.jpeg"))); // NOI18N

        profileNameText.setFont(new java.awt.Font("Palatino", 1, 24)); // NOI18N
        profileNameText.setForeground(new java.awt.Color(255, 255, 255));

        profileButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        profileButton.setForeground(new java.awt.Color(255, 255, 255));
        profileButton.setText("Profile");
        profileButton.setBorderPainted(false);
        profileButton.setContentAreaFilled(false);
        profileButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ServicesPanelLayout = new javax.swing.GroupLayout(ServicesPanel);
        ServicesPanel.setLayout(ServicesPanelLayout);
        ServicesPanelLayout.setHorizontalGroup(
            ServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EmployeeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(OrdersButton, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
            .addComponent(LogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ServicesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(profileNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(homeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(profileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ServicesPanelLayout.setVerticalGroup(
            ServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicesPanelLayout.createSequentialGroup()
                .addGroup(ServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServicesPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(profileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ServicesPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(profileNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeButton)
                .addGap(12, 12, 12)
                .addComponent(profileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmployeeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OrdersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogoutButton)
                .addContainerGap(498, Short.MAX_VALUE))
        );

        adminSplitPane.setLeftComponent(ServicesPanel);

        jPanelAdmin.setPreferredSize(new java.awt.Dimension(1254, 800));

        javax.swing.GroupLayout jPanelAdminLayout = new javax.swing.GroupLayout(jPanelAdmin);
        jPanelAdmin.setLayout(jPanelAdminLayout);
        jPanelAdminLayout.setHorizontalGroup(
            jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1254, Short.MAX_VALUE)
        );
        jPanelAdminLayout.setVerticalGroup(
            jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        adminSplitPane.setRightComponent(jPanelAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(adminSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
//        String imageforOrganization = getImageforOrganization(organization);
        LegalAdvisorAdminJPanel home = new LegalAdvisorAdminJPanel(userProcessContainer,userAccount,system,legalOrganization,adminSplitPane,icon);
        adminSplitPane.setRightComponent(home);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void EmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("moneeeesd testtttt"+legalOrganization.getConsultationAdvisor().size());
        LegalEmployeeOperations employee = new LegalEmployeeOperations(system, legalOrganization);
        adminSplitPane.setRightComponent(employee);
    }//GEN-LAST:event_EmployeeButtonActionPerformed

    private void OrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersButtonActionPerformed
        // TODO add your handling code here:
        ManageLegalAdvisorOrders order = new ManageLegalAdvisorOrders(userProcessContainer, userAccount, system, legalOrganization, adminSplitPane);
        adminSplitPane.setRightComponent(order);
    }//GEN-LAST:event_OrdersButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        // TODO add your handling code here:
        LegalAdvisorAdminProfile profile = new LegalAdvisorAdminProfile(userProcessContainer, userAccount, system, adminSplitPane);
        adminSplitPane.setRightComponent(profile);
    }//GEN-LAST:event_profileButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        dB4OUtil.storeSystem(system);
        EcoSystem system1 = dB4OUtil.retrieveSystem();
        JPanel loginPage = new LoginJpanel(userProcessContainer, system1);
        userProcessContainer.add("loginPage",loginPage);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_LogoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmployeeButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton OrdersButton;
    private javax.swing.JPanel ServicesPanel;
    private javax.swing.JSplitPane adminSplitPane;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanelAdmin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton profileButton;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JLabel profileNameText;
    // End of variables declaration//GEN-END:variables

    private void getImageforOrganization(Organization organization1) {
        if(organization1.getName().equals("Money Management Organization")){
            img = "moneyManage.jpeg";
        }else if(organization1.getName().equals("Legal Services Organization")){
            img = "legalservices.jpeg";
        }else if(organization1.getName().equals("GroceryAndEssentials Organization")){
            img = "";
        }else if(organization1.getName().equals("Food Organization")){
            img = "";
        }else if(organization1.getName().equals("CovidCare Organization")){
            img = "covidcareOrganization_630x375.jpeg";
        }else if(organization1.getName().equals("HealthAid Organization")){
            img = "";
        }else if(organization1.getName().equals("Therapy Organization")){
            img = "therapyOrganization_630x375.jpeg";
        }else if(organization1.getName().equals("Nurse Organization")){
            img = "nurseOrganization_630x375.jpeg";
        } else if(organization1.getName().equals("HouseHold Organization")){
            img = "houseHoldOrganization_630x375.jpeg";
        }
         
    }

    private void setAssignedOrganization(Organization organization) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
