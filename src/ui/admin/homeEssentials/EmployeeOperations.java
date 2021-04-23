/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin.homeEssentials;

import ui.admin.Food.*;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization.FoodOrganization;
import Business.Organization.GroceryAndEssentialsOrganization;
import Business.Organization.Organization;
import Business.Role.FoodManagerRole;
import Business.UserAccount.UserAccount;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrudu
 */
public class EmployeeOperations extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeOperations
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount userAccount;
    JSplitPane adminSplitPane;
    Organization organization;
    //FoodOrganization foodOrg;
    GroceryAndEssentialsOrganization groceryOrg;
    DefaultTableModel model;
    int index;
    Employee selectedEmp;
    
    public EmployeeOperations(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system, Organization organization, JSplitPane adminSplitPane, GroceryAndEssentialsOrganization groceryOrg) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.organization = organization;
        this.adminSplitPane = adminSplitPane;
        this.groceryOrg = groceryOrg;
        System.out.println("orh name>>>"+organization.getName());
        System.out.println("kay problem aahe>>>"+organization.getEmployeeDirectory().getEmployeeList().size());
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Emp Id");
        model.addColumn("Name");
        
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

        jPanel2 = new javax.swing.JPanel();
        ImageHeader = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Namecreate = new javax.swing.JTextField();
        Create = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idUpdate = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        nameUpdate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        idDelete = new javax.swing.JTextField();
        Delete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        nameDelete = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(178, 215, 229));
        setPreferredSize(new java.awt.Dimension(1480, 800));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1254, 116));

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
                .addGap(0, 0, Short.MAX_VALUE))
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Emp Id", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
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

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel8.setText("Create Employee");

        Create.setBackground(new java.awt.Color(0, 0, 0));
        Create.setForeground(new java.awt.Color(255, 255, 255));
        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel9.setText("Name:");

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel10.setText("Update Employee");

        Update.setBackground(new java.awt.Color(0, 0, 0));
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel11.setText("Id:");

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel12.setText("Name:");

        Delete.setBackground(new java.awt.Color(0, 0, 0));
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel13.setText("Id:");

        jLabel14.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel14.setText("Name:");

        jLabel15.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel15.setText("Delete Employee");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1480, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(Namecreate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(idUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(idDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(nameDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(nameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(148, 148, 148)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(402, 402, 402))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Namecreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        // TODO add your handling code here:
//        Employee employee1 = system.getEmployeeDirectory().createEmployee(Namecreate.getText());
//        
//        organization.getEmployeeDirectory().getEmployeeList().add(employee1);
//        System.out.println("emp_id"+organization.getEmployeeDirectory().getEmployeeList().size());
//        
//        model.addRow(new Object[]{
//            //organization.getEmployeeDirectory().getEmployeeList().get(organization.getEmployeeDirectory().getEmployeeList().size()-1).getId(),
//            employee1.getId(),
//            Namecreate.getText()
//        });

            String empName = Namecreate.getText();
        Employee newEmployee = system.getEmployeeDirectory().createEmployee(Namecreate.getText());
        UserAccount newUser = system.getUserAccountDirectory().createUserAccount(empName, empName, newEmployee, new FoodManagerRole("employee"));
        groceryOrg.getUserAccountDirectory().getUserAccountList().add(newUser);
        groceryOrg.getDeliveryManList().add(newUser);
        JOptionPane.showMessageDialog(null, "Employee created");
        model.addRow(new Object[]{
            newEmployee.getId(),
            newEmployee.getName()
        });
    }//GEN-LAST:event_CreateActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
//        for(int j = 0; j < organization.getEmployeeDirectory().getEmployeeList().size(); j++){
//            if(organization.getEmployeeDirectory().getEmployeeList().get(j).getId() == Integer.parseInt(idUpdate.getText()) && organization.getEmployeeDirectory().getEmployeeList().get(j).getName().equals(nameUpdate.getText())){
//                selectedEmp = organization.getEmployeeDirectory().getEmployeeList().get(j);
//            }
//        }

        if (jTable1.getSelectedRow() >= 0) {

            List<UserAccount> employeeList = groceryOrg.getUserAccountDirectory().getUserAccountList();
            List<UserAccount> userAccountList = system.getUserAccountDirectory().getUserAccountList();
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())) {
                    employeeList.get(i).getEmployee().setName(nameUpdate.getText());
                    JOptionPane.showMessageDialog(null, "Details updated");
                    model.getDataVector().removeAllElements();
                    showEmployeeList();
                }
            }
            for (int i = 0; i < groceryOrg.getDeliveryManList().size(); i++) {
                if (groceryOrg.getDeliveryManList().get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())) {
                    groceryOrg.getDeliveryManList().get(i).getEmployee().setName(nameUpdate.getText());
                }
            }
            for (int i = 0; i < userAccountList.size(); i++) {
                if (userAccountList.get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())) {
                    system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().setName(nameUpdate.getText());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select Employee from table.");
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        String id = String.valueOf(model.getValueAt(jTable1.getSelectedRow(), 0));
        String name = String.valueOf(model.getValueAt(jTable1.getSelectedRow(), 1));
        idUpdate.setText(id);
    }//GEN-LAST:event_DeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        index = jTable1.getSelectedRow();
        System.out.println("selectedrow>>>>"+index);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int emp_id = Integer.parseInt(model.getValueAt(index, 0).toString());
        String name = model.getValueAt(index, 1).toString();
        
        for(int j = 0; j < organization.getEmployeeDirectory().getEmployeeList().size(); j++){
            if(organization.getEmployeeDirectory().getEmployeeList().get(j).getId() == emp_id && organization.getEmployeeDirectory().getEmployeeList().get(j).getName().equals(name)){
                selectedEmp = organization.getEmployeeDirectory().getEmployeeList().get(j);
            }
        }
        
        idUpdate.setText(model.getValueAt(index, 0).toString());
        nameUpdate.setText(name);
        idDelete.setText(model.getValueAt(index, 0).toString());
        nameDelete.setText(name);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel ImageHeader;
    private javax.swing.JTextField Namecreate;
    private javax.swing.JLabel Title;
    private javax.swing.JButton Update;
    private javax.swing.JTextField idDelete;
    private javax.swing.JTextField idUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameDelete;
    private javax.swing.JTextField nameUpdate;
    // End of variables declaration//GEN-END:variables

    private void generateTable() {
//        for(int j = 0; j < organization.getEmployeeDirectory().getEmployeeList().size(); j++){
//            model.addRow(new Object[]{
//                organization.getEmployeeDirectory().getEmployeeList().get(j).getId(),
//                organization.getEmployeeDirectory().getEmployeeList().get(j).getName()
//            });
//        }
        for (int i = 0; i < groceryOrg.getDeliveryManList().size(); i++) {
            model.addRow(new Object[]{
                groceryOrg.getDeliveryManList().get(i).getEmployee().getId(),
                groceryOrg.getDeliveryManList().get(i).getEmployee().getName()
            });
        }
    }

    private void showEmployeeList() {
        for (int i = 0; i < groceryOrg.getDeliveryManList().size(); i++) {
            model.addRow(new Object[]{
                groceryOrg.getDeliveryManList().get(i).getEmployee().getId(),
                groceryOrg.getDeliveryManList().get(i).getEmployee().getName()
            });
        }
    }
}