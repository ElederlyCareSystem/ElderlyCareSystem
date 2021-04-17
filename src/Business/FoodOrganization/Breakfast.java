/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodOrganization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mrudu
 */
public class Breakfast {
    
    List<FoodItems> vegList = new ArrayList<FoodItems>();
    List<FoodItems> nonVegList = new ArrayList<FoodItems>();
    List<FoodItems> veganList = new ArrayList<FoodItems>();

    public Breakfast() {
        generateVegList();
        generateNonVegList();
        generateVeganList();
    }

    private void generateVegList() {
        FoodItems fi1 = new FoodItems("Breakfast","Veg" ,"Bread Butter Toast", 2.00);
        FoodItems fi2 = new FoodItems("Breakfast", "Veg" ,"Cereals", 1.50);
        FoodItems fi3 = new FoodItems("Breakfast","Veg" , "Avocado Toast", 2.00);
        FoodItems fi4 = new FoodItems("Breakfast","Veg" , "Milk and Cookies", 2.50);
        vegList.add(fi1);
        vegList.add(fi2);
        vegList.add(fi3);
        vegList.add(fi4);
    }

    private void generateNonVegList() {
        FoodItems fi1 = new FoodItems("Breakfast","Non-Veg" , "Bread Butter Toast", 2.00);
        FoodItems fi2 = new FoodItems("Breakfast","Non-Veg" , "French Toast", 2.00);
        FoodItems fi3 = new FoodItems("Breakfast","Non-Veg" , "Scrambled eggs", 3.00);
        FoodItems fi4 = new FoodItems("Breakfast","Non-Veg" , "Breakfast burrito", 4.00);
        nonVegList.add(fi1);
        nonVegList.add(fi2);
        nonVegList.add(fi3);
        nonVegList.add(fi4);
    }

    private void generateVeganList() {
        FoodItems fi1 = new FoodItems("Breakfast","Vegan", "Bread Butter Toast", 2.00);
        FoodItems fi2 = new FoodItems("Breakfast","Vegan", "Cereals", 1.50);
        FoodItems fi3 = new FoodItems("Breakfast","Vegan", "Avocado Toast", 2.00);
        FoodItems fi4 = new FoodItems("Breakfast","Vegan", "Milk and Cookies", 2.50);
        veganList.add(fi1);
        veganList.add(fi2);
        veganList.add(fi3);
        veganList.add(fi4);
    }
    
    public List<FoodItems> getVegList() {
        return vegList;
    }

    public List<FoodItems> getNonVegList() {
        return nonVegList;
    }

    public List<FoodItems> getVeganList() {
        return veganList;
    }
    
}
