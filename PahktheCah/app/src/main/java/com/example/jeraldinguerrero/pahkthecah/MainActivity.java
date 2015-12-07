package com.example.jeraldinguerrero.pahkthecah;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
import android.view.View;
import android.widget.Button;
        import android.content.Intent;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    //private Button google;
    private Button startButton;
    private Button aboutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.content_homescreen);
        
        startButton = (Button) findViewById(R.id.startbutton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(MainActivity.this, CategoryPage.class);
                startActivity(nextActivity);
            }
        });


        aboutButton = (Button) findViewById(R.id.aboutbutton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(MainActivity.this, AboutPage.class);
                startActivity(nextActivity);
            }
        });
    }
}
    /*

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.startbutton: {
                Intent nextActivity = new Intent(MainActivity.this, CategoryPage.class);
                startActivity(nextActivity);
                break;
            }
            case R.id.aboutbutton: { //make about page????
                Intent nextActivity = new Intent(MainActivity.this, AboutPage.class);
                startActivity(nextActivity);
                break;
            }
        }
    }
}
*/
/*

@Override
public void onResume() {
super.onResume();
Profile profile = Profile.getCurrentProfile();

// logs install and app activate App Events
AppEventsLogger.activateApp(this);
}

@Override
public void onPause() {
super.onPause();

//logs appDeactivate event
AppEventsLogger.deactivateApp(this);
}

@Override
public void onStop() {
super.onStop();
}
*/
