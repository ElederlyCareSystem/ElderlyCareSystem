/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author snehalchavan
 */
public class LoginJpanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJpanel
     */
    
    private JPanel mainWorkArea;
    private EcoSystem system;
    

    public LoginJpanel(JPanel jPanel_MainWorkArea, EcoSystem system) {
        initComponents();
        
        this.mainWorkArea = jPanel_MainWorkArea;
        this.system = system;
    }

    public LoginJpanel(JPanel userProcessContainer) {
        this.mainWorkArea = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_loginarea = new javax.swing.JPanel();
        jTextField_username = new javax.swing.JTextField();
        jLabel_password = new javax.swing.JLabel();
        jLabel_username = new javax.swing.JLabel();
        jButton_login = new javax.swing.JButton();
        jButton_signup = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ImageHeader = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jPasswordField_password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        jPanel_loginarea.setLayout(null);
        jPanel_loginarea.add(jTextField_username);
        jTextField_username.setBounds(710, 330, 210, 40);

        jLabel_password.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_password.setFont(new java.awt.Font("Palatino", 1, 25)); // NOI18N
        jLabel_password.setText("Password");
        jPanel_loginarea.add(jLabel_password);
        jLabel_password.setBounds(530, 420, 120, 30);

        jLabel_username.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_username.setFont(new java.awt.Font("Palatino", 1, 25)); // NOI18N
        jLabel_username.setText("Username");
        jPanel_loginarea.add(jLabel_username);
        jLabel_username.setBounds(530, 340, 120, 30);

        jButton_login.setBackground(new java.awt.Color(102, 102, 255));
        jButton_login.setFont(new java.awt.Font("Palatino", 1, 24)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Login");
        jButton_login.setBorderPainted(false);
        jButton_login.setPreferredSize(new java.awt.Dimension(118, 35));
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });
        jPanel_loginarea.add(jButton_login);
        jButton_login.setBounds(530, 500, 190, 40);

        jButton_signup.setBackground(new java.awt.Color(102, 102, 255));
        jButton_signup.setFont(new java.awt.Font("Palatino", 1, 24)); // NOI18N
        jButton_signup.setForeground(new java.awt.Color(255, 255, 255));
        jButton_signup.setText("Sign Up");
        jButton_signup.setBorderPainted(false);
        jButton_signup.setPreferredSize(new java.awt.Dimension(118, 35));
        jButton_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signupActionPerformed(evt);
            }
        });
        jPanel_loginarea.add(jButton_signup);
        jButton_signup.setBounds(740, 500, 180, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ImageHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/helpingHandsLogo.jpeg"))); // NOI18N

        Title.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        Title.setText("Helping Hands");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ImageHeader)
                .addGap(20, 20, 20)
                .addComponent(Title)
                .addGap(0, 977, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_loginarea.add(jPanel2);
        jPanel2.setBounds(0, 0, 1480, 110);

        jPasswordField_password.setText("jPasswordField1");
        jPanel_loginarea.add(jPasswordField_password);
        jPasswordField_password.setBounds(710, 410, 210, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/elderly care.jpeg"))); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(1480, 1000));
        jPanel_loginarea.add(jLabel1);
        jLabel1.setBounds(-110, 100, 1500, 1000);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_loginarea, javax.swing.GroupLayout.PREFERRED_SIZE, 1480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_loginarea, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        // TODO add your handling code here:
        String username = jTextField_username.getText();
        char[] passwordChar = jPasswordField_password.getPassword();
        String password = String.valueOf(passwordChar);
        boolean flag = false;
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(username, password);
        if (userAccount != null) {
            for (Network network : system.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//                            userAccount=organization.getUserAccountDirectory().authenticateUser(username, password);
                        for (UserAccount user : organization.getUserAccountDirectory().getUserAccountList()) {
                            if (user.getUsername().equals(userAccount.getUsername())) {
//                            if(userAccount!=null){
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                System.out.println("org user...." + organization);
                                break;
                            }
                        }
                    }
                }
            }
        }

        if (userAccount == null) {
            //Step 2: Go inside each network and check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(username, password);
                    if (userAccount == null) {
                        //Step 3:check against each organization for each enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(username, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
//                                System.out.println("org user...."+organization);
                                break;
                            }
                        }

                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            CardLayout layout = (CardLayout) mainWorkArea.getLayout();
            mainWorkArea.add("workarea", userAccount.getRole().createWorkArea(mainWorkArea, userAccount, inOrganization, inEnterprise, system));
            layout.next(mainWorkArea);
            jTextField_username.setText("");
            jPasswordField_password.setText("");
        }


    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jButton_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signupActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        SignUpJpanel signUp = new SignUpJpanel(mainWorkArea, system);
        mainWorkArea.add(signUp);
        layout.next(mainWorkArea);
    }//GEN-LAST:event_jButton_signupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHeader;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton_login;
    private javax.swing.JButton jButton_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_loginarea;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
