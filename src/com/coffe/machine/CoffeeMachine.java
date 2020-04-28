package com.coffe.machine;
import com.sun.tools.javac.Main;

import java.util.Scanner;
public class CoffeeMachine {

    static int limitedWater = 1200;
    static int LimitedMilk = 540;
    static int limitedCoffeeBeans = 120;
    static int limitedDisposableCups = 9;
    static Scanner scanner = new Scanner(System.in);
    static double totalMoney = 550.00;

    static int numCups;   //  Где надо это поле ? тут или в классе Coffee ?
    /*static final int ESPRESSO = 0;
    static final int LATTE = 1;
    static final int CAPPUCCINO = 2; */

    static int WATER = 0;
    static int MILK = 1;
    static int BEANS = 2;
    static int COST = 3;

    static int choosenCoffee;
    

    enum State {
        BUY(1),
        BACK(2),
        FILL(3),
        TAKE(4),
        REMAINING(5),
        EXIT(6);
        private final int num;
        State(int num) {
            this.num = num;
        }
        public int getNum() {
            return this.num;
        }
    }
    public static void main(String[] args) {
        mainMenu();
    }
        /* chosen an action buy coffee, fill or take money */

    public static void mainMenu() {
        String action;
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        while (scanner.hasNext()) {
            action = scanner.next();
            switch (action) {
                case "buy":
                    State.BUY.getNum();
                    buy();
                    break;
                case "remaining":
                    State.REMAINING.getNum();
                    print();
                    break;
                case "fill":
                    State.FILL.getNum();
                    fill();
                    break;
                case "take":
                    State.TAKE.getNum();
                    takeMoney();
                    break;
                case "exit":
                    State.EXIT.getNum();
                    System.exit(0);
                    break;
                default:
                    System.out.println("You didn't choose any action, please try again...");
            }
            System.out.println("Write action (buy, fill, take, remaining, exit):");
        }
    }

    /* a method buying*/
    public static void buy() {

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String temp = scanner.next();
        if (temp.equals("back")) {
            State.BACK.getNum();
            mainMenu();
        } else {

            choosenCoffee = Integer.parseInt(temp);
            makeCoffee(choosenCoffee);

        }
     //   System.out.println("Write how many cups of coffee you will need:");
      // while (scanner.hasNextInt()) {
      //     numCups = scanner.nextInt();
           //ifEnough();

        //print();
    }

    public static void makeCoffee(int choosenCoffee) {
        Coffee coffee = null;
            switch (choosenCoffee) {
                case 1:
                    coffee = new Espresso();
                    break;
                case 2:
                    coffee = new Latte();
                    break;
                case 3:
                    coffee = new Cappuccino();
                    break;
                default:
                    System.out.println("You didn't choose coffee");
                    return;
            }
            ifEnough(coffee);
        }


    public static void ifEnough(Coffee coffee) {

        if (coffee.getMilk() > LimitedMilk) {
            System.out.println("Sorry, not enough milk!");

        } else if (coffee.getWater() > limitedWater) {
            System.out.println("Sorry, not enough water!");
        } else if (coffee.getCoffeeBeans() > limitedCoffeeBeans) {
            System.out.println("Sorry, not enough coffeeBeans!");
        } else if (limitedDisposableCups == 0) {
            System.out.println();
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            LimitedMilk = LimitedMilk - (coffee.getMilk() * 1);
            limitedWater = limitedWater - (coffee.getWater() * 1);
            limitedCoffeeBeans = limitedCoffeeBeans - (coffee.getCoffeeBeans() * 1);
            limitedDisposableCups = limitedDisposableCups - 1;
            totalMoney = totalMoney + 1 * coffee.getCost();
        }
    }

    /* calculation available numbers of cups */   /*
    public static int availiableCups(int limitedWater, int limitedMilk, int limitedCoffeeBeans, int limitedDisposableCups, int Coffee.water, int milk, int coffeeBeans) {
        int w = limitedWater / Coffee.water;
        int m = limitedMilk / Coffee.milk;
        int cb = limitedCoffeeBeans / Coffee.coffeeBeans;
        int db = limitedDisposableCups;

        //int cupsAvailable = Math.min(w, Math.min(m, cb));     // 2
        int cupsAvailable = Math.min(Math.min(w, m), Math.min(cb, db));
        return cupsAvailable;
    }  */



    public static void fill() {
        //while (scanner.hasNextInt()) {
        System.out.println("Write how many ml of water do you want to add:");
        int additionalWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int additionalMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int additionalCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int additionalDispCups = scanner.nextInt();
        limitedWater = limitedWater + additionalWater;
        LimitedMilk = LimitedMilk + additionalMilk;
        limitedCoffeeBeans = limitedCoffeeBeans + additionalCoffeeBeans;
        limitedDisposableCups = limitedDisposableCups + additionalDispCups;

            /*System.out.println("The coffee machine has:\n" +
                    (limitedWater + additionalWater) + " of water\n" +
                    (limitedMilk + additionalMilk) + " of milk\n" +
                    (limitedCoffeeBeans + additionalCoffeeBeans) + " of coffee beans\n" +
                    (limitedDisposableCups + additionalDispCups) + " of disposable cups\n" +
                    totalMoney + " of money");*/
    }
    public static void takeMoney() {
        System.out.println("I gave you $" + totalMoney);
        totalMoney = totalMoney - totalMoney;
        //print();
    }
    public static void print() {
        System.out.println("The coffee machine has:\n" +
                limitedWater + " of water\n" +
                LimitedMilk + " of milk\n" +
                limitedCoffeeBeans + " of coffee beans\n" +
                limitedDisposableCups + " of disposable cups\n" +
                "$" + totalMoney + " of money");
    }

}


