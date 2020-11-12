package com.example.myfitapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;

public class diet extends AppCompatActivity {
    //Button b;
   // TextView tv_text;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_diet);

       /* tv_text=(TextView)findViewById(R.id.text);
        b=(Button)findViewById(R.id.diet);
        b.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick (View view)
           {
               String text="";
               try{
                   InputStream is=getAssets().open("test.txt");
                   int size=is.available();
                   byte[] buffer=new byte[size];
                   is.read(buffer);
                   is.close();
                   text=new String(buffer);
               }catch(IOException ex)
               {
                   ex.printStackTrace();
               }
               tv_text.setText(text);
           }
        });Z*/

    }

}
