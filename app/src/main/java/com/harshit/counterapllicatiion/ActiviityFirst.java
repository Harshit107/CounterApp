package com.harshit.counterapllicatiion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActiviityFirst extends AppCompatActivity {

    Button send;
    EditText et;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activiity_first);

        send = findViewById(R.id.send);
        et = findViewById(R.id.et);

//      message = et.getText().toString();

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message = et.getText().toString();
                Intent it = new Intent(getApplicationContext(), ActivitySecond.class);
                it.putExtra("message",message);
                startActivity(it);
            }
        });

//        Textview/EditText - >  set = setText();
//        TextView/EditText -> get = getText();

        




    }
}