package org.example;

import java.util.ArrayList;
import java.util.List;

public class AutoFactory {
    private int productionSize;
    private ProductionLine productionLine;

    public AutoFactory(int productionSize, ProductionLine productionLine) {
        this.productionSize = productionSize;
        this.productionLine = productionLine;
    }

    public int runProduction() {
        int carsBuilt = 0;
        List<Car> cars = new ArrayList<>();
        while (carsBuilt < productionSize) {
            cars.add(productionLine.work());
            carsBuilt++;
        }
        return cars.size();
    }
}
