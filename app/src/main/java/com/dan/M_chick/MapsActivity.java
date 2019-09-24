package com.dan.M_chick;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    private Double Latitude = 0.00;
    private Double Longitude = 0.00;
    ArrayList<HashMap<String, String>> location = new ArrayList<HashMap<String, String>>();
    HashMap<String, String> map;

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

        // Location 1
        map = new HashMap<String, String>();
        map.put("LocationID", "1");
        map.put("Latitude", "-1.288107");
        map.put("Longitude", "36.831115");
        map.put("LocationName", "Ecochicks Poultry ltd,Nairobi");
        location.add(map);

// Location 2
        map = new HashMap<String, String>();
        map.put("LocationID", "2");
        map.put("Latitude", " -1.190745");
        map.put("Longitude", "36.776932");
        map.put("LocationName", "Kari Improved Kienyeji,Nairobi");
        location.add(map);
// Location 3
        map = new HashMap<String, String>();
        map.put("LocationID", "3");
        map.put("Latitude", "-1.283793");
        map.put("Longitude", "36.823709");
        map.put("LocationName", "NeonChicks,Nairobi");
        location.add(map);
// *** Focus & Zoom
        Latitude = Double.parseDouble(location.get(0).get("Latitude").toString());
        Longitude = Double.parseDouble(location.get(0).get("Longitude").toString());
        LatLng coordinate = new LatLng(Latitude, Longitude);
        googleMap.setMapType(com.google.android.gms.maps.GoogleMap.MAP_TYPE_HYBRID);
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinate, 11));
// *** Marker (Loop)
        for (int i = 0; i < location.size(); i++) {
            Latitude = Double.parseDouble(location.get(i).get("Latitude").toString());
            Longitude = Double.parseDouble(location.get(i).get("Longitude").toString());
            String name = location.get(i).get("LocationName").toString();
            MarkerOptions marker = new MarkerOptions().position(new LatLng(Latitude,
                    Longitude)).title(name);
            ///  marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker));
            googleMap.addMarker(marker);
        }
    }
}
