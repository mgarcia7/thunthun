package com.example.jeraldinguerrero.pahkthecah;


import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends FragmentActivity implements
        GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener
{
    private GoogleMap mMap; // Might be null if Google Play services APK is not available.
    //Google maps location (used for button)
    private Location mLastLocation;

    // Google client to interact with Google API
    private GoogleApiClient mGoogleApiClient;

    //When the app is open
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();

            // Building the GoogleApi client
            buildGoogleApiClient();
        //Declaring map dependencies
        displayLocation();
        onMapReady(mMap);
    }

    //Creates the map
    private void setUpMap()
    {
        //Live locations
        mMap.setMyLocationEnabled(true);
        //Remove buildings
        mMap.setBuildingsEnabled(false);
        //Turn off basic menu
        mMap.getUiSettings().setMapToolbarEnabled(false);
        //Set up map click listeners
        mMap.setOnMapClickListener(this);
        mMap.setOnMapLongClickListener(this);
    }
    //Set up the map the first time
    private void setUpMapIfNeeded()
    {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null)
            {
                setUpMap();
            }
        }
    }

    //Passes in Map
    public void onMapReady(GoogleMap googleMap)
    {
        Intent nextActivity = getIntent();
        String next = nextActivity.getStringExtra("next");

        googleMap.setMyLocationEnabled(true);

        //SWITCH STATEMENT INSTEAD
        if (next.equals("AboutFreedomTrail")) {

            // Add a marker to Freedom Trail and move the camera
            LatLng freedom = new LatLng(42.3550, 71.0656);
            googleMap.addMarker(new MarkerOptions().title("Freedom Trail").position(freedom));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(freedom));

            //double dlongtd = result.get(0).getLongitude() , dlattd=result.get(0).getLatitude();
            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Freedom+Trail");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutAgganis")) {
            // Add a marker to Agganis Arena and move the camera
            LatLng agganis = new LatLng(42.3522, 71.1178); // HAVE SOMEONE ELSE CONFIRM THAT THESE ARE RIGHT
            googleMap.addMarker(new MarkerOptions().title("Agganis Arena").position(agganis));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(agganis));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Agganis+Arena");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }


        else if (next.equals("AboutAquarium")) {
            // Add a marker to Aquarium and move the camera
            LatLng aquarium = new LatLng(42.3590, 71.0507);
            googleMap.addMarker(new MarkerOptions().title("New England Aquarium").position(aquarium));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(aquarium));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=New+England+Aquarium");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutBeerworks")) {
            // Add a marker to Beerworks and move the camera
            LatLng beerworks = new LatLng(42.3464, 71.0975);
            googleMap.addMarker(new MarkerOptions().title("Boston Beer Works").position(beerworks));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(beerworks));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Boston+Beer+Works");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }


        else if (next.equals("AboutBostonCommons")) {
            // Add a marker to Boston Commons and move the camera
            LatLng bostonCommons = new LatLng(42.3550, 71.0656);
            googleMap.addMarker(new MarkerOptions().title("Boston Commons").position(bostonCommons));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(bostonCommons));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Boston+Commons");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutBPL")) {
            // Add a marker to Boston Public Library and move the camera
            LatLng bpl = new LatLng(42.3492, 71.0787);
            googleMap.addMarker(new MarkerOptions().title("Boston Public Library").position(bpl));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(bpl));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Boston+Public+Library");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutCask")) {
            // Add a marker to Cask'n Flagon  and move the camera
            LatLng cask = new LatLng(42.3473,71.0983);
            googleMap.addMarker(new MarkerOptions().title("Cask'n Flagon").position(cask));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(cask));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Caskn+Flagon");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutCemetary")) {
            // Add a marker to Boston Commons and move the camera
            LatLng cemetary = new LatLng(42.3574,71.0616);
            googleMap.addMarker(new MarkerOptions().title("Granary Burying Ground").position(cemetary));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(cemetary));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Granary+Burying+Ground");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutChildrens")) {
            // Add a marker to Boston Children's Museum and move the camera
            LatLng child = new LatLng(42.3516,71.0498);
            googleMap.addMarker(new MarkerOptions().title("Boston Children's Museum").position(child));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(child));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Boston+Childrens+Museum");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutConstitution")) {
            // Add a marker to Constitution and move the camera
            LatLng constitution = new LatLng(42.3767,71.0515);
            googleMap.addMarker(new MarkerOptions().title("USS Constitution").position(constitution));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(constitution));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=USS+Constitution+Museum");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutContemporary")) {
            // Add a marker to Contemporary and move the camera
            LatLng cont = new LatLng(42.3528,71.0429);
            googleMap.addMarker(new MarkerOptions().title("Institute of Contemporary Art").position(cont));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(cont));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Institute+of+Contemporary+Art");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutFaneuilHall")) {
            // Add a marker to Faneuil Hall and move the camera
            LatLng hall = new LatLng(42.3600,71.0568);
            googleMap.addMarker(new MarkerOptions().title("Faneuil Hall").position(hall));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(hall));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Faneuil+Hall");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutFenway")) {
            // Add a marker to Fenway and move the camera
            LatLng fenway = new LatLng(42.3464,71.0975);
            googleMap.addMarker(new MarkerOptions().title("Fenway").position(fenway));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(fenway));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Fenway+Park");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutFours")) {
            // Add a marker to Fours and move the camera
            LatLng fours = new LatLng(42.3649,71.0609);
            googleMap.addMarker(new MarkerOptions().title("Four's Restaurant").position(fours));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(fours));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=The+Fours+Restaurant+&+Sports+Bar");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutFreedomTrail")) {
            // Add a marker to Freedom Trail and move the camera
            LatLng freedom = new LatLng(42.3550, 71.0656);
            googleMap.addMarker(new MarkerOptions().title("Freedom Trail").position(freedom));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(freedom));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Freedom+Trail");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutGardnerMuseum")) {
            // Add a marker to Isabella Stewart Gardner Museum and move the camera
            LatLng isabella = new LatLng(42.3386,71.0989);
            googleMap.addMarker(new MarkerOptions().title("Isabella Stewart Gardner Museum").position(isabella));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(isabella));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Isabella+Stewart+Gardner+Museum");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutHurricane")) {
            // Add a marker to Hurricane O'Reilly's and move the camera
            LatLng hurricane = new LatLng(42.3649,71.0609);
            googleMap.addMarker(new MarkerOptions().title("Hurricane O'Reilly's").position(hurricane));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(hurricane));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Hurricane+O'Reilly's");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutMarathon")) {
            // Add a marker to Boston Marathon Finish Line and move the camera
            LatLng marathon = new LatLng(42.3497,71.0786);
            googleMap.addMarker(new MarkerOptions().title("Boston Marathon Finish Line").position(marathon));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(marathon));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=665+Boylston+Street+Boston+MA");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutMassacre")) {
            // Add a marker to The Boston Massacre Site and move the camera
            LatLng massacre = new LatLng(42.3588, 71.0578);
            googleMap.addMarker(new MarkerOptions().title("Boston Massacre Site").position(massacre));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(massacre));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Boston+Massacre+Site");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutMcganns")) {
            // Add a marker to McGanns and move the camera
            LatLng mc = new LatLng(42.3644,71.0616);
            googleMap.addMarker(new MarkerOptions().title("McGann's Irish Pub").position(mc));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(mc));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=McGanns+Pub");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutMFA")) {
            // Add a marker to the MFA and move the camera
            LatLng mfa = new LatLng(42.3392,71.0942);
            googleMap.addMarker(new MarkerOptions().title("Museum of Fine Arts").position(mfa));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(mfa));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=MFA+Boston");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutOldNorthChurch")) {
            // Add a marker to the Old North Church and move the camera
            LatLng onc = new LatLng(42.3663,71.0545);
            googleMap.addMarker(new MarkerOptions().title("Old North Church").position(onc));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(onc));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Old+North+Church");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutOpera")) {
            // Add a marker to the Opera House and move the camera
            LatLng opera = new LatLng(42.3542,71.0627);
            googleMap.addMarker(new MarkerOptions().title("Boston Opera House").position(opera));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(opera));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Boston+Opera+House");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutRevereHouse")) {
            // Add a marker to the Revere House and move the camera
            LatLng revere = new LatLng(42.3637,71.0537);
            googleMap.addMarker(new MarkerOptions().title("Paul Revere House").position(revere));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(revere));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Paul+Revere+House");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }


        else if (next.equals("AboutScience")) {
            // Add a marker to the Boston Museum of Science and move the camera
            LatLng science = new LatLng(42.3687,71.0699);
            googleMap.addMarker(new MarkerOptions().title("Boston Museum of Science").position(science));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(science));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Museum+Of+Science");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutSymphony")) {
            // Add a marker to Boston Symphony Hall and move the camera
            LatLng symphony = new LatLng(42.3426,71.0858);
            googleMap.addMarker(new MarkerOptions().title("Boston Symphony Hall").position(symphony));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(symphony));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Boston+Symphony+Orchestra");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutTDGarden")) {
            // Add a marker to TD Garden and move the camera
            LatLng garden = new LatLng(42.3663,71.0622);
            googleMap.addMarker(new MarkerOptions().title("TD Garden").position(garden));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(garden));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=TD+Garden");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

        else if (next.equals("AboutTrinity")) {
            // Add a marker to Boston Commons and move the camera
            LatLng freedom = new LatLng(42.3550, 71.0656);
            googleMap.addMarker(new MarkerOptions().title("Trinity Church").position(freedom));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(freedom));

            Uri intentUri = Uri.parse("https://maps.google.com/maps?f=d&daddr=Trinity+Church");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        }

}
    //Connects app to Google API
    @Override
    protected void onStart()
    {
        super.onStart();
        if (mGoogleApiClient != null)
        {
            mGoogleApiClient.connect();
        }
        displayLocation();
    }
    //Upon returning to app
    @Override
    protected void onResume()
    {
        super.onResume();
        setUpMapIfNeeded();
    }
    //Detecting a single map click
    public void onMapClick(LatLng point)
    {

    }
    //Detecting a long click (pressing a while on the map)
    public void onMapLongClick(LatLng point)
    {
        ;
    }
    //When connected to API
    @Override
    public void onConnected(Bundle bundle)
    {
        displayLocation();
    }
    //When disconnected, try to recon
    @Override
    public void onConnectionSuspended(int i)
    {
        mGoogleApiClient.connect();
    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult)
    {

    }


    //Connecting to actual client
    protected synchronized void buildGoogleApiClient()
    {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API).build();
    }

    //Update the live location dot
    private void displayLocation()
    {
        mLastLocation = LocationServices.FusedLocationApi
                .getLastLocation(mGoogleApiClient);

        if (mLastLocation != null)
        {
            double latitude = mLastLocation.getLatitude();
            double longitude = mLastLocation.getLongitude();
            //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude, longitude), 14.0f));
        }
        else
        {

        }
    }

}