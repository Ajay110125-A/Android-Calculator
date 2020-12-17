package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/*import android.annotation.SuppressLint;*/

public class MainActivity extends AppCompatActivity {
    public EditText T1,T2, T3;
    public Button B1,B2,B3,B4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1 = findViewById(R.id.edt1);
        T2 = findViewById(R.id.edt2);
        T3 = findViewById(R.id.edt3);
        B1 = findViewById(R.id.b1);
        B2 = findViewById(R.id.b2);
        B3 = findViewById(R.id.b3);
        B4 = findViewById(R.id.b4);
    }


    public void Add(View view)
    {
        String tx1 = T1.getText().toString();
        String tx2 = T2.getText().toString();
        int x = (Integer.parseInt(tx1)) + (Integer.parseInt(tx2));
        String s = Integer.toString(x);
        T3.setText(s);
        Toast.makeText(getApplicationContext(),"Output = "+s,Toast.LENGTH_SHORT).show();

    }

    public void Sub(View view)
    {
        String tx1 = T1.getText().toString();
        String tx2 = T2.getText().toString();
        int x = (Integer.parseInt(tx1)) - (Integer.parseInt(tx2));
        String s = Integer.toString(x);
        T3.setText(s);
        Toast.makeText(getApplicationContext(),"Output = "+s,Toast.LENGTH_SHORT).show();    }

    public void Mul(View view)
    {
        String tx1 = T1.getText().toString();
        String tx2 = T2.getText().toString();
        int x = (Integer.parseInt(tx1)) * (Integer.parseInt(tx2));
        String s = Integer.toString(x);
        T3.setText(s);
        Toast.makeText(getApplicationContext(),"Output = "+s,Toast.LENGTH_SHORT).show();    }

    public void Div(View view)
    {
        String tx1 = T1.getText().toString();
        String tx2 = T2.getText().toString();
        int x = (Integer.parseInt(tx1)) / (Integer.parseInt(tx2));
        String s = Integer.toString(x);
        T3.setText(s);
        Toast.makeText(getApplicationContext(),"Output = "+s,Toast.LENGTH_SHORT).show();    }

    public void Mod(View view)
    {
        String tx1 = T1.getText().toString();
        String tx2 = T2.getText().toString();
        int x = (Integer.parseInt(tx1)) % (Integer.parseInt(tx2));
        String s = Integer.toString(x);
        T3.setText(s);
        Toast.makeText(getApplicationContext(), "Output = "+s, Toast.LENGTH_SHORT).show();
    }
}