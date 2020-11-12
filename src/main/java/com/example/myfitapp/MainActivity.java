package com.example.myfitapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int age;
    int weight;
    int height;
    EditText age_input,weight_input,height_input;
    Button save_here,next_page;





    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        age_input=(EditText) findViewById(R.id.age_field);
        weight_input=(EditText) findViewById(R.id.Weight_field);
        height_input=(EditText) findViewById(R.id.Height_field);

        save_here =(Button) findViewById(R.id.save);
        save_here.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                age = Integer.valueOf(age_input.getText().toString());
                weight = Integer.valueOf(weight_input.getText().toString());
                height = Integer.valueOf(height_input.getText().toString());
            }
        });
        next_page=(Button) findViewById(R.id.save);
        next_page.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openpage2();
            }
        });
    }

public void openpage2()
{
    Intent intent = new Intent(this, page2.class);
    intent.putExtra("age_key",age);
    intent.putExtra("weight_key",weight);
    intent.putExtra("height_key",height);
    startActivity(intent);
}

}

