package com.fragment1.generally2.fortuneteller;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.app.Activity;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.seismic.ShakeDetector;


public class FortuneActivity extends Activity implements ShakeDetector.Listener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune);

        ShakeDetector shakeDetector = new ShakeDetector(this);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        shakeDetector.start(sensorManager);
    }

    @Override
    public void hearShake() {
        final TextView answerTxt = (TextView) findViewById(R.id.answerTxt);
        final String[] answers = {"I Don't Think So","Absolutely","No Way Jose","Definitely","Doubtful","All Signs Point To Yes","I Guess So","Ummmm...Sure","YES!", "NO!", "Sure Why Not", "Not Today", "Let Me Think About That A While", "Okay!", "Nope", "Outlook Looks Good", "Outlook Not So Good", "Probably", "Probably Not"};

        int random = (int) (Math.random() * answers.length);
        answerTxt.setText(answers[random]);

       // Toast.makeText(this, "Fix Me!",Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, answers[random], Toast.LENGTH_SHORT).show();

    }







    }
