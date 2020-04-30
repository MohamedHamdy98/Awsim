//package com.example.awsem;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.app.ActivityCompat;
//
//import android.Manifest;
//import android.content.Intent;
//import android.content.pm.PackageManager;
//import android.net.Uri;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//public class DoctorActivity extends AppCompatActivity {
//    Button btnphone1, btnphone2, btnphone3, btnphone4, btnphone5, btnphone6, btnphone7, btnphone8, btnphone9, btnphone10, btnphone11, btnphone12, btnphone13, btnphone14, btnphone15, btnphone16;
//    TextView tvPhone1, tvPhone2, tvPhone3, tvPhone4, tvPhone5, tvPhone6, tvPhone7, tvPhone8, tvPhone9, tvPhone10, tvPhone11, tvPhone12, tvPhone13, tvPhone14, tvPhone15, tvPhone16;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_doctor);
//
//        initialization();
//        FireBaseRealTimeEdit();
//
//
//
//        btnphone3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone3();
//            }
//        });
//        btnphone4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone4();
//            }
//        });
//        btnphone5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone5();
//            }
//        });
//        btnphone6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone6();
//            }
//        });
//        btnphone7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone7();
//            }
//        });
//        btnphone8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone8();
//            }
//        });
//        btnphone9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone9();
//            }
//        });
//        btnphone10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone10();
//            }
//        });
//        btnphone11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone11();
//            }
//        });
//        btnphone12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone12();
//            }
//        });
//        btnphone13.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone13();
//            }
//        });
//        btnphone14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone14();
//            }
//        });
//        btnphone15.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone15();
//            }
//        });
//        btnphone16.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fireBaseNumberPhone16();
//            }
//        });
//
//    }
//
//
//    private void fireBaseNumberPhone2() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone2.getText().toString()));
//        startActivity(callIntent);
//
//
//    }
//    private void fireBaseNumberPhone3() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone3.getText().toString()));
//        startActivity(callIntent);
//
//
//    }
//    private void fireBaseNumberPhone4() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone4.getText().toString()));
//        startActivity(callIntent);
//
//
//    }
//    private void fireBaseNumberPhone5() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone5.getText().toString()));
//        startActivity(callIntent);
//
//
//    }
//    private void fireBaseNumberPhone6() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone6.getText().toString()));
//        startActivity(callIntent);
//
//
//    }
//    private void fireBaseNumberPhone7() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone7.getText().toString()));
//        startActivity(callIntent);
//
//
//    }
//    private void fireBaseNumberPhone8() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone8.getText().toString()));
//        startActivity(callIntent);
//
//
//    }
//    private void fireBaseNumberPhone9() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone9.getText().toString()));
//        startActivity(callIntent);
//
//
//    }
//    private void fireBaseNumberPhone10() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone10.getText().toString()));
//        startActivity(callIntent);
//
//
//    }
//    private void fireBaseNumberPhone11() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone11.getText().toString()));
//        startActivity(callIntent);
//
//
//    }
//    private void fireBaseNumberPhone12() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone12.getText().toString()));
//        startActivity(callIntent);
//
//
//    }
//    private void fireBaseNumberPhone13() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone13.getText().toString()));
//        startActivity(callIntent);
//    }
//    private void fireBaseNumberPhone14() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone14.getText().toString()));
//        startActivity(callIntent);
//    }
//    private void fireBaseNumberPhone15() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone15.getText().toString()));
//        startActivity(callIntent);
//
//
//    }
//    private void fireBaseNumberPhone16() {
//        Intent callIntent = new Intent(Intent.ACTION_DIAL);
//        callIntent.setData(Uri.parse("tel:" + tvPhone16.getText().toString()));
//        startActivity(callIntent);
//
//    }
//    private void initialization() {
//
//        tvPhone2 = findViewById(R.id.textView_phone2);
//        tvPhone3 = findViewById(R.id.textView_phone3);
//        tvPhone4 = findViewById(R.id.textView_phone4);
//        tvPhone5 = findViewById(R.id.textView_phone5);
//        tvPhone6 = findViewById(R.id.textView_phone6);
//        tvPhone7 = findViewById(R.id.textView_phone7);
//        tvPhone8 = findViewById(R.id.textView_phone8);
//        tvPhone9 = findViewById(R.id.textView_phone9);
//        tvPhone10 = findViewById(R.id.textView_phone10);
//        tvPhone11 = findViewById(R.id.textView_phone11);
//        tvPhone12 = findViewById(R.id.textView_phone12);
//        tvPhone13 = findViewById(R.id.textView_phone13);
//        tvPhone14 = findViewById(R.id.textView_phone14);
//        tvPhone15 = findViewById(R.id.textView_phone15);
//        tvPhone16 = findViewById(R.id.textView_phone16);
//
//        btnphone2 = findViewById(R.id.button_phone_number2);
//        btnphone3 = findViewById(R.id.button_phone_number3);
//        btnphone4 = findViewById(R.id.button_phone_number4);
//        btnphone5 = findViewById(R.id.button_phone_number5);
//        btnphone6 = findViewById(R.id.button_phone_number6);
//        btnphone7 = findViewById(R.id.button_phone_number7);
//        btnphone8 = findViewById(R.id.button_phone_number8);
//        btnphone9 = findViewById(R.id.button_phone_number9);
//        btnphone10 = findViewById(R.id.button_phone_number10);
//        btnphone11 = findViewById(R.id.button_phone_number11);
//        btnphone12 = findViewById(R.id.button_phone_number12);
//        btnphone13 = findViewById(R.id.button_phone_number13);
//        btnphone14 = findViewById(R.id.button_phone_number14);
//        btnphone15 = findViewById(R.id.button_phone_number15);
//        btnphone16 = findViewById(R.id.button_phone_number16);
//    }
//    private void FireBaseRealTimeEdit(){
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference();
//        myRef.child("number phone1").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone1.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone2").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone2.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone3").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone3.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone5").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone5.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone4").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone4.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone6").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone6.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone7").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone7.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone8").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone8.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone9").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone9.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone10").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone10.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone11").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone11.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone12").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone12.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone13").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone13.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone14").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone14.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone15").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone15.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//        myRef.child("number phone16").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                tvPhone16.setText(dataSnapshot.getValue(String.class));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(DoctorActivity.this, "Error!", Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//}
