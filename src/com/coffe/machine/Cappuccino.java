package com.coffe.machine;

public class Cappuccino extends Coffee {
   //public static int numCups;  // и так наследует
    protected static final int water = 200;
    protected static final int milk = 100;
    protected static final int coffeeBeans = 12;
    protected static final int cost = 6;



    public int getWater() {
        return water;
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
