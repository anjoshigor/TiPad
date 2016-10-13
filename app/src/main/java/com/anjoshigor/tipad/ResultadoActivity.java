package com.anjoshigor.tipad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ResultadoActivity extends AppCompatActivity {

    TextView nota;
    Intent intent, intentPerguntas;
    String assunto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        nota = (TextView) findViewById(R.id.nota);
        String notaRecebida = getIntent().getStringExtra("nota");
        assunto = getIntent().getStringExtra("assunto");
        nota.setText(notaRecebida);
        intent = new Intent(getBaseContext(), MainActivity.class);
        intentPerguntas = new Intent(getBaseContext(), PerguntasActivity.class);
    }

    @Override
    public void onBackPressed() {
        startActivity(intent);
    }

    public void jogarNovamente(View v){
        intentPerguntas.putExtra("assunto", assunto);
        startActivity(intentPerguntas);
    }
}
