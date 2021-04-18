/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Customer;

import Business.EcoSystem;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.LoginJpanel;

/**
 *
 * @author snehalchavan
 */
public class CustomerDashboard extends javax.swing.JPanel {

    /**
     * Creates new form CustomerDashboard
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Organization organization;
    
    
    public CustomerDashboard(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.organization = organization;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardJScrollPane = new javax.swing.JScrollPane();
        dashboardJPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        ImageHeader1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        containerPanel = new javax.swing.JPanel();
        PersonalCarePanel = new javax.swing.JPanel();
        PersonalCareImgPanel = new javax.swing.JPanel();
        PersonalCarePanelImg = new javax.swing.JLabel();
        PeronalCareButton = new javax.swing.JButton();
        PersonalCareLabel = new javax.swing.JLabel();
        ProtectiveServicesPanel = new javax.swing.JPanel();
        ProtecticeCareImgPanel = new javax.swing.JPanel();
        ProtectiveServicesPanelImg = new javax.swing.JLabel();
        LegalServicesButton = new javax.swing.JButton();
        ProtectiveServicesLabel = new javax.swing.JLabel();
        NursingServicesPanel = new javax.swing.JPanel();
        NursingImgPanel = new javax.swing.JPanel();
        ProtectiveServicesPanelImg1 = new javax.swing.JLabel();
        NursingServicesButton = new javax.swing.JButton();
        NursingServicesLabel = new javax.swing.JLabel();
        GroceryServicesPanel = new javax.swing.JPanel();
        GroceryImgPanel = new javax.swing.JPanel();
        GroceryServicesButton = new javax.swing.JButton();
        GroceryServicesLabel = new javax.swing.JLabel();
        GroceryServicesPanelImg = new javax.swing.JLabel();
        CompanionServicesPanel = new javax.swing.JPanel();
        CompanionServicesImgPanel = new javax.swing.JPanel();
        ProtectiveServicesPanelImg3 = new javax.swing.JLabel();
        CompanionServicesButton = new javax.swing.JButton();
        CompanionServicesLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1210, 942));

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
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Title1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        containerPanel.setBackground(new java.awt.Color(178, 215, 229));

        PersonalCarePanel.setBackground(new java.awt.Color(255, 255, 255));
        PersonalCarePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        PersonalCarePanelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/personalCareImg_280x186.jpeg"))); // NOI18N

        javax.swing.GroupLayout PersonalCareImgPanelLayout = new javax.swing.GroupLayout(PersonalCareImgPanel);
        PersonalCareImgPanel.setLayout(PersonalCareImgPanelLayout);
        PersonalCareImgPanelLayout.setHorizontalGroup(
            PersonalCareImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersonalCarePanelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PersonalCareImgPanelLayout.setVerticalGroup(
            PersonalCareImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersonalCarePanelImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PeronalCareButton.setBackground(new java.awt.Color(0, 0, 0));
        PeronalCareButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        PeronalCareButton.setForeground(new java.awt.Color(255, 255, 255));
        PeronalCareButton.setText("Personal Care");
        PeronalCareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeronalCareButtonActionPerformed(evt);
            }
        });

        PersonalCareLabel.setBackground(new java.awt.Color(255, 255, 255));
        PersonalCareLabel.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        PersonalCareLabel.setText("<html> Get help at home  with everyday <br>activities like bathing, dressing, meal preparation, and household tasks </html>");

        javax.swing.GroupLayout PersonalCarePanelLayout = new javax.swing.GroupLayout(PersonalCarePanel);
        PersonalCarePanel.setLayout(PersonalCarePanelLayout);
        PersonalCarePanelLayout.setHorizontalGroup(
            PersonalCarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersonalCareImgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PeronalCareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PersonalCarePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PersonalCareLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        PersonalCarePanelLayout.setVerticalGroup(
            PersonalCarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalCarePanelLayout.createSequentialGroup()
                .addComponent(PersonalCareImgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PersonalCareLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PeronalCareButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
        );

        ProtectiveServicesPanel.setBackground(new java.awt.Color(255, 255, 255));
        ProtectiveServicesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        ProtectiveServicesPanelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/protectiveService.jpeg"))); // NOI18N

        javax.swing.GroupLayout ProtecticeCareImgPanelLayout = new javax.swing.GroupLayout(ProtecticeCareImgPanel);
        ProtecticeCareImgPanel.setLayout(ProtecticeCareImgPanelLayout);
        ProtecticeCareImgPanelLayout.setHorizontalGroup(
            ProtecticeCareImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProtectiveServicesPanelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ProtecticeCareImgPanelLayout.setVerticalGroup(
            ProtecticeCareImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProtectiveServicesPanelImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LegalServicesButton.setBackground(new java.awt.Color(0, 0, 0));
        LegalServicesButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        LegalServicesButton.setForeground(new java.awt.Color(255, 255, 255));
        LegalServicesButton.setText("Legal Services");
        LegalServicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LegalServicesButtonActionPerformed(evt);
            }
        });

        ProtectiveServicesLabel.setBackground(new java.awt.Color(255, 255, 255));
        ProtectiveServicesLabel.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        ProtectiveServicesLabel.setText("<html>Provides clients, who may <br> be victims of an alleged abuse, an evaluation and legal representative by an attorney.</html>");

        javax.swing.GroupLayout ProtectiveServicesPanelLayout = new javax.swing.GroupLayout(ProtectiveServicesPanel);
        ProtectiveServicesPanel.setLayout(ProtectiveServicesPanelLayout);
        ProtectiveServicesPanelLayout.setHorizontalGroup(
            ProtectiveServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProtecticeCareImgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LegalServicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ProtectiveServicesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProtectiveServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        ProtectiveServicesPanelLayout.setVerticalGroup(
            ProtectiveServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProtectiveServicesPanelLayout.createSequentialGroup()
                .addComponent(ProtecticeCareImgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProtectiveServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LegalServicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
        );

        NursingServicesPanel.setBackground(new java.awt.Color(255, 255, 255));
        NursingServicesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        ProtectiveServicesPanelImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/nursing_280x186.jpeg"))); // NOI18N

        javax.swing.GroupLayout NursingImgPanelLayout = new javax.swing.GroupLayout(NursingImgPanel);
        NursingImgPanel.setLayout(NursingImgPanelLayout);
        NursingImgPanelLayout.setHorizontalGroup(
            NursingImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProtectiveServicesPanelImg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NursingImgPanelLayout.setVerticalGroup(
            NursingImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProtectiveServicesPanelImg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NursingServicesButton.setBackground(new java.awt.Color(0, 0, 0));
        NursingServicesButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        NursingServicesButton.setForeground(new java.awt.Color(255, 255, 255));
        NursingServicesButton.setText("Nursing Services");
        NursingServicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NursingServicesButtonActionPerformed(evt);
            }
        });

        NursingServicesLabel.setBackground(new java.awt.Color(255, 255, 255));
        NursingServicesLabel.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        NursingServicesLabel.setText("<html>Home health aides help elderly, convalescent<br>  or disabled persons live in their own homes instead of in a health care facility.</html>");

        javax.swing.GroupLayout NursingServicesPanelLayout = new javax.swing.GroupLayout(NursingServicesPanel);
        NursingServicesPanel.setLayout(NursingServicesPanelLayout);
        NursingServicesPanelLayout.setHorizontalGroup(
            NursingServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NursingImgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NursingServicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(NursingServicesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NursingServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        NursingServicesPanelLayout.setVerticalGroup(
            NursingServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NursingServicesPanelLayout.createSequentialGroup()
                .addComponent(NursingImgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NursingServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NursingServicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroceryServicesPanel.setBackground(new java.awt.Color(255, 255, 255));
        GroceryServicesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout GroceryImgPanelLayout = new javax.swing.GroupLayout(GroceryImgPanel);
        GroceryImgPanel.setLayout(GroceryImgPanelLayout);
        GroceryImgPanelLayout.setHorizontalGroup(
            GroceryImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        GroceryImgPanelLayout.setVerticalGroup(
            GroceryImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        GroceryServicesButton.setBackground(new java.awt.Color(0, 0, 0));
        GroceryServicesButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        GroceryServicesButton.setForeground(new java.awt.Color(255, 255, 255));
        GroceryServicesButton.setText("Meals Services");
        GroceryServicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroceryServicesButtonActionPerformed(evt);
            }
        });

        GroceryServicesLabel.setBackground(new java.awt.Color(255, 255, 255));
        GroceryServicesLabel.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        GroceryServicesLabel.setText("<html>For those who just need a little <br> extra help getting their groceries, we do the shopping for you and deliver the items to your door.</html>");

        GroceryServicesPanelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/meals.jpeg"))); // NOI18N

        javax.swing.GroupLayout GroceryServicesPanelLayout = new javax.swing.GroupLayout(GroceryServicesPanel);
        GroceryServicesPanel.setLayout(GroceryServicesPanelLayout);
        GroceryServicesPanelLayout.setHorizontalGroup(
            GroceryServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GroceryServicesPanelLayout.createSequentialGroup()
                .addComponent(GroceryServicesPanelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GroceryImgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(GroceryServicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GroceryServicesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GroceryServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        GroceryServicesPanelLayout.setVerticalGroup(
            GroceryServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GroceryServicesPanelLayout.createSequentialGroup()
                .addGroup(GroceryServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GroceryImgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GroceryServicesPanelImg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GroceryServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GroceryServicesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CompanionServicesPanel.setBackground(new java.awt.Color(255, 255, 255));
        CompanionServicesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        ProtectiveServicesPanelImg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/companionImg.jpeg"))); // NOI18N

        javax.swing.GroupLayout CompanionServicesImgPanelLayout = new javax.swing.GroupLayout(CompanionServicesImgPanel);
        CompanionServicesImgPanel.setLayout(CompanionServicesImgPanelLayout);
        CompanionServicesImgPanelLayout.setHorizontalGroup(
            CompanionServicesImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProtectiveServicesPanelImg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CompanionServicesImgPanelLayout.setVerticalGroup(
            CompanionServicesImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProtectiveServicesPanelImg3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CompanionServicesButton.setBackground(new java.awt.Color(0, 0, 0));
        CompanionServicesButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        CompanionServicesButton.setForeground(new java.awt.Color(255, 255, 255));
        CompanionServicesButton.setText("Companion Services");
        CompanionServicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanionServicesButtonActionPerformed(evt);
            }
        });

        CompanionServicesLabel.setBackground(new java.awt.Color(255, 255, 255));
        CompanionServicesLabel.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        CompanionServicesLabel.setText("<html>Provides company and supervision <br> and offers temporary relief to family members who are acting as caregivers..</html>");

        javax.swing.GroupLayout CompanionServicesPanelLayout = new javax.swing.GroupLayout(CompanionServicesPanel);
        CompanionServicesPanel.setLayout(CompanionServicesPanelLayout);
        CompanionServicesPanelLayout.setHorizontalGroup(
            CompanionServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CompanionServicesImgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CompanionServicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CompanionServicesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CompanionServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        CompanionServicesPanelLayout.setVerticalGroup(
            CompanionServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompanionServicesPanelLayout.createSequentialGroup()
                .addComponent(CompanionServicesImgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompanionServicesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CompanionServicesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );

        logoutButton.setBackground(new java.awt.Color(0, 0, 0));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ProtectiveServicesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PersonalCarePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addComponent(NursingServicesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(CompanionServicesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(GroceryServicesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutButton)
                .addGap(35, 35, 35)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CompanionServicesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PersonalCarePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NursingServicesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProtectiveServicesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GroceryServicesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dashboardJPanelLayout = new javax.swing.GroupLayout(dashboardJPanel);
        dashboardJPanel.setLayout(dashboardJPanelLayout);
        dashboardJPanelLayout.setHorizontalGroup(
            dashboardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dashboardJPanelLayout.setVerticalGroup(
            dashboardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardJPanelLayout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashboardJScrollPane.setViewportView(dashboardJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1294, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dashboardJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PeronalCareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeronalCareButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PeronalCareButtonActionPerformed

    private void LegalServicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LegalServicesButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("customerServices",new CustomerService("Legal", userProcessContainer, business, userAccount) );
        layout.next(userProcessContainer);
    }//GEN-LAST:event_LegalServicesButtonActionPerformed

    private void NursingServicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NursingServicesButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("customerServices",new CustomerService("Nursing", userProcessContainer, business, userAccount) );
        layout.next(userProcessContainer);
    }//GEN-LAST:event_NursingServicesButtonActionPerformed

    private void GroceryServicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroceryServicesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GroceryServicesButtonActionPerformed

    private void CompanionServicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanionServicesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanionServicesButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CompanionServicesButton;
    private javax.swing.JPanel CompanionServicesImgPanel;
    private javax.swing.JLabel CompanionServicesLabel;
    private javax.swing.JPanel CompanionServicesPanel;
    private javax.swing.JPanel GroceryImgPanel;
    private javax.swing.JButton GroceryServicesButton;
    private javax.swing.JLabel GroceryServicesLabel;
    private javax.swing.JPanel GroceryServicesPanel;
    private javax.swing.JLabel GroceryServicesPanelImg;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel ImageHeader1;
    private javax.swing.JButton LegalServicesButton;
    private javax.swing.JPanel NursingImgPanel;
    private javax.swing.JButton NursingServicesButton;
    private javax.swing.JLabel NursingServicesLabel;
    private javax.swing.JPanel NursingServicesPanel;
    private javax.swing.JButton PeronalCareButton;
    private javax.swing.JPanel PersonalCareImgPanel;
    private javax.swing.JLabel PersonalCareLabel;
    private javax.swing.JPanel PersonalCarePanel;
    private javax.swing.JLabel PersonalCarePanelImg;
    private javax.swing.JPanel ProtecticeCareImgPanel;
    private javax.swing.JLabel ProtectiveServicesLabel;
    private javax.swing.JPanel ProtectiveServicesPanel;
    private javax.swing.JLabel ProtectiveServicesPanelImg;
    private javax.swing.JLabel ProtectiveServicesPanelImg1;
    private javax.swing.JLabel ProtectiveServicesPanelImg3;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel dashboardJPanel;
    private javax.swing.JScrollPane dashboardJScrollPane;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}
