package oop_pie_a.grociery;

import oop_pie_a.grociery.solved.Customer;

import java.util.ArrayList;

public class GroceryStore {
    String storeName;
    String managerName;
    private double managerSalary;
    private int breadCount = 100;
    private int milkCount = 100;
    private int cerealCount = 100;
    private int eggCount = 100;

    public GroceryStore(String storeName, String managerName, double managerSalary) {
        this.storeName = storeName;
        this.managerName = managerName;
        this.managerSalary = managerSalary;
    }

    public void greetCustomer(String custName) {
        System.out.println("Welcome to " + this.storeName + " " + custName + "!");
    }

    public void makeTransaction(ArrayList<String> cart, String custName) {
        cart.forEach(item -> {
            switch (item) {
                case "milk" -> this.milkCount -= 1;
                case "cereal" -> this.cerealCount -= 1;
                case "bread" -> this.breadCount -= 1;
                case "eggs" -> this.eggCount -= 1;
                default -> {
                    System.out.println(item + " does not exist in inventory.");
                }
            }
        });
        System.out.println("Your all set " + custName + " have a nice day!");
        System.out.println(" ");
    }




    private void checkInventory(){
        System.out.println("Current Inventory: ");
        System.out.println("milk: "+this.milkCount);
        System.out.println("eggs: "+this.eggCount);
        System.out.println("cereal: "+this.cerealCount);
        System.out.println("bread: "+this.breadCount);
        System.out.println(" ");
    }
    public static void main(String[] args) {
        GroceryStore safeway = new GroceryStore("safeway","sam smith",30000.00);
        Customer john = new Customer("john", 24, false, true);
        safeway.checkInventory();


        safeway.greetCustomer(john.getName());


        System.out.println("Managers name is:");
        john.getManagerName(safeway.managerName);


        john.addItemToCart("milk");
        john.addItemToCart("milk");
        john.addItemToCart("bread");
        john.addItemToCart("cereal");
        john.addItemToCart("cereal");
        john.addItemToCart("eggs");
        john.addItemToCart("eggs");

        safeway.makeTransaction(john.getCart(), john.getName());
        safeway.checkInventory();
    }

}
