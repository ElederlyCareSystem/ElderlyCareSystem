/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CovidCareOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.admin.covidCare.CovidCareOrgAdminJpanel;
import ui.employee.OrganizationEmployeePanel;

/**
 *
 * @author harshikag
 */
public class CovidCareRole extends Role {
    String type;
    
    public CovidCareRole() {
    }
    
    public CovidCareRole(String type) {
        this.type = type;
        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        if (type.equalsIgnoreCase("admin")) {
//            organization = (NursingOrganization) organization;
            return new CovidCareOrgAdminJpanel(userProcessContainer, account, (CovidCareOrganization) organization, business);
        }
        return new OrganizationEmployeePanel(userProcessContainer, account, (CovidCareOrganization) organization, business);
    }
    
}
