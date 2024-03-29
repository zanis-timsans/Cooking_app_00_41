package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class StartActivity extends AppCompatActivity {

    private Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnContinue = (Button) findViewById(R.id.buttonContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // connecting this main activity with the second activity and pass on a string

                Intent intent = new Intent(StartActivity.this, TutorialActivity.class);

                //intent.putExtra("activityOne", "I am from the First Activity Hoorraaaayyy!!");

                startActivity(intent);

            }
        });

        //FloatingActionButton fab = findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        //});
    }

}
