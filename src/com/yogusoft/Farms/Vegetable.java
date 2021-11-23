package com.yogusoft.Farms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Vegetable {
    static File fileVegetable = new File("src/com/yogusoft/Farms/vegetables.txt");

    public static int randomGrowthGenerator(){
        return (int) ((Math.random() * 5000) + 1000);
    }

    public static String randomVegetable(){
        String vegetable = "";
        ArrayList<String> listVegetable = new ArrayList<>();

        if(!fileVegetable.exists() || fileVegetable.isDirectory()){
            System.err.println("Error, el fichero no es valido ");
            System.exit(0);
        } else {
            try (BufferedReader buffer = new BufferedReader(new FileReader(fileVegetable))) {
                vegetable = buffer.readLine();

                while (vegetable != null) {
                    listVegetable.add(vegetable);
                    vegetable = buffer.readLine();
                }
            } catch (IOException e) {
                System.out.println("Error, problema inesperado");
            }

            int randomPositionVegetable = (int) (Math.random() * listVegetable.size());

            return listVegetable.get(randomPositionVegetable);
        }

        return vegetable;
    }
}
