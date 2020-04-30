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

public class GrilActivity extends AppCompatActivity {
    Button btn_gril_1, btn_gril_2, btn_gril_3, btn_gril_4, btn_gril_5, btn_gril_6;
    TextView textView_gril_1, textView_gril_2, textView_gril_3, textView_gril_4, textView_gril_5, textView_gril_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gril);
        initialization();
        onclick_all_buttons();
        firebase_edit_number_phone();
    }

    private void initialization() {
        textView_gril_1 = findViewById(R.id.textView_gril_phone1);
        textView_gril_2 = findViewById(R.id.textView_gril_phone2);
        textView_gril_3 = findViewById(R.id.textView_gril_phone3);
        textView_gril_4 = findViewById(R.id.textView_gril_phone4);
        textView_gril_5 = findViewById(R.id.textView_gril_phone5);
        textView_gril_6 = findViewById(R.id.textView_gril_phone6);
        btn_gril_1 = findViewById(R.id.button_gril_phone_number1);
        btn_gril_2 = findViewById(R.id.button_gril_phone_number2);
        btn_gril_3 = findViewById(R.id.button_gril_phone_number3);
        btn_gril_4 = findViewById(R.id.button_gril_phone_number4);
        btn_gril_5 = findViewById(R.id.button_gril_phone_number5);
        btn_gril_6 = findViewById(R.id.button_gril_phone_number6);
    }

    private void fireBaseNumberPhone1() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + textView_gril_1.getText().toString()));
        startActivity(intent);
    }

    private void fireBaseNumberPhone2() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + textView_gril_2.getText().toString()));
        startActivity(intent);
    }

    private void fireBaseNumberPhone3() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + textView_gril_3.getText().toString()));
        startActivity(intent);
    }

    private void fireBaseNumberPhone4() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + textView_gril_4.getText().toString()));
        startActivity(intent);
    }

    private void fireBaseNumberPhone5() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + textView_gril_5.getText().toString()));
        startActivity(intent);
    }

    private void fireBaseNumberPhone6() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + textView_gril_6.getText().toString()));
        startActivity(intent);
    }

    private void onclick_all_buttons() {
        btn_gril_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone1();
            }
        });
        btn_gril_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone2();
            }
        });
        btn_gril_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone3();
            }
        });
        btn_gril_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone4();
            }
        });
        btn_gril_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone5();
            }
        });
        btn_gril_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireBaseNumberPhone6();
            }
        });
    }

    private void firebase_edit_number_phone() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        myRef.child("number phone gril 1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                textView_gril_1.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        myRef.child("number phone gril 2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                textView_gril_2.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        myRef.child("number phone gril 3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                textView_gril_3.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        myRef.child("number phone gril 4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                textView_gril_4.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        myRef.child("number phone gril 5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                textView_gril_5.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        myRef.child("number phone gril 6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                textView_gril_6.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}
