package com.example.jeraldinguerrero.pahkthecah;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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

        Throwable throwable = new Throwable();
        StackTraceElement[] stackInfoList = throwable.getStackTrace();
        String className = stackInfoList[1].getClassName();


        if (className.equals("AboutAgganis")) {
            // Add a marker to Agganis Arena and move the camera
            LatLng agganis = new LatLng(42.3522, 71.1178); // HAVE SOMEONE ELSE CONFIRM THAT THESE ARE RIGHT
            googleMap.addMarker(new MarkerOptions().title("Agganis Arena").position(agganis));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(agganis));

            Uri intentUri = Uri.parse("google.navigation:q=42.3522,71.1178&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }


        else if (className.equals("AboutAquarium")) {
            // Add a marker to Aquarium and move the camera
            LatLng aquarium = new LatLng(42.3590, 71.0507);
            googleMap.addMarker(new MarkerOptions().title("New England Aquarium").position(aquarium));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(aquarium));

            Uri intentUri = Uri.parse("google.navigation:q=42.3590,71.0507&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutBeerworks")) {
            // Add a marker to Beerworks and move the camera
            LatLng beerworks = new LatLng(42.3464, 71.0975);
            googleMap.addMarker(new MarkerOptions().title("Boston Beer Works").position(beerworks));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(beerworks));

            Uri intentUri = Uri.parse("google.navigation:q=42.3464,71.0975&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }


        else if (className.equals("AboutBostonCommons")) {
            // Add a marker to Boston Commons and move the camera
            LatLng bostonCommons = new LatLng(42.3550, 71.0656);
            googleMap.addMarker(new MarkerOptions().title("Boston Commons").position(bostonCommons));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(bostonCommons));

            Uri intentUri = Uri.parse("google.navigation:q=42.3550,71.0656&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutBPL")) {
            // Add a marker to Boston Public Library and move the camera
            LatLng bpl = new LatLng(42.3492, 71.0787);
            googleMap.addMarker(new MarkerOptions().title("Boston Public Library").position(bpl));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(bpl));

            Uri intentUri = Uri.parse("google.navigation:q=42.3492,71.0787&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutCask")) {
            // Add a marker to Cask'n Flagon  and move the camera
            LatLng cask = new LatLng(42.3473,71.0983);
            googleMap.addMarker(new MarkerOptions().title("Cask'n Flagon").position(cask));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(cask));

            Uri intentUri = Uri.parse("google.navigation:q=42.3473,71.0983&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutCemetary")) {
            // Add a marker to Boston Commons and move the camera
            LatLng cemetary = new LatLng(42.3574,71.0616);
            googleMap.addMarker(new MarkerOptions().title("Granary Burying Ground").position(cemetary));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(cemetary));

            Uri intentUri = Uri.parse("google.navigation:q=42.3574,71.0616&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutChildrens")) {
            // Add a marker to Boston Children's Museum and move the camera
            LatLng child = new LatLng(42.3516,71.0498);
            googleMap.addMarker(new MarkerOptions().title("Boston Children's Museum").position(child));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(child));

            Uri intentUri = Uri.parse("google.navigation:q=42.3516,71.0498&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutConstitution")) {
            // Add a marker to Constitution and move the camera
            LatLng constitution = new LatLng(42.3767,71.0515);
            googleMap.addMarker(new MarkerOptions().title("USS Constitution").position(constitution));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(constitution));

            Uri intentUri = Uri.parse("google.navigation:q=42.3767,71.0515&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutContemporary")) {
            // Add a marker to Contemporary and move the camera
            LatLng cont = new LatLng(42.3528,71.0429);
            googleMap.addMarker(new MarkerOptions().title("Institute of Contemporary Art").position(cont));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(cont));

            Uri intentUri = Uri.parse("google.navigation:q=42.3528,71.0429&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutFaneuilHall")) {
            // Add a marker to Faneuil Hall and move the camera
            LatLng hall = new LatLng(42.3600,71.0568);
            googleMap.addMarker(new MarkerOptions().title("Faneuil Hall").position(hall));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(hall));

            Uri intentUri = Uri.parse("google.navigation:q=42.3600,71.0568&mode='w'");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutFenway")) {
            // Add a marker to Fenway and move the camera
            LatLng fenway = new LatLng(42.3464,71.0975);
            googleMap.addMarker(new MarkerOptions().title("Fenway").position(fenway));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(fenway));

            Uri intentUri = Uri.parse("google.navigation:q=42.3464,71.0975&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutFours")) {
            // Add a marker to Fours and move the camera
            LatLng fours = new LatLng(42.3649,71.0609);
            googleMap.addMarker(new MarkerOptions().title("Four's Restaurant").position(fours));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(fours));

            Uri intentUri = Uri.parse("google.navigation:q=42.3649,71.0609&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutFreedomTrail")) {
            // Add a marker to Freedom Trail and move the camera
            LatLng freedom = new LatLng(42.3550, 71.0656);
            googleMap.addMarker(new MarkerOptions().title("Freedom Trail").position(freedom));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(freedom));

            Uri intentUri = Uri.parse("google.navigation:q=42.3550,71.0656&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutGardnerMuseum")) {
            // Add a marker to Isabella Stewart Gardner Museum and move the camera
            LatLng isabella = new LatLng(42.3386,71.0989);
            googleMap.addMarker(new MarkerOptions().title("Isabella Stewart Gardner Museum").position(isabella));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(isabella));

            Uri intentUri = Uri.parse("google.navigation:q=42.3386,71.0989&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutHurricane")) {
            // Add a marker to Hurricane O'Reilly's and move the camera
            LatLng hurricane = new LatLng(42.3649,71.0609);
            googleMap.addMarker(new MarkerOptions().title("Hurricane O'Reilly's").position(hurricane));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(hurricane));

            Uri intentUri = Uri.parse("google.navigation:q=42.3649,71.0609&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutMarathon")) {
            // Add a marker to Boston Marathon Finish Line and move the camera
            LatLng marathon = new LatLng(42.3497,71.0786);
            googleMap.addMarker(new MarkerOptions().title("Boston Marathon Finish Line").position(marathon));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(marathon));

            Uri intentUri = Uri.parse("google.navigation:q=42.3497,71.0786&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutMassacre")) {
            // Add a marker to The Boston Massacre Site and move the camera
            LatLng massacre = new LatLng(42.3588, 71.0578);
            googleMap.addMarker(new MarkerOptions().title("Boston Massacre Site").position(massacre));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(massacre));

            Uri intentUri = Uri.parse("google.navigation:q=42.3588,71.0578&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutMcganns")) {
            // Add a marker to McGanns and move the camera
            LatLng mc = new LatLng(42.3644,71.0616);
            googleMap.addMarker(new MarkerOptions().title("McGann's Irish Pub").position(mc));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(mc));

            Uri intentUri = Uri.parse("google.navigation:q=42.3644,71.0616&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutMFA")) {
            // Add a marker to the MFA and move the camera
            LatLng mfa = new LatLng(42.3392,71.0942);
            googleMap.addMarker(new MarkerOptions().title("Museum of Fine Arts").position(mfa));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(mfa));

            Uri intentUri = Uri.parse("google.navigation:q=42.3392,71.0942&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutOldNorthChurch")) {
            // Add a marker to the Old North Church and move the camera
            LatLng onc = new LatLng(42.3663,71.0545);
            googleMap.addMarker(new MarkerOptions().title("Old North Church").position(onc));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(onc));

            Uri intentUri = Uri.parse("google.navigation:q=42.3663,71.0545&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutOpera")) {
            // Add a marker to the Opera House and move the camera
            LatLng opera = new LatLng(42.3542,71.0627);
            googleMap.addMarker(new MarkerOptions().title("Boston Opera House").position(opera));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(opera));

            Uri intentUri = Uri.parse("google.navigation:q=42.3542,71.0627&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutRevereHouse")) {
            // Add a marker to the Revere House and move the camera
            LatLng revere = new LatLng(42.3637,71.0537);
            googleMap.addMarker(new MarkerOptions().title("Paul Revere House").position(revere));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(revere));

            Uri intentUri = Uri.parse("google.navigation:q=42.3637,71.0537&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }


        else if (className.equals("AboutScience")) {
            // Add a marker to the Boston Museum of Science and move the camera
            LatLng science = new LatLng(42.3687,71.0699);
            googleMap.addMarker(new MarkerOptions().title("Boston Museum of Science").position(science));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(science));

            Uri intentUri = Uri.parse("google.navigation:q=42.3687,71.0699&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutSymphony")) {
            // Add a marker to Boston Symphony Hall and move the camera
            LatLng symphony = new LatLng(42.3426,71.0858);
            googleMap.addMarker(new MarkerOptions().title("Boston Symphony Orchestra").position(symphony));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(symphony));

            Uri intentUri = Uri.parse("google.navigation:q=42.3426,71.0858&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutTDGarden")) {
            // Add a marker to TD Garden and move the camera
            LatLng garden = new LatLng(42.3663,71.0622);
            googleMap.addMarker(new MarkerOptions().title("TD Garden").position(garden));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(garden));

            Uri intentUri = Uri.parse("google.navigation:q=42.3663,71.0622&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }

        else if (className.equals("AboutTrinity")) {
            // Add a marker to Boston Commons and move the camera
            LatLng freedom = new LatLng(42.3550, 71.0656);
            googleMap.addMarker(new MarkerOptions().title("Boston Massacre Site").position(freedom));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(freedom));

            Uri intentUri = Uri.parse("google.navigation:q=42.3550,71.0656&mode='w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }
}
