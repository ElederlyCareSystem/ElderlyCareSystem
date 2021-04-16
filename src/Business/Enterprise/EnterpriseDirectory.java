/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Medical) {
            enterprise = new MedicalEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.FoodAndEssentials) {
            enterprise = new FoodAndEssentialsEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }

    public Organization getEnterpriseByType(String type, String orgName) {
        Enterprise enterprise = null;
        for (int i = 0; i < enterpriseList.size(); i++) {
            //System.out.println("en>>>" + enterpriseList.get(i).getEnterpriseType().getValue());
            if (enterpriseList.get(i).getEnterpriseType().getValue() == type) {
                System.out.println("if>>>"+enterpriseList.get(i).getEnterpriseType().getValue());
                enterprise = enterpriseList.get(i);
                for (int j = 0; j < enterprise.getOrganizationDirectory().getOrganizationList().size(); j++) {
                    System.out.println("orgo>>>" + enterprise.getOrganizationDirectory().getOrganizationList().get(j).getName());
                    if (enterprise.getOrganizationDirectory().getOrganizationList().get(j).getName() == orgName) {
                        return enterprise.getOrganizationDirectory().getOrganizationList().get(j);
                    }
                }
            }
        }
        return null;
//        return enterprise;

    }
}
