package com.example.android1.androidquicksettings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
/**
 * Created by Kamal Verma on 24-August-2017
 * Kamalverma1207@gmail.com
 * Precise Automation and Robotics
 **/

public class MainActivity extends AppCompatActivity {

    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButton();

    }

    private void setupButton() {

        mButton = (Button) findViewById(R.id.btn_facts);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDialog();
            }
        });
    }

    private void showDialog() {

        TileDialog.getDialog(this).show();
    }
}