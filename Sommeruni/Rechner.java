package com.example.k0027968.bikelightapp;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


/**
 * Created by k0027968 on 29.08.2017.
 */

class Rechner extends AppCompatActivity {
    String eingabe = "";
    public void butEingabe(View v){
        eingabe += v.getTag();
        EditText zahl1 = (EditText) findViewById(R.id.editText);
        zahl1.setText(eingabe);
    }
    public void asuwertung(View v){
        int opIndex = 0;
        double x, y, z;

        EditText zahl1 = (EditText) findViewById(R.id.editText)
        eingabe = "" + zahl1.getText();

        switch(eingabe.contains())
    }
}
