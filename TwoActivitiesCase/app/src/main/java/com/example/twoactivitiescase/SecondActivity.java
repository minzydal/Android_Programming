package com.example.twoactivitiescase;

import androidx.appcompat.app.AppCompatActivity;

 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;


         public class SecondActivity extends AppCompatActivity {
     @Override
     public void onCreate(Bundle savedInstanceState) {
                 super.onCreate(savedInstanceState);
                 setContentView(R.layout.activity_second);


                 Button b = findViewById(R.id.buttonClose);
                 b.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                                 finish();
                             }
         });


             }
 }
