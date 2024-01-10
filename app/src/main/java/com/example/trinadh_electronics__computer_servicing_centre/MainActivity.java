package com.example.trinadh_electronics__computer_servicing_centre;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button3);
        button1 = findViewById(R.id.button4);

        button.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent intent=new Intent(MainActivity.this,INSERTDATA.class);

                startActivity(intent);

            }
        });
button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,VIEWDATA.class);

        startActivity(intent);
    }
});

    }
}