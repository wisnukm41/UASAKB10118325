// Dibuat Tanggal 14 Agustus 2021
// Oleh Wisnu Murfadilah Rokhsan / 10118325 / IF8
package com.example.uasakb10118325;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesVH extends RecyclerView.ViewHolder {
    public TextView txt_name,txt_location,txt_desc;
    public PlacesVH(@NonNull View itemView) {
        super(itemView);
        txt_name = itemView.findViewById(R.id.txt_name);
        txt_location = itemView.findViewById(R.id.txt_location);
        txt_desc = itemView.findViewById(R.id.txt_description);
    }
}
