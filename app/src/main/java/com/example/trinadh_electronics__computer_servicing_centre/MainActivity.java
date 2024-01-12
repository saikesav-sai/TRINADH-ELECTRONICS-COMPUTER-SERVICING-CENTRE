package com.example.trinadh_electronics__computer_servicing_centre;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.insert_data);
        button2 = findViewById(R.id.view_data);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, INSERTDATA.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                           Intent intent = new Intent(MainActivity.this, VIEWDATA.class);
                           startActivity(intent);
            }

        });

    }


}

