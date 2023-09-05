package com.example.misoperaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    Button btnIngresar;
    EditText et1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIngresar = findViewById(R.id.bt1);
        et1 = findViewById(R.id.txt1);


    }

    public void ingresar(View view) {

        int proceso = Integer.parseInt(et1.getText().toString());

        if (proceso == 1){
            Intent pasar = new Intent(MainActivity.this, Multiplicacion.class);
            startActivity(pasar);
        }
        else if (proceso == 2){
            Intent pasar = new Intent(MainActivity.this,potencia.class);
            startActivity(pasar);
        }
        else if (proceso == 3){
            Intent pasar = new Intent(MainActivity.this,Finobacci.class);
            startActivity(pasar);
        }
        else if (proceso == 4){
            Intent pasar = new Intent(MainActivity.this, division.class);
            startActivity(pasar);
        }



        }


    }
