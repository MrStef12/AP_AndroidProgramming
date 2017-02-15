package com.sdu.stefh14.onearmedbandit;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SpinnerActivity extends AppCompatActivity {

    private AnimationDrawable spinner1;
    private AnimationDrawable spinner2;
    private AnimationDrawable spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        ImageView img1 = (ImageView) findViewById(R.id.spinner1);
        img1.setBackgroundResource(R.drawable.spinner1);
        spinner1 = (AnimationDrawable) img1.getBackground();

        ImageView img2 = (ImageView) findViewById(R.id.spinner2);
        img2.setBackgroundResource(R.drawable.spinner2);
        spinner2 = (AnimationDrawable) img2.getBackground();

        ImageView img3 = (ImageView) findViewById(R.id.spinner3);
        img3.setBackgroundResource(R.drawable.spinner3);
        spinner3 = (AnimationDrawable) img3.getBackground();
    }

    public void onSpin(View view) {
        spinner1.start();
        spinner2.start();
        spinner3.start();
    }

    public void onStopSpinner1(View view) {
        spinner1.stop();
    }

    public void onStopSpinner2(View view) {
        spinner2.stop();
    }

    public void onStopSpinner3(View view) {
        spinner3.stop();
    }
}
