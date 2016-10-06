package com.anjoshigor.tipad;

/**
 * Created by anjoshigor on 04/10/16.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class EscolhaActivity extends AppCompatActivity {

    Toast toastC;
    ImageView playImage, curImage;
    Intent intentP;
    String assunto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pancreas);
        Intent intent = getIntent();
        assunto = intent.getExtras().getString("assunto");
        setTitle(assunto);
        populateImages();


    }

    private void populateImages() {
        runOnUiThread(new Runnable(){
            public void run() {
                playImage= (ImageView)findViewById(R.id.playImageView);
                playImage.setImageDrawable(getResources().getDrawable(R.drawable.rsz_play));
                curImage= (ImageView)findViewById(R.id.curImageView);
                curImage.setImageDrawable(getResources().getDrawable(R.drawable.rsz_question_mark));
                toastC = Toast.makeText(getApplicationContext(), "BUTAO Curiosidades", Toast.LENGTH_LONG);
                intentP = new Intent(getBaseContext(), PerguntasActivity.class);
                intentP.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intentP.putExtra("assunto", assunto);
            }
        });
    }

    public void callPlayView(View v) {
        startActivity(intentP);

    }

    public void callCurView(View v) {
        toastC.show();
    }


}
