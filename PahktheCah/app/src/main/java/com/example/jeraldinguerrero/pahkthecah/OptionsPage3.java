package com.example.jeraldinguerrero.pahkthecah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by jeraldinguerrero on 12/4/15.
 */
public class OptionsPage3 extends Activity implements View.OnClickListener {

    private Button gardnerMuseum;
    private Button MFA;
    private Button symphony;
    private Button childrens;
    private Button contemporary;
    private Button aquarium;
    private Button BPL;
    private Button science;
    private Button opera;

    @Override
    //used to be private, changed this to protected because it fixed my error!! lmk if this is not a thing that can be done
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_optionspage3);

        gardnerMuseum = (Button) findViewById(R.id.gardnermuseumbutton);
        MFA = (Button) findViewById(R.id.mfabutton);
        symphony = (Button) findViewById(R.id.symphonybutton);
        childrens = (Button) findViewById(R.id.childrensbutton);
        contemporary = (Button) findViewById(R.id.contemporarybutton);
        aquarium = (Button) findViewById(R.id.aquariumbutton);
        BPL = (Button) findViewById(R.id.bplbutton);
        science = (Button) findViewById(R.id.sciencebutton);
        opera = (Button) findViewById(R.id.operabutton);

        gardnerMuseum.setOnClickListener(this);
        MFA.setOnClickListener(this);
        symphony.setOnClickListener(this);
        childrens.setOnClickListener(this);
        contemporary.setOnClickListener(this);
        aquarium.setOnClickListener(this);
        BPL.setOnClickListener(this);
        science.setOnClickListener(this);
        opera.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.gardnermuseumbutton: {
                Intent NextActivity = new Intent(OptionsPage3.this, AboutGardnerMuseum.class);
                startActivity(NextActivity);
                break;
            }

            case R.id.mfabutton: {
                Intent NextActivity = new Intent(OptionsPage3.this, AboutMFA.class);
                startActivity(NextActivity);
                break;
            }

            case R.id.symphonybutton: {
                Intent NextActivity = new Intent(OptionsPage3.this, AboutSymphony.class);
                startActivity(NextActivity);
                break;
            }

            case R.id.childrensbutton: {
                Intent NextActivity = new Intent(OptionsPage3.this, AboutChildrens.class);
                startActivity(NextActivity);
                break;
            }

            case R.id.contemporarybutton: {
                Intent NextActivity = new Intent(OptionsPage3.this, AboutContemporary.class);
                startActivity(NextActivity);
                break;
            }

            case R.id.aquariumbutton: {
                Intent NextActivity = new Intent(OptionsPage3.this, AboutAquarium.class);
                startActivity(NextActivity);
                break;
            }

            case R.id.bplbutton: {
                Intent NextActivity = new Intent(OptionsPage3.this, AboutBPL.class);
                startActivity(NextActivity);
                break;
            }

            case R.id.sciencebutton: {
                Intent NextActivity = new Intent(OptionsPage3.this, AboutScience.class);
                startActivity(NextActivity);
                break;
            }

            case R.id.operabutton: {
                Intent NextActivity = new Intent(OptionsPage3.this, AboutOpera.class);
                startActivity(NextActivity);
                break;
            }

            default : {
                break;
            }
        }
    }
}
