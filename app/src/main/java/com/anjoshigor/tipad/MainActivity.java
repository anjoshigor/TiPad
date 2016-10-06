package com.anjoshigor.tipad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

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
                intentP = new Intent(getBaseContext(), EscolhaActivity.class);
                intentP.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            }
        });
    }

    public void callPancreasView(View v) {
        intentP.putExtra("assunto","Pâncreas");
        startActivity(intentP);
    }

    public void callHipotView(View v) {
        intentP.putExtra("assunto","Hipófise/Hipotálamo");
        startActivity(intentP);
    }

    public void callTireoideView(View v) {
        intentP.putExtra("assunto","Tireóide");
        startActivity(intentP);
    }

    public void callAdrenalView(View v) {
        intentP.putExtra("assunto","Glândula Adrenal");
        startActivity(intentP);

    }

}
