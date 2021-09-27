package com.udemy.section06;

public class Rectangle {
    private double width, length;

    public Rectangle(double width, double length) {
        this.width = width < 0? 0: width;
        this.length = length < 0? 0: length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
class Cuboid extends Rectangle {

    private double height;

    public Cuboid (double width, double length, double heigth) {
        super(width, length);
        this.height = heigth < 0? 0: heigth;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }
}
