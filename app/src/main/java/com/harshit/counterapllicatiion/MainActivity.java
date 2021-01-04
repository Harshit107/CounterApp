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
    public static final String TAG ="MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"At create State");


        text = findViewById(R.id.text);
        Button inc = findViewById(R.id.inc);
        Button dec = findViewById(R.id.dec);
        Button reset = findViewById(R.id.reset);



        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count = count+1;    //1 = 2   1 -> 2
                changeText();

            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count -= 1;
                changeText();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                changeText();
            }
        });
    }

    void changeText() {
        text.setText( String.valueOf(count) ); //2 -> String  ->  set Text
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"At Resume State");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"At pause State");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"At stop State "+count);
        //new layout with dark gray color

    }

    @Override
    protected void onStart() {
        super.onStart();
        count = 0;
        changeText();
        Log.d(TAG,"At stop State"+count);
        //remove that lay

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"At restart State");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"At OnDes. State");

    }
}





















// s1.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        //method
////                Snackbar.make(v,"This is snakebar",10000).show();
//
//        //Toast
//        Toast.makeText(getApplicationContext(),"This is a Toast message!",Toast.LENGTH_LONG).show();
//        }
//        });


