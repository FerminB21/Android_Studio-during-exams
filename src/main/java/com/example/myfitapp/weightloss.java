package com.example.myfitapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class weightloss extends AppCompatActivity implements View.OnClickListener {

    private Button easyB, hardB,dietB;
    private String difficulty,typeofExercise,diet_type;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_weightloss);

        easyB = findViewById(R.id.easy);
        hardB = findViewById(R.id.hard);

        easyB.setOnClickListener(this);
        hardB.setOnClickListener(this);
        dietB=findViewById(R.id.diet);
        dietB.setOnClickListener(this);

        }




    @Override
    public void onClick(View v) {
        Context context = getApplicationContext();
        if (v.getId() == R.id.hard) {
           //setDifficulty("hard");
            difficulty="hard";
           typeofExercise="weightloss";
            Intent intent = new Intent(weightloss.this, days.class);
            intent.putExtra("diff_key",difficulty);
           intent.putExtra("type_key",typeofExercise);
            startActivity(intent);
        }
        else if (v.getId() == R.id.easy) {
            difficulty="easy";
            typeofExercise="weightloss";
            Intent intent = new Intent(weightloss.this, days.class);
            intent.putExtra("diff_key",difficulty);
            intent.putExtra("type_key",typeofExercise);
            startActivity(intent);
        }
        else if(v.getId()==R.id.diet)
        {
            Intent intent=new Intent(weightloss.this,diet.class);
            startActivity(intent);
        }


    }








/* an dn mporesw n perasw to diff
public weightloss(String difficulty, String typeofExercise) {
      this.difficulty = difficulty;
      this.typeofExercise = typeofExercise;
  }

public String getDifficulty()
{
    return difficulty;
}

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }*/

}
