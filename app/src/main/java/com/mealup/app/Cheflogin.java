package com.mealup.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cheflogin extends AppCompatActivity {
Button phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheflogin);

        phone = (Button) findViewById(R.id.btnphone);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phone=  new Intent(Cheflogin.this, Chefloginphone.class);
                phone.putExtra("Home","Phone");
                startActivity(phone);
            }
        });
    }
}