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

public class PizzaActivity extends AppCompatActivity {
    Button btn_pizza_1, btn_pizza_2, btn_pizza_3;
    TextView textView_pizza_1, textView_pizza_2, textView_pizza_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
        initialization();
        onclick_all_buttons();
        firebase_edit_number_phone();
    }

    private void initialization() {
        textView_pizza_1 = findViewById(R.id.textView_pizza_phone1);
        textView_pizza_2 = findViewById(R.id.textView_pizza_phone2);
        textView_pizza_3 = findViewById(R.id.textView_pizza_phone3);
        btn_pizza_1 = findViewById(R.id.button_pizza_phone_number1);
        btn_pizza_2 = findViewById(R.id.button_pizza_phone_number2);
        btn_pizza_3 = findViewById(R.id.button_pizza_phone_number3);

    }

    private void fireBaseNumberPhone1() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + textView_pizza_1.getText().toString()));
        startActivity(intent);
    }

    private void fireBaseNumberPhone2() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + textView_pizza_2.getText().toString()));
        startActivity(intent);
    }

    private void fireBaseNumberPhone3() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + textView_pizza_3.getText().toString()));
        startActivity(intent);
    }

    private void onclick_all_buttons() {
        btn_pizza_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone1();
            }
        });
        btn_pizza_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone2();
            }
        });
        btn_pizza_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone3();
            }
        });

    }

    private void firebase_edit_number_phone() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        myRef.child("number phone pizza 1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                textView_pizza_1.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        myRef.child("number phone pizza 2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                textView_pizza_2.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        myRef.child("number phone pizza 3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                textView_pizza_3.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}
