package com.example.managerapp;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class PelaajaAdapter extends RecyclerView.Adapter<PelaajaAdapter.PelaajaViewHolder> {

    private List<Pelaaja> pelaajaLista;

    public PelaajaAdapter(List<Pelaaja> pelaajaLista) {
        this.pelaajaLista = pelaajaLista;
    }

    @NonNull
    @Override
    public PelaajaViewHolder onCreateViewHolder(@NonNull ViewGroup vanhempi, int viewType) {
        View nakyma = LayoutInflater.from(vanhempi.getContext())
                .inflate(R.layout.item_pelaaja, vanhempi, false);
        return new PelaajaViewHolder(nakyma);
    }

    @Override
    public void onBindViewHolder(@NonNull PelaajaViewHolder holder, int indeksi) {
        Pelaaja pelaaja = pelaajaLista.get(indeksi);
        holder.nimiTextView.setText(pelaaja.getNimi());
    }

    @Override
    public int getItemCount() {
        return pelaajaLista.size();
    }

    public void paivitaLista(List<Pelaaja> uusiLista) {
        pelaajaLista = uusiLista;
        notifyDataSetChanged();
    }

    public static class PelaajaViewHolder extends RecyclerView.ViewHolder {
        TextView nimiTextView;

        public PelaajaViewHolder(@NonNull View itemView) {
            super(itemView);
            nimiTextView = itemView.findViewById(R.id.textViewPelaajaNimi);
        }
    }
}

