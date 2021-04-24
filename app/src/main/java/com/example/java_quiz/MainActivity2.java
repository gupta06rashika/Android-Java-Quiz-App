package com.example.java_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView textView2;
private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2=findViewById(R.id.textView2);
        Intent intent=getIntent();
        String score2= intent.getStringExtra(MainActivity.EXTRA_SCORE);
        textView2.setText("       YOU ARE A GOOD PLAYER \n          YOUR SCORE IS " + score2+" / 5");
        mediaPlayer=MediaPlayer.create(this,R.raw.clap3);
        mediaPlayer.start();

    }
}