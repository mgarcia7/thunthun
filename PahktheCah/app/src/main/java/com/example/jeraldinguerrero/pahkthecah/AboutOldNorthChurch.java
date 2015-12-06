package com.example.jeraldinguerrero.pahkthecah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by jeraldinguerrero on 12/5/15.
 */
public class AboutOldNorthChurch extends Activity implements View.OnClickListener {

    private Button google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.aboutoldnorthchurch);
        google = (Button) findViewById(R.id.googleButton);

        google.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent nextActivity = new Intent(AboutOldNorthChurch.this, MapsActivity.class);
        startActivity(nextActivity);
    }
}
