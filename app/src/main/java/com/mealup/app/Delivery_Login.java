package com.mealup.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Delivery_Login extends AppCompatActivity {
 Button phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_login);

        phone = (Button) findViewById(R.id.Dbtnphone);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phone=  new Intent(Delivery_Login.this,Delivery_Loginphone.class);
                phone.putExtra("Home","Phone");
                startActivity(phone);
            }
        });

    }
}