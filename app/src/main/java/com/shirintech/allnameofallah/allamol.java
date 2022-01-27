package com.shirintech.allnameofallah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class allamol extends AppCompatActivity {
        TextView rogmuktiramol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allamol_activity);
        rogmuktiramol = findViewById(R.id.rogmuktiramol);

        rogmuktiramol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rogIntent=new Intent(allamol.this,rogmukti.class);
                startActivity(rogIntent);
            }
        });

    }
}