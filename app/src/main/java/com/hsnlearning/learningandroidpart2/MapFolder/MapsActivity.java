package com.hsnlearning.learningandroidpart2.MapFolder;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.hsnlearning.learningandroidpart2.R;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (GSA()) {
            Toast.makeText(this, "Google PlayService Working", Toast.LENGTH_SHORT).show();
            setContentView(R.layout.activity_maps);
            initiateMethod();
        } else {

        }
        //iniitalze spinner
        spinner = findViewById(R.id.spiinerInMap);
        //onItemSelectedListener lena h
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0://Hybrid k lye
                        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                        break;
                    case 1://None rhy ga
                        mMap.setMapType(GoogleMap.MAP_TYPE_NONE);
                        break;
                    case 2://normal map hoga
                        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        break;
                    case 3://satellite sy capture kryga
                        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                        break;
                    case 4://terrain hoga
                        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                        break;
                    /*default://agr kch b na hoto none wala rhy
                        mMap.setMapType(GoogleMap.MAP_TYPE_NONE);
                        break;*/
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //bad m likhoga agr likha tw
            }
        });

    }

    public boolean GSA() {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        int isAvailable = googleApiAvailability.isGooglePlayServicesAvailable(this);
        if (isAvailable == ConnectionResult.SUCCESS) {
            return true;
        } else if (googleApiAvailability.isUserResolvableError(isAvailable)) {
            Dialog dialog = googleApiAvailability.getErrorDialog(this, isAvailable, 0);
            dialog.show();
        } else {
            Toast.makeText(this, "Google PlayService isn't Working", Toast.LENGTH_SHORT).show();
        }
        return false;

    }

    private void initiateMethod() {
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
     /*   LatLng sydney = new LatLng(29.995371, 73.262712);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/
        gotoLocationMethod(30.002819, 73.250763, 10);
    }

    private void gotoLocationMethod(double lat, double lang) {
        LatLng latLng = new LatLng(lat, lang);
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLng(latLng);
        mMap.animateCamera(cameraUpdate);
    }

    private void gotoLocationMethod(double lat, double lang, float zoom) {
        LatLng latLng = new LatLng(lat, lang);
        mMap.addMarker(new MarkerOptions().position(latLng).title("Hassan Malik Home"));

        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, zoom);
        mMap.animateCamera(cameraUpdate);
        //  mMap.animateCamera(CameraUpdateFactory.zoomTo(10));

    }
}
