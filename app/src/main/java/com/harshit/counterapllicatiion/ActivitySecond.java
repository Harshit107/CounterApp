package com.harshit.counterapllicatiion;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitySecond extends AppCompatActivity {

    public static final String TAG = "ActivitySecond";

    TextView tv ;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent get = getIntent();
        String message = get.getStringExtra("message");

        tv = findViewById(R.id.input);
        tv.setText(message);
        send = findViewById(R.id.send);

//
//        class One;
//        somemethod();
//
//        new One()
//                .somemethod();



        //with object
//
//        AlertDialog.Builder alert = new AlertDialog.Builder(ActivitySecond.this);
//        alert.setMessage(message);
//        alert.setNegativeButton("Delete for Everyone", new DialogInterface.OnClickListener() {
//            //method
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                //work
//            }
//        });
//        alert.setNeutralButton("Delete for me", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//
//            }
//        });
//        alert.setPositiveButton("cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                //function
//            }
//        });
//        alert.setIcon(R.drawable.email_24);
//        alert.setTitle(message);
//
//        send.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                alert.create().show();
//            }
//        });


//        without object

       new AlertDialog.Builder(ActivitySecond.this)
                .setTitle(message)
                .setMessage(message)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .create().show();



    }
}