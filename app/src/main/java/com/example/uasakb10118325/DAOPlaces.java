// Dibuat Tanggal 14 Agustus 2021
// Oleh Wisnu Murfadilah Rokhsan / 10118325 / IF8
package com.example.uasakb10118325;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class DAOPlaces {

    private DatabaseReference databaseReference;

    public  DAOPlaces(){

        FirebaseDatabase db = FirebaseDatabase.getInstance("https://uas10118325-64f18-default-rtdb.firebaseio.com/");
        databaseReference = db.getReference("Places");


        DatabaseReference connectedRef = db.getReference(".info/connected");
        connectedRef.addValueEventListener(new ValueEventListener() {
            private static final String TAG = "OfflineActivity";

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                boolean connected = snapshot.getValue(Boolean.class);
                if (connected) {
                    Log.d(TAG, "connected");
                } else {
                    Log.d(TAG, "not connected");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.w(TAG, "Listener was cancelled");
            }
        });
    }

    public  Task<Void> add (Places plc){
        return databaseReference.push().setValue(plc);
    }

    public Query get(){
        return databaseReference.orderByKey();
    }
}
