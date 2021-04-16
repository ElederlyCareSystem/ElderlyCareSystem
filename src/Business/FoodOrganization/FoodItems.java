/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodOrganization;

/**
 *
 * @author mrudu
 */
public class FoodItems {
    
    private String meal;
    private String type;
    private String foodItemsName;
    private Double price;
    private int quantity;

    public FoodItems(String meal, String type, String foodItemsName, Double price) {
        this.meal = meal;
        this.type = type;
        this.foodItemsName = foodItemsName;
        this.price = price;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getFoodItemsName() {
        return foodItemsName;
    }

    public void setFoodItemsName(String foodItemsName) {
        this.foodItemsName = foodItemsName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
