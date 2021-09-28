package com.udemy.section07;

public class Hamburger {
    private String name, meat, breadRollType;
    private double price;
    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name,String meat,double price,String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double itemizeHamburger() {
        double burgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);

        if (this.addition1Name != null) {
            burgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }

        if (this.addition2Name != null) {
            burgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }

        if (this.addition3Name != null) {
            burgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }

        if (this.addition4Name != null) {
            burgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return burgerPrice;
    }
}

class DeluxeBurger extends Hamburger{
    public DeluxeBurger(){
        super("basic","chicken",10.10,"white");
        super.addHamburgerAddition1("Chips", 5);
        super.addHamburgerAddition2("Drink", 4);
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        System.out.println("Cannot add additional items to a deluxe burger.");
    }
}

class HealthyBurger extends Hamburger{
    private String healthyExtra1Name , healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super("Healthy",meat,price,"");
    }

    public void addHealthyAddition1(String addition1Name, double addition1Price){
        this.healthyExtra1Name = addition1Name;
        this.healthyExtra1Price = addition1Price;
    }

    public void addHealthyAddition2(String addition2Name, double addition2Price){
        this.healthyExtra2Name = addition2Name;
        this.healthyExtra2Price = addition2Price;
    }

    public double itemizeHamburger() {
        double burgerPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            burgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null) {
            burgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }

        return burgerPrice;
    }
}