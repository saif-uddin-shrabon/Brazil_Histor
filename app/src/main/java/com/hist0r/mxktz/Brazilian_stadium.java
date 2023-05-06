package com.hist0r.mxktz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowMetrics;
import android.widget.ImageButton;




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
                finish();
            }
        });




    }


}