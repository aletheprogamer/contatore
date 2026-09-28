package com.example;

public class Main {
    public static void main(String[] args) {
        
        Contatore c1 =new Contatore(0, 10); 

        Lavoratore l1 = new Lavoratore(c1, "renzo");
        Lavoratore l2 = new Lavoratore(c1, "lorenzo");

        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(l2);

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("box,box,box");
        }
        
        System.out.println("Raggiunto il valore massimo del contatore!");


    }
}