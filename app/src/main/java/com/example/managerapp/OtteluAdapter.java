package com.example.managerapp;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class OtteluAdapter extends RecyclerView.Adapter<OtteluAdapter.OtteluViewHolder> {

    private final List<Ottelu> otteluLista;

    public OtteluAdapter(List<Ottelu> otteluLista) {
        this.otteluLista = otteluLista;
    }

    @NonNull
    @Override
    public OtteluViewHolder onCreateViewHolder(@NonNull ViewGroup vanhempi, int viewType) {
        View nakyma = LayoutInflater.from(vanhempi.getContext())
                .inflate(R.layout.item_ottelu, vanhempi, false);
        return new OtteluViewHolder(nakyma);
    }

    @Override
    public void onBindViewHolder(@NonNull OtteluViewHolder holder, int indeksi) {
        Ottelu ottelu = otteluLista.get(indeksi);
        holder.nimiTextView.setText(ottelu.getNimi());
    }

    @Override
    public int getItemCount() {
        return otteluLista.size();
    }

    public static class OtteluViewHolder extends RecyclerView.ViewHolder {
        TextView nimiTextView;

        public OtteluViewHolder(@NonNull View itemView) {
            super(itemView);
            nimiTextView = itemView.findViewById(R.id.textViewOtteluNimi);
        }
    }
}
