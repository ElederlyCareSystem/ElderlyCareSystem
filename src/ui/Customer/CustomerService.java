/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Customer;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
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
    private UserAccount userAccount;
    public CustomerService(String orgName,JPanel userProcessContainer, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.setSize(1680, 1050);
        this.userAccount = userAccount;
        serviceName = orgName;
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        profileNameText.setText(userAccount.getEmployee().getName());
        if(serviceName != null) {
            switch(serviceName) {
                case "Nursing":
                    NursingServices nurse = new NursingServices(userProcessContainer,system, userAccount);
                    servicesSplitPane.setRightComponent(nurse);
                    NursingButton.setBorderPainted(true);
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
                    ElderLawFirm lawfirm = new ElderLawFirm(userProcessContainer, system, userAccount, servicesSplitPane);
                    servicesSplitPane.setRightComponent(lawfirm);
                    LegalServicesButton.setBorderPainted(true);
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
        MoneyManagementButton = new javax.swing.JButton();
        LegalServicesButton = new javax.swing.JButton();
        MealDeliveryButton = new javax.swing.JButton();
        GroceryDeliveryButton = new javax.swing.JButton();
        HouseHoldCareButton = new javax.swing.JButton();
        HouseMaintainenceButton = new javax.swing.JButton();
        PersonalCareButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        profileIcon = new javax.swing.JLabel();
        profileNameText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        CartBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        servicesSplitPane.setBorder(null);
        servicesSplitPane.setDividerSize(0);

        ServicesPanel.setBackground(new java.awt.Color(102, 102, 102));

        ProfileButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        ProfileButton.setForeground(new java.awt.Color(255, 255, 255));
        ProfileButton.setText("Profile");
        ProfileButton.setBorderPainted(false);
        ProfileButton.setContentAreaFilled(false);
        ProfileButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileButtonActionPerformed(evt);
            }
        });

        NursingButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        NursingButton.setForeground(new java.awt.Color(255, 255, 255));
        NursingButton.setText("Nursing");
        NursingButton.setBorderPainted(false);
        NursingButton.setContentAreaFilled(false);
        NursingButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NursingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NursingButtonActionPerformed(evt);
            }
        });

        TherapyButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        TherapyButton.setForeground(new java.awt.Color(255, 255, 255));
        TherapyButton.setText("Therapy");
        TherapyButton.setBorderPainted(false);
        TherapyButton.setContentAreaFilled(false);
        TherapyButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TherapyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TherapyButtonActionPerformed(evt);
            }
        });

        CovidCareButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        CovidCareButton.setForeground(new java.awt.Color(255, 255, 255));
        CovidCareButton.setText("Covid Care");
        CovidCareButton.setBorderPainted(false);
        CovidCareButton.setContentAreaFilled(false);
        CovidCareButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CovidCareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CovidCareButtonActionPerformed(evt);
            }
        });

        MoneyManagementButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        MoneyManagementButton.setForeground(new java.awt.Color(255, 255, 255));
        MoneyManagementButton.setText("Funds");
        MoneyManagementButton.setBorderPainted(false);
        MoneyManagementButton.setContentAreaFilled(false);
        MoneyManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MoneyManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyManagementButtonActionPerformed(evt);
            }
        });

        LegalServicesButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        LegalServicesButton.setForeground(new java.awt.Color(255, 255, 255));
        LegalServicesButton.setText("Legal");
        LegalServicesButton.setBorderPainted(false);
        LegalServicesButton.setContentAreaFilled(false);
        LegalServicesButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LegalServicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LegalServicesButtonActionPerformed(evt);
            }
        });

        MealDeliveryButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        MealDeliveryButton.setForeground(new java.awt.Color(255, 255, 255));
        MealDeliveryButton.setText("Meals");
        MealDeliveryButton.setBorderPainted(false);
        MealDeliveryButton.setContentAreaFilled(false);
        MealDeliveryButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MealDeliveryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MealDeliveryButtonActionPerformed(evt);
            }
        });

        GroceryDeliveryButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        GroceryDeliveryButton.setForeground(new java.awt.Color(255, 255, 255));
        GroceryDeliveryButton.setText("Grocery");
        GroceryDeliveryButton.setBorderPainted(false);
        GroceryDeliveryButton.setContentAreaFilled(false);
        GroceryDeliveryButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GroceryDeliveryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroceryDeliveryButtonActionPerformed(evt);
            }
        });

        HouseHoldCareButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        HouseHoldCareButton.setForeground(new java.awt.Color(255, 255, 255));
        HouseHoldCareButton.setText("Household Chore");
        HouseHoldCareButton.setBorderPainted(false);
        HouseHoldCareButton.setContentAreaFilled(false);
        HouseHoldCareButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HouseHoldCareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HouseHoldCareButtonActionPerformed(evt);
            }
        });

        HouseMaintainenceButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        HouseMaintainenceButton.setForeground(new java.awt.Color(255, 255, 255));
        HouseMaintainenceButton.setText("<html>Household <br>Maintainence</html>");
        HouseMaintainenceButton.setBorderPainted(false);
        HouseMaintainenceButton.setContentAreaFilled(false);
        HouseMaintainenceButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HouseMaintainenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HouseMaintainenceButtonActionPerformed(evt);
            }
        });

        PersonalCareButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        PersonalCareButton.setForeground(new java.awt.Color(255, 255, 255));
        PersonalCareButton.setText("Personal Care");
        PersonalCareButton.setBorderPainted(false);
        PersonalCareButton.setContentAreaFilled(false);
        PersonalCareButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonalCareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonalCareButtonActionPerformed(evt);
            }
        });

        HomeButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("Home");
        HomeButton.setBorderPainted(false);
        HomeButton.setContentAreaFilled(false);
        HomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HomeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.setBorderPainted(false);
        logoutButton.setContentAreaFilled(false);
        logoutButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        profileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/download_1_75x75.jpeg"))); // NOI18N

        profileNameText.setFont(new java.awt.Font("Palatino", 1, 24)); // NOI18N
        profileNameText.setForeground(new java.awt.Color(255, 255, 255));

        CartBtn.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        CartBtn.setForeground(new java.awt.Color(255, 255, 255));
        CartBtn.setText("Cart");
        CartBtn.setBorderPainted(false);
        CartBtn.setContentAreaFilled(false);
        CartBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ServicesPanelLayout = new javax.swing.GroupLayout(ServicesPanel);
        ServicesPanel.setLayout(ServicesPanelLayout);
        ServicesPanelLayout.setHorizontalGroup(
            ServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NursingButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CovidCareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TherapyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MoneyManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LegalServicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GroceryDeliveryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MealDeliveryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PersonalCareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HouseMaintainenceButton)
            .addComponent(HouseHoldCareButton, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ServicesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(profileNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(ProfileButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(CartBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(ProfileButton)
                .addGap(12, 12, 12)
                .addComponent(CartBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NursingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CovidCareButton)
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
                .addComponent(HouseMaintainenceButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PersonalCareButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        servicesSplitPane.setLeftComponent(ServicesPanel);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 706));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
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
            .addComponent(servicesSplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileButtonActionPerformed
        // TODO add your handling code here:
        NewCustomerJPanel profile = new NewCustomerJPanel(userProcessContainer, system, userAccount);
        servicesSplitPane.setRightComponent(profile);
    }//GEN-LAST:event_ProfileButtonActionPerformed

    private void NursingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NursingButtonActionPerformed
        // TODO add your handling code here:
        NursingServices nurse = new NursingServices(userProcessContainer,system, userAccount);
        servicesSplitPane.setRightComponent(nurse);
    }//GEN-LAST:event_NursingButtonActionPerformed

    private void TherapyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TherapyButtonActionPerformed
        // TODO add your handling code here:
        TherapyServices therapy = new TherapyServices(userProcessContainer,system, userAccount);
        servicesSplitPane.setRightComponent(therapy);
    }//GEN-LAST:event_TherapyButtonActionPerformed

    private void CovidCareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CovidCareButtonActionPerformed
        // TODO add your handling code here:
        CovidCareServices care = new CovidCareServices(userProcessContainer,system, userAccount);
        servicesSplitPane.setRightComponent(care);
    }//GEN-LAST:event_CovidCareButtonActionPerformed

    private void MoneyManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyManagementButtonActionPerformed
        // TODO add your handling code here:
        MoneyManagement money = new MoneyManagement(userProcessContainer,system,userAccount,servicesSplitPane);
        servicesSplitPane.setRightComponent(money);
    }//GEN-LAST:event_MoneyManagementButtonActionPerformed

    private void LegalServicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LegalServicesButtonActionPerformed
        // TODO add your handling code here:
        ElderLawFirm law = new ElderLawFirm(userProcessContainer, system, userAccount, servicesSplitPane);
       servicesSplitPane.setRightComponent(law);
    }//GEN-LAST:event_LegalServicesButtonActionPerformed

    private void MealDeliveryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MealDeliveryButtonActionPerformed
        // TODO add your handling code here:
        OrderMeal profile = new OrderMeal(userProcessContainer, system, userAccount, servicesSplitPane);
        servicesSplitPane.setRightComponent(profile);
    }//GEN-LAST:event_MealDeliveryButtonActionPerformed

    private void GroceryDeliveryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroceryDeliveryButtonActionPerformed
        // TODO add your handling code here:
        GroceryAndEssentialsJPanel grocery = new GroceryAndEssentialsJPanel(userProcessContainer, system, userAccount, servicesSplitPane);
        servicesSplitPane.setRightComponent(grocery);
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

    private void CartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartBtnActionPerformed
        // TODO add your handling code here:
        ServiceCart cart = new ServiceCart(userProcessContainer, system, userAccount);
        servicesSplitPane.setRightComponent(cart);
    }//GEN-LAST:event_CartBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CartBtn;
    private javax.swing.JButton CovidCareButton;
    private javax.swing.JButton GroceryDeliveryButton;
    private javax.swing.JButton HomeButton;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JLabel profileNameText;
    private javax.swing.JSplitPane servicesSplitPane;
    // End of variables declaration//GEN-END:variables
}
