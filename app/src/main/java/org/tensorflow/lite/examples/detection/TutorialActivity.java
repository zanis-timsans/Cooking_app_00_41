package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TutorialActivity extends AppCompatActivity {

    //private TextView myTextView;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        // Load media for tutorial
        //myTextView = (TextView) findViewById(R.id.textView);
        btnNext = (Button) findViewById(R.id.buttonNext);

        Bundle extras = getIntent().getExtras();

        //String myString = extras.getString("activityOne");

        //myTextView.setText(myString);


        btnNext.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent_2 = new Intent(TutorialActivity.this, MainActivity.class);

                //intent_2.putExtra("activityOne", "I am from the First Activity Hoorraaaayyy!!");

                startActivity(intent_2);


            }
        });
    }
}