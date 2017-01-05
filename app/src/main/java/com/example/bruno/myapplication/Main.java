package com.example.bruno.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by bruno on 1/5/17.
 */

public class Main extends FragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.myapp_main_activity);

        TextView textView = (TextView) findViewById(R.id.myApp_mainActivity_helloText);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), About.class));
            }
        });
    }
}
