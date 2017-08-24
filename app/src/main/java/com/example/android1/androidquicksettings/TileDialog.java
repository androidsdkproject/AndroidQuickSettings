package com.example.android1.androidquicksettings;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import java.util.Random;

/**
 * Created by Kamal Verma on 24-August-2017
 * Kamalverma1207@gmail.com
 * Precise Automation and Robotics
 **/

public class TileDialog {

    public static AlertDialog getDialog(Context context) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Fact");
        Random random = new Random();
        builder.setMessage(Constants.facts[random.nextInt(6)]);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.dismiss();
            }
        });

        return builder.create();
    }
}