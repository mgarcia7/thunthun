package com.example.jeraldinguerrero.pahkthecah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


/**
 * Created by jeraldinguerrero on 12/5/15.
 */

//the aboutMarathon is the class
public class AboutMarathon extends Activity implements OnClickListener{

    //this is Button (which is a type) && google is the name of the button
    private Button google;

    //onCreate means what happens when this activity starts 
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //calls the appropriate xml file to mame it look like that 
        setContentView(R.layout.activity_about_marathon);

        //in that xml file is a button called googleButton 
        //we want to get the id of that button and set it equal to our google button 
        google = (Button) findViewById(R.id.googleButton);

        //sets onclicklistener
        google.setOnClickListener(this);
    }

    //this listens for any button pressed 
    //in our case there's just one on this page so no need for if or switch statements
    //takes in a View  (a button is a type of View, so we can pass that in (similar to either
    //polymorphism or inheritance idk the difference LOL)) - Jeraldin
    @Override
    public void onClick(View v) {
        //makes a new Intent so that you're able to set it up to go to the next place
        //intent( where you are, to where you want to go)
        Intent nextActivity = new Intent(AboutMarathon.this, MapsActivity.class);

        //puts in an extra string so in the
        nextActivity.putExtra("next", "AboutMarathon");

        //actually starts that intent 
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