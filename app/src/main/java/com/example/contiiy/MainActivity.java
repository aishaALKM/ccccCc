package com.example.contiiy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton a = findViewById(R.id.imageButton10);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(o);
            }
        });

        ImageButton b = findViewById(R.id.imageButton11);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent op = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(op);
            }
        });

        ImageButton c = findViewById(R.id.imageButton12);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ope = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(ope);
            }
        });
        ImageButton d = findViewById(R.id.imageButton13);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(MainActivity.this, MainActivity6.class);
                startActivity(open);
            }
        });

        ImageButton e = findViewById(R.id.imageButton14);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open1 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(open1);
            }
        });

    }


}