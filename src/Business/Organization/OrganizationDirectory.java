/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import Business.Role.HealthAidRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NursingOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.CovidCare.getValue())){
            organization = new CovidCareOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HealthAid.getValue())){
            organization = new HealthAidOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Therapy.getValue())){
            organization = new TherapyOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}