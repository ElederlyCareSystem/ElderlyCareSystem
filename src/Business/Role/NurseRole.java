/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.admin.OrganizationAdminJpanel;
import ui.employee.OrganizationEmployeePanel;

/**
 *
 * @author harshikag
 */
public class NurseRole extends Role {
    String type;
    public NurseRole() {
    }
    
    public NurseRole(String type) {
        this.type = type;
        
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, DB4OUtil dB4OUtil) {
        if (type.equalsIgnoreCase("admin")) {
            return new OrganizationAdminJpanel(userProcessContainer, account, organization, business);
        }
        return new OrganizationEmployeePanel(userProcessContainer, account, organization, business);
    }
    
}
