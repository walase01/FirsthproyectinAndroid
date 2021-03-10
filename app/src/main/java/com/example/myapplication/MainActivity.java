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

        Entrada1 = findViewById(R.id.editTextNumber6);
        Entrada2 = findViewById(R.id.editTextNumber5);
        Entrada3 = findViewById(R.id.editTextNumber4);
    }

    public void Sumar_click(View num){
        int valor1 = Integer.parseInt(Entrada1.getText().toString());
        int valor2 = Integer.parseInt(Entrada2.getText().toString());
        int resultado =  valor1 + valor2 ;
        Entrada3.setText("La suma es igual a " + Integer.toString(resultado));

    }
    public void Resta_click(View num){

        int valor1 = Integer.parseInt(Entrada1.getText().toString());
        int valor2 = Integer.parseInt(Entrada2.getText().toString());
        int resultado =  valor1 - valor2 ;
        Entrada3.setText("La resta es igual a " + Integer.toString(resultado));

    }
    public void Multiplicacion_click(View num){

        int valor1 = Integer.parseInt(Entrada1.getText().toString());
        int valor2 = Integer.parseInt(Entrada2.getText().toString());
        int resultado =  valor1 * valor2 ;
        Entrada3.setText("La multiplicacion es igual a " + Integer.toString(resultado));
    }
    public void Division_click(View num){

        float valor1 = Integer.parseInt(Entrada1.getText().toString());
        float valor2 = Integer.parseInt(Entrada2.getText().toString());
        float resultado =  valor1 / valor2 ;
        Entrada3.setText("La divicion es igual a " + resultado);
    }
    public void Limpiar_click(View num){

        Entrada1.setText("");
        Entrada2.setText("");
        Entrada3.setText("");
    }
}