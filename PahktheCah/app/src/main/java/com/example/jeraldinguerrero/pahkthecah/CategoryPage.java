package com.example.jeraldinguerrero.pahkthecah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by jeraldinguerrero on 12/3/15.
 */
public class CategoryPage extends Activity implements View.OnClickListener {

    //Initializes buttons on category page
    private Button historical;
    private Button sports;
    private Button arts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //calls corresponding xml file
        setContentView(R.layout.content_categorypage);

        historical = (Button) findViewById(R.id.historicalbutton);
        sports = (Button) findViewById(R.id.sportsbutton);
        arts = (Button) findViewById(R.id.artsbutton);

        historical.setOnClickListener(this);
        sports.setOnClickListener(this);
        arts.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.historicalbutton: {
                Intent nextActivity = new Intent(CategoryPage.this, OptionsPage.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.sportsbutton: {
                Intent nextActivity = new Intent(CategoryPage.this, OptionsPage2.class);
                startActivity(nextActivity);
                break;
            }

            case R.id.artsbutton: {
                Intent nextActivity = new Intent(CategoryPage.this, OptionsPage3.class);
                startActivity(nextActivity);
                break;
            }

            default : {
                break;
            }
        }
    }

}
