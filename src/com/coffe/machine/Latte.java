package com.coffe.machine;

public class Latte extends Coffee {
   // public static int numCups; // и так наследует
    protected static final int water = 350;
    protected static final int milk = 75;
    protected static final int coffeeBeans = 20;
    protected static final int cost = 7;


    @Override
    public int getWater() {
        return this.getWater();
    }

    @Override
    public int getMilk() {
        return this.getMilk();
    }

    @Override
    public int getCoffeeBeans() {
        return this.getCoffeeBeans();
    }

    @Override
    public int getCost() {
        return this.getCost();
    }
}
