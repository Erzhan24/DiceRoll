package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button press;
    public static final Random dice=new Random();
    ImageView first;
    ImageView second;
    public static int randomDice(){
        return dice.nextInt(6)+1;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        press=(Button)findViewById(R.id.button);
        first=(ImageView)findViewById(R.id.image1);
        second=(ImageView)findViewById(R.id.image2);
        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int roll1=randomDice();
                int roll2=randomDice();
                int set1=getResources().getIdentifier("diceroll_"+roll1,"drawable","com.example.diceroll");
                int set2=getResources().getIdentifier("diceroll_"+roll2,"drawable","com.example.diceroll");
                first.setImageResource(set1);
                second.setImageResource(set2);
            }

        });



    }
}