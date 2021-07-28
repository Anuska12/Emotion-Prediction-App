package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import org.tensorflow.lite.examples.classification.tflite.Classifier;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.btni);
        Button button2 = findViewById(R.id.btnl);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, ImageDetection.class);
                startActivity(in);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        Intent in = new Intent(MainActivity.this, ClassifierActivity.class);
        startActivity(in);
        }
        });
    }
}