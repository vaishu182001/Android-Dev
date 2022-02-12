package com.example.truthtableops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2,res;
    Button b1,b2,b3,b4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.b1);
        n2=findViewById(R.id.b2);
        res=findViewById(R.id.r);
        b1=findViewById(R.id.and);
        b2=findViewById(R.id.or);
        b3=findViewById(R.id.nor);
        b4=findViewById(R.id.nand);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(String.valueOf(n1.getText()));
                int b=Integer.parseInt(String.valueOf(n2.getText()));
                int c=a*b;
                res.setText(String.valueOf(c));


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(String.valueOf(n1.getText()));
                int b=Integer.parseInt(String.valueOf(n2.getText()));
                int c=a+b;
                if(c==2)
                res.setText(String.valueOf(1));
                else
                    res.setText(String.valueOf(c));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(String.valueOf(n1.getText()));
                int b=Integer.parseInt(String.valueOf(n2.getText()));
                int c=a+b;
                if(c==1 || c==2)
                {
                    res.setText(String.valueOf(0));
                }
                else
                {
                    res.setText(String.valueOf(1));
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(String.valueOf(n1.getText()));
                int b=Integer.parseInt(String.valueOf(n2.getText()));
                int c=a*b;
                if(c==1)
                {
                    res.setText(String.valueOf(0));
                }
                else
                {
                    res.setText(String.valueOf(1));
                }
            }

            
        });

    }
}