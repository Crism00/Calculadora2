package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {
    TextView resultado,miniatura;
    public float N1 = 0;
    public float N2 = 0;
    float res = 0;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado = findViewById(R.id.resultado);
        miniatura = findViewById(R.id.miniatura);
        Button cero = findViewById(R.id.cero);
        Button eliminar = findViewById(R.id.eliminar);
        Button punto = findViewById(R.id.punto);
        Button uno = findViewById(R.id.uno);
        Button dos = findViewById(R.id.dos);
        Button tres = findViewById(R.id.tres);
        Button cuatro = findViewById(R.id.cuatro);
        Button cinco = findViewById(R.id.cinco);
        Button seis = findViewById(R.id.seis);
        Button siete = findViewById(R.id.siete);
        Button ocho = findViewById(R.id.ocho);
        Button nueve = findViewById(R.id.nieve);
        Button limpiar = findViewById(R.id.borrar);
        Button restar = findViewById(R.id.resta);
        Button multiplicar = findViewById(R.id.multiplicar);
        Button dividir = findViewById(R.id.division);
        Button sumar = findViewById(R.id.sumar);

        Button mostraResultado = findViewById(R.id.igual);
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultado.getText().toString().equals("0")) {
                    resultado.setText("0");
                }
                Toast.makeText(getApplicationContext(), "Ingresa un numero!", Toast.LENGTH_LONG).show();
            }
        });
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultado.getText().toString().equals("0")) {
                    resultado.setText("0.");
                } else {
                    resultado.setText(resultado.getText() + ".");
                }
            }
        });
        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = resultado.getText().toString();
                resultado.setText(text.substring(0, text.length() - 1));
            }
        });
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultado.getText().toString().equals("0")) {
                    resultado.setText("1");
                } else {
                    resultado.setText(resultado.getText() + "1");
                }
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultado.getText().toString().equals("0")) {
                    resultado.setText("2");
                } else {
                    resultado.setText(resultado.getText() + "2");
                }
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultado.getText().toString().equals("0")) {
                    resultado.setText("3");
                } else {
                    resultado.setText(resultado.getText() + "3");
                }
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultado.getText().toString().equals("0")) {
                    resultado.setText("4");
                } else {
                    resultado.setText(resultado.getText() + "4");
                }
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultado.getText().toString().equals("0")) {
                    resultado.setText("5");
                } else {
                    resultado.setText(resultado.getText() + "5");
                }
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultado.getText().toString().equals("0")) {
                    resultado.setText("6");
                } else {
                    resultado.setText(resultado.getText() + "6");
                }
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultado.getText().toString().equals("0")) {
                    resultado.setText("7");
                } else {
                    resultado.setText(resultado.getText() + "7");
                }
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultado.getText().toString().equals("0")) {
                    resultado.setText("8");
                } else {
                    resultado.setText(resultado.getText() + "8");
                }
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultado.getText().toString().equals("0")) {
                    resultado.setText("9");
                } else {
                    resultado.setText(resultado.getText() + "9");
                }
            }
        });
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado.getText().toString()!="0") {
                    N1 = Float.parseFloat(resultado.getText().toString());
                    resultado.setText("0");
                    miniatura.setText("" + N1);
                    operacion = "+";
                }
                else {
                    Toast.makeText(getApplicationContext(), "Ingresa un numero!", Toast.LENGTH_LONG).show();
                }
            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado.getText().toString()!="0") {
                N1 = Float.parseFloat(resultado.getText().toString());
                resultado.setText("0");
                miniatura.setText(""+N1);
                operacion = "-";
                }
                else {
                    Toast.makeText(getApplicationContext(), "Ingresa un numero!", Toast.LENGTH_LONG).show();
                }
            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultado.getText().toString() != "0") {
                    N1 = Float.parseFloat(resultado.getText().toString());
                    resultado.setText("0");
                    miniatura.setText("" + N1);
                    operacion = "*";
                } else {
                    Toast.makeText(getApplicationContext(), "Ingresa un numero!", Toast.LENGTH_LONG).show();
                }
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado.getText().toString()!="0") {
                N1 = Float.parseFloat(resultado.getText().toString());
                resultado.setText("0");
                miniatura.setText(""+N1);
                operacion = "/";
                } else {
                    Toast.makeText(getApplicationContext(), "Ingresa un numero!", Toast.LENGTH_LONG).show();
                }
            }
        });
        mostraResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion == "+") {
                    N2 = Float.parseFloat(resultado.getText().toString());
                    res = N1 + N2;
                    resultado.setText("" + res);
                } else if (operacion == "-") {
                    N2 = Float.parseFloat(resultado.getText().toString());
                    res = N1 - N2;
                    resultado.setText("" + res);
                } else if (operacion == "*") {
                    N2 = Float.parseFloat(resultado.getText().toString());
                    res = N1 * N2;
                    resultado.setText("" + res);
                } else if(operacion == "/"){
                        N2 = Float.parseFloat(resultado.getText().toString());
                        res = N1 / N2;
                        resultado.setText("" + res);
                }
                else {
                    Toast.makeText(getApplicationContext(), "No se puede procesar ningun dato!", Toast.LENGTH_LONG).show();
                }
                miniatura.setText(""+res);
            }
        });
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                N1 = 0;
                N2 = 0;
                operacion = "";
                res = 0;
                resultado.setText("0");
            }
        });
    }
}