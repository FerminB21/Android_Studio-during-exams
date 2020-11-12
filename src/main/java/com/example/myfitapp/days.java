package com.example.myfitapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class days extends AppCompatActivity implements View.OnClickListener  {
    private Button day,day2,day3,day4,day5,day6,day7,day8,day9,day10,day11,day12,day13,day14,day15,day16,day17,day18,day19,day20,day21,day22,day23,day24,day25,day26,day27,day28,day29,day30;
    String difficulty,typeofExercise;
    String flag,flagType;
    String hard="hard",easy="easy",arm="arm",chest="chest",abs="abs",weightloss="weightloss";
    String change,change_prop="change_color_prop",change_rest="change_color_rest";
    String x;//an x=prop meres askhshs || an x=rest hmeres ksekourashs

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_days);
        difficulty = getIntent().getExtras().getString("diff_key");//pernw to value apo to prohgoumeno class etsi wste me to pathma ths meras n mou bgazei tis askhseis pou analogoun gia thn diskolia m
        typeofExercise=getIntent().getExtras().getString("type_key");
        change=getIntent().getExtras().getString("color_key");
        if(difficulty.equals(easy))
            setFlag("easy");
        else if(difficulty.equals(hard))
            setFlag("hard");

        if(typeofExercise.equals(weightloss))
            setFlag_type("weightloss");
        else if(typeofExercise.equals(arm))
            setFlag_type("arm");
        else if(typeofExercise.equals(chest))
            setFlag_type("chest");
        else if(typeofExercise.equals(abs))
            setFlag_type("abs");


        day=(Button)findViewById(R.id.day1);
        day.setOnClickListener((View.OnClickListener) this);
        day2=(Button)findViewById(R.id.day2);
        day2.setOnClickListener((View.OnClickListener) this);
        day3=(Button)findViewById(R.id.day3);
        day3.setOnClickListener((View.OnClickListener) this);
        day4=(Button)findViewById(R.id.day4);
        day4.setOnClickListener((View.OnClickListener) this);
        day5=(Button)findViewById(R.id.day5);
        day5.setOnClickListener((View.OnClickListener) this);
        day6=(Button)findViewById(R.id.day6);
        day6.setOnClickListener((View.OnClickListener) this);
        day7=(Button)findViewById(R.id.day7);
        day7.setOnClickListener((View.OnClickListener) this);
        day8=(Button)findViewById(R.id.day8);
        day8.setOnClickListener((View.OnClickListener) this);
        day9=(Button)findViewById(R.id.day9);
        day9.setOnClickListener((View.OnClickListener) this);
        day10=(Button)findViewById(R.id.day10);
        day10.setOnClickListener((View.OnClickListener) this);
        day11=(Button)findViewById(R.id.day11);
        day11.setOnClickListener((View.OnClickListener) this);
        day12=(Button)findViewById(R.id.day12);
        day12.setOnClickListener((View.OnClickListener) this);
        day13=(Button)findViewById(R.id.day13);
        day13.setOnClickListener((View.OnClickListener) this);
        day14=(Button)findViewById(R.id.day14);
        day14.setOnClickListener((View.OnClickListener) this);
        day15=(Button)findViewById(R.id.day15);
        day15.setOnClickListener((View.OnClickListener) this);
        day16=(Button)findViewById(R.id.day16);
        day16.setOnClickListener((View.OnClickListener) this);
        day17=(Button)findViewById(R.id.day17);
        day17.setOnClickListener((View.OnClickListener) this);
        day18=(Button)findViewById(R.id.day18);
        day18.setOnClickListener((View.OnClickListener) this);
        day19=(Button)findViewById(R.id.day19);
        day19.setOnClickListener((View.OnClickListener) this);
        day20=(Button)findViewById(R.id.day20);
        day20.setOnClickListener((View.OnClickListener) this);
        day21=(Button)findViewById(R.id.day21);
        day21.setOnClickListener((View.OnClickListener) this);
        day22=(Button)findViewById(R.id.day22);
        day22.setOnClickListener((View.OnClickListener) this);
        day23=(Button)findViewById(R.id.day23);
        day23.setOnClickListener((View.OnClickListener) this);
        day24=(Button)findViewById(R.id.day24);
        day24.setOnClickListener((View.OnClickListener) this);
        day25=(Button)findViewById(R.id.day25);
        day25.setOnClickListener((View.OnClickListener) this);
        day26=(Button)findViewById(R.id.day26);
        day26.setOnClickListener((View.OnClickListener) this);
        day27=(Button)findViewById(R.id.day27);
        day27.setOnClickListener((View.OnClickListener) this);
        day28=(Button)findViewById(R.id.day28);
        day28.setOnClickListener((View.OnClickListener) this);
        day29=(Button)findViewById(R.id.day29);
        day29.setOnClickListener((View.OnClickListener) this);
        day30=(Button)findViewById(R.id.day30);
        day30.setOnClickListener((View.OnClickListener) this);


    }



    @Override
            public void onClick(View v) {
        if(flagType.equals(weightloss)) {
            if (flag.equals(easy)) {//an kathgoria weightloss kai diskolia easy
                if ((v.getId() == R.id.day1) || (v.getId() == R.id.day2) || (v.getId() == R.id.day4) || (v.getId() == R.id.day5) || (v.getId() == R.id.day7) || (v.getId() == R.id.day8) || (v.getId() == R.id.day10) || (v.getId() == R.id.day11) ||
                        (v.getId() == R.id.day13) || (v.getId() == R.id.day14) || (v.getId() == R.id.day16) || (v.getId() == R.id.day17) || (v.getId() == R.id.day19) || (v.getId() == R.id.day20) || (v.getId() == R.id.day22) || (v.getId() == R.id.day23) || (v.getId() == R.id.day25)
                        || (v.getId() == R.id.day26) || (v.getId() == R.id.day28) || (v.getId() == R.id.day29)) {//exercise days
                    Intent intent = new Intent(days.this, weightloss_easy.class);
                    startActivity(intent);
                } else if ((v.getId() == R.id.day3) || (v.getId() == R.id.day6) || (v.getId() == R.id.day9) || (v.getId() == R.id.day12) || (v.getId() == R.id.day15) || (v.getId() == R.id.day18) || (v.getId() == R.id.day21)
                        || (v.getId() == R.id.day24) || (v.getId() == R.id.day27) || (v.getId() == R.id.day30))//rest days
                {
                    Intent intent = new Intent(days.this, rest.class);
                    startActivity(intent);
                }
            }
            else if (flag.equals(hard)) {//an kathgoria weightloss kai diskolia hard
                if ((v.getId() == R.id.day1) || (v.getId() == R.id.day2) || (v.getId() == R.id.day4) || (v.getId() == R.id.day5) || (v.getId() == R.id.day7) || (v.getId() == R.id.day8) || (v.getId() == R.id.day10) || (v.getId() == R.id.day11) ||
                        (v.getId() == R.id.day13) || (v.getId() == R.id.day14) || (v.getId() == R.id.day16) || (v.getId() == R.id.day17) || (v.getId() == R.id.day19) || (v.getId() == R.id.day20) || (v.getId() == R.id.day22) || (v.getId() == R.id.day23) || (v.getId() == R.id.day25)
                        || (v.getId() == R.id.day26) || (v.getId() == R.id.day28) || (v.getId() == R.id.day29)) {//exercise days
                    Intent intent = new Intent(days.this, weightloss_exercises_hard.class);
                    x="prop";
                    intent.putExtra("change_color",x);
                    startActivity(intent);
                } else if ((v.getId() == R.id.day3) || (v.getId() == R.id.day6) || (v.getId() == R.id.day9) || (v.getId() == R.id.day12) || (v.getId() == R.id.day12) || (v.getId() == R.id.day15) || (v.getId() == R.id.day18) || (v.getId() == R.id.day21)
                        || (v.getId() == R.id.day24) || (v.getId() == R.id.day27) || (v.getId() == R.id.day30))//rest days
                {
                    Intent intent = new Intent(days.this, rest.class);
                    x="rest";
                    intent.putExtra("change_color",x);
                    startActivity(intent);
                }
            }
        }
        if(flagType.equals(arm)) {
            if (flag.equals(easy)) {//an kathgoria weightloss kai diskolia easy
                if ((v.getId() == R.id.day1) || (v.getId() == R.id.day2) || (v.getId() == R.id.day4) || (v.getId() == R.id.day5) || (v.getId() == R.id.day7) || (v.getId() == R.id.day8) || (v.getId() == R.id.day10) || (v.getId() == R.id.day11) ||
                        (v.getId() == R.id.day13) || (v.getId() == R.id.day14) || (v.getId() == R.id.day16) || (v.getId() == R.id.day17) || (v.getId() == R.id.day19) || (v.getId() == R.id.day20) || (v.getId() == R.id.day22) || (v.getId() == R.id.day23) || (v.getId() == R.id.day25)
                        || (v.getId() == R.id.day26) || (v.getId() == R.id.day28) || (v.getId() == R.id.day29)) {//exercise days
                    Intent intent = new Intent(days.this, arm_easy.class);
                    startActivity(intent);
                } else if ((v.getId() == R.id.day3) || (v.getId() == R.id.day6) || (v.getId() == R.id.day9) || (v.getId() == R.id.day12)  || (v.getId() == R.id.day15) || (v.getId() == R.id.day18) || (v.getId() == R.id.day21)
                        || (v.getId() == R.id.day24) || (v.getId() == R.id.day27) || (v.getId() == R.id.day30))//rest days
                {
                    Intent intent2 = new Intent(days.this, rest.class);
                    startActivity(intent2);
                }
            }
            else if (flag.equals(hard)) {//an kathgoria weightloss kai diskolia hard
                if ((v.getId() == R.id.day1) || (v.getId() == R.id.day2) || (v.getId() == R.id.day4) || (v.getId() == R.id.day5) || (v.getId() == R.id.day7) || (v.getId() == R.id.day8) || (v.getId() == R.id.day10) || (v.getId() == R.id.day11) ||
                        (v.getId() == R.id.day13) || (v.getId() == R.id.day14) || (v.getId() == R.id.day16) || (v.getId() == R.id.day17) || (v.getId() == R.id.day19) || (v.getId() == R.id.day20) || (v.getId() == R.id.day22) || (v.getId() == R.id.day23) || (v.getId() == R.id.day25)
                        || (v.getId() == R.id.day26) || (v.getId() == R.id.day28) || (v.getId() == R.id.day29)) {//exercise days
                    Intent intent = new Intent(days.this, arm_hard.class);
                    startActivity(intent);
                } else if ((v.getId() == R.id.day3) || (v.getId() == R.id.day6) || (v.getId() == R.id.day9) || (v.getId() == R.id.day12) || (v.getId() == R.id.day12) || (v.getId() == R.id.day15) || (v.getId() == R.id.day18) || (v.getId() == R.id.day21)
                        || (v.getId() == R.id.day24) || (v.getId() == R.id.day27) || (v.getId() == R.id.day30))//rest days
                {
                    Intent intent2 = new Intent(days.this, rest.class);
                    startActivity(intent2);
                }
            }
        }
        if(flagType.equals(abs)) {
            if (flag.equals(easy)) {//an kathgoria weightloss kai diskolia easy
                if ((v.getId() == R.id.day1) || (v.getId() == R.id.day2) || (v.getId() == R.id.day4) || (v.getId() == R.id.day5) || (v.getId() == R.id.day7) || (v.getId() == R.id.day8) || (v.getId() == R.id.day10) || (v.getId() == R.id.day11) ||
                        (v.getId() == R.id.day13) || (v.getId() == R.id.day14) || (v.getId() == R.id.day16) || (v.getId() == R.id.day17) || (v.getId() == R.id.day19) || (v.getId() == R.id.day20) || (v.getId() == R.id.day22) || (v.getId() == R.id.day23) || (v.getId() == R.id.day25)
                        || (v.getId() == R.id.day26) || (v.getId() == R.id.day28) || (v.getId() == R.id.day29)) {//exercise days
                    Intent intent = new Intent(days.this, abs_easy.class);
                    startActivity(intent);
                } else if ((v.getId() == R.id.day3) || (v.getId() == R.id.day6) || (v.getId() == R.id.day9) || (v.getId() == R.id.day12) || (v.getId() == R.id.day12) || (v.getId() == R.id.day15) || (v.getId() == R.id.day18) || (v.getId() == R.id.day21)
                        || (v.getId() == R.id.day24) || (v.getId() == R.id.day27) || (v.getId() == R.id.day30))//rest days
                {
                    Intent intent2 = new Intent(days.this, rest.class);
                    startActivity(intent2);
                }
            }
            else if (flag.equals(hard)) {//an kathgoria weightloss kai diskolia hard
                if ((v.getId() == R.id.day1) || (v.getId() == R.id.day2) || (v.getId() == R.id.day4) || (v.getId() == R.id.day5) || (v.getId() == R.id.day7) || (v.getId() == R.id.day8) || (v.getId() == R.id.day10) || (v.getId() == R.id.day11) ||
                        (v.getId() == R.id.day13) || (v.getId() == R.id.day14) || (v.getId() == R.id.day16) || (v.getId() == R.id.day17) || (v.getId() == R.id.day19) || (v.getId() == R.id.day20) || (v.getId() == R.id.day22) || (v.getId() == R.id.day23) || (v.getId() == R.id.day25)
                        || (v.getId() == R.id.day26) || (v.getId() == R.id.day28) || (v.getId() == R.id.day29)) {//exercise days
                    Intent intent = new Intent(days.this, abs_hard.class);
                    startActivity(intent);
                } else if ((v.getId() == R.id.day3) || (v.getId() == R.id.day6) || (v.getId() == R.id.day9) || (v.getId() == R.id.day12) || (v.getId() == R.id.day12) || (v.getId() == R.id.day15) || (v.getId() == R.id.day18) || (v.getId() == R.id.day21)
                        || (v.getId() == R.id.day24) || (v.getId() == R.id.day27) || (v.getId() == R.id.day30))//rest days
                {
                    Intent intent2 = new Intent(days.this, rest.class);
                    startActivity(intent2);
                }
            }
        }
        if(flagType.equals(chest)) {
            if (flag.equals(easy)) {//an kathgoria weightloss kai diskolia easy
                if ((v.getId() == R.id.day1) || (v.getId() == R.id.day2) || (v.getId() == R.id.day4) || (v.getId() == R.id.day5) || (v.getId() == R.id.day7) || (v.getId() == R.id.day8) || (v.getId() == R.id.day10) || (v.getId() == R.id.day11) ||
                        (v.getId() == R.id.day13) || (v.getId() == R.id.day14) || (v.getId() == R.id.day16) || (v.getId() == R.id.day17) || (v.getId() == R.id.day19) || (v.getId() == R.id.day20) || (v.getId() == R.id.day22) || (v.getId() == R.id.day23) || (v.getId() == R.id.day25)
                        || (v.getId() == R.id.day26) || (v.getId() == R.id.day28) || (v.getId() == R.id.day29)) {//exercise days
                    Intent intent = new Intent(days.this, chest_easy.class);
                    startActivity(intent);
                } else if ((v.getId() == R.id.day3) || (v.getId() == R.id.day6) || (v.getId() == R.id.day9) || (v.getId() == R.id.day12) || (v.getId() == R.id.day12) || (v.getId() == R.id.day15) || (v.getId() == R.id.day18) || (v.getId() == R.id.day21)
                        || (v.getId() == R.id.day24) || (v.getId() == R.id.day27) || (v.getId() == R.id.day30))//rest days
                {
                    Intent intent2 = new Intent(days.this, rest.class);
                    startActivity(intent2);
                }
            }
            else if (flag.equals(hard)) {//an kathgoria weightloss kai diskolia hard
                if ((v.getId() == R.id.day1) || (v.getId() == R.id.day2) || (v.getId() == R.id.day4) || (v.getId() == R.id.day5) || (v.getId() == R.id.day7) || (v.getId() == R.id.day8) || (v.getId() == R.id.day10) || (v.getId() == R.id.day11) ||
                        (v.getId() == R.id.day13) || (v.getId() == R.id.day14) || (v.getId() == R.id.day16) || (v.getId() == R.id.day17) || (v.getId() == R.id.day19) || (v.getId() == R.id.day20) || (v.getId() == R.id.day22) || (v.getId() == R.id.day23) || (v.getId() == R.id.day25)
                        || (v.getId() == R.id.day26) || (v.getId() == R.id.day28) || (v.getId() == R.id.day29)) {//exercise days
                    Intent intent = new Intent(days.this, chest_hard.class);
                    startActivity(intent);
                } else if ((v.getId() == R.id.day3) || (v.getId() == R.id.day6) || (v.getId() == R.id.day9) || (v.getId() == R.id.day12) || (v.getId() == R.id.day12) || (v.getId() == R.id.day15) || (v.getId() == R.id.day18) || (v.getId() == R.id.day21)
                        || (v.getId() == R.id.day24) || (v.getId() == R.id.day27) || (v.getId() == R.id.day30))//rest days
                {
                    Intent intent2 = new Intent(days.this, rest.class);
                    startActivity(intent2);
                }
            }
        }


    }//end of view



    public void setFlag(String x)
            {
                flag=x;
            }

    private void setFlag_type(String x) {
        flagType=x;
    }

}



