package com.example.trinadh_electronics__computer_servicing_centre;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
 ImageButton imageButton;
 ImageButton imageButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
imageButton = (ImageButton) findViewById(R.id.insertdata);
imageButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, INSERTDATA.class);
    }
});
 imageButton1 = (ImageButton) findViewById(R.id.viewdata);
 imageButton1.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Intent intent = new Intent(MainActivity.this, VIEWDATA.class);
     }
 });
    }
}