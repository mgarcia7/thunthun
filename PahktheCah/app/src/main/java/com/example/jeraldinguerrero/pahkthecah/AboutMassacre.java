package com.example.jeraldinguerrero.pahkthecah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by jeraldinguerrero on 12/5/15.
 */
public class AboutMassacre extends Activity implements View.OnClickListener {

    private Button google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about_massacre);
        google = (Button) findViewById(R.id.googleButton);

        google.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent nextActivity = new Intent(AboutMassacre.this, MapsActivity.class);
        nextActivity.putExtra("next", "AboutMassacre");
        startActivity(nextActivity);
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
