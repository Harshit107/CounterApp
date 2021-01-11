package com.harshit.counterapllicatiion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    Button add;
    Button sub;
    Button mult;
    Button div;
    Button calculate;

    EditText first;
    EditText second;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        init();

        ///

//        add.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//
//                Toast.makeText(getApplicationContext(),"You just pressed me long",Toast.LENGTH_LONG).show();
//                return false;
//            }
//        });







        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkUserInput()) {
                    int f = Integer.parseInt(first.getText().toString());
                    int s = Integer.parseInt(second.getText().toString());
                    int sum = f +s;
                    changeText(sum);
                }

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkUserInput()) {
                    int f = Integer.parseInt(first.getText().toString());
                    int s = Integer.parseInt(second.getText().toString());
                    int sum = f - s;
                    changeText(sum);
                }
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkUserInput()) {
                    int f = Integer.parseInt(first.getText().toString());
                    int s = Integer.parseInt(second.getText().toString());
                    int sum = f * s;
                    changeText(sum);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkUserInput()) {
                    int f = Integer.parseInt(first.getText().toString());
                    int s = Integer.parseInt(second.getText().toString());      //5/2 = 2
                    double sum = (double) f / s;
                    changeText(sum);
                }
            }
        });




    }
    boolean checkUserInput() {
        if(first.getText().toString().isEmpty()){
            first.setError("Field Required");
            return false;
        }
        if(second.getText().toString().isEmpty()){
            second.setError("Field Required");
            return false;
        }

        return true;
    }



    void changeText(int sum) {
        result.setText(sum+"");
    }
    void changeText(double sum) {
        result.setText(sum+"");
    }

    private void init() {
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mult = findViewById(R.id.multiply);
        div = findViewById(R.id.div);
        calculate = findViewById(R.id.calculate);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        result = findViewById(R.id.result);

    }


}