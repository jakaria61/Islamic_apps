package com.shirintech.allnameofallah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class third extends AppCompatActivity {
            TextView fathiha,ikhlas,nas,falak,kafirun,nasor,kausar,maun,kurais,fill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
        fathiha=findViewById(R.id.fatiha);
        ikhlas=findViewById(R.id.ikhlas);
        nas = findViewById(R.id.nas);
        falak =findViewById(R.id.falak);
        kafirun=findViewById(R.id.kafirun);
        nasor=findViewById(R.id.nasor);
        kausar=findViewById(R.id.kausar);
        maun=findViewById(R.id.maun);
        kurais=findViewById(R.id.kurais);
        fill=findViewById(R.id.fill);



        fathiha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent =new Intent(third.this,fourth.class);
                startActivity(myIntent);
            }
        });
        ikhlas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent= new Intent(third.this,ikhlas.class);
                startActivity(myIntent);
            }
        });
        nas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent= new Intent(third.this,nas.class);
                startActivity(myIntent);
            }
        });
        falak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent= new Intent(third.this,falak.class);
                startActivity(myIntent);
            }
        });
        kafirun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent= new Intent(third.this,kafirun.class);
                startActivity(myIntent);
            }
        });
        nasor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent= new Intent(third.this,nasor.class);
                startActivity(myIntent);
            }
        });
        kausar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent= new Intent(third.this,kausar.class);
                startActivity(myIntent);
            }
        });
        maun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent= new Intent(third.this,maun.class);
                startActivity(myIntent);
            }
        });
        kurais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent= new Intent(third.this,kurais.class);
                startActivity(myIntent);
            }
        });
        fill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent= new Intent(third.this,fill.class);
                startActivity(myIntent);
            }
        });
    }
}