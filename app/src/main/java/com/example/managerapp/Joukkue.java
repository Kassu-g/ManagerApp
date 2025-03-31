package com.example.managerapp;


public class Joukkue implements JalkapalloEntiteetti {
    private String nimi;
    private String maa;
    private String sarja;
    private String stadion;
    private int perustamisVuosi;

    public Joukkue(String nimi, String maa, String sarja, String stadion, int perustamisVuosi) {
        this.nimi = nimi;
        this.maa = maa;
        this.sarja = sarja;
        this.stadion = stadion;
        this.perustamisVuosi = perustamisVuosi;
    }

    @Override
    public String getNimi() {
        return nimi;
    }

    // Getterit
    public String getMaa() {
        return maa;
    }

    public String getSarja() {
        return sarja;
    }

    public String getStadion() {
        return stadion;
    }

    public int getPerustamisVuosi() {
        return perustamisVuosi;
    }
}
