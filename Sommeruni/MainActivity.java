package com.example.k0027968.bikelightapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonFunk(View v){
        //Zahl 1 wird eingelesen
        EditText zahl1 = (EditText) findViewById(R.id.editText);
        String s1 = zahl1.getText().toString();
        Integer nr = Integer.parseInt(s1);

        //Zahl 2 wird eingelesen
        EditText zahl2 = (EditText) findViewById(R.id.editText2);
        s1 = zahl2.getText().toString();
        Integer nr2 = Integer.parseInt(s1);

        Integer ergebnis = nr + nr2;
        String lösung = String.valueOf(ergebnis);
        TextView ausgabe = (TextView) findViewById(R.id.Ergebnis);
        ausgabe.setText("" + nr + "+" + nr2 + "=" + lösung);
    }
}
