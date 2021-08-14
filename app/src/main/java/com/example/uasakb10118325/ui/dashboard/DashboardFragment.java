// Dibuat Tanggal 14 Agustus 2021
// Oleh Wisnu Murfadilah Rokhsan / 10118325 / IF8
package com.example.uasakb10118325.ui.dashboard;

import android.app.Activity;
import android.app.FragmentManager;
import android.graphics.Camera;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.uasakb10118325.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DashboardFragment extends Fragment implements OnMapReadyCallback{

    private DashboardViewModel dashboardViewModel;

    GoogleMap map;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        return root;
    }


    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map = googleMap;

        LatLng post = new LatLng(-6.861795, 107.591777);
        LatLng m1 = new LatLng(-6.840896954099256, 107.55127739678802); // alam wisata
        LatLng m2 = new LatLng(-6.795237087677568, 107.57848492543332); // curug cimahi
        LatLng m3 = new LatLng(-6.793183230572315, 107.57664274612362); // curug bugbrug
        LatLng m4 = new LatLng(-6.8384739924235785, 107.53880779678799); // pakuhaji
        LatLng m5 = new LatLng(-6.759211301261271, 107.60982356516985); // tangkuban perahu
        LatLng m6 = new LatLng(-6.829337226331154, 107.68748020627373); // The Lodge Maribaya
        LatLng m7 = new LatLng(-6.814926247141498, 107.62663011827317); // Wisata De’ranch
        LatLng m8 = new LatLng(-6.78933769830275, 107.57890359863639); // Dusun Bambu Family Leisure Park
        LatLng m9 = new LatLng(-6.784988769546466, 107.65153497035233); // Grafika Cikole
        LatLng m10 = new LatLng(-7.194939885157794, 107.43132401213391); // Bukit Jamur Ciwidey
        LatLng m11 = new LatLng(-6.841959603758682, 107.62289245261036); // Dago Bakery Punclut
        LatLng m12 = new LatLng(-6.78023730392357, 107.63750718329415); // Orchid Forest Cikole
        LatLng m13 = new LatLng(-6.790753587946777, 107.58205241212978); // Curug Tilu Leuwi Opat
        LatLng m14 = new LatLng(-6.776506879101242, 107.62422853911637); // Jungle Milk

        map.addMarker(new MarkerOptions().position(m1).title("Alam Wisata"));
        map.addMarker(new MarkerOptions().position(m2).title("Curug Cimahi"));
        map.addMarker(new MarkerOptions().position(m3).title("Curug Bugbrug"));
        map.addMarker(new MarkerOptions().position(m4).title("Pakuhaji"));
        map.addMarker(new MarkerOptions().position(m5).title("Tangkuban Perahu"));
        map.addMarker(new MarkerOptions().position(m6).title("The Lodge Maribaya"));
        map.addMarker(new MarkerOptions().position(m7).title("Wisata De’ranch"));
        map.addMarker(new MarkerOptions().position(m8).title("Dusun Bambu Family"));
        map.addMarker(new MarkerOptions().position(m9).title("Grafika Cikole"));
        map.addMarker(new MarkerOptions().position(m10).title("Bukit Jamur Ciwidey"));
        map.addMarker(new MarkerOptions().position(m11).title("Dago Bakery Punclut"));
        map.addMarker(new MarkerOptions().position(m12).title("Orchid Forest Cikole"));
        map.addMarker(new MarkerOptions().position(m13).title("Curug Tilu Leuwi Opat"));
        map.addMarker(new MarkerOptions().position(m14).title("Jungle Milk"));

        map.animateCamera(CameraUpdateFactory.newLatLngZoom(post, 10), 3000, null);
    }
}