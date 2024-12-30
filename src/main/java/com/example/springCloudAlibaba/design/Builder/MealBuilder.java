package com.example.springCloudAlibaba.design.Builder;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 21:28
 */
public class MealBuilder {
    //素餐食
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    //肉餐食
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
