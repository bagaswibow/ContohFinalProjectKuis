package com.example.bagaswibowo.contohfinalprojectkuis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mlinePilGan = (LinearLayout) findViewById(R.id.linePilGan);
        LinearLayout mlineEssay  = (LinearLayout) findViewById(R.id.LineEssay);
        mlinePilGan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,KuisPilihanGanda.class);
                startActivity(i);
            }
        });
        mlineEssay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,KuisEssay.class);
                startActivity(i);
            }
        });
    }
}
