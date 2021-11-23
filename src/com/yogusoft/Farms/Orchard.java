package com.yogusoft.Farms;

public class Orchard extends Thread{
    private String buff[] = null;
    private int top = 0;

    private boolean full = false;
    private boolean empty = true;

    public Orchard(int spaceVegetable) {
        this.buff = new String[spaceVegetable];
    }

    public synchronized void put(String vegetable) throws InterruptedException {
        while (full){
            wait();
        }

        System.out.println("Plantando " + vegetable + " en la posición del huerto " + top);
        System.out.println("--------------------------------");
        buff[top++] = vegetable;

        empty = false;
        full = top >=  buff.length;

        notifyAll();
    }

    public synchronized String get() throws InterruptedException {
        while (empty){
            wait();
        }

        String vegetable = buff[--top];
        System.out.println("Recogiendo " + vegetable + " de la posición del huerto " + top);
        System.out.println("--------------------------------");

        full = false;
        empty = top <= 0;

        notifyAll();

        return vegetable;
    }
}
