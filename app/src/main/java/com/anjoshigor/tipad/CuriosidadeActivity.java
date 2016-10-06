package com.anjoshigor.tipad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CuriosidadeActivity extends AppCompatActivity {
    TextView curTextView;
    String assunto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curiosidade);
        assunto = getIntent().getStringExtra("assunto");
        setTitle("Curiosidades sobre "+assunto);
        curTextView = (TextView) findViewById(R.id.curTextView);
        curTextView.setText(switchAssunto(assunto));
    }

    private String switchAssunto(String assunto){
        String text = new String();

        switch (assunto){
            case "Pâncreas":
                text = getResources().getString(R.string.curPancreas);
            break;

            case "Hipófise/Hipotálamo":
                text = getResources().getString(R.string.curHipot);
            break;

            case "Glândula Adrenal":
                text = getResources().getString(R.string.curAdrenal);
            break;

            case "Tireóide":
                text = getResources().getString(R.string.curTireoide);
            break;

            default:
            break;
        }

        return text;
    }
}
