package oop_pie_a.grociery;

import java.util.ArrayList;

public class Customer {
    private String name;
    public ArrayList<String> cart = new ArrayList<>();
    private int age;
    boolean hasKids;
    boolean hasPets;

    public Customer(String name, int age, boolean hasKids, boolean hasPets) {
        this.name = name;
        this.age = age;
        this.hasKids = hasKids;
        this.hasPets = hasPets;
    }
    public String askManagersName() { return name; }

    public String getName() {
        return name;
    }

    public void addItemToCart(String item) {
        System.out.println(this.name + " adds " + item + " to their cart.");
        this.cart.add(item);
    }
    public Customer checkoutAtRegister() {
        System.out.println(" ");
        System.out.println(this.name + " places their following items on the checkout stand.");
        System.out.println(this.cart);

        return this;
    }
}
