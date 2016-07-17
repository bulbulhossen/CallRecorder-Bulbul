package com.jlcsoftware.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.jlcsoftware.callrecorder.MainActivity;
import com.jlcsoftware.callrecorder.R;


/**
 * Created by bulbul-ulab on 6/6/16.
 */
public class Home extends Activity {

    TextView auto_Answer, auto_rec, about_app, userHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);

        auto_Answer = (TextView) findViewById(R.id.auto_answer);
        auto_Answer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent auto_Intent_Answer = new Intent(Home.this, MainActivity.class);
                startActivity(auto_Intent_Answer);
            }
        });

/*        auto_rec = (TextView) findViewById(R.id.auto_recoriding);
        auto_rec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent auto_Intent_Answer = new Intent(Home.this,SettingsActivity.class);
                startActivity(auto_Intent_Answer);
            }
        });*/

        about_app = (TextView) findViewById(R.id.about);
        about_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent auto_Intent_Answer = new Intent(Home.this, About.class);
                startActivity(auto_Intent_Answer);
            }
        });

        userHelp = (TextView) findViewById(R.id.userid);
        userHelp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent auto_Intent_Answer = new Intent(Home.this, User_Help.class);
                startActivity(auto_Intent_Answer);


            }
        });


    }


    private Boolean exit = false;
    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }
    }

}