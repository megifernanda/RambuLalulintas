package com.example.mendev.lintasdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import android.widget.Toast;


public class Activity_Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_home);


        TextView tv_larangan = (TextView) findViewById(R.id.tv_larangan);
        TextView tv_peringatan = (TextView) findViewById(R.id.tv_peringatan);
        TextView tv_perintah = (TextView) findViewById(R.id.tv_perintah);

        LinearLayout ly_larangan = (LinearLayout) findViewById(R.id.ly_larangan);
        LinearLayout ly_peringatan = (LinearLayout) findViewById(R.id.ly_peringatan);
        LinearLayout ly_perintah = (LinearLayout) findViewById(R.id.ly_perintah);
        LinearLayout ly_petunjuk = (LinearLayout) findViewById(R.id.ly_petunjuk);

        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        ly_larangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity_Home.this, "This is my Toast message!",
                        Toast.LENGTH_LONG).show();
                view.startAnimation(animAlpha);
            }
        });


        ly_peringatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity_Home.this, "This is my Toast message!",
                        Toast.LENGTH_LONG).show();
                view.startAnimation(animAlpha);
            }
        });

        ly_perintah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity_Home.this, "This is my Toast message!",
                        Toast.LENGTH_LONG).show();
                view.startAnimation(animAlpha);
            }
        });

        ly_petunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity_Home.this, "This is my Toast message!",
                        Toast.LENGTH_LONG).show();
                view.startAnimation(animAlpha);
            }
        });
    }
}
