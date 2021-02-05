package com.harshit.counterapllicatiion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NoteApp extends AppCompatActivity {

    LinearLayout linearLayout;
    EditText editText;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.note_app);
        linearLayout = findViewById(R.id.linear);
        editText = findViewById(R.id.et);
        bt = findViewById(R.id.addBt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                LayoutInflater i = getLayoutInflater();
                i.inflate(R.layout.simple_tv,linearLayout,false);
            }
        });
//        View v = i.inflate(R.layout.simple_tv,null);
//        linearLayout.addView(v);
//        //v = TextView ->;
//        View v1 = i.inflate(R.layout.simple_tv, linearLayout);
//       // v1 -> linearLayout;
//        View v2 = i.inflate(R.layout.simple_tv,linearLayout, false);
//       // v2-> textView


    }
//
//    public void mySimpleTv(String text) {
//        LayoutInflater i = getLayoutInflater();
//        // relativelayout -> linearlayout -> child (tv) exclude
//        LinearLayout textView = (LinearLayout) i.inflate(R.layout.simple_tv,linearLayout);//add
//        // relativelayout -> linearlayout -> child (tv) include
//        TextView tv = textView.findViewById(R.id.simpletv);
//        tv.setText(text);
//    }

    public void mySimpleTv(String text) {

        Log.d("Home",text);
    }

}













/*

    adapter -> accept list -> convert view
    a set of data
    monday -> adapter -> convert -> tv
    tue
    wed
    thi




 */














