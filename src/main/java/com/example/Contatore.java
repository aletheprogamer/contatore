package com.example;

public class Contatore {
    
    private int valore;
    private int valoreMassimo;

    public Contatore(int v,int vm){
        
            this.valore=v;
            this.valoreMassimo=vm;
        
    }

    public synchronized boolean incrementa(String nomeThread){

        if(this.valore < this.valoreMassimo){
            this.valore++;
            System.out.println(nomeThread+" ha incrementato il contatore a: "+this.valore);
            return true;
        }
        else{
            return false;
        }


    }




}
