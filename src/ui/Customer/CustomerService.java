/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Customer;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.LoginJpanel;
import ui.MainJFrame;

/**
 *
 * @author snehalchavan
 */
public class CustomerService extends javax.swing.JPanel {

    /**
     * Creates new form CustomerService
     */
    private String serviceName;
    private JPanel userProcessContainer;
    private EcoSystem system;
    public CustomerService(String orgName,JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.setSize(1680, 1050);
        serviceName = orgName;
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        if(serviceName != null) {
            switch(serviceName) {
                case "Nursing":
                    NursingServices nurse = new NursingServices(userProcessContainer,system);
                    servicesSplitPane.setRightComponent(nurse);
                    break;
                case "Grocery":
                    break;
                case "Profile":
                    break;
                case "PersonalCare":
                    break;
                case "Companion":
                    break;
                case "Legal":
                    break;
                default: break;
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

        servicesSplitPane = new javax.swing.JSplitPane();
        ServicesPanel = new javax.swing.JPanel();
        ProfileButton = new javax.swing.JButton();
        NursingButton = new javax.swing.JButton();
        TherapyButton = new javax.swing.JButton();
        CovidCareButton = new javax.swing.JButton();
        HomeHealthAideButton = new javax.swing.JButton();
        MoneyManagementButton = new javax.swing.JButton();
        LegalServicesButton = new javax.swing.JButton();
        MealDeliveryButton = new javax.swing.JButton();
        GroceryDeliveryButton = new javax.swing.JButton();
        HouseHoldCareButton = new javax.swing.JButton();
        HouseMaintainenceButton = new javax.swing.JButton();
        PersonalCareButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        ProfileButton.setText("Profile");
        ProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileButtonActionPerformed(evt);
            }
        });

        NursingButton.setText("Nursing");
        NursingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NursingButtonActionPerformed(evt);
            }
        });

        TherapyButton.setText("Therapy");
        TherapyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TherapyButtonActionPerformed(evt);
            }
        });

        CovidCareButton.setText("Covid Care");
        CovidCareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CovidCareButtonActionPerformed(evt);
            }
        });

        HomeHealthAideButton.setText("Home Health Aide");
        HomeHealthAideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeHealthAideButtonActionPerformed(evt);
            }
        });

        MoneyManagementButton.setText("Funds");
        MoneyManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyManagementButtonActionPerformed(evt);
            }
        });

        LegalServicesButton.setText("Legal");
        LegalServicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LegalServicesButtonActionPerformed(evt);
            }
        });

        MealDeliveryButton.setText("Meals");
        MealDeliveryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MealDeliveryButtonActionPerformed(evt);
            }
        });

        GroceryDeliveryButton.setText("Grocery");
        GroceryDeliveryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroceryDeliveryButtonActionPerformed(evt);
            }
        });

        HouseHoldCareButton.setText("Household Chore");
        HouseHoldCareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HouseHoldCareButtonActionPerformed(evt);
            }
        });

        HouseMaintainenceButton.setText("Household Maintainence");
        HouseMaintainenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HouseMaintainenceButtonActionPerformed(evt);
            }
        });

        PersonalCareButton.setText("Personal Care");
        PersonalCareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonalCareButtonActionPerformed(evt);
            }
        });

        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ServicesPanelLayout = new javax.swing.GroupLayout(ServicesPanel);
        ServicesPanel.setLayout(ServicesPanelLayout);
        ServicesPanelLayout.setHorizontalGroup(
            ServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProfileButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NursingButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CovidCareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HomeHealthAideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TherapyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MoneyManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LegalServicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GroceryDeliveryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MealDeliveryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PersonalCareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HouseMaintainenceButton, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
            .addComponent(HouseHoldCareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ServicesPanelLayout.setVerticalGroup(
            ServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicesPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(ProfileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NursingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CovidCareButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HomeHealthAideButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TherapyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoneyManagementButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LegalServicesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GroceryDeliveryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MealDeliveryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HouseHoldCareButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HouseMaintainenceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PersonalCareButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        servicesSplitPane.setLeftComponent(ServicesPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );

        servicesSplitPane.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(servicesSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(servicesSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileButtonActionPerformed
        // TODO add your handling code here:
        NewCustomerJPanel profile = new NewCustomerJPanel();
        servicesSplitPane.setRightComponent(profile);
    }//GEN-LAST:event_ProfileButtonActionPerformed

    private void NursingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NursingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NursingButtonActionPerformed

    private void TherapyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TherapyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TherapyButtonActionPerformed

    private void CovidCareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CovidCareButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CovidCareButtonActionPerformed

    private void HomeHealthAideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeHealthAideButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeHealthAideButtonActionPerformed

    private void MoneyManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyManagementButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoneyManagementButtonActionPerformed

    private void LegalServicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LegalServicesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LegalServicesButtonActionPerformed

    private void MealDeliveryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MealDeliveryButtonActionPerformed
        // TODO add your handling code here:
        OrderMeal profile = new OrderMeal();
        servicesSplitPane.setRightComponent(profile);
    }//GEN-LAST:event_MealDeliveryButtonActionPerformed

    private void GroceryDeliveryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroceryDeliveryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GroceryDeliveryButtonActionPerformed

    private void HouseHoldCareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HouseHoldCareButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HouseHoldCareButtonActionPerformed

    private void HouseMaintainenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HouseMaintainenceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HouseMaintainenceButtonActionPerformed

    private void PersonalCareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonalCareButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonalCareButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        new MainJFrame();
        
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CovidCareButton;
    private javax.swing.JButton GroceryDeliveryButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton HomeHealthAideButton;
    private javax.swing.JButton HouseHoldCareButton;
    private javax.swing.JButton HouseMaintainenceButton;
    private javax.swing.JButton LegalServicesButton;
    private javax.swing.JButton MealDeliveryButton;
    private javax.swing.JButton MoneyManagementButton;
    private javax.swing.JButton NursingButton;
    private javax.swing.JButton PersonalCareButton;
    private javax.swing.JButton ProfileButton;
    private javax.swing.JPanel ServicesPanel;
    private javax.swing.JButton TherapyButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JSplitPane servicesSplitPane;
    // End of variables declaration//GEN-END:variables
}
