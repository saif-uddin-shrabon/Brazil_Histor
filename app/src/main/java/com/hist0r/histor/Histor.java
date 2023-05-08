package com.hist0r.histor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;


public class Histor extends AppCompatActivity {

    Button BrazilFootballBtn, BrazilStadiumBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_histor);

        BrazilFootballBtn = findViewById(R.id.bf);
        BrazilStadiumBtn = findViewById(R.id.bs);

        BrazilFootballBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Histor.this,Brazilian_Football.class));
                Animatoo.INSTANCE.animateInAndOut(Histor.this);
                finish();
            }
        });

        BrazilStadiumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Histor.this,Brazilian_stadium.class));
                Animatoo.INSTANCE.animateCard(Histor.this);
                finish();
            }
        });


    }
}