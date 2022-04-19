package com.mealup.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Mainmenu extends AppCompatActivity {

    Button signinemail, signinphone, login;
    ImageView img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        final Animation zoomin = AnimationUtils.loadAnimation(this,R.anim.zoomin);
        final Animation zoomout = AnimationUtils.loadAnimation(this,R.anim.zoomout);

        img2= findViewById(R.id.back2);
        img2.setAnimation(zoomin);
        img2.setAnimation(zoomout);

        zoomout.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
        img2.startAnimation(zoomin);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        zoomin.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
            img2.startAnimation(zoomout);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        signinemail=(Button)findViewById(R.id.SignwithEmail);
        login=(Button)findViewById(R.id.Loginbutton);
        signinphone=(Button)findViewById(R.id.SignwithPhone);

        signinemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signemail = new Intent(Mainmenu.this, Chooseone.class);
            }
        });

    }
}