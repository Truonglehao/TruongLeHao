package edu.csc.truonglehao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView so1, so2, so3, so4, so5;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        so1 = findViewById(R.id.so1);
        so2 = findViewById(R.id.so2);
        so3 = findViewById(R.id.so3);
        so4 = findViewById(R.id.so4);
        so5 = findViewById(R.id.so5);

        so1.setOnClickListener(v -> {
            i = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(i);

        });
        so2.setOnClickListener(v -> {
            i = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(i);

        });
        so3.setOnClickListener(v -> {
            i = new Intent(MainActivity.this, MainActivity4.class);
            startActivity(i);

        });
        so4.setOnClickListener(v -> {
            i = new Intent(MainActivity.this, MainActivity5.class);
            startActivity(i);

        });
        so5.setOnClickListener(v -> {
            i = new Intent(MainActivity.this, MainActivity6.class);
            startActivity(i);
        });
    }
    public void xuLyThoat(View view) {
        finish();
    }
}
