package com.example.gslc2_travelinus;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.gslc2_travelinus.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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

        // Add a marker in Alsut and move the camera
        LatLng binals = new LatLng(-6.223744666990042, 106.6492927896018);
        mMap.addMarker(new MarkerOptions().position(binals).title("BINUS @Alam Sutera"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(binals));

        // Add a marker in Kmg and move the camera
        LatLng binkmg = new LatLng(-6.201659839056613, 106.78208840296521);
        mMap.addMarker(new MarkerOptions().position(binkmg).title("BINUS @Kemanggisan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(binkmg));

        // Add a marker in Senayan and move the camera
        LatLng binay = new LatLng(-6.2287820655493995, 106.79682591912717);
        mMap.addMarker(new MarkerOptions().position(binay).title("BINUS @Senayan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(binay));

        // Add a marker in Bekasi and move the camera
        LatLng bikasi = new LatLng(-6.219405517276351, 106.99937851408356);
        mMap.addMarker(new MarkerOptions().position(bikasi).title("BINUS @Bekasi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bikasi));

        // Add a marker in Bandung and move the camera
        LatLng bindung = new LatLng(-6.914887402628683, 107.59594220008802);
        mMap.addMarker(new MarkerOptions().position(bindung).title("BINUS @Bandung"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bindung));

        // Add a marker in Malang and move the camera
        LatLng bimal = new LatLng(-7.939650632186557, 112.68173104000212);
        mMap.addMarker(new MarkerOptions().position(bimal).title("BINUS @Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bimal));

        // Add a marker in Semarang and move the camera
        LatLng birang = new LatLng(-6.948127724394864, 110.38049653459339);
        mMap.addMarker(new MarkerOptions().position(birang).title("BINUS @Semarang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(birang));
    }
}