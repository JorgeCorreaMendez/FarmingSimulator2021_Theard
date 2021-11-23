package com.yogusoft.Farms;

public class Farmer extends Thread {
    private Orchard buffer;
    private int producedUnits;
    private int maxTimeGrow = Vegetable.randomGrowthGenerator();
    private String name;

    public Farmer(String name, Orchard buffer, int producedUnits) {
        this.name = name;
        this.buffer = buffer;
        this.producedUnits = producedUnits;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < producedUnits; i++) {
                String vegetable = Vegetable.randomVegetable();

                sleep((int) (Math.random() * maxTimeGrow));
                buffer.put(vegetable);
                System.out.println(name + " ha producido un " + vegetable);
                System.out.println("--------------------------------");

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
