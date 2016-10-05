package com.anjoshigor.tipad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast toastP, toastH, toastA, toastT;
    Intent intentP;
    ImageView pancreasImage, hipofiseImage, adrenalImage, tireoideImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Selecione o Assunto");
        populateImages();



    }

    private void populateImages() {
        runOnUiThread(new Runnable() {
            public void run() {
                pancreasImage = (ImageView) findViewById(R.id.pancreasImageView);
                tireoideImage = (ImageView) findViewById(R.id.tireoideImageView);
                hipofiseImage = (ImageView) findViewById(R.id.hipofiseImageView);
                adrenalImage = (ImageView) findViewById(R.id.adrenalImageView);
                hipofiseImage.setImageDrawable(getResources().getDrawable(R.drawable.rsz_hipofise_02));
                tireoideImage.setImageDrawable(getResources().getDrawable(R.drawable.rsz_tireoide_02));
                adrenalImage.setImageDrawable(getResources().getDrawable(R.drawable.rsz_adrenal_02));
                pancreasImage.setImageDrawable(getResources().getDrawable(R.drawable.rsz_pancreas_02));
                toastP = Toast.makeText(getApplicationContext(), "BUTAO Pancreas", Toast.LENGTH_LONG);
                toastH = Toast.makeText(getApplicationContext(), "BUTAO Hipotálamo", Toast.LENGTH_LONG);
                toastT = Toast.makeText(getApplicationContext(), "BUTAO Tireoide", Toast.LENGTH_LONG);
                toastA = Toast.makeText(getApplicationContext(), "BUTAO Adrenal", Toast.LENGTH_LONG);
                intentP = new Intent(getBaseContext(), Pancreas.class);
                intentP.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            }
        });
    }

    public void callPancreasView(View v) {
        toastP.show();
        startActivity(intentP);
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
