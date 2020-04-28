package com.coffe.machine;

public class Latte extends Coffee {
   // public static int numCups; // и так наследует
    protected static final int water = 350;
    protected static final int milk = 75;
    protected static final int coffeeBeans = 20;
    protected static final int cost = 7;



    public int getWater() {
        return water ;
    }


    public int getMilk() {
        return milk;
    }


    public int getCoffeeBeans() {
        return coffeeBeans;
    }


    public int getCost() {
        return cost;
    }
}
