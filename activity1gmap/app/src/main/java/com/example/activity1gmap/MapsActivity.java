package com.example.activity1gmap;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

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
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        LatLng UCU = new LatLng(15.980617, 120.56062);
        mMap.addMarker(new MarkerOptions().position(UCU).title("This is Urdaneta City University"));

        LatLng Umingan = new LatLng(15.923784, 120.86712);
        mMap.addMarker(new MarkerOptions().position(Umingan).title("Villar"));

        LatLng Poblacion = new LatLng(15.976306, 120.567427);
        mMap.addMarker(new MarkerOptions().position(Poblacion).title("Gonzales"));

        LatLng StaMaria = new LatLng(15.95794, 120.724936);
        mMap.addMarker(new MarkerOptions().position(StaMaria).title("Carpo"));


        mMap.addCircle(new CircleOptions()
            .center(new LatLng(15.980617, 120.56062))
            .radius(35000)
            .strokeWidth(5)
            .strokeColor(Color.GRAY)
            .fillColor(Color.argb(138, 0, 100 ,100)));

        mMap.addPolyline(new PolylineOptions()
            .add(new LatLng(15.923784, 120.86712),
                 new LatLng(15.883709, 120.689005),
                 new LatLng(15.892861, 120.634053),
                 new LatLng(15.906073, 120.585276),
                 new LatLng(15.980617, 120.56062))
                .width(5)
                .color(Color.BLACK));

        mMap.addPolyline(new PolylineOptions()
            .add(new LatLng(15.976306, 120.567427),
                 new LatLng(15.980617, 120.56062))
                .width(5)
                .color(Color.BLACK));

        mMap.addPolyline(new PolylineOptions()
            .add(new LatLng(15.95794, 120.724936),
                 new LatLng(16.004372, 120.654502),
                 new LatLng(15.980617, 120.56062))
                .width(5)
                .color(Color.BLACK));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(UCU));

    }
}