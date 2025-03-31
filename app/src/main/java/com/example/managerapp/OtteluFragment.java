package com.example.managerapp;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class OtteluFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View nakyma = inflater.inflate(R.layout.fragment_ottelu, container, false);
        RecyclerView recyclerViewOttelut = nakyma.findViewById(R.id.recyclerViewOttelut);
        recyclerViewOttelut.setLayoutManager(new LinearLayoutManager(getContext()));

        return nakyma;
    }
}

