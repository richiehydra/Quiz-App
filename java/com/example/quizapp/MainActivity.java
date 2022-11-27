package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private String[] questions={"C is a Programming Language","C has Variables","C program was Founded By Bjrane Straustrop","C programming has 31 keywords","C programming is oops based Concept","C has Data Type called Character","C programm has header file","Variable name cant be Numbers","sum is a keyword in C"};

private boolean[] answers={true,true,false,false,false,true,true,true,false};
private int score=0;
public int index=0;
private TextView question;
Button yes;
Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.question);
        question.setText(questions[0]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==questions.length-1)
                {
                    Toast.makeText(MainActivity.this, "Your Score is " +score+ " out of 8" , Toast.LENGTH_SHORT).show();
                }
                else {
                    if (answers[index] == true) {
                        score++;
                    }
                    question.setText(questions[++index]);
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                    if (index == questions.length - 1) {
                        Toast.makeText(MainActivity.this, "Your Score is " +score+ "Out of 8", Toast.LENGTH_SHORT).show();
                    } else {
                        if (answers[index] == false) {
                            score++;
                        }
                        question.setText(questions[++index]);
                    }
                }
        });

    }

}