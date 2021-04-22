/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.FoodOrganization.Breakfast;
import Business.FoodOrganization.Dinner;
import Business.Role.Role;
import java.util.ArrayList;
import Business.FoodOrganization.FoodItems;
import Business.FoodOrganization.Lunch;
import Business.Role.AdminRole;
import Business.WorkQueue.FoodOrganizationWorkQueue;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mrudu
 */
public class FoodOrganization extends Organization{
    
    List<FoodItems> veganBreakfastList;
    List<FoodItems> vegBreakfastList;
    List<FoodItems> nonvegBreakfastList;
    List<FoodItems> veganLunchList;
    List<FoodItems> vegLunchList;
    List<FoodItems> nonvegLunchList;
    List<FoodItems> veganDinnerList;
    List<FoodItems> vegDinnerList;
    List<FoodItems> nonvegDinnerList;
    Breakfast bf = new Breakfast();
    Lunch lunch = new Lunch();
    Dinner dinner = new Dinner();
    FoodOrganizationWorkQueue workQueue = new FoodOrganizationWorkQueue();
    Map<List<String>,Double> map = new LinkedHashMap<>();
    
    public FoodOrganization() {
        super(Type.Food.getValue());
        this.veganBreakfastList = bf.getVeganList();
        this.vegBreakfastList = bf.getVegList();
        this.nonvegBreakfastList = bf.getNonVegList();
        this.veganLunchList = lunch.getVeganList();
        this.vegLunchList = lunch.getVegList();
        this.nonvegLunchList = lunch.getNonVegList();
        this.veganDinnerList = dinner.getVeganList();
        this.vegDinnerList = dinner.getVegList();
        this.nonvegDinnerList = dinner.getNonVegList();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }

    public List<FoodItems> getVeganBreakfastList() {
        return veganBreakfastList;
    }

    public List<FoodItems> getVegBreakfastList() {
        return vegBreakfastList;
    }

    public List<FoodItems> getNonvegBreakfastList() {
        return nonvegBreakfastList;
    }

    public List<FoodItems> getVeganLunchList() {
        return veganLunchList;
    }

    public List<FoodItems> getVegLunchList() {
        return vegLunchList;
    }

    public List<FoodItems> getNonvegLunchList() {
        return nonvegLunchList;
    }

    public List<FoodItems> getVeganDinnerList() {
        return veganDinnerList;
    }

    public List<FoodItems> getVegDinnerList() {
        return vegDinnerList;
    }

    public List<FoodItems> getNonvegDinnerList() {
        return nonvegDinnerList;
    }
    
    public FoodItems getFoodItemByName(String meal, String type, String name){
        FoodItems foodItem = null;
        
        if(meal.equals("Breakfast") && type.equals("Veg")){
            for(int i = 0; i < vegBreakfastList.size(); i++){
                if(vegBreakfastList.get(i).getFoodItemsName().equals(name)){
                    foodItem = vegBreakfastList.get(i);
                }
            }
        }else if(meal.equals("Breakfast") && type.equals("Vegan")){
            for(int i = 0; i < veganBreakfastList.size(); i++){
                if(veganBreakfastList.get(i).getFoodItemsName().equals(name)){
                    foodItem = veganBreakfastList.get(i);
                }
            }
        }else if(meal.equals("Breakfast") && type.equals("Non-Veg")){
            for(int i = 0; i < nonvegBreakfastList.size(); i++){
                if(nonvegBreakfastList.get(i).getFoodItemsName().equals(name)){
                    foodItem = nonvegBreakfastList.get(i);
                }
            }
        }else if(meal.equals("Lunch") && type.equals("Veg")){
            for(int i = 0; i < vegLunchList.size(); i++){
                if(vegLunchList.get(i).getFoodItemsName().equals(name)){
                    foodItem = vegLunchList.get(i);
                }
            }
        }else if(meal.equals("Lunch") && type.equals("Vegan")){
            for(int i = 0; i < veganLunchList.size(); i++){
                if(veganLunchList.get(i).getFoodItemsName().equals(name)){
                    foodItem = veganLunchList.get(i);
                }
            }
        }else if(meal.equals("Lunch") && type.equals("Non-Veg")){
            for(int i = 0; i < nonvegLunchList.size(); i++){
                if(nonvegLunchList.get(i).getFoodItemsName().equals(name)){
                    foodItem = nonvegLunchList.get(i);
                }
            }
        }else if(meal.equals("Dinner") && type.equals("Veg")){
            for(int i = 0; i < vegDinnerList.size(); i++){
                if(vegDinnerList.get(i).getFoodItemsName().equals(name)){
                    foodItem = vegDinnerList.get(i);
                }
            }
        }else if(meal.equals("Dinner") && type.equals("Vegan")){
            for(int i = 0; i < veganDinnerList.size(); i++){
                if(veganDinnerList.get(i).getFoodItemsName().equals(name)){
                    foodItem = veganDinnerList.get(i);
                }
            }
        }else if(meal.equals("Dinner") && type.equals("Non-Veg")){
            for(int i = 0; i < nonvegDinnerList.size(); i++){
                if(nonvegDinnerList.get(i).getFoodItemsName().equals(name)){
                    foodItem = nonvegDinnerList.get(i);
                }
            }
        }
        
        return foodItem;
    }
    
    @Override
    public void generateMap(){
        map = new LinkedHashMap<>();
    }

    @Override
    public void generateRevenue() {
        System.out.println("generate rev>>");
        List<String> l1 = Arrays.asList("2020", "Jan");
        map.put(l1, 120.0);
        List<String> l2 = Arrays.asList("2020", "Feb");
        map.put(l2, 20.0);
        List<String> l3 = Arrays.asList("2020", "Mar");
        map.put(l3, 220.0);
        List<String> l4 = Arrays.asList("2020", "Apr");
        map.put(l4, 160.0);
        List<String> l5 = Arrays.asList("2020", "May");
        map.put(l5, 80.0);
        List<String> l6 = Arrays.asList("2020", "Jun");
        map.put(l6, 120.0);
        List<String> l7 = Arrays.asList("2020", "Jul");
        map.put(l7, 140.0);
        List<String> l8 = Arrays.asList("2020", "Aug");
        map.put(l8, 110.0);
        List<String> l9 = Arrays.asList("2020", "Sep");
        map.put(l9, 190.0);
        List<String> l10 = Arrays.asList("2020", "Oct");
        map.put(l10, 120.0);
        List<String> l11 = Arrays.asList("2020", "Nov");
        map.put(l11, 100.0);
        List<String> l12 = Arrays.asList("2020", "Dec");
        map.put(l12, 120.0);
        List<String> l13 = Arrays.asList("2021", "Jan");
        map.put(l13, 170.0);
        List<String> l14 = Arrays.asList("2021", "Feb");
        map.put(l14, 230.0);
        List<String> l15 = Arrays.asList("2021", "Mar");
        map.put(l15, 220.0);
        List<String> l16 = Arrays.asList("2021", "Apr");
        map.put(l16, 0.0);
        List<String> l17 = Arrays.asList("2021", "May");
        map.put(l17, 0.0);
        List<String> l18 = Arrays.asList("2021", "Jun");
        map.put(l18, 0.0);
        List<String> l19 = Arrays.asList("2021", "Jul");
        map.put(l19, 0.0);
        List<String> l20 = Arrays.asList("2021", "Aug");
        map.put(l20, 0.0);
        List<String> l21 = Arrays.asList("2021", "Sep");
        map.put(l21, 0.0);
        List<String> l22 = Arrays.asList("2021", "Oct");
        map.put(l22, 0.0);
        List<String> l23 = Arrays.asList("2021", "Nov");
        map.put(l23, 0.0);
        List<String> l24 = Arrays.asList("2021", "Dec");
        map.put(l24, 0.0);
    }
    
    @Override
    public void setRevenueMap(Map<List<String>, Double> revenueMap) {
        this.map = map;
    }
    
    @Override
    public Map<List<String>, Double> getRevenueMap() {
        return map;
    }
    
}
