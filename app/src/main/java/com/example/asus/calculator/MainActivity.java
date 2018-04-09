package com.example.asus.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText number1,number2;
    Button sum,min,div,mult;

    float res;
    int n1,n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(TextView)findViewById(R.id.result);
        number1=(EditText)findViewById(R.id.number1);
        number2=(EditText)findViewById(R.id.number2);
        sum=(Button)findViewById(R.id.sum);
        min=(Button)findViewById(R.id.min);
        mult=(Button)findViewById(R.id.mult);
        div=(Button)findViewById(R.id.div);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt( number1.getText().toString());
                n2=Integer.parseInt( number2.getText().toString());
                res=n1+n2;
                result.setText(String.valueOf(res));
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt( number1.getText().toString());
                n2=Integer.parseInt( number2.getText().toString());
                res=n1-n2;
                result.setText(String.valueOf(res));
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt( number1.getText().toString());
                n2=Integer.parseInt( number2.getText().toString());
                res=n1*n2;
                result.setText(String.valueOf(res));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt( number1.getText().toString());
                n2=Integer.parseInt( number2.getText().toString());
                res=n1/n2;
                result.setText(String.valueOf(res));
            }
        });


    }
}
