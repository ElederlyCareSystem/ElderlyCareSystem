/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Customer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FoodOrganization.FoodItems;
import Business.Organization.FoodOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodOrganizationWorkRequest;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrudu
 */
public class OrderMeal extends javax.swing.JPanel {

    /**
     * Creates new form OrderMeal
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    DefaultTableModel model;
    FoodOrganization foodOrg;
    String meal;
    String type;
    String food;
    Double price;
    FoodItems selectedFoodItem;
    FoodOrganizationWorkRequest request;
    JSplitPane servicesSplitPane;
    
    public OrderMeal(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount,JSplitPane servicesSplitPane) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = business;
        this.userAccount = userAccount;
        this.servicesSplitPane = servicesSplitPane;
        model = new DefaultTableModel();
        MenujTable1.setModel(model);
        model.addColumn("Meal");
        model.addColumn("Type");
        model.addColumn("Food Items");
        model.addColumn("Price");
        
        //foodOrg = system.getNetwork().getEnterpriseDirectory().getEnterpriseByType("FoodAndEssentials", "Food Organization");
        //System.out.println("yo>>"+foodOrg.toString());
        foodOrg = new FoodOrganization();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ImageHeader1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        QuantityjTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenujTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        PlaceOrder = new javax.swing.JButton();
        OKjButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(178, 215, 229));
        setAutoscrolls(true);

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
                .addGap(0, 416, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Title1))
        );

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel2.setText("Order Meal");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Veg", "Non-Veg", "Vegan" }));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel3.setText("Type of Meal:");

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel4.setText("Quantity:");

        jButton1.setText("Add To Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        MenujTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Meal", "Type", "Food Items", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel5.setText("Meal:");

        PlaceOrder.setText("Place Order");
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });

        OKjButton.setText("Search");
        OKjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKjButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Track Order");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Breakfast", "Lunch", "Dinner" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(454, 454, 454)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QuantityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(OKjButton)))
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(278, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 166, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(PlaceOrder)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlaceOrder)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OKjButton)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OKjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKjButtonActionPerformed
        // TODO add your handling code here:
        
        System.out.println("selected>>>"+jComboBox1.getSelectedItem().toString());
        if(jComboBox2.getSelectedItem().toString().equals("Breakfast") && jComboBox1.getSelectedItem().toString().equals("Veg")){
            List<FoodItems> foodList = foodOrg.getVegBreakfastList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Breakfast") && jComboBox1.getSelectedItem().toString().equals("Non-Veg")){
            List<FoodItems> foodList = foodOrg.getNonvegBreakfastList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Breakfast") && jComboBox1.getSelectedItem().toString().equals("Vegan")){
            List<FoodItems> foodList = foodOrg.getVeganBreakfastList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Lunch") && jComboBox1.getSelectedItem().toString().equals("Veg")){
            List<FoodItems> foodList = foodOrg.getVegLunchList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Lunch") && jComboBox1.getSelectedItem().toString().equals("Non-Veg")){
            List<FoodItems> foodList = foodOrg.getNonvegLunchList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Lunch") && jComboBox1.getSelectedItem().toString().equals("Vegan")){
            List<FoodItems> foodList = foodOrg.getVeganLunchList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Dinner") && jComboBox1.getSelectedItem().toString().equals("Veg")){
            List<FoodItems> foodList = foodOrg.getVegDinnerList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Dinner") && jComboBox1.getSelectedItem().toString().equals("Non-Veg")){
            List<FoodItems> foodList = foodOrg.getNonvegDinnerList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Dinner") && jComboBox1.getSelectedItem().toString().equals("Vegan")){
            List<FoodItems> foodList = foodOrg.getVeganDinnerList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }
        
//        model.addRow(new Object[]{
//                StudentNameTextField.getText(),
//                AgeText.getText(),
//                phoneText.getText(),
//                emailText.getText(),
//                addressText.getText(),
//                d1.getName()
//        });
    }//GEN-LAST:event_OKjButtonActionPerformed

    private void MenujTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenujTable1MouseClicked
        // TODO add your handling code here:
        int index = MenujTable1.getSelectedRow();
        System.out.println("selectedrow>>>>"+index);
        DefaultTableModel model = (DefaultTableModel) MenujTable1.getModel();
       // updateName.setText(model.getValueAt(index, 0).toString());
        meal = model.getValueAt(index, 0).toString();
        type = model.getValueAt(index, 1).toString();
        food = model.getValueAt(index, 2).toString();
        price = Double.parseDouble(model.getValueAt(index, 3).toString());
        
        selectedFoodItem = foodOrg.getFoodItemByName(meal, type, type);
        
        System.out.println(">>>"+meal+" >>>"+type+" >>>"+food);
    }//GEN-LAST:event_MenujTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int workQueueSize = userAccount.getWorkQueue().getWorkRequestList().size();
        
        if(workQueueSize == 0){
            request = new FoodOrganizationWorkRequest();
            request.setReqType(foodOrg.getName());
            request.setSender(userAccount);
            request.getFoodList().add(selectedFoodItem);
            request.setTotal(price);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }else{
            for(int i = workQueueSize; i >= 0; i--){
                if(userAccount.getWorkQueue().getWorkRequestList().get(i).getReqType().equals(foodOrg.getName())){
                    if(!userAccount.getWorkQueue().getWorkRequestList().get(i).getStatus().equals("completed")){
                        request = (FoodOrganizationWorkRequest)userAccount.getWorkQueue().getWorkRequestList().get(i);
                        request.getFoodList().add(selectedFoodItem);
                        double total = request.getTotal() + price;
                        request.setTotal(total);
                    }else if(userAccount.getWorkQueue().getWorkRequestList().get(i).getStatus().equals("completed")){
                        request = new FoodOrganizationWorkRequest();
                        request.setReqType(foodOrg.getName());
                        request.setSender(userAccount);
                        request.getFoodList().add(selectedFoodItem);
                        request.setTotal(price);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                    }
                    break;
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
        // TODO add your handling code here:
        PlaceMealOrder placeOrder = new PlaceMealOrder();
        servicesSplitPane.setRightComponent(placeOrder);
    }//GEN-LAST:event_PlaceOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHeader1;
    private javax.swing.JTable MenujTable1;
    private javax.swing.JButton OKjButton;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JTextField QuantityjTextField;
    private javax.swing.JLabel Title1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
