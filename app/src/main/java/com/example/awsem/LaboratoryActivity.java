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

public class LaboratoryActivity extends AppCompatActivity {
    Button btnphone1;
    TextView tvPhone1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratory);
        initialization();
        firebase_edit_number_phone();
        onclick_all_buttons();
    }

    private void fireBaseNumberPhone1() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + tvPhone1.getText().toString()));
        startActivity(intent);
    }

    private void firebase_edit_number_phone() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        myRef.child("number phone laboratory 1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                tvPhone1.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void initialization() {
        tvPhone1 = findViewById(R.id.textView_laboratory_phone1);
        btnphone1 = findViewById(R.id.button_laboratory_phone_number1);
    }

    private void onclick_all_buttons() {
        btnphone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone1();
            }
        });
    }

}
