package com.udemy.section07;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = wheels;
    }

    public String startEngine(){
        return ("Engine "+this.name+" is starting");
    }

    public String accelerate(){
        return ("Car "+this.name+" is accelerating");
    }

    public String brake(){
        return ("Car "+this.name+" is braking");
    }

    public String getName(){
        return name;
    }

    public int getCylinders(){
        return cylinders;
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders,String name){
        super(cylinders,name);
    }

    public String startEngine(){
        return ("Mitsubishi Engine "+getName());
    }

    public String accelerate(){
        return ("Mitsubishi Car "+getName()+" is accelerating");
    }

    public String brake(){
        return ("Mitsubishi Car "+getName()+" is braking");
    }
}

class Ford extends Car{
    public Ford(int cylinders,String name){
        super(cylinders,name);
    }

    public String startEngine(){
        return ("Ford Engine "+getName()+" is starting");
    }

    public String accelerate(){
        return ("Ford Car "+getName()+" is accelerating");
    }

    public String brake(){
        return ("Ford Car "+getName()+" is braking");
    }
}

class Holden extends Car{
    public Holden(int cylinders,String name){
        super(cylinders,name);
    }

    public String startEngine(){
        return ("Holden Engine "+getName()+" is starting");
    }

    public String accelerate(){
        return ("Holden Car "+getName()+" is accelerating");
    }

    public String brake(){
        return ("Holden Car "+getName()+" is braking");
    }
}



