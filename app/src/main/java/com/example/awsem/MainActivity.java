package com.example.awsem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
CardView cardFood,cardDoctor;
ImageView imageFood,imageDoctor;
TextView textDoctor,textFood;
Button btnFood,btnDoctor;
Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();


        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intentGoToFoodActivity = new Intent(MainActivity.this,TypeOfFoodActivity.class);
               startActivity(intentGoToFoodActivity);

            }
        });
        btnDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoToDoctorActivity = new Intent(MainActivity.this, TypeOfDoctorActivity.class);
                startActivity(intentGoToDoctorActivity);

            }
        });
    }
    public void initialization(){
        cardFood = findViewById(R.id.card_view_Food);
        cardDoctor = findViewById(R.id.card_view_Medicine);
        imageFood = findViewById(R.id.imageFood);
        imageDoctor = findViewById(R.id.imageMedicine);
        textFood = findViewById(R.id.textViewFood);
        textDoctor = findViewById(R.id.textViewMedicine);
        btnFood = findViewById(R.id.buttonFood);
        btnDoctor = findViewById(R.id.buttonMedicine);
    }
}
