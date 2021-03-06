package com.example.jeraldinguerrero.pahkthecah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/**
 * Created by melissagarcia on 12/7/15.
 */
public class AboutPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.content_aboutpage);
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

/*


public class MainActivity extends Activity implements OnClickListener {

    //private Button google;
    private Button startButton;
    private Button aboutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.content_homescreen);
        //I'm assuming this Google stuff is only ncessary  somewhere else
        // google = (Button) findViewById(R.id.googleButton);
        //google.setOnClickListener(this);

        startButton = (Button) findViewById(R.id.startbutton);
        startButton.setOnClickListener(this);

        aboutButton = (Button) findViewById(R.id.aboutbutton);
        aboutButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.startbutton: {
                Intent nextActivity = new Intent(MainActivity.this, CategoryPage.class);
                startActivity(nextActivity);
            }
            case R.id.aboutbutton: { //make about page????
                Intent nextActivity = new Intent(MainActivity.this, CategoryPage.class);
                startActivity(nextActivity);
            }
        }
    }
}
 */