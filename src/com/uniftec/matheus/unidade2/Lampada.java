package com.uniftec.matheus.unidade2;

public class Lampada {

    private boolean ligada=false;


    public void liga() {

        ligada=true;

    }

    public void desliga() {
       ligada=false;
    }

    public String observa() {

        if (ligada == true) {
            return "Ligada";
        } else {
            return "Desligada";
        }

    }

}
