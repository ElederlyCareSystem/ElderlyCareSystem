/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CovidCareRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harshikag
 */
public class CovidCareOrganization extends Organization {
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
