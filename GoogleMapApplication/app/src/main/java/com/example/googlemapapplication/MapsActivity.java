package com.example.googlemapapplication;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

        LatLng UCNHS = new LatLng(15.979523615079602, 120.56354102275198);
        mMap.addMarker(new MarkerOptions()
                .position(UCNHS)
                .title("URDANETA CITY NATIONAL HIGH SCHOOL")
                .snippet("Gonzales's secondary school "));
        mMap.moveCamera(CameraUpdateFactory
                .newLatLng(UCNHS));

        LatLng UCHS = new LatLng(15.929204893772374, 120.83956452275197);
        mMap.addMarker(new MarkerOptions()
                .position(UCHS)
                .title("UMINGAN CENTRAL NATIONAL HIGH SCHOOL")
                .snippet("Villar's secondary school "));
        mMap.moveCamera(CameraUpdateFactory
                .newLatLng(UCHS));

        LatLng LMNHS = new LatLng(16.005261625738864, 120.66617336787704);
        mMap.addMarker(new MarkerOptions()
                .position(LMNHS)
                .title("LUCIANO MILLAN NATIONAL HIGH SCHOOL")
                .snippet("Carpo's secondary school "));
        mMap.moveCamera(CameraUpdateFactory
                .newLatLng(LMNHS));




        }
    }
