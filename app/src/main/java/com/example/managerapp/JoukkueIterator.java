package com.example.managerapp;
import java.util.Iterator;
import java.util.List;

public class JoukkueIterator implements Iterator<Joukkue> {
    private List<Joukkue> joukkueet;
    private int indeksi = 0;

    @Override
    public boolean hasNext() {
        return indeksi < joukkueet.size();
    }
    @Override
    public Joukkue next() {
        return joukkueet.get(indeksi++);
    }
}

