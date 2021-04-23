/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CovidCareRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harshikag
 */
public class CovidCareOrganization extends Organization {
    ArrayList<UserAccount> doctorList = new ArrayList<UserAccount>();

    public ArrayList<UserAccount> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<UserAccount> doctorList) {
        this.doctorList = doctorList;
    }
    
    public CovidCareOrganization() {
        super(Organization.Type.CovidCare.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CovidCareRole());
        return roles;
    }
    
}
