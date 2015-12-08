package com.example.jeraldinguerrero.pahkthecah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by jeraldinguerrero on 12/4/15.
 */
public class OptionsPage2 extends Activity implements View.OnClickListener {

    private Button agganis;
    private Button fenway;
    private Button cask;
    private Button marathon;
    private Button TDGarden;
    private Button fours;
    private Button beerworks;
    private Button mcganns;
    private Button hurricane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_optionspage2);

        agganis = (Button) findViewById(R.id.agganisbutton);
        fenway = (Button) findViewById(R.id.fenwaybutton);
        cask = (Button) findViewById(R.id.caskbutton);
        marathon = (Button) findViewById(R.id.marathonbutton);
        TDGarden = (Button) findViewById(R.id.tdgardenbutton);
        fours = (Button) findViewById(R.id.foursbutton);
        beerworks = (Button) findViewById(R.id.beerworksbutton);
        mcganns = (Button) findViewById(R.id.mcgannsbutton);
        hurricane = (Button) findViewById(R.id.hurricanebutton);

        agganis.setOnClickListener(this);
        fenway.setOnClickListener(this);
        cask.setOnClickListener(this);
        marathon.setOnClickListener(this);
        TDGarden.setOnClickListener(this);
        fours.setOnClickListener(this);
        beerworks.setOnClickListener(this);
        mcganns.setOnClickListener(this);
        hurricane.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.agganisbutton: {
                Intent nextActivity = new Intent(OptionsPage2.this, AboutAgganis.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.fenwaybutton: {
                Intent nextActivity = new Intent(OptionsPage2.this, AboutFenway.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.caskbutton: {
                Intent nextActivity = new Intent(OptionsPage2.this, AboutCask.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.marathonbutton: {
                Intent nextActivity = new Intent(OptionsPage2.this, AboutMarathon.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.tdgardenbutton: {
                Intent nextActivity = new Intent(OptionsPage2.this, AboutTDGarden.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.foursbutton: {
                Intent nextActivity = new Intent(OptionsPage2.this, AboutFours.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.beerworksbutton: {
                Intent nextActivity = new Intent(OptionsPage2.this, AboutBeerworks.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.mcgannsbutton: {
                Intent nextActivity = new Intent(OptionsPage2.this, AboutMcganns.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.hurricanebutton: {
                Intent nextActivity = new Intent(OptionsPage2.this, AboutHurricane.class);
                startActivity(nextActivity);
                break;
            }

            default: {
                break;
            }
        }
    }

    @Override
    public boolean onKeyDown(int keycode, KeyEvent e) {

        switch(keycode) {
            case KeyEvent.KEYCODE_MENU: {
                Intent nextActivity = new Intent(this, RedirectFromGrid.class);
                startActivity(nextActivity);
                return true;
            }
            case KeyEvent.KEYCODE_BACK: {
                finish();
                return true;
            }
        }

        return false;
    }
}
