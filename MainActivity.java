package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText minimal;
    EditText maxima;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minimal = findViewById(R.id.min);
        maxima = findViewById(R.id.max);
        start= findViewById(R.id.button_begin);


    }

    public void onFirstClick(View v){
        String strbegin = minimal.getText().toString();
        int begin = Integer.parseInt(strbegin);
        String strend = maxima.getText().toString();
        int end = Integer.parseInt(strend);

        Intent i = new Intent(this,GameActivity.class);
        i.putExtra("begin",begin);
        i.putExtra("end",end);
        startActivity(i);
    }
}
