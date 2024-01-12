package com.example.trinadh_electronics__computer_servicing_centre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class VIEWDATA extends AppCompatActivity {
    private Button button;
    private Button button0;
    private Button button9;
    private Button button8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewdata);
        setContentView(R.layout.activity_viewdata);
        setContentView(R.layout.activity_viewdata);
        setContentView(R.layout.activity_viewdata);



        button = findViewById(R.id.button);
        button0 = findViewById(R.id.button2);
        button9 = findViewById(R.id.button5);
        button8 = findViewById(R.id.button6);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VIEWDATA.this, RENTAL.class);

                startActivity(intent);
                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(VIEWDATA.this, SERVICES.class);

                        startActivity(intent);

                    }
                });
            }



        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VIEWDATA.this, SALES.class);

                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VIEWDATA.this, PROJECTS.class);

                startActivity(intent);
            }
        });
    }
}

