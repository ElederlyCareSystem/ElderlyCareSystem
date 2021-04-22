package Business;

import Business.DB4OUtil.DB4OUtil;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FoodOrganization;
import Business.Organization.Organization;
import Business.Role.CovidCareRole;
import Business.Role.CustomerRole;
import Business.Role.HouseHoldRole;
import Business.Role.LegalAdvisorRole;
import Business.Role.MoneyAdvisorRole;
import Business.Role.NurseRole;
import Business.Role.SystemAdminRole;
import Business.Role.TherapistRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        DB4OUtil dB4OUtil = DB4OUtil.getInstance();
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
        // house hold enterprise
        Enterprise houseHoldEnterprise = network.getEnterpriseDirectory().createAndAddEnterprise("HouseHold", Enterprise.EnterpriseType.HouseHold);
        // house hold organization
        Organization houseHoldOrganization = houseHoldEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.HouseHold);        
        //have some employees 
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        Employee employee1 = system.getEmployeeDirectory().createEmployee("customer");
        Employee employeeMoneyAdmin = system.getEmployeeDirectory().createEmployee("moneyAdmin");
        Employee employeeLegalAdmin = system.getEmployeeDirectory().createEmployee("legalAdmin");        
        Employee employeeNurseAdmin = system.getEmployeeDirectory().createEmployee("nurseAdmin");
        Employee employeeTherapyAdmin = system.getEmployeeDirectory().createEmployee("therapyAdmin");
        Employee employeeCovidCareAdmin = system.getEmployeeDirectory().createEmployee("covidCareAdmin");
        Employee employeeHouseHoldAdmin = system.getEmployeeDirectory().createEmployee("houseHoldAdmin");

        //create user account
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("customer", "customer", employee1, new CustomerRole());
        UserAccount userMoney = system.getUserAccountDirectory().createUserAccount("moneyAdmin", "moneyAdmin", employeeMoneyAdmin, new MoneyAdvisorRole());
        UserAccount userLegal = system.getUserAccountDirectory().createUserAccount("legalAdmin", "legalAdmin", employeeLegalAdmin, new LegalAdvisorRole());
        UserAccount nurseUser = system.getUserAccountDirectory().createUserAccount("nurseAdmin", "nurseAdmin", employeeNurseAdmin, new NurseRole("admin"));   
        UserAccount therapistUser = system.getUserAccountDirectory().createUserAccount("therapyAdmin", "therapyAdmin", employeeTherapyAdmin, new TherapistRole());
        UserAccount covidCareUser = system.getUserAccountDirectory().createUserAccount("covidCareAdmin", "covidCareAdmin", employeeCovidCareAdmin, new CovidCareRole());
        UserAccount houseHoldUser = system.getUserAccountDirectory().createUserAccount("houseHoldAdmin", "houseHoldAdmin", employeeHouseHoldAdmin, new HouseHoldRole());

        MoneyManagementOrganization.getUserAccountDirectory().getUserAccountList().add(userMoney);
        LegalServicesOrganization.getUserAccountDirectory().getUserAccountList().add(userLegal);        
        
        nurseOrganization.getUserAccountDirectory().getUserAccountList().add(nurseUser);        
        therapyOrganization.getUserAccountDirectory().getUserAccountList().add(therapistUser);
        covidCareOrganization.getUserAccountDirectory().getUserAccountList().add(covidCareUser);
        houseHoldOrganization.getUserAccountDirectory().getUserAccountList().add(houseHoldUser);
//        dB4OUtil.storeSystem(system);
        return system;
    }
    
}
