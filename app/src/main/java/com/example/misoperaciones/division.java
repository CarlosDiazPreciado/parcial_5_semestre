package com.example.misoperaciones;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class division extends AppCompatActivity implements View.OnClickListener{


    EditText et1, et2;
    EditText tv1;
    Button boton1, boton2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        et1 = (EditText) findViewById(R.id.texto11);
        et2 = (EditText) findViewById(R.id.text21);
        tv1 = (EditText) findViewById(R.id.vista11);

        boton1 = (Button) findViewById(R.id.boton11);
        boton1.setOnClickListener(this);

        boton2 = (Button) findViewById(R.id.boton20);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Devolver = new Intent(division.this, MainActivity.class);
                startActivity(Devolver);
            }
        });
    }



    @Override
    public void onClick(View view) {
        int n1, n2, resultado;
        n1 = Integer.parseInt((et1.getText().toString()));
        n2 = Integer.parseInt((et2.getText().toString()));
        resultado = n1 / n2;
        tv1.setText(String.valueOf(resultado));
    }

    public int onClick(int n1, int n2) {
        n1 = Integer.parseInt((et1.getText().toString()));
        n2 = Integer.parseInt((et2.getText().toString()));
        return n1 / n2;

    }


}

