package com.example.jeraldinguerrero.pahkthecah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by melissagarcia on 12/7/15.
 */
public class RedirectFromGrid extends Activity implements View.OnClickListener{

    //intialize variables
    private Button category; //ToLocationType (categories type)
    private Button home; //ToHomeScreen (home screen)
    private Button cancel; //CancelButton (back to where you come from)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_redirect_from_grid);
        category = (Button) findViewById(R.id.ToLocationType);
        home = (Button) findViewById(R.id.ToHomeScreen);
        cancel = (Button) findViewById(R.id.CancelButton);

        category.setOnClickListener(this);
        home.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ToLocationType: {
                Intent nextActivity = new Intent(RedirectFromGrid.this, CategoryPage.class);
                startActivity(nextActivity);
                break;
            }
            case R.id.ToHomeScreen: {
                Intent nextActivity = new Intent(RedirectFromGrid.this, MainActivity.class);
                startActivity(nextActivity);
                break;
            }
            case R.id.CancelButton: {//not sure if this is going to work how we want it to
                finish();
            }
                break;

        }
    }
}


