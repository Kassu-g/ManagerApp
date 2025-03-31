package com.example.managerapp;
public class Ottelu implements JalkapalloEntiteetti {
    private String kotijoukkue;
    private String vierasjoukkue;
    private String tulos;
    private String kilpailu;
    private String pvm;
    private String kentta;

    public Ottelu(String kotijoukkue, String vierasjoukkue, String tulos, String kilpailu, String pvm, String kentta) {
        this.kotijoukkue = kotijoukkue;
        this.vierasjoukkue = vierasjoukkue;
        this.tulos = tulos;
        this.kilpailu = kilpailu;
        this.pvm = pvm;
        this.kentta = kentta;
    }

    @Override
    public String getNimi() {
        // Voit palauttaa esim. "kotijoukkue vs vierasjoukkue"
        return kotijoukkue + " vs " + vierasjoukkue;
    }

    // Getterit
    public String getKotijoukkue() {
        return kotijoukkue;
    }

    public String getVierasjoukkue() {
        return vierasjoukkue;
    }

    public String getTulos() {
        return tulos;
    }

    public String getKilpailu() {
        return kilpailu;
    }

    public String getPvm() {
        return pvm;
    }

    public String getKentta() {
        return kentta;
    }
}
