package org.example;

public class CabrioletProductionLine implements ProductionLine {
    @Override
    public Car work() {
        System.out.println("CABRIOLET built");
        return new Car();
    }
}
