package com.example.palindromo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    char palabra;
    String  palabra2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText text = (EditText) findViewById(R.id.text);
        final TextView palindromo = (TextView) findViewById(R.id.palindromo);
        final TextView longitud = (TextView) findViewById(R.id.longitud);
        final TextView inversa = (TextView) findViewById(R.id.inversa);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(){


    }


        public void palindromo(){

    }

    public void palabra(){

    }


}




