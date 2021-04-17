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
public class Dinner {
    
    List<FoodItems> vegList = new ArrayList<FoodItems>();
    List<FoodItems> nonVegList = new ArrayList<FoodItems>();
    List<FoodItems> veganList = new ArrayList<FoodItems>();

    public Dinner() {
        generateVegList();
        generateNonVegList();
        generateVeganList();
    }

    private void generateVegList() {
        FoodItems fi1 = new FoodItems("Dinner","Veg" ,"Tomato Soup", 2.00);
        FoodItems fi2 = new FoodItems("Dinner", "Veg" ,"Greek Salad", 2.50);
        FoodItems fi3 = new FoodItems("Dinner","Veg" , "Fresh Spring Rolls", 3.50);
        FoodItems fi4 = new FoodItems("Dinner","Veg" , "Best Broccoli Salad", 3.00);
        vegList.add(fi1);
        vegList.add(fi2);
        vegList.add(fi3);
        vegList.add(fi4);
    }

    private void generateNonVegList() {
        FoodItems fi1 = new FoodItems("Dinner","Non-Veg" , "chicken salad", 2.00);
        FoodItems fi2 = new FoodItems("Dinner","Non-Veg" , "Tuna salad", 2.00);
        FoodItems fi3 = new FoodItems("Dinner","Non-Veg" , "Burrito bowls", 3.00);
        FoodItems fi4 = new FoodItems("Dinner","Non-Veg" , "Asian Chicken Meatballs", 4.00);
        nonVegList.add(fi1);
        nonVegList.add(fi2);
        nonVegList.add(fi3);
        nonVegList.add(fi4);
    }

    private void generateVeganList() {
        FoodItems fi1 = new FoodItems("Dinner","Vegan", "Many-Veggie Vegetable Soup", 2.00);
        FoodItems fi2 = new FoodItems("Dinner","Vegan", "Best Buddha Bowl", 2.50);
        FoodItems fi3 = new FoodItems("Dinner","Vegan", "Mediterranean Chickpea Salad", 3.00);
        FoodItems fi4 = new FoodItems("Dinner","Vegan", "Chickpea Salad Sandwiches", 3.50);
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
