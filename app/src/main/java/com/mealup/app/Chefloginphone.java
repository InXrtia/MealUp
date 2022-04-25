package com.mealup.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chefloginphone extends AppCompatActivity {
 Button Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chefloginphone);

        Email = (Button) findViewById(R.id.btnEmail);
        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phone=  new Intent(Chefloginphone.this,Cheflogin.class);
                phone.putExtra("Home","Phone");
                startActivity(phone);
            }
        });
    }
}