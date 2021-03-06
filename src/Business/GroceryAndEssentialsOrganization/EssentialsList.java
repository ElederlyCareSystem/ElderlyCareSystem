/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GroceryAndEssentialsOrganization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mrudu
 */
public class EssentialsList {
    
    List<ShoppingItem> shoppingList;

    public EssentialsList() {
        shoppingList = new ArrayList<ShoppingItem>();
        makeList();
    }

    public List<ShoppingItem> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<ShoppingItem> shoppingList) {
        this.shoppingList = shoppingList;
    }
    
    public void makeList(){
        ShoppingItem si1 = new ShoppingItem("Whole wheat bread", 1.5);
        shoppingList.add(si1);
        ShoppingItem si2 = new ShoppingItem("Milk", 2.5);
        shoppingList.add(si2);
        ShoppingItem si3 = new ShoppingItem("Chicken", 3.5);
        shoppingList.add(si3);
        ShoppingItem si4 = new ShoppingItem("Salmon", 4.0);
        shoppingList.add(si4);
        ShoppingItem si5 = new ShoppingItem("Brown rice", 10.0);
        shoppingList.add(si5);
        ShoppingItem si6 = new ShoppingItem("Olive Oil", 8.0);
        shoppingList.add(si6);
        ShoppingItem si7 = new ShoppingItem("multigrain cereals", 4.0);
        shoppingList.add(si7);
        ShoppingItem si8 = new ShoppingItem("Broccoli", 2.5);
        shoppingList.add(si8);
        ShoppingItem si9 = new ShoppingItem("Spinach", 2.5);
        shoppingList.add(si9);
        ShoppingItem si10 = new ShoppingItem("Frozen shrimp", 3.5);
        shoppingList.add(si10);
        ShoppingItem si11 = new ShoppingItem("Bounty", 14.0);
        shoppingList.add(si11);
        ShoppingItem si12 = new ShoppingItem("Lizol", 10.0);
        shoppingList.add(si12);
        ShoppingItem si13 = new ShoppingItem("Toilet paper pack", 16.0);
        shoppingList.add(si13);
        ShoppingItem si14 = new ShoppingItem("Plates", 2.0);
        shoppingList.add(si14);
        ShoppingItem si15 = new ShoppingItem("Cup", 1.5);
        shoppingList.add(si15);
        ShoppingItem si16 = new ShoppingItem("Glass", 2.0);
        shoppingList.add(si16);
        ShoppingItem si17 = new ShoppingItem("Detergent", 15.0);
        shoppingList.add(si17);
        ShoppingItem si18 = new ShoppingItem("Air freshener", 3.0);
        shoppingList.add(si18);
        ShoppingItem si19 = new ShoppingItem("Bath rug", 7.0);
        shoppingList.add(si19);
        ShoppingItem si20 = new ShoppingItem("Comforters", 30.0);
        shoppingList.add(si20);
    }
}
