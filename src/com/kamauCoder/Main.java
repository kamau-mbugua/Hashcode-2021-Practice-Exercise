package com.kamauCoder;

import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Google HashCode 2021");
        Service service = new Service();
        try{
            Path inputPath = Paths.get("src","in");
            Path outputPath = Paths.get("src","out");

            Files.newDirectoryStream(inputPath,
                    path -> path.toString().endsWith(".txt"))
                    .forEach(path -> {
                        service.readInputFile(path);
                        List<DeliveredPizza> pizzas = service.process();
                    });

        }
    }
}
