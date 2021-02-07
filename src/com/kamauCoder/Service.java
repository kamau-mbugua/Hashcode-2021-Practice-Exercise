package com.kamauCoder;

import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service {
    int pizzaType;
    int teamOf2;
    int teamOf3;
    int teamOf4;
    Pizza[] pizzas;


    public void readInputFile(Path path) {
    }

    public List<DeliveredPizza> process() {
        List<DeliveredPizza> deliveredPizzasResults = new ArrayList<>();

        DeliveredPizza deliveredPizza = new DeliveredPizza();
        deliveredPizza.team =2;
        deliveredPizza.pizzaIndexes = Arrays.asList(1, 2, 3);
        deliveredPizzasResults.add(deliveredPizza);
    }

    public void writeOutputFile(Path resolve, List<DeliveredPizza> pizzas) {
    }
}
