package com.example.malizen.bimarapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.cedarstudios.cedarmapssdk.CedarMaps;
import com.cedarstudios.cedarmapssdk.MapView;
import com.cedarstudios.cedarmapssdk.listeners.OnTilesConfigured;

import com.mapbox.mapboxsdk.maps.MapboxMap;
public class CedarMap extends AppCompatActivity {

    private MapView mMapView;
    private MapboxMap mMapboxMap;
    private MapboxMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cedar_map);

        CedarMaps.getInstance()
                .setClientID("gelophone-7625202776323663722")
                .setClientSecret("bvOGLWdlbG9waG9uZWim2I9C_gF_7A0IZgrFg-zG4DQjOcCTKc_QzRmE_Awk")
                .setContext(this);


        CedarMaps.getInstance().prepareTiles(new OnTilesConfigured() {
            @Override
            public void onSuccess() {

                setContentView(R.layout.activity_cedar_map);
            }


            @Override
            public void onFailure(@NonNull String errorMessage) {

            }
        });

    }
}
