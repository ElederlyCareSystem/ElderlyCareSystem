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
import java.util.List;

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
    
}
