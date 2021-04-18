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
public class ElderLawFirm extends javax.swing.JPanel {

    /**
     * Creates new form ElderLawFirm
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount userAccount;
    JSplitPane servicesSplitPane;
    
    public ElderLawFirm(JPanel userProcessContainer,EcoSystem system, UserAccount userAccount,JSplitPane servicesSplitPane) {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1_content1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_bookLawAppointment1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel_lawImage1 = new javax.swing.JLabel();

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
                .addGap(0, 0, Short.MAX_VALUE))
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

        jLabel1_content1.setFont(new java.awt.Font("Palatino", 0, 16)); // NOI18N
        jLabel1_content1.setText("<html><h2>PLAN YOUR ESTATE WITH INTENTION</h2>\n<p>You worked hard to build your life — your family, your home and all the things you cherish. Have you put the same<br> effort into planning what happens to you if you become disabled or when you die? An estate plan is about more<br> than planning for death. It is about planning for whatever comes your way during your lifetime. A solid estate plan<br> provides peace of mind for you and your family.</p>\n<br>\n<b><p>We provide guidance and assistance in preparing Last Will and Testament and Trust Documents, Powers<br> of Attorney and Advance Directives for Health Care and other important matters.<br> </p>\n</html>");

        jLabel4.setFont(new java.awt.Font("Palatino", 0, 16)); // NOI18N
        jLabel4.setText("<html> <h2>Last Will & Testament</h2> <p>Your Last Will and Testament is just one part of a<br> comprehensive estate plan. If a person dies without a Will,<br> they are said to have died “intestate“. State laws<br>will determine how and to whom the your assets will be distributed.</html>");

        jButton_bookLawAppointment1.setBackground(new java.awt.Color(0, 0, 0));
        jButton_bookLawAppointment1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jButton_bookLawAppointment1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_bookLawAppointment1.setText("BOOK OUT TEAM TO SPEAK AT YOUR LOCATION");
        jButton_bookLawAppointment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bookLawAppointment1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Palatino", 0, 16)); // NOI18N
        jLabel3.setText("<html> <h2>Planning for Incapacity (Advance Directives)</h2>  <p>Another important aspect of estate planning that should<br> not be overlooked is planning for your own care in the event you become incapacitated and unable to make decisions regarding<br> your care and finances.<br> Through an Advance Directive, you can appoint someone you trust as your agent.</p></html>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1_content1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jButton_bookLawAppointment1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_content1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_bookLawAppointment1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jLabel_lawImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lawfirm.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_lawImage1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 269, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_lawImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_bookLawAppointment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bookLawAppointment1ActionPerformed
        // TODO add your handling code here:
        BookLawAppointment law = new BookLawAppointment(userProcessContainer, system, userAccount, servicesSplitPane);
        servicesSplitPane.setRightComponent(law);
    }//GEN-LAST:event_jButton_bookLawAppointment1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHeader;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton_bookLawAppointment1;
    private javax.swing.JLabel jLabel1_content1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_lawImage1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelHeader;
    // End of variables declaration//GEN-END:variables
}
