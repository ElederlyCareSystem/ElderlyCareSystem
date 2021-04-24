/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Customer;

import Business.EcoSystem;
import Business.GroceryAndEssentialsOrganization.ShoppingItem;
import Business.Organization.GroceryAndEssentialsOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GroceryWorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrudu
 */
public class GroceryAndEssentialsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GroceryAndEssentialsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    DefaultTableModel model;
    JSplitPane servicesSplitPane;
    GroceryAndEssentialsOrganization groceryOrg;
    ShoppingItem selectedItem;
    String itemName;
    boolean flag = false;
    GroceryWorkRequest request;
    
    public GroceryAndEssentialsJPanel(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount,JSplitPane servicesSplitPane) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = business;
        this.servicesSplitPane = servicesSplitPane;
        
        model = new DefaultTableModel();
        MenujTable1.setModel(model);
        model.addColumn("Food Items");
        model.addColumn("Price");
        
        //groceryOrg = new GroceryAndEssentialsOrganization();
        for (Organization organization : system.getNetwork().getEnterpriseDirectory().getEnterprise("FoodAndEssentials").getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof GroceryAndEssentialsOrganization) {
                groceryOrg = ((GroceryAndEssentialsOrganization) organization);
                System.out.println("or list " + groceryOrg.getWorkQueue().getWorkRequestList().size());
                break;
            }
        }
        
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
        MenujTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        QuantityjTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        PlaceOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(178, 215, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addGap(0, 361, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Title1))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenujTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Food Items", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        MenujTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenujTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MenujTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 191, -1, 176));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Shop for Home");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 128, 864, 31));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel4.setText("Quantity:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 409, 110, 31));
        add(QuantityjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 412, 166, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add To Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 180, 40));

        PlaceOrder.setBackground(new java.awt.Color(0, 0, 0));
        PlaceOrder.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        PlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        PlaceOrder.setText("Place Order");
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });
        add(PlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 180, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void MenujTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenujTable1MouseClicked
        // TODO add your handling code here:
        int index = MenujTable1.getSelectedRow();
        System.out.println("selectedrow>>>>"+index);
        DefaultTableModel model = (DefaultTableModel) MenujTable1.getModel();
        itemName = model.getValueAt(index, 0).toString();
        
        selectedItem = groceryOrg.getItemByName(itemName);
//
//        System.out.println(">>>"+selectedFoodItem.getMeal()+" >>>"+selectedFoodItem.getType()+" >>>"+selectedFoodItem.getFoodItemsName()+ " >>>"+selectedFoodItem.getPrice());
    }//GEN-LAST:event_MenujTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(!QuantityjTextField.getText().equals("") && selectedItem != null){
        for(int i = userAccount.getWorkQueue().getWorkRequestList().size()-1; i >= 0 ; i-- ){
            if(userAccount.getWorkQueue().getWorkRequestList().get(i).getReqType().equals(groceryOrg.getName())){
                if(userAccount.getWorkQueue().getWorkRequestList().get(i).getStatus().equals("Completed")){
                    request = new GroceryWorkRequest();
                    request.setReqType(groceryOrg.getName());
                    request.setSender(userAccount);
                    request.getShoppingList().add(selectedItem);
                    request.setStatus("Incomplete");
                    request.getShoppingList().get(request.getShoppingList().size()-1).setQuantity(Integer.parseInt(QuantityjTextField.getText()));
                    request.setTotal(selectedItem.getPrice()  * Double.parseDouble(QuantityjTextField.getText()));
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    flag = true;
                }else if(userAccount.getWorkQueue().getWorkRequestList().get(i).getStatus().equals("Incomplete")){
                    request = (GroceryWorkRequest)userAccount.getWorkQueue().getWorkRequestList().get(i);
                    request.getShoppingList().add(selectedItem);
                    request.getShoppingList().get(request.getShoppingList().size()-1).setQuantity(Integer.parseInt(QuantityjTextField.getText()));
                    double total = request.getTotal();
                    request.setTotal(total + (selectedItem.getPrice() * Double.parseDouble(QuantityjTextField.getText())));
                    flag = true;
                }
                break;
            }
        }
        
        if(flag == false){
            request = new GroceryWorkRequest();
            request.setReqType(groceryOrg.getName());
            request.setSender(userAccount);
            request.getShoppingList().add(selectedItem);
            request.setStatus("Incomplete");
            request.getShoppingList().get(request.getShoppingList().size()-1).setQuantity(Integer.parseInt(QuantityjTextField.getText()));
            request.setTotal(selectedItem.getPrice()  * Double.parseDouble(QuantityjTextField.getText()));
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        
            JOptionPane.showMessageDialog(null, "Added to Cart!!");
            QuantityjTextField.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Please select item and enter quantity");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
        // TODO add your handling code here:
        GroceryPlaceOrderJPanel placeOrder = new GroceryPlaceOrderJPanel(userProcessContainer, system, userAccount, groceryOrg, request, servicesSplitPane);
//        PlaceMealOrder placeOrder = new PlaceMealOrder(userProcessContainer, system ,userAccount,foodOrg, request,servicesSplitPane);
        servicesSplitPane.setRightComponent(placeOrder);
    }//GEN-LAST:event_PlaceOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHeader1;
    private javax.swing.JTable MenujTable1;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JTextField QuantityjTextField;
    private javax.swing.JLabel Title1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void generateTable() {
        
        for(int i = 0; i < groceryOrg.getShoppingList().size();i++){
                model.addRow(new Object[]{
                    groceryOrg.getShoppingList().get(i).getItemName(),
                    String.valueOf(groceryOrg.getShoppingList().get(i).getPrice())
                });
            }
    }
}
