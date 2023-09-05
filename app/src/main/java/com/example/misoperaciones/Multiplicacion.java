package com.example.misoperaciones;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Multiplicacion extends AppCompatActivity implements View.OnClickListener {

    EditText et1, et2;
    EditText tv1;
    Button boton1, bt2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);
        et1 = (EditText) findViewById(R.id.texto1);
        et2 = (EditText) findViewById(R.id.texto2);
        tv1 = (EditText) findViewById(R.id.vista1);

        boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(this);

        bt2 = (Button) findViewById(R.id.btnmenu3);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Devolver = new Intent(Multiplicacion.this, MainActivity.class);
                startActivity(Devolver);
            }
        });


    }

    @Override
    public void onClick(View view) {
        int n1, n2, resultado;
        n1 = Integer.parseInt((et1.getText().toString()));
        n2 = Integer.parseInt((et2.getText().toString()));
        resultado = n1 * n2;
        tv1.setText(String.valueOf(resultado));
    }


    public int onClick(int n1, int n2) {
        n1 = Integer.parseInt((et1.getText().toString()));
        n2 = Integer.parseInt((et2.getText().toString()));
        return n1 * n2;
    }
}


