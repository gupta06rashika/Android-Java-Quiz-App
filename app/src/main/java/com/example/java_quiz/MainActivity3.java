package com.example.java_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
private TextView textView3;
private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView3=findViewById(R.id.textView3);
        Intent intent=getIntent();
        String score2= intent.getStringExtra(MainActivity.EXTRA_SCORE);
        textView3.setText("     WORK HARD AND COME AGAIN \n      YOUR SCORE IS " + score2 + "  / 5");
        mediaPlayer= MediaPlayer.create(this,R.raw.oops);
        mediaPlayer.start();

    }
}