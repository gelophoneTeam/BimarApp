package com.example.malizen.bimarapp;

import android.os.Bundle;
import android.support.annotation.NonNull;

import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.cedarstudios.cedarmapssdk.CedarMaps;
import com.cedarstudios.cedarmapssdk.listeners.OnTilesConfigured;

import java.util.Locale;

public class MainMap extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_map);

        CedarMaps.getInstance()
                .setClientID("gelophone-7625202776323663722")
                .setClientSecret("bvOGLWdlbG9waG9uZWim2I9C_gF_7A0IZgrFg-zG4DQjOcCTKc_QzRmE_Awk")
                .setContext(this);


        CedarMaps.getInstance().prepareTiles(new OnTilesConfigured() {
            @Override
            public void onSuccess() {
                BottomNavigationView navigation = findViewById(R.id.navigationView);
                navigation.setOnNavigationItemSelectedListener(MainMap.this);
                navigation.setSelectedItemId(R.id.navigation_map);
            }

            @Override
            public void onFailure(@NonNull String error) {
                Toast.makeText(MainMap.this, R.string.error_preparing_tiles, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.navigation_map:
                setTitle(R.string.title_map);
                fragment = new MapFragment();
                break;

            case R.id.navigation_forward:
                setTitle("");
                fragment = new ForwardGeocodeFragment();
                break;

        }

        if (fragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (getSupportFragmentManager().getFragments().isEmpty()) {
                transaction.add(R.id.content, fragment, String.format(Locale.US, "item: %d", item.getItemId())).commit();
            } else {
                transaction.replace(R.id.content, fragment, String.format(Locale.US, "item: %d", item.getItemId())).commit();
                invalidateOptionsMenu();
            }
            return true;
        }

        return false;
    }
}
