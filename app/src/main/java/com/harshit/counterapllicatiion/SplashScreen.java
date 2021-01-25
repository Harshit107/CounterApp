package com.harshit.counterapllicatiion;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent it = new Intent(SplashScreen.this, LoginPage.class);
                startActivity(it);
                finish();

            }
        }, 5000);


    }
    public void btnClicked(View view){
        Toast.makeText(getApplicationContext(),"You just clicked",Toast.LENGTH_LONG).show();
    }
}