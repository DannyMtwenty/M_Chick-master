package com.dan.M_chick;

import androidx.fragment.app.FragmentActivity;
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
        map.put("LocationName", "NeonChicks Poultry ltd,Nairobi");
        location.add(map);
        // Location 4
        map = new HashMap<String, String>();
        map.put("LocationID", "4");
        map.put("Latitude", "-1.173907");
        map.put("Longitude", "36.759242");
        map.put("LocationName", "Bradegate poultry industries,Banana hill");
        location.add(map);
        // Location 5
        map = new HashMap<String, String>();
        map.put("LocationID", "5");
        map.put("Latitude", "-1.282376");
        map.put("Longitude", "36.755466");
        map.put("LocationName", "Kuku Mfalme,Nairobi");
        location.add(map);
        // Location 6
        map = new HashMap<String, String>();
        map.put("LocationID", "6");
        map.put("Latitude", " -1.252169");
        map.put("Longitude", "36.693322");
        map.put("LocationName", "Tai's Chciken,Kikuyu");
        location.add(map);
        //location 7
        map = new HashMap<String, String>();
        map.put("LocationID", "7");
        map.put("Latitude", "-1.229164");
        map.put("Longitude", "36.919292");
        map.put("LocationName", "Chicken Arcade,Nairobi");
        location.add(map);
        //location 8
        map = new HashMap<String, String>();
        map.put("LocationID", "8");
        map.put("Latitude", "-1.287161");
        map.put("Longitude", "36.830733");
        map.put("LocationName", "Poultry Farming,Nairobi");
        location.add(map);
        //location 9
        map = new HashMap<String, String>();
        map.put("LocationID", "9");
        map.put("Latitude", "-1.278001");
        map.put("Longitude", " 36.828861");
        map.put("LocationName", "Pagak Farm Solutions Ltd,Nairobi");
        location.add(map);
        //location 10
        map = new HashMap<String, String>();
        map.put("LocationID", "10");
        map.put("Latitude", "-1.287804");
        map.put("Longitude", " 36.830754");
        map.put("LocationName", "Wakulima House, Nairobi City");
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
