package com.harshit.counterapllicatiion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    Button login;
    EditText email;
    EditText pass;
    public static final String TAG = "Login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        login = findViewById(R.id.login);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //we write our code here
                checkInput();

            }
        });

    }

    private void checkInput() {

        String userEmail = email.getText().toString();
        String userPass = pass.getText().toString();

        if(userEmail.isEmpty() || userPass.isEmpty()) {
            Toast.makeText(getApplicationContext(),"All Field is Required",Toast.LENGTH_LONG).show();
            return;
        }

        Log.d(TAG, "Email" +userEmail+" pass : "+userPass);


    }
}