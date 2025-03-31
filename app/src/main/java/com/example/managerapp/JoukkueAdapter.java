package com.example.managerapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class JoukkueAdapter extends RecyclerView.Adapter<JoukkueAdapter.JoukkueViewHolder> {

    private List<Joukkue> joukkueLista;

    public JoukkueAdapter(List<Joukkue> joukkueLista) {
        this.joukkueLista = joukkueLista;
    }

    @NonNull
    @Override
    public JoukkueViewHolder onCreateViewHolder(@NonNull ViewGroup vanhempi, int viewType) {
        View nakyma = LayoutInflater.from(vanhempi.getContext())
                .inflate(R.layout.item_joukkue, vanhempi, false);
        return new JoukkueViewHolder(nakyma);
    }

    @Override
    public void onBindViewHolder(@NonNull JoukkueViewHolder holder, int indeksi) {
        Joukkue joukkue = joukkueLista.get(indeksi);
        holder.nimiTextView.setText(joukkue.getNimi());
    }

    @Override
    public int getItemCount() {
        return joukkueLista.size();
    }

    public void paivitaLista(List<Joukkue> uusiLista) {
        joukkueLista = uusiLista;
        notifyDataSetChanged();
    }

    public static class JoukkueViewHolder extends RecyclerView.ViewHolder {
        TextView nimiTextView;

        public JoukkueViewHolder(@NonNull View itemView) {
            super(itemView);
            nimiTextView = itemView.findViewById(R.id.textViewJoukkueNimi);
        }
    }
}

