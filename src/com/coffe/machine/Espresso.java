package com.coffe.machine;



public class Espresso extends Coffee {
    //public static int numCups;   // и так наследует

    protected static final int water = 250;
    protected static final int coffeeBeans = 16;
    protected static final int milk = 0;
    protected static final int cost = 4;


    @Override
    public int getWater() {
        return water ;
    }

    @Override
    public int getMilk() {
        return milk;
    }

    @Override
    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
