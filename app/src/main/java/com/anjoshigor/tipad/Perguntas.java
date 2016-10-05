package com.anjoshigor.tipad;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Perguntas extends AppCompatActivity {

    CheckBox check1, check2, check3, check4;
    TextView txt1, txt2, txt3, txt4;
    Boolean flag1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_perguntas);
        txt1 = (TextView) findViewById(R.id.resposta1);
        check1 = (CheckBox) findViewById(R.id.checkbox1);
        flag1 = false;
    }

    public void responder1(View v) {
        if (!flag1) {
            v.setBackgroundColor(getResources().getColor(R.color.accent));
            txt1.setTextColor(getResources().getColor(R.color.icons));
            check1.setChecked(true);
            check1.setBackgroundColor(getResources().getColor(R.color.icons));
            flag1 = true;
        } else {
            v.setBackgroundColor(getResources().getColor(R.color.divider));
            txt1.setTextColor(getResources().getColor(R.color.primary_text));
            check1.setChecked(false);
            check1.setBackgroundColor(getResources().getColor(R.color.divider));
            flag1 = false;
        }
    }

}
