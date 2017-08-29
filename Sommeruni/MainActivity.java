package com.example.k0027968.bikelightapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//

public class MainActivity extends Rechner{
    char op;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*public String feldAuslesen(){
        EditText zahl1 = (EditText) findViewById(R.id.editText);
        return zahl1.getText().toString();
    }*/
/*    public void add(View v){
        //Zahl 1 wird eingelesen
            EditText zahl1 = (EditText) findViewById(R.id.editText);
            String s1 = zahl1.getText().toString();
            Integer nr = Integer.parseInt(s1);

            //Zahl 2 wird eingelesen
            EditText zahl2 = (EditText) findViewById(R.id.editText2);
            s1 = zahl2.getText().toString();
            Integer nr2 = Integer.parseInt(s1);

            Integer ergebnis = nr + nr2;
            TextView ausgabe = (TextView) findViewById(R.id.Ergebnis);
            ausgabe.setText("Ergebnis:\n" + nr + " + " + nr2 + " = " + ergebnis);
    }
    public void mult(View v){
        try {
            EditText zahl1 = (EditText) findViewById(R.id.editText);
            String s1 = zahl1.getText().toString();
            Integer nr = Integer.parseInt(s1);

            //Zahl 2 wird eingelesen
            EditText zahl2 = (EditText) findViewById(R.id.editText2);
            s1 = zahl2.getText().toString();
            Integer nr2 = Integer.parseInt(s1);

            Integer ergebnis = nr * nr2;
            TextView ausgabe = (TextView) findViewById(R.id.Ergebnis);
            ausgabe.setText("Ergebnis:\n" + nr + " * " + nr2 + " = " + ergebnis);
        }
        catch (Exception e){
            Toast.makeText(this, "Bitte nur ganze Zahlen eingeben\n" + e, Toast.LENGTH_LONG).show();
        }
    }*/
}
