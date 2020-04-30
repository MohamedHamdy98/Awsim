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

public class NervesActivity extends AppCompatActivity {
    Button btnphone15;
    TextView tvPhone15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nerves);
        initialization();
        firebase_edit_number_phone();
        onclick_all_buttons();
    }

    private void firebase_edit_number_phone() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        myRef.child("number phone nerves 1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                tvPhone15.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void initialization() {
        tvPhone15 = findViewById(R.id.textView_nerves_phone1);
        btnphone15 = findViewById(R.id.button_nerves_phone_number1);
    }

    private void onclick_all_buttons() {
        btnphone15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone1();
            }
        });
    }

    private void fireBaseNumberPhone1() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + tvPhone15.getText().toString()));
        startActivity(intent);
    }
}
