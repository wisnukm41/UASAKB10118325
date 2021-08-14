// Dibuat Tanggal 14 Agustus 2021
// Oleh Wisnu Murfadilah Rokhsan / 10118325 / IF8
package com.example.uasakb10118325;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    ArrayList<Places> list =  new ArrayList<>();
    public RVAdapter(Context ctx){
        this.context = ctx;
    }
    public void setItems(ArrayList<Places> plc){
        list.addAll(plc);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items,parent,false);
        return new PlacesVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PlacesVH vh = (PlacesVH) holder;
        Places plc = list.get(position);
        vh.txt_name.setText(plc.getName());
        vh.txt_location.setText(plc.getLocation());
        vh.txt_desc.setText(plc.getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
