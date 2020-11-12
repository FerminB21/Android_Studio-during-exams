package com.example.myfitapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class chest extends AppCompatActivity implements View.OnClickListener {


    private Button easy, hard,button;
    private String difficulty,typeofExercise;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_chest);

        easy = findViewById(R.id.easy);
        hard = findViewById(R.id.hard);

        easy.setOnClickListener(this);
        hard.setOnClickListener(this);
        button=findViewById(R.id.diet);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Context context = getApplicationContext();
        if (v.getId() == R.id.hard) {
            Intent intent = new Intent(chest.this, days.class);
            difficulty="hard";
            typeofExercise="chest";
            intent.putExtra("type_key",typeofExercise);
            intent.putExtra("diff_key",difficulty);
            startActivity(intent);
        }
        else if (v.getId() == R.id.easy) {
            Intent intent = new Intent(chest.this, days.class);
            difficulty="easy";
            typeofExercise="chest";
            intent.putExtra("type_key",typeofExercise);
            intent.putExtra("diff_key",difficulty);
            startActivity(intent);
        }
        else if(v.getId()==R.id.diet)
        {
            Intent intent = new Intent(chest.this, abs_diet.class);
            startActivity(intent);
        }
    }

}
