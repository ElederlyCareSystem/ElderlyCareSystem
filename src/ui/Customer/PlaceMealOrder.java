/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Customer;

import Business.EcoSystem;
import Business.Organization.FoodOrganization;
import Business.Organization.RevenueMap;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodOrganizationWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrudu
 */
public class PlaceMealOrder extends javax.swing.JPanel {

    /**
     * Creates new form PlaceMealOrder
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    DefaultTableModel model;
    FoodOrganization foodOrg;
    FoodOrganizationWorkRequest request;
    JSplitPane servicesSplitPane;
    int index;
    String food;
    java.util.Date date=new java.util.Date();  
    
    public PlaceMealOrder(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount, FoodOrganization foodOrg, FoodOrganizationWorkRequest request, 
    JSplitPane servicesSplitPane) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = business;
        this.userAccount = userAccount; 
        this.foodOrg = foodOrg;
        this.request = request;
        this.servicesSplitPane = servicesSplitPane;
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Meal");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SubmitjButton = new javax.swing.JButton();
        RemovejButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InstructionsjTextArea = new javax.swing.JTextArea();
        TotalTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton_pay = new javax.swing.JButton();

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Meal", "Food Items", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        SubmitjButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        SubmitjButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitjButton.setText("Submit");
        SubmitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitjButtonActionPerformed(evt);
            }
        });

        RemovejButton.setBackground(new java.awt.Color(0, 0, 0));
        RemovejButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        RemovejButton.setForeground(new java.awt.Color(255, 255, 255));
        RemovejButton.setText("Remove");
        RemovejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovejButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel6.setText("Total:");

        InstructionsjTextArea.setColumns(20);
        InstructionsjTextArea.setRows(5);
        jScrollPane2.setViewportView(InstructionsjTextArea);

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel8.setText("Instructions:");

        jButton_pay.setBackground(new java.awt.Color(0, 0, 0));
        jButton_pay.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jButton_pay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_pay.setText("Pay");
        jButton_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_payActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(417, 417, 417))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SubmitjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RemovejButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(jButton_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemovejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        index = jTable1.getSelectedRow();
        System.out.println("selectedrow>>>>"+index);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        food = model.getValueAt(index, 1).toString();
    }//GEN-LAST:event_jTable1MouseClicked

    private void RemovejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovejButtonActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i < request.getFoodList().size(); i++){
            if(request.getFoodList().get(i).getFoodItemsName().equals(food)){
                double total = request.getTotal() - (request.getFoodList().get(i).getPrice() * request.getFoodList().get(i).getQuantity());
                request.setTotal(total);
                request.getFoodList().remove(i);
            }
        }
        
        model.removeRow(index);
        TotalTextField.setText(String.valueOf(request.getTotal()));
        JOptionPane.showMessageDialog(null, "Order Removed!!");
    }//GEN-LAST:event_RemovejButtonActionPerformed

    private void SubmitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitjButtonActionPerformed
        // TODO add your handling code here:
        foodOrg.getWorkQueue().getWorkRequestList().add(request);
        System.out.println("sender>"+request.getSender().getUserDetails().getName());
        request.setStatus("Order Placed");
        request.setMessage(InstructionsjTextArea.getText());
        JOptionPane.showMessageDialog(null, "Order Placed!!");
        TotalTextField.setText("");
        request.setRequestDate(date);
        String d = request.getRequestDate().toString();
        String[] dArr = d.split(" ");
        System.out.println("date>>>>"+date);
        System.out.println("total>>"+request.getTotal());
        
        List<String> fullDate = Arrays.asList(dArr[dArr.length -1], dArr[1]);
        //foodOrg.getRevenueMap().put(fullDate, request.getTotal());
        RevenueMap rm = new RevenueMap(Integer.parseInt(fullDate.get(0)), fullDate.get(1), request.getTotal(), 4);
        foodOrg.getRevMap().add(rm);
        
    }//GEN-LAST:event_SubmitjButtonActionPerformed

    private void jButton_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_payActionPerformed
        // TODO add your handling code here:

        PaymentJpanel pay = new PaymentJpanel(userAccount, request.getTotal());
        servicesSplitPane.setRightComponent(pay);
    }//GEN-LAST:event_jButton_payActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHeader1;
    private javax.swing.JTextArea InstructionsjTextArea;
    private javax.swing.JButton RemovejButton;
    private javax.swing.JButton SubmitjButton;
    private javax.swing.JLabel Title1;
    private javax.swing.JTextField TotalTextField;
    private javax.swing.JButton jButton_pay;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void generateTable() {
                        
        for(int j = 0; j < request.getFoodList().size(); j++){
        System.out.println("request place order>>>"+request.getFoodList().size());
        System.out.println("request place order meal>>>"+request.getFoodList().get(j).getMeal());
            model.addRow(new Object[]{
                request.getFoodList().get(j).getMeal(),
                request.getFoodList().get(j).getFoodItemsName(),
                request.getFoodList().get(j).getPrice().toString(),
                request.getFoodList().get(j).getQuantity()
            });
        }
        
        TotalTextField.setText(String.valueOf(request.getTotal()));
    }
}
        
  
