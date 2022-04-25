package com.mealup.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registration extends AppCompatActivity {
Button Email,Phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Email = (Button)findViewById(R.id.email);
        Phone = (Button)findViewById(R.id.Phonenumber);

        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Email=  new Intent(Registration.this,Login.class);
                Email.putExtra("Home","Email");
                startActivity(Email);
            }
        });
        Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Email=  new Intent(Registration.this,Loginphone.class);
                Email.putExtra("Home","Email");
                startActivity(Email);
            }
        });
    }
}