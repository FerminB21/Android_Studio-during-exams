package com.example.myfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class page2 extends AppCompatActivity implements View.OnClickListener {
    private Button weight_page, arms_page, chest_page, abs_page;
    private int age,weight,height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);



        weight_page = findViewById(R.id.weight_image);
        abs_page = findViewById(R.id.abs_image);
        chest_page = findViewById(R.id.chest_image);
        arms_page = findViewById(R.id.arm_image);

        weight_page.setOnClickListener(this);
        abs_page.setOnClickListener(this);
        chest_page.setOnClickListener(this);
        arms_page.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.abs_image) {
            Intent intent = new Intent(page2.this, abs.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.weight_image) {
            Intent intent = new Intent(page2.this, weightloss.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.chest_image) {
            Intent intent = new Intent(page2.this, chest.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.arm_image) {
            Intent intent = new Intent(page2.this, arm.class);
            startActivity(intent);
        }
    }
}
