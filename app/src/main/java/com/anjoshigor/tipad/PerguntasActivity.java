package com.anjoshigor.tipad;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PerguntasActivity extends AppCompatActivity {


    ArrayList<TextView> textViews;
    ArrayList<CheckBox> checkBoxes;
    ArrayList<LinearLayout> cards;
    ArrayList<Boolean> flags;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_perguntas);
        textViews = new ArrayList<>(4);
        checkBoxes = new ArrayList<>(4);
        cards = new ArrayList<>(4);
        flags = new ArrayList<>(4);
        bindViews();

    }

    private void resetFlags(){
        flags.set(0,false);
        flags.set(1,false);
        flags.set(2,false);
        flags.set(3,false);
    }
    private void bindViews(){
        textViews.add((TextView) findViewById(R.id.resposta1));
        textViews.add((TextView) findViewById(R.id.resposta2));
        textViews.add((TextView) findViewById(R.id.resposta3));
        textViews.add((TextView) findViewById(R.id.resposta4));
        checkBoxes.add((CheckBox) findViewById(R.id.checkbox1));
        checkBoxes.add((CheckBox) findViewById(R.id.checkbox2));
        checkBoxes.add((CheckBox) findViewById(R.id.checkbox3));
        checkBoxes.add((CheckBox) findViewById(R.id.checkbox4));
        cards.add((LinearLayout) findViewById(R.id.card1));
        cards.add((LinearLayout) findViewById(R.id.card2));
        cards.add((LinearLayout) findViewById(R.id.card3));
        cards.add((LinearLayout) findViewById(R.id.card4));
        flags.add(false); flags.add(false); flags.add(false); flags.add(false);

    }

    private void resetCard(int i){
        if(i>=0) {
            cards.get(i).setBackgroundColor(getResources().getColor(R.color.divider));
            textViews.get(i).setTextColor(getResources().getColor(R.color.primary_text));
            checkBoxes.get(i).setChecked(false);
            checkBoxes.get(i).setBackgroundColor(getResources().getColor(R.color.divider));
            flags.set(i, false);
        }
    }

    public void responder1(View v) {
        if (!flags.get(0)) {
            cards.get(0).setBackgroundColor(getResources().getColor(R.color.accent));
            textViews.get(0).setTextColor(getResources().getColor(R.color.icons));
            checkBoxes.get(0).setChecked(true);
            checkBoxes.get(0).setBackgroundColor(getResources().getColor(R.color.icons));
            int i = flags.indexOf(true);
            resetCard(i);
            Log.i("PERGUNTAS ACTIVITY",String.valueOf(i));
            flags.set(0,true);

        } else {
            resetCard(0);
        }
    }

    public void responder2(View v) {
        if (!flags.get(1)) {
            cards.get(1).setBackgroundColor(getResources().getColor(R.color.accent));
            textViews.get(1).setTextColor(getResources().getColor(R.color.icons));
            checkBoxes.get(1).setChecked(true);
            checkBoxes.get(1).setBackgroundColor(getResources().getColor(R.color.icons));
            resetCard(flags.indexOf(true));
            flags.set(1,true);
        } else {
            resetCard(1);
        }
    }

    public void responder3(View v) {
        if (!flags.get(2)) {
            cards.get(2).setBackgroundColor(getResources().getColor(R.color.accent));
            textViews.get(2).setTextColor(getResources().getColor(R.color.icons));
            checkBoxes.get(2).setChecked(true);
            checkBoxes.get(2).setBackgroundColor(getResources().getColor(R.color.icons));
            resetCard(flags.indexOf(true));
            flags.set(2,true);
        } else {
            resetCard(2);
        }
    }

    public void responder4(View v) {
        if (!flags.get(3)) {
            cards.get(3).setBackgroundColor(getResources().getColor(R.color.accent));
            textViews.get(3).setTextColor(getResources().getColor(R.color.icons));
            checkBoxes.get(3).setChecked(true);
            checkBoxes.get(3).setBackgroundColor(getResources().getColor(R.color.icons));
            resetCard(flags.indexOf(true));
            flags.set(3,true);
        } else {
            resetCard(3);
        }
    }

    public void submeter(View v) {
        v.setBackgroundColor(getResources().getColor(R.color.accent));
        int i = flags.indexOf(true);
        if(i>=0) {
            Log.i("PERGUNTAS ACTIVITY", "Resposta Escolhida: " + String.valueOf(i));
            String respostaEscolhida = String.valueOf(textViews.get(i).getText());
            Log.i("PERGUNTAS ACTIVITY", "Resposta Escolhida: " + respostaEscolhida);
        } else {
            Toast toastEscolha = Toast.makeText(getApplicationContext(), "Escolha uma opção :)", Toast.LENGTH_SHORT);
            toastEscolha.show();
        }
    }
}
