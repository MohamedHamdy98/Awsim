package com.example.awsem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class StomachActivity extends AppCompatActivity {
    TextView tvPhone1, tvPhone2, tvPhone3,tvPhone4;
    Button btnphone1, btnphone2, btnphone3,btnphone4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stomach);
        initialization();
        firebase_edit_number_phone();
        onclick_all_buttons();
    }

    private void fireBaseNumberPhone1() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + tvPhone1.getText().toString()));
        startActivity(intent);
    }

    private void fireBaseNumberPhone2() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + tvPhone2.getText().toString()));
        startActivity(intent);
    }

    private void fireBaseNumberPhone3() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + tvPhone3.getText().toString()));
        startActivity(intent);
    }

    private void fireBaseNumberPhone4() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + tvPhone4.getText().toString()));
        startActivity(intent);
    }

    private void onclick_all_buttons() {
        btnphone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone1();
            }
        });
        btnphone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone2();
            }
        });
        btnphone3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone3();
            }
        });
        btnphone4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone4();
            }
        });
    }

    private void firebase_edit_number_phone() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        myRef.child("number phone stoach 1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                tvPhone1.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        myRef.child("number phone stoach 2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                tvPhone2.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        myRef.child("number phone stoach 3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                tvPhone3.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        myRef.child("number phone stoach 4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                tvPhone4.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void initialization() {
        tvPhone1 = findViewById(R.id.textView_stomach_phone1);
        tvPhone2 = findViewById(R.id.textView_stomach_phone2);
        tvPhone3 = findViewById(R.id.textView_stomach_phone3);
        tvPhone4 = findViewById(R.id.textView_stomach_phone4);
        btnphone1 = findViewById(R.id.button_stomach_phone_number1);
        btnphone2 = findViewById(R.id.button_stomach_phone_number2);
        btnphone3 = findViewById(R.id.button_stomach_phone_number3);
        btnphone4 = findViewById(R.id.button_stomach_phone_number4);
    }
}
