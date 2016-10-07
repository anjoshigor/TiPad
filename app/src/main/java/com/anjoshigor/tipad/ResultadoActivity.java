package com.anjoshigor.tipad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ResultadoActivity extends AppCompatActivity {

    TextView nota;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        nota = (TextView) findViewById(R.id.nota);
        String notaRecebida = getIntent().getStringExtra("nota");
        nota.setText(notaRecebida);
        intent = new Intent(getBaseContext(), MainActivity.class);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getBaseContext(), "Aperte para jogar novamente", Toast.LENGTH_SHORT).show();
    }

    public void jogarNovamente(View v){
        startActivity(intent);
    }
}
