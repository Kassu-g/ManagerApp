package com.example.managerapp;

public class Pelaaja implements JalkapalloEntiteetti {
    private String nimi;
    private int ika;
    private String maa;
    private String pelipaikka;
    private String joukkue;
    private int pelinumero;

    public Pelaaja(String nimi, int ika, String maa, String pelipaikka, String joukkue, int pelinumero) {
        this.nimi = nimi;
        this.ika = ika;
        this.maa = maa;
        this.pelipaikka = pelipaikka;
        this.joukkue = joukkue;
        this.pelinumero = pelinumero;
    }

    @Override
    public String getNimi() {
        return nimi;
    }

    // Getterit
    public int getIka() {
        return ika;
    }

    public String getMaa() {
        return maa;
    }

    public String getPelipaikka() {
        return pelipaikka;
    }

    public String getJoukkue() {
        return joukkue;
    }

    public int getPelinumero() {
        return pelinumero;
    }
}
