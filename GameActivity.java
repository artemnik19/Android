package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    int minimal, maxima, medium, raznost;
    Button yes,no;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent i = getIntent();
        minimal = i.getIntExtra("begin", 0);
        maxima = i.getIntExtra("end", 0);
        raznost = maxima - minimal;
        medium = minimal + (maxima - minimal)/2;
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        text = findViewById(R.id.textview);

        text.setText("Ваше число больше чем "+medium+" ?");

    }
    public void onYes(View v){
        if(raznost != 0) {
            if (maxima - minimal != 1) {
                minimal = medium;
                medium = minimal + (maxima - minimal) / 2;
                text.setText("Ваше число больше чем " + medium + " ?");
            } else {
                text.setText("Вы загадали : " + maxima + " !");
                raznost = 0;

            }
        }

    }
    public void onNo(View v) {
        if(raznost != 0) {
            if (maxima - minimal != 1) {
                maxima = medium;
                medium = minimal + (maxima - minimal) / 2;
                text.setText("Ваше число больше чем " + medium + " ?");
            } else {
                text.setText("Вы загадали : " + minimal + " !");
                raznost = 0;
            }
        }
    }
}
