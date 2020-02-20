package com.example.qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private Button buttonElso, buttonMasodik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        buttonElso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGenerate = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intentGenerate);
                finish();
            }
        });
        buttonMasodik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentScan = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intentScan);
                finish();
            }
        });
    }




    public void init()
    {
        buttonElso = findViewById(R.id.buttonElso);
        buttonMasodik = findViewById(R.id.buttonMasodik);
    }
}
