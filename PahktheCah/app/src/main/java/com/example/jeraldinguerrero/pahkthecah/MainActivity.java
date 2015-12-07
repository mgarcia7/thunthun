package com.example.jeraldinguerrero.pahkthecah;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.view.View.OnClickListener;
        import android.widget.EditText;

        import com.facebook.AccessToken;
        import com.facebook.AccessTokenTracker;
        import com.facebook.CallbackManager;
        import com.facebook.FacebookCallback;
        import com.facebook.FacebookException;
        import com.facebook.FacebookSdk;
        import com.facebook.Profile;
        import com.facebook.ProfileTracker;
        import com.facebook.appevents.AppEventsLogger;
        import com.facebook.login.LoginManager;
        import com.facebook.login.LoginResult;
        import com.facebook.login.widget.LoginButton;

        import java.util.Arrays;

/*
public class MainActivity extends Activity implements OnClickListener {

    //Declaring login buttons
    private Button FBlogin;
    private CallbackManager callbackManager;
    private AccessTokenTracker accessTokenTracker;
    private ProfileTracker profileTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        //Initializes Sdk for FB
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.content_main);

        //Initializes FB login button
        FBlogin = (LoginButton) findViewById(R.id.FBlogin_button);
        FBlogin.setOnClickListener(this); //does it jump to onClick then continue doing the rest

        //This updates FB info we receive (if they changed profile picture or information)
        accessTokenTracker = new AccessTokenTracker() {
            @Override
            protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken) {

            }
        };

        profileTracker = new ProfileTracker() {
            @Override
            protected void onCurrentProfileChanged(Profile oldProfile, Profile currentProfile) {

            }
        };


    }

    @Override
    public void onClick(View v)
    {
        if (v == FBlogin) {
            callbackManager = CallbackManager.Factory.create();
            LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile"));
            LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
                @Override
                public void onSuccess(LoginResult loginResult) {
                    AccessToken accessToken = AccessToken.getCurrentAccessToken(); //might not need this
                    Profile profile = Profile.getCurrentProfile();
                    //EditText name = (EditText) findViewById(R.id.FB_name);
                    //name.setText(profile.getName());
                    //we need to create a user name here into the text file

                }

                @Override
                public void onCancel() {

                }

                @Override
                public void onError(FacebookException error) {

                }
            });
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

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
        accessTokenTracker.stopTracking();
        profileTracker.stopTracking();
    }

}
*/
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
}