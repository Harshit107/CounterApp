package com.harshit.counterapllicatiion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class Profile extends AppCompatActivity {

    ImageView profileImgBtn;
    CircleImageView profile_img;
    boolean checker = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profileImgBtn = findViewById(R.id.profile_img_btn);
        profile_img = findViewById(R.id.profile_img);

        profileImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You just clicked", Toast.LENGTH_SHORT).show();
                if(checker) {
                    profile_img.setImageResource(R.drawable.logob);
                    checker = false;
                }
                else {
                    profile_img.setImageResource(R.drawable.logo);
                    checker = true;
                }
            }
        });


    }
}