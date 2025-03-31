package com.example.managerapp;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PelaajaFragment extends Fragment {

    private RecyclerView recyclerViewPelaajat;
    private PelaajaAdapter pelaajaAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View nakyma = inflater.inflate(R.layout.fragment_pelaaja, container, false);
        recyclerViewPelaajat = nakyma.findViewById(R.id.recyclerViewPelaajat);
        recyclerViewPelaajat.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Pelaaja> pelaajat = Data.luoEsimerkkipelaajat();

        pelaajaAdapter = new PelaajaAdapter(pelaajat);
        recyclerViewPelaajat.setAdapter(pelaajaAdapter);

        return nakyma;
    }
}

