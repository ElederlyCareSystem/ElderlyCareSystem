/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Customer;

import Business.EcoSystem;
import Business.Organization.GroceryAndEssentialsOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GroceryWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrudu
 */
public class GroceryPlaceOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GroceryPlaceOrderJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    DefaultTableModel model;
    GroceryAndEssentialsOrganization groceryOrg;
    GroceryWorkRequest request;
    JSplitPane servicesSplitPane;
    int index;
    String food;
    
    public GroceryPlaceOrderJPanel(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount, GroceryAndEssentialsOrganization groceryOrg,
    GroceryWorkRequest request, JSplitPane servicesSplitPane) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = business;
        this.servicesSplitPane = servicesSplitPane;
        this.groceryOrg = groceryOrg;
        this.request = request;
        
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Food Items");
        model.addColumn("Price");
        model.addColumn("Quantity");
        
        generateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImageHeader1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SubmitjButton = new javax.swing.JButton();
        RemovejButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TotalTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(178, 215, 229));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ImageHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/helpingHandsLogo.jpeg"))); // NOI18N

        Title1.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        Title1.setText("Helping Hands");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ImageHeader1)
                .addGap(20, 20, 20)
                .addComponent(Title1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Title1))
        );

        BackButton.setBackground(new java.awt.Color(0, 0, 0));
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("<< BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Items", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        SubmitjButton.setBackground(new java.awt.Color(0, 0, 0));
        SubmitjButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitjButton.setText("Submit");
        SubmitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitjButtonActionPerformed(evt);
            }
        });

        RemovejButton.setBackground(new java.awt.Color(0, 0, 0));
        RemovejButton.setForeground(new java.awt.Color(255, 255, 255));
        RemovejButton.setText("Remove");
        RemovejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovejButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel6.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SubmitjButton)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(TotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(RemovejButton)))
                .addContainerGap(387, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BackButton)
                    .addContainerGap(944, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitjButton)
                    .addComponent(RemovejButton))
                .addGap(125, 125, 125))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(BackButton)
                    .addContainerGap(522, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        index = jTable1.getSelectedRow();
        System.out.println("selectedrow>>>>"+index);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        food = model.getValueAt(index, 0).toString();
    }//GEN-LAST:event_jTable1MouseClicked

    private void SubmitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitjButtonActionPerformed
        // TODO add your handling code here:
        groceryOrg.getWorkQueue().getWorkRequestList().add(request);
    }//GEN-LAST:event_SubmitjButtonActionPerformed

    private void RemovejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovejButtonActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i < request.getShoppingList().size(); i++){
            if(request.getShoppingList().get(i).getItemName().equals(food)){
                double total = request.getTotal() - (request.getShoppingList().get(i).getPrice() * request.getShoppingList().get(i).getQuantity());
                request.setTotal(total);
                request.getShoppingList().remove(i);
            }
        }

        model.removeRow(index);
        TotalTextField.setText(String.valueOf(request.getTotal()));
    }//GEN-LAST:event_RemovejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel ImageHeader1;
    private javax.swing.JButton RemovejButton;
    private javax.swing.JButton SubmitjButton;
    private javax.swing.JLabel Title1;
    private javax.swing.JTextField TotalTextField;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void generateTable() {
        for(int j = 0; j < request.getShoppingList().size(); j++){
        System.out.println("request place order>>>"+request.getShoppingList().size());
        System.out.println("request place order meal>>>"+request.getShoppingList().get(j).getItemName());
            model.addRow(new Object[]{
                request.getShoppingList().get(j).getItemName(),
                request.getShoppingList().get(j).getPrice(),
                request.getShoppingList().get(j).getQuantity()
            });
        }
        
        TotalTextField.setText(String.valueOf(request.getTotal()));
    }
}
