package com.yogusoft;

import com.yogusoft.Farms.Orchard;

public class Consumer extends Thread{
    private String name;
    private Orchard buffer;
    private int expectedUnits;


    public Consumer(String name, Orchard buffer, int expectedUnits) {
        this.name = name;
        this.buffer = buffer;
        this.expectedUnits = expectedUnits;
    }

    @Override
    public void run() {
        String vegetable;

        try {
            for (int i = 0; i < expectedUnits; i++) {
                sleep(5000);
                vegetable = buffer.get();
                System.out.println(name + " ha comprado el vegetal: " + vegetable);
                System.out.println("--------------------------------");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
