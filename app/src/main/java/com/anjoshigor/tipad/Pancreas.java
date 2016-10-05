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

public class Pancreas extends AppCompatActivity {

    Toast toastP, toastC;
    ImageView playImage, curImage;
    Intent intentP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pancreas);
        setTitle("Pâncreas");
        populateImages();


    }

    private void populateImages() {
        runOnUiThread(new Runnable(){
            public void run() {
                playImage= (ImageView)findViewById(R.id.playImageView);
                playImage.setImageDrawable(getResources().getDrawable(R.drawable.rsz_play));
                curImage= (ImageView)findViewById(R.id.curImageView);
                curImage.setImageDrawable(getResources().getDrawable(R.drawable.rsz_question_mark));
                toastP = Toast.makeText(getApplicationContext(), "BUTAO Jogar", Toast.LENGTH_LONG);
                toastC = Toast.makeText(getApplicationContext(), "BUTAO Curiosidades", Toast.LENGTH_LONG);
                intentP = new Intent(getBaseContext(), PerguntasActivity.class);
                intentP.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            }
        });
    }

    public void callPlayView(View v) {
        startActivity(intentP);
        toastP.show();
    }

    public void callCurView(View v) {
        toastC.show();
    }


}
