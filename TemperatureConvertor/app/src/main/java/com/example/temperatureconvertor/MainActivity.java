package com.example.temperatureconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2,r;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.c);
        n2=findViewById(R.id.f);
        r=findViewById(R.id.res);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double w=Double.parseDouble(String.valueOf(n1.getText()));
                double w1=(w*(9.0/5.0))+32.0;
                r.setText(String.valueOf(w1));



            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a=Double.parseDouble(String.valueOf(n2.getText()));
                double b=(a-32.0)*(5.0/9.0);
                r.setText(String.valueOf(b));

            }
        });
    }
}