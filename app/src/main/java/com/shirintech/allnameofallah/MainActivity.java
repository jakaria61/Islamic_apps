package com.shirintech.allnameofallah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView name,duya,amols,khalifa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        duya = findViewById(R.id.duya);
        amols=findViewById(R.id.amols);
        khalifa=findViewById(R.id.khalifa);

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(MainActivity.this,second.class);
                startActivity(myIntent);
            }
        });
        duya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent =new Intent(MainActivity.this,third.class);
                startActivity(myIntent);
            }
        });
amols.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent amolIntent=new Intent(MainActivity.this,allamol.class);
        startActivity(amolIntent);
    }
});
khalifa.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent myIntent =new Intent(MainActivity.this,fifth.class);
        startActivity(myIntent);
    }
});
    }
}