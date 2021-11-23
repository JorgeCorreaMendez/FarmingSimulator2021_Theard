package com.yogusoft;

import com.yogusoft.ExceptionHandlers.getInputValue;

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
    }
}
