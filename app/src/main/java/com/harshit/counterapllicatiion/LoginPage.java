package com.harshit.counterapllicatiion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    Button login;
    EditText email;
    EditText pass;
    TextView forget;
    TextView signup;
    public static final String TAG = "Login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        login = findViewById(R.id.login);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        forget = findViewById(R.id.forget);
        signup = findViewById(R.id.signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //we write our code here
                checkInput();
            }
        });
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You just clicked forget tv",Toast.LENGTH_LONG).show();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You just clicked signup tv",Toast.LENGTH_LONG).show();
            }
        });

    }

    private void checkInput() {

        String userEmail = email.getText().toString();
        String userPass = pass.getText().toString();

        if(userEmail.isEmpty()) {
            email.setError("Field is required");
            email.requestFocus();
//            Toast.makeText(getApplicationContext(),"All Field is Required",Toast.LENGTH_LONG).show();
//            return;
        }
        if( userPass.isEmpty()){
            pass.setError("Field is required");
        }
        Log.d(TAG, "Email" +userEmail+" pass : "+userPass);

    }
}