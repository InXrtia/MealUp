package com.mealup.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Delivery_Loginphone extends AppCompatActivity {
Button Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_loginphone);
        Email = (Button) findViewById(R.id.DbtnEmail);
        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phone=  new Intent(Delivery_Loginphone.this,Delivery_Login.class);
                phone.putExtra("Home","Phone");
                startActivity(phone);
            }
        });
    }
}