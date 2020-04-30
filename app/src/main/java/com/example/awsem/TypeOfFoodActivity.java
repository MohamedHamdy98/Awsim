package com.example.awsem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TypeOfFoodActivity extends AppCompatActivity {
    Button btnpizza, btnkoshary, btngril, btnfish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_food);
        inisializition();
        onclickallbutton();
    }

    private void onclickallbutton() {
        btnfish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfFoodActivity.this, FishActivity.class);
                startActivity(intent);
            }
        });
        btnpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfFoodActivity.this, PizzaActivity.class);
                startActivity(intent);
            }
        });
        btngril.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfFoodActivity.this, GrilActivity.class);
                startActivity(intent);
            }
        });
        btnkoshary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfFoodActivity.this, KosharyActivity.class);
                startActivity(intent);
            }
        });
    }

    private void inisializition() {
        btnfish = findViewById(R.id.button_fish);
        btnpizza = findViewById(R.id.button_pizza);
        btnkoshary = findViewById(R.id.button_koshary);
        btngril = findViewById(R.id.button_gril);
    }

}
