package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FoodOrganization;
import Business.Organization.Organization;
import Business.Role.CustomerRole;
import Business.Role.MoneyAdvisorRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        Network network = system.createAndAddNetwork();
        //create an enterprise
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("Medical", Enterprise.EnterpriseType.Medical);
        Enterprise financeEnterprise = network.getEnterpriseDirectory().createAndAddEnterprise("Finance", Enterprise.EnterpriseType.Finance);
        //initialize some organizations
        Organization nurseOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Nurse);        
        Organization covidCareOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.CovidCare);
        Organization therapyOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Therapy);
        Organization healthAidOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.HealthAid);
        Organization MoneyManagementOrganization = financeEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.MoneyManagement);
        Organization LegalServicesOrganization = financeEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.LegalServices);
         //create an enterprise - food and essentials
        Enterprise enterprise2 = network.getEnterpriseDirectory().createAndAddEnterprise("FoodAndEssentials", Enterprise.EnterpriseType.FoodAndEssentials);
        //initialize some organizations
        //FoodOrganization foodOrganization = new FoodOrganization();
        Organization foodOrganization = enterprise2.getOrganizationDirectory().createOrganization(Organization.Type.Food);
        Organization essentialOrganization = enterprise2.getOrganizationDirectory().createOrganization(Organization.Type.GroceryAndEssentials);
        System.out.println("enterprise config " + enterprise2.getOrganizationDirectory().getOrganizationList().get(0).getName());
        // house hold enterprise
        Enterprise houseHoldEnterprise = network.getEnterpriseDirectory().createAndAddEnterprise("HouseHold", Enterprise.EnterpriseType.HouseHold);
        // house hold organization
        Organization houseHoldOrganization = houseHoldEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.HouseHold);        
        //have some employees 
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        Employee employee1 = system.getEmployeeDirectory().createEmployee("customer");
        Employee employeeMoneyAdmin = system.getEmployeeDirectory().createEmployee("moneyAdmin");
        //create user account
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("customer", "customer", employee1, new CustomerRole());
        UserAccount userMoney = system.getUserAccountDirectory().createUserAccount("moneyAdmin", "moneyAdmin", employeeMoneyAdmin, new MoneyAdvisorRole());
        MoneyManagementOrganization.getUserAccountDirectory().getUserAccountList().add(userMoney);
        return system;
    }
    
}
