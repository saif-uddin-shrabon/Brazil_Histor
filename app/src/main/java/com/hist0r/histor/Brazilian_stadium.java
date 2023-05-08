package com.hist0r.histor;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;


public class Brazilian_stadium extends AppCompatActivity {
    ImageButton BackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazilian_stadium);


        BackBtn = findViewById(R.id.backbtn2);
        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Brazilian_stadium.this,Histor.class));
                Animatoo.INSTANCE.animateSlideLeft(Brazilian_stadium.this);
                finish();
            }
        });

        Brazilian_stadium.this.getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {

                startActivity(new Intent(Brazilian_stadium.this,Histor.class));
                Animatoo.INSTANCE.animateSlideRight(Brazilian_stadium.this);
                finish();

            }
        });



    }


}