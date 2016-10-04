package com.anjoshigor.tipad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast toastP, toastH, toastA, toastT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Selecione o Assunto");

        toastP = Toast.makeText(getApplicationContext(), "BUTAO Pancreas", Toast.LENGTH_LONG);
        toastH = Toast.makeText(getApplicationContext(), "BUTAO Hipotálamo", Toast.LENGTH_LONG);
        toastT = Toast.makeText(getApplicationContext(), "BUTAO Tireoide", Toast.LENGTH_LONG);
        toastA = Toast.makeText(getApplicationContext(), "BUTAO Adrenal", Toast.LENGTH_LONG);

    }

    public void callPancreasView(View v) {
        toastP.show();
    }

    public void callHipotView(View v) {
        toastH.show();
    }

    public void callTireoideView(View v) {
        toastT.show();
    }

    public void callAdrenalView(View v) {
        toastA.show();
    }

}
