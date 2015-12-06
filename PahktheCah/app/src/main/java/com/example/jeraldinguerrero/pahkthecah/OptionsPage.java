package com.example.jeraldinguerrero.pahkthecah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by jeraldinguerrero on 12/3/15.
 */
public class OptionsPage extends Activity {
    private Button trinity;
    private Button bostonCommons;
    private Button cemetary;
    private Button massacre;
    private Button freedomTrail;
    private Button faneuilHall;
    private Button revereHouse;
    private Button oldNorthChurch;
    private Button constitution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_optionspage);

        trinity = (Button) findViewById(R.id.trinitybutton);
        bostonCommons = (Button) findViewById(R.id.bostoncommonsbutton);
        cemetary = (Button) findViewById(R.id.cemetarybutton);
        massacre = (Button) findViewById(R.id.massacrebutton);
        freedomTrail = (Button) findViewById(R.id.freedomtrailbutton);
        faneuilHall = (Button) findViewById(R.id.faneuilhallbutton);
        revereHouse = (Button) findViewById(R.id.reversehousebutton);
        oldNorthChurch = (Button) findViewById(R.id.oldnorthchurchbutton);
        constitution = (Button) findViewById(R.id.constitutionButton);


        trinity.setOnClickListener(this);
        bostonCommons.setOnClickListener(this);
        cemetary.setOnClickListener(this);
        massacre.setOnClickListener(this);
        freedomTrail.setOnClickListener(this);
        faneuilHall.setOnClickListener(this);
        revereHouse.setOnClickListener(this);
        oldNorthChurch.setOnClickListener(this);
        constitution.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.trinitybutton: {
                Intent nextActivity = new Intent(OptionsPage.this, AboutTrinity.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.bostoncommonsbutton: {
                Intent nextActivity = new Intent(OptionsPage.this, AboutBostonCommons.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.cemetarybutton: {
                Intent nextActivity = new Intent(OptionsPage.this, AboutCemetary.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.massacrebutton: {
                Intent nextActivity = new Intent(OptionsPage.this, AboutMassacre.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.freedomtrailbutton: {
                Intent nextActivity = new Intent(OptionsPage.this, AboutFreedomTrail.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.faneuilhallbutton: {
                Intent nextActivity = new Intent(OptionsPage.this, AboutFaneuilHall.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.reverehousebutton: {
                Intent nextActivity = new Intent(OptionsPage.this, AboutRevereHouse.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.oldnorthchurchbutton: {
                Intent nextActivity = new Intent(OptionsPage.this, AboutOldNorthChurch.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.constitutionbutton: {
                Intent nextActivity = new Intent(OptionsPage.this, AboutConstitution.class);
                startActivity(nextActivity);
                break;
            }

            default: {
                break;
            }
        }
    }


}
