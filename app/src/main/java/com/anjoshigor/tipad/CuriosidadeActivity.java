package com.anjoshigor.tipad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CuriosidadeActivity extends AppCompatActivity {
    static TextView curTextView, doenca1, doenca2, tituloDoenca1, tituloDoenca2;
    String assunto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curiosidade);
        assunto = getIntent().getStringExtra("assunto");
        setTitle("Curiosidades sobre "+assunto);
        curTextView = (TextView) findViewById(R.id.introTextView);
        doenca1 = (TextView) findViewById(R.id.doencaTextView1);
        doenca2 = (TextView) findViewById(R.id.doencaTextView2);
        tituloDoenca1 = (TextView) findViewById(R.id.doencaTituloTextView1);
        tituloDoenca2 = (TextView) findViewById(R.id.doencaTituloTextView2);

        updateViews(assunto);
    }

    private void updateViews(String assunto) {
        switch (assunto) {
            case "Pâncreas":
                curTextView.setText(getResources().getText(R.string.introPancreas));
                doenca1.setText(getResources().getText(R.string.doencaPancreas1));
                doenca2.setText(this.getText(R.string.doencaPancreas2));
                tituloDoenca1.setText(getResources().getText(R.string.tDoencaPancreas1));
                tituloDoenca2.setText(getResources().getText(R.string.tDoencaPancreas2));
                break;

            case "Hipófise/Hipotálamo":
                curTextView.setText(getResources().getText(R.string.introHipot));
                doenca1.setText(getResources().getText(R.string.doencaHipot1));
                doenca2.setText(getResources().getText(R.string.doencaHipot2));
                tituloDoenca1.setText(getResources().getText(R.string.tDoencaHipot1));
                tituloDoenca2.setText(getResources().getText(R.string.tDoencaHipot2));
                break;

            case "Glândula Adrenal":
                curTextView.setText(getResources().getText(R.string.introAdrenal));
                doenca1.setText(getResources().getText(R.string.doencaAdrenal1));
                doenca2.setText(getResources().getText(R.string.doencaAdrenal2));
                tituloDoenca1.setText(getResources().getText(R.string.tDoencaAdrenal1));
                tituloDoenca2.setText(getResources().getText(R.string.tDoencaAdrenal2));
                break;

            case "Tireóide":
                curTextView.setText(getResources().getText(R.string.introTireoide));
                doenca1.setText(getResources().getText(R.string.doencaTireoide1));
                doenca2.setText(getResources().getText(R.string.doencaTireoide2));
                tituloDoenca1.setText(getResources().getText(R.string.tDoencaTireoide1));
                tituloDoenca2.setText(getResources().getText(R.string.tDoencaTireoide2));
                break;

            default:
                break;

        }

    }
}
