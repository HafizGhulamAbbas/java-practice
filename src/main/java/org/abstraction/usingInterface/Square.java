package org.abstraction.usingInterface;

public class Square implements Shape {
    String color;
    double sides;

    public Square(String color, double sides) {
        this.color = color;
        this.sides = sides;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return Math.pow(sides, 2);
    }

    @Override
    public String info() {
        return "I am a " + color() + " Circle and my area is " + area();
    }
}
