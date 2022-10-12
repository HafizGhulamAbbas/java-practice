package org.abstraction.usingInterface;

public interface Shape {
    int i = 5;
    
    String color();
    double area();
    String info();

    // Usage: if subclass is not ready, implement in the interface. Once, the subclass ready, remove 'default' keyword along with implementation and override in the subclass.
    default void defaultMethod() {
        System.out.println("I am a default method with implementation in interface. Without default keyword, no method can have implementation.");
    }

    static void staticMethod() {
        System.out.println("I am a static method in interface");
    }
}
