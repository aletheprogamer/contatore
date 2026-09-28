package com.example;

import java.util.Random;

public class Lavoratore implements Runnable{

    private Contatore condiviso;
    private String nome;


    public Lavoratore(Contatore c , String n){
        this.condiviso = c;
        this.nome=n;
    }



    public void run() {
        
        Random random = new Random();
     try {
        while(condiviso.incrementa(nome)!=false){
            condiviso.incrementa(nome);
            int pausa = 100 + random.nextInt(401);
            Thread.sleep(pausa);
        }
     } catch (Exception e) {
        System.out.println("programma interrotto");
     }   
        
       
    }
    
}
