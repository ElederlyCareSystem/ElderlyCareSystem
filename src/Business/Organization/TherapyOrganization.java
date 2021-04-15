/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TherapistRole;
import java.util.ArrayList;

/**
 *
 * @author harshikag
 */
public class TherapyOrganization extends Organization {
    public TherapyOrganization() {
        super(Organization.Type.Therapy.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TherapistRole());
        return roles;
    }
}
