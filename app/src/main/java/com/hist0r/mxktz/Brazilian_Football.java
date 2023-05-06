package com.hist0r.mxktz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Brazilian_Football extends AppCompatActivity {
    ImageButton BackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazilian_football);

        BackBtn = findViewById(R.id.backbtn);

        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Brazilian_Football.this,Histor.class));
                finish();
            }
        });
    }
}