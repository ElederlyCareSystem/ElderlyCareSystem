/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.GroceryAndEssentialsOrganization.EssentialsList;
import Business.GroceryAndEssentialsOrganization.ShoppingItem;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mrudu
 */
public class GroceryAndEssentialsOrganization extends Organization{
    
    List<ShoppingItem> shoppingList;
    EssentialsList list = new EssentialsList();
    List<UserAccount> deliveryManList = new ArrayList<>();
    
    public GroceryAndEssentialsOrganization() {
        super(Organization.Type.GroceryAndEssentials.getValue());
        shoppingList = list.getShoppingList();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<ShoppingItem> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<ShoppingItem> shoppingList) {
        this.shoppingList = shoppingList;
    }
    
    public ShoppingItem getItemByName(String name){
        ShoppingItem item = null;
        
        for(int i = 0; i < shoppingList.size(); i++){
            if(shoppingList.get(i).getItemName().equals(name)){
                item = shoppingList.get(i);
            }
        }
        
        return item;
    }
    
    public List<UserAccount> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(List<UserAccount> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
}
