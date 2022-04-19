package com.mealup.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Mainmenu extends AppCompatActivity {

    Button signinemail,signinphone,signup;
    ImageView img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        final Animation zoomin = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        final Animation zoomout = AnimationUtils.loadAnimation(this, R.anim.zoomout);
        img2 = findViewById(R.id.back2);
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


        signinemail = (Button) findViewById(R.id.SignwithEmail);
        signinphone = (Button) findViewById(R.id.SignwithPhone);
        signup = (Button) findViewById(R.id.Signup);

        signinemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signinemail = new Intent(Mainmenu.this, ChooseOne.class);
                signinemail.putExtra("Home", "Email");
                startActivity(signinemail);
                finish();
            }
        });

signinphone.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent signinphone = new Intent(Mainmenu.this,ChooseOne.class);
        signinphone.putExtra("Home" , "phone");
        startActivity(signinphone);
        finish();
    }
});

signup.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent signup = new Intent(Mainmenu.this,ChooseOne.class);
        signup.putExtra("Home" , "signup");
        startActivity(signup);
        finish();
    }
});

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.gc();
    }
}
