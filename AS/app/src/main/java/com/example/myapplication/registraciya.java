package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registraciya extends AppCompatActivity {
    androidx.appcompat.widget.AppCompatButton regitaciay_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registraciya);
        regitaciay_2 = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.regitaciay_2);
        regitaciay_2.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View v){
        switch (v. getId()){
            case R.id.regitaciay_2:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}