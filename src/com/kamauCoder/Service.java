package com.kamauCoder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
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
        try(BufferedReader bufferedReader = Files.newBufferedReader(path)){
            String line[] = bufferedReader.readLine().split(" ");
            pizzaType = Integer.parseInt(line[0]);
            teamOf2 = Integer.parseInt(line[1]);
            teamOf3 = Integer.parseInt(line[2]);
            teamOf4 = Integer.parseInt(line[3]);

            pizzas = new Pizza[pizzaType];
            for (int i = 0; i < pizzaType; i++){
                String[] stringInput = bufferedReader.readLine().split(" ");
                pizzas[i] = new Pizza(stringInput[0], Arrays.copyOfRange(stringInput, 1, stringInput.length));
                System.out.println(pizzas[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<DeliveredPizza> process() {
        List<DeliveredPizza> deliveredPizzasResults = new ArrayList<>();

        DeliveredPizza deliveredPizza = new DeliveredPizza();
        deliveredPizza.team =2;
        deliveredPizza.pizzaIndexes = Arrays.asList(1, 2, 3);
        deliveredPizzasResults.add(deliveredPizza);

        return deliveredPizzasResults;
    }

    public void writeOutputFile(Path resolve, List<DeliveredPizza> pizzas) {
        try {Files.createDirectories(resolve.getParent());

        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(resolve)){
            bufferedWriter.write(String.format("%d", pizzas.size()));
            bufferedWriter.newLine();
            for (DeliveredPizza deliveredPizza : pizzas){
                bufferedWriter.write(String.format("%s", deliveredPizza));
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
