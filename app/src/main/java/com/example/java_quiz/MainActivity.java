package com.example.java_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_SCORE="androidx.appcompat.app.AppCompatActivity.score";
    private Button yes;
    private Button no;
    private TextView textView;
    private int index=0,score=0;
    private String sc;
    private String questions[]={"JAVA IS INTRODUCED IN 1996?","JAVA IS OBJECT ORIENTED LANG?","JAVA IS WRITTEN IN PYTHON?","JAVA IS USED FOR APP DEVELOPMENT","JAVA CONTAINS POINTERS?"};
    private boolean answers[]={true,true,false,true,false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.button);
        no=findViewById(R.id.button2);
        textView=findViewById(R.id.textView);
        textView.setText(questions[index]);
         yes.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(index<5){
                 if(answers[index]){
                     score++;
                 }}
                 index++;
                 if(index==5){

                     if(score>3){
                         //go to next page
                         sc=String.valueOf(score);
                         Intent intent=new Intent( MainActivity.this,MainActivity2.class);
                         intent.putExtra(EXTRA_SCORE,sc);
                         startActivity(intent);
                        // Toast.makeText(MainActivity.this ,"CONGRATULATIONS YOU ARE A GOOD PLAYER ,YOUR SCORE IS "+ score +"/5",Toast.LENGTH_LONG).show();
                     }
                     else{

                         //go to next page

                         sc=String.valueOf(score);
                         Intent intent=new Intent( MainActivity.this,MainActivity3.class);
                         intent.putExtra(EXTRA_SCORE,sc);

                         startActivity(intent);
                         //Toast.makeText( MainActivity.this ,"WORK HARD AND COME AGAIN ,YOUR SCORE IS "+ score +"/5",Toast.LENGTH_LONG).show();

                     }



                 }
                 if(index<5){
                     textView.setText(questions[index]);
                 }

                 if(index>5){
                     Toast.makeText(MainActivity.this ,"YOUR QUIZ IS OVER",Toast.LENGTH_SHORT).show();
                 }
//                 else{
//                     To
//                 }

             }
         });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<5) {
                    if (!answers[index]) {
                        score++;
                    }
                }
                    index++;

                if(index==5){
                    if(score>3){

                        //go to next page

                        sc=String.valueOf(score);
                        Intent intent=new Intent( MainActivity.this,MainActivity2.class);
                        intent.putExtra(EXTRA_SCORE,sc);

                        startActivity(intent);
                    //Toast.makeText(MainActivity.this ,"CONGRATULATIONS YOU ARE A GOOD PLAYER ,YOUR SCORE IS "+ score +"/5",Toast.LENGTH_LONG).show();
                }
                    else{

                        //go to next page

                        sc=String.valueOf(score);
                        Intent intent=new Intent( MainActivity.this,MainActivity3.class);
                        intent.putExtra(EXTRA_SCORE,sc);

                        startActivity(intent);
                      //  Toast.makeText(MainActivity.this ,"WORK HARD AND COME AGAIN ,YOUR SCORE IS "+ score +"/5",Toast.LENGTH_LONG).show();

                    }



                }
                if(index<5){
                    textView.setText(questions[index]);
                }
                if(index>5){

                    Toast.makeText(MainActivity.this ,"YOUR QUIZ IS OVER",Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}