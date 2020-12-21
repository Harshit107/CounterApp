package com.harshit.counterapllicatiion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        //
        Button inc = findViewById(R.id.inc);
        Button dec = findViewById(R.id.dec);
        Button reset = findViewById(R.id.reset);


        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //method
//                Snackbar.make(view, "Inc", 5000).show();
                count = count+1;
//                Log.d("MainActivity","Running");
                changeText();

            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //method
//                Snackbar.make(view, "DEC", 5000).show();
                count -= -1;

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //method
//                Snackbar.make(view, "RESET", 5000).show();
                count = 0;

            }
        });
    }

    void changeText() {
        text.setText(count+"");
    }



}

//activity
//context

//        s1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //method
////                Snackbar.make(v,"This is snakebar",10000).show();
//
//                //Toast
//                Toast.makeText(getApplicationContext(),"This is a Toast message!",Toast.LENGTH_LONG).show();
//            }
//        });

