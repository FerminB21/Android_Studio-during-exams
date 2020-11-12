package com.example.myfitapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class weightloss_exercises_hard extends AppCompatActivity implements View.OnClickListener {
   Button map;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_weightloss_exercises_hard);
        map=findViewById(R.id.LaunchMap);
        map.setOnClickListener(weightloss_exercises_hard.this);
        TextView back=findViewById(R.id.end);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void onClick(View v) {
        Context context = getApplicationContext();
        if (v.getId() == R.id.LaunchMap) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:37.788069,26.7053326"));
            startActivity(intent);
        }
    }
}
