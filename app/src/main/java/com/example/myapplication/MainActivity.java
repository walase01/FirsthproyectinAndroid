package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        EditText Entrada1;
        EditText Entrada2;
        EditText Entrada3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Entrada1 = findViewById(R.id.editTextNumber4);
        Entrada2 = findViewById(R.id.editTextNumber5);
        Entrada3 = findViewById(R.id.editTextNumber6);
    }

    public void Sumar_click(View num){

            Entrada3.setText(Integer.parseInt(Entrada1.toString()) + Integer.parseInt(Entrada2.toString()));

    }
    public void Resta_click(View num){

        Entrada3.setText(Integer.parseInt(Entrada1.toString()) - Integer.parseInt(Entrada2.toString()));

    }
    public void Multiplicacion_click(View num){

        Entrada3.setText(Integer.parseInt(Entrada1.toString()) * Integer.parseInt(Entrada2.toString()));
    }
    public void Division_click(View num){

        Entrada3.setText(Integer.parseInt(Entrada1.toString()) / Integer.parseInt(Entrada2.toString()));
    }
    public void Limpiar_click(View num){

        Entrada1.setText("");
        Entrada2.setText("");
        Entrada3.setText("");
    }
}