package com.example.awsem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TypeOfDoctorActivity extends AppCompatActivity {
    Button buttonmicroscope,buttonbone, buttontooth, buttonbaby, buttongeneralsergury, buttonwoman, buttonnose, buttonnerves, buttonstomach, buttoneye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of);
        inisializition();
        onclickallbutton();
    }

    private void inisializition() {
        buttonmicroscope = findViewById(R.id.button_microscope);
        buttonbone = findViewById(R.id.button_bone);
        buttonbaby = findViewById(R.id.button_baby);
        buttontooth = findViewById(R.id.button_tooth);
        buttonnose = findViewById(R.id.button_nose);
        buttoneye = findViewById(R.id.button_eye);
        buttonwoman = findViewById(R.id.button_woman);
        buttonnerves = findViewById(R.id.button_nerves);
        buttonstomach = findViewById(R.id.button_stomach);
        buttongeneralsergury = findViewById(R.id.button_General_surgery);
    }

    private void onclickallbutton() {
        buttonmicroscope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfDoctorActivity.this, LaboratoryActivity.class);
                startActivity(intent);
            }
        });
        buttonbone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfDoctorActivity.this, BoneActivity.class);
                startActivity(intent);
            }
        });
        buttontooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfDoctorActivity.this, ToothActivity.class);
                startActivity(intent);
            }
        });
        buttonbaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfDoctorActivity.this, BabyActivity.class);
                startActivity(intent);
            }
        });
        buttongeneralsergury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfDoctorActivity.this, GeneralSerguryActivity.class);
                startActivity(intent);
            }
        });
        buttonwoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfDoctorActivity.this, WomanActivity.class);
                startActivity(intent);
            }
        });
        buttonnose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfDoctorActivity.this, NoseActivity.class);
                startActivity(intent);
            }
        });
        buttonnerves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfDoctorActivity.this, NervesActivity.class);
                startActivity(intent);
            }
        });
        buttonstomach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfDoctorActivity.this, StomachActivity.class);
                startActivity(intent);
            }
        });
        buttoneye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfDoctorActivity.this, EyeActivity.class);
                startActivity(intent);
            }
        });
    }

}
