package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text1;
    EditText text2;
    androidx.appcompat.widget.AppCompatButton input;
    androidx.appcompat.widget.AppCompatButton registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input.setOnClickListener(view -> {
            Intent sign = new Intent(MainActivity.this, MainCabinet.class);
            MainActivity.this.startActivity(sign);
            MainActivity.this.finish();
            if (text1 != null && text2 != null) {
                Intent cab = new Intent(MainActivity.this, MainCabinet.class);
                MainActivity.this.startActivity(cab);
                MainActivity.this.finish();

            }
        });
        registration = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.registration);
        registration.setOnClickListener((View.OnClickListener) this);
    }
    public static boolean checkSmth(int n)
    {
        if(n > 5)
            return true;
        else
            return false;
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.registration:
                Intent intent = new Intent(this, registraciya.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}


