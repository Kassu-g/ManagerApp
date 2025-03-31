package com.example.managerapp;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class JoukkueFragment extends Fragment {

    private RecyclerView recyclerViewJoukkueet;
    private JoukkueAdapter joukkueAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View nakyma = inflater.inflate(R.layout.fragment_joukkue, container, false);
        recyclerViewJoukkueet = nakyma.findViewById(R.id.recyclerViewJoukkueet);
        recyclerViewJoukkueet.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Joukkue> joukkueet = Data.luoEsimerkkijoukkueet();

        joukkueAdapter = new JoukkueAdapter(joukkueet);
        recyclerViewJoukkueet.setAdapter(joukkueAdapter);

        return nakyma;
    }
}

