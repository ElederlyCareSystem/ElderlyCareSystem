/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NurseRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author harshikag
 */
public class NursingOrganization extends Organization{
    HashMap<String, Double> servicesList = new HashMap<String, Double>();
    ArrayList<UserAccount> nurseEmployeeList = new ArrayList<UserAccount>();

    public ArrayList<UserAccount> getNurseEmployeeList() {
        return nurseEmployeeList;
    }

    public void setNurseEmployeeList(ArrayList<UserAccount> nurseEmployeeList) {
        this.nurseEmployeeList = nurseEmployeeList;
    }

    public HashMap<String, Double> getServicesList() {
        return servicesList;
    }

    public void setServicesList(HashMap<String, Double> servicesList) {
        this.servicesList = servicesList;
    }
    
    
    public NursingOrganization() {
        super(Organization.Type.Nurse.getValue());
        System.out.println("new instance..");
        servicesList.put("General Home Care", 100.00);
        servicesList.put("Alzheimer’s Care", 120.00);
        servicesList.put("Demantia Care", 110.00);
        servicesList.put("Hospice Care", 115.00);
        servicesList.put("Walking and rehab exercises", 119.00);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NurseRole());
        return roles;
    }
    
    
    
    
}
