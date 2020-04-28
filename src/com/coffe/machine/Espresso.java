package com.coffe.machine;



public class Espresso extends Coffee {
    //public static int numCups;   // и так наследует

    protected static final int water = 250;
    protected static final int coffeeBeans = 16;
    protected static final int milk = 0;
    protected static final int cost = 4;


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
