package com.mealup.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Delivery_Registration extends AppCompatActivity {
Button Email,Phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_registration);
        Email = (Button)findViewById(R.id.emaillid);
        Phone = (Button)findViewById(R.id.Phonenumber);

        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Email=  new Intent(Delivery_Registration.this,Delivery_Login.class);
                Email.putExtra("Home","Email");
                startActivity(Email);
            }
        });
        Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Email=  new Intent(Delivery_Registration.this,Delivery_Loginphone.class);
                Email.putExtra("Home","Email");
                startActivity(Email);
            }
        });
    }
}