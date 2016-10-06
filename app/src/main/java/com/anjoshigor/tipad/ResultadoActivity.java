package com.anjoshigor.tipad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView nota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        nota = (TextView) findViewById(R.id.nota);
        String notaRecebida = getIntent().getStringExtra("nota");
        nota.setText(notaRecebida);
    }
}
