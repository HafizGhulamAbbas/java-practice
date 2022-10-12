package org.abstraction.usingInterface;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", 2.5);
        System.out.println(circle.info());

        Square square = new Square("Red", 10);
        System.out.println(square.info());

        // Access interface methods and variables
        Shape.staticMethod();
        System.out.println(Shape.i);
    }
}
