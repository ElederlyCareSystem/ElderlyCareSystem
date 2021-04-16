/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mrudu
 */
public class FoodAndEssentialsEnterprise extends Enterprise{
    
    public FoodAndEssentialsEnterprise(String name) {
        super(name,Enterprise.EnterpriseType.FoodAndEssentials);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
