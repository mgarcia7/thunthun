package com.example.jeraldinguerrero.pahkthecah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


/*
NOTES:
-figure out how to come back from google and where it comes back to
	-does it go to on pause in main or if we have to make onpause in maps activity . java
	-make a new intent and go to page "did you get there" and create that page
	-once you're there, yes and no should send them to options
		-if they press yes, press image to black and white (figure out how to do black and white)
	-yes take a pic, do camera stuff, what happens when camera comes back
		-back to options page
-load xml files in the project
-1 classes: did you get there?
*/

/**
 * Created by jeraldinguerrero on 12/5/15.
 */

//the aboutMarathon is the class 
//extends Activity is similar to namespace from my understanding?
public class AboutMarathon extends Activity implements OnClickListener{

    //this is Button (which is a type) && google is the name of the button
    private Button google;

    //override is similar to overload in c++ because we have a onCreate function in the main activity
    //onCreate means what happens when this activity starts 
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //i dont really get this but it's some reserved word called super that does something
        //julian said it was important 
        super.onCreate(savedInstanceState);

        //calls the appropriate xml file to mame it look like that 
        setContentView(R.layout.activity_about_marathon);
        //in that xml file is a button called googleButton 
        //we want to get the id of that button and set it equal to our google button 
        google = (Button) findViewById(R.id.googleButton);
        //sets onclicklistener
        google.setOnClickListener(this);
    }

    //same deal with override
    //this listens for any button pressed 
    //in our case there's just one on this page so no need for if or switch statements
    //takes in a View  (a button is a type of View, so we can pass that in (similar to either
    //polymorphism or inheritance idk the difference LOL)) 
    @Override
    public void onClick(View v) {
        //makes a new Intent so that you're able to set it up to go to the next place
        //intent( where you are, to where you want to go)
        Intent nextActivity = new Intent(AboutMarathon.this, MapsActivity.class);

        //actually starts that intent 
        startActivity(nextActivity);
    }
}