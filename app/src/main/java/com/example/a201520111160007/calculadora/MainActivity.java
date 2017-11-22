package com.example.a201520111160007.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private Button zero;
    private Button um;
    private Button dois;
    private Button tres;
    private Button quatro;
    private Button cinco;
    private Button seis;
    private Button sete;
    private Button oito ;
    private Button nove;
    private Button div;
    private Button mul;
    private Button soma;
    private Button sub;
    private Button igual;
    private Button limpar;

    private final char ADICAO = '+';
    private final char SUBTRACAO = '-';
    private final char DIVISAO = '/';
    private final char MULTIPLICACAO = '*';
    private final char IGUAL = 0;

    private char Acao;


    private TextView resultado;
    private TextView info;

    private double val1 = Double.NaN;
    private double val2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");

            }
        });
        um.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");

            }
        });
        dois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");

            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");

            }
        });
        quatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");

            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");

            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");

            }
        });
        sete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");

            }
        });
        oito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");

            }
        });
        nove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");

            }
        });

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Acao = ADICAO;
                resultado.setText(String.valueOf(val1) + "+");
                info.setText(null);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Acao = SUBTRACAO;
                resultado.setText(String.valueOf(val1) + "-");
                info.setText(null);

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Acao = MULTIPLICACAO;
                resultado.setText(String.valueOf(val1) + "*");
                info.setText(null);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Acao = DIVISAO;
                resultado.setText(String.valueOf(val1) + "/");
                info.setText(null);

            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Acao = IGUAL;
                resultado.setText(resultado.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));

                info.setText(null);

            }
        });

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (info.getText().length() > 0) {
                    CharSequence name = info.getText(). toString();
                    info.setText(name.subSequence(0 , name.length() -1));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    resultado.setText(null);
                }
            }

        });

    }

    private void setupUIViews (){

        zero = (Button) findViewById(R.id.btn0);
        um = (Button) findViewById(R.id.btn1);
        dois = (Button) findViewById(R.id.btn2);
        tres = (Button) findViewById(R.id.btn3);
        quatro = (Button) findViewById(R.id.btn4);
        cinco = (Button) findViewById(R.id.btn5);
        seis = (Button) findViewById(R.id.btn6);
        sete = (Button) findViewById(R.id.btn7);
        oito = (Button) findViewById(R.id.btn8);
        nove = (Button) findViewById(R.id.btn9);
        soma = (Button) findViewById(R.id.btnsoma);
        div = (Button) findViewById(R.id.btndiv);
        mul = (Button) findViewById(R.id.btnmult);
        sub = (Button) findViewById(R.id.btnsubt);
        igual = (Button) findViewById(R.id.btnigual);
        limpar = (Button)findViewById(R.id.btnlimpar);

        info = (TextView) findViewById(R.id.tvInfo);
        resultado = (TextView) findViewById(R.id.tvResultado);

        
    }

    private void compute (){
        if (!Double.isNaN(val1)){
            val2 = Double.parseDouble(info.getText().toString());

            switch (Acao) {
                case ADICAO :
                    val1 = val1 + val2;
                    break;
                case SUBTRACAO :
                    val1 = val1 - val2;
                    break;
                case MULTIPLICACAO :
                    val1 = val1 * val2;
                    break;
                case DIVISAO :
                    val1 = val1 / val2;
                    break;
                case IGUAL:
                    break;
            }
        }

        else{
            val1 = Double.parseDouble(info.getText().toString());
        }
    }

}

