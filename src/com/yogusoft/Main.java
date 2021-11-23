package com.yogusoft;

import com.yogusoft.ExceptionHandlers.getInputValue;
import com.yogusoft.Farms.Farmer;
import com.yogusoft.Farms.Orchard;

public class Main {

    public static void main(String[] args) {
        System.out.print("Introduce el tamaño del huerto: ");
        int sizeOrchard = getInputValue.getPositive_Integer();

        System.out.print("Introduce el número de vegetales a producir: ");
        int numberVegetablesProduced = getInputValue.getPositive_Integer();

        System.out.print("Introduce el número de maximo de vegetales a consumir: ");
        int numberVegetablesSell = getInputValue.getPositive_Integer();

        System.out.println("------------------------------------------");

        System.out.print("Introduce el número de clientes: ");
        int numberClients = getInputValue.getPositive_Integer();

        System.out.print("Introduce el número de productores: ");
        int numberProducer = getInputValue.getPositive_Integer();

        Orchard newOrchard = new Orchard(sizeOrchard);
        System.out.println("------------------------------------------");

        for (int i = 0; i < numberProducer; i++) {
            Farmer newFarmer = new Farmer("Productor" + i , newOrchard, numberVegetablesProduced);
            newFarmer.start();
        }

        for (int i = 0; i < numberClients; i++) {
            Consumer newConsumer = new Consumer("Consumidor" + i, newOrchard, numberVegetablesSell);
            newConsumer.start();
        }
    }
}
