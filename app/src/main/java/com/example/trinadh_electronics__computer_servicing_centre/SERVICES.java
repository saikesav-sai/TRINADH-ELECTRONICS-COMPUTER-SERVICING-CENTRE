package com.example.trinadh_electronics__computer_servicing_centre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SERVICES extends AppCompatActivity {

     private Button button11;
     private Button button12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        setContentView(R.layout.activity_services);

        button11 = findViewById(R.id.inbound);
        button12 = findViewById(R.id.outbound);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SERVICES.this, INBOUND.class);

                startActivity(intent);
            }

        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SERVICES.this, OUTBOUND.class);

                startActivity(intent);
            }
        });


    }
}