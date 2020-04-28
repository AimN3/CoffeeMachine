package com.coffe.machine;

public class Cappuccino extends Coffee {
   //public static int numCups;  // и так наследует
    protected static final int water = 200;
    protected static final int milk = 100;
    protected static final int coffeeBeans = 12;
    protected static final int cost = 6;


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
