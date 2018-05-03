package com.bestnbest.satyajeetjena;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bestnbest.satyajeetjena.TabLayout.TabHome;
import com.bestnbest.satyajeetjena.utils.Tools;

public class MainActivity extends AppCompatActivity {
    Animation alp,rot,sca,set,trsn,trans;
    TextView textView,textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.tv_splash_satayajeet);
        textView2=(TextView) findViewById(R.id.tv_splash_playback);
        trsn= AnimationUtils.loadAnimation(this,R.anim.transla);
        textView.startAnimation(trsn);

        trsn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                textView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                textView.startAnimation(trsn);
            }
        });

        trans=AnimationUtils.loadAnimation(this,R.anim.translate);
        textView2.startAnimation(trans);
        trans.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                textView2.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                textView2.startAnimation(trans);
            }
        });
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (Tools.isNetworkAvailable(MainActivity.this)) {

                    Intent i = new Intent(MainActivity.this, TabHome.class);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "Ensure your internet connection is lost!",
                            Toast.LENGTH_LONG).show();
                }
            }
        }, 3000);



    }
}
