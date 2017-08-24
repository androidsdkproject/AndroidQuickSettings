package com.example.android1.androidquicksettings;

import android.os.Build;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import android.support.annotation.RequiresApi;
import android.util.Log;

/**
 * Created by Kamal Verma on 24-August-2017
 * Kamalverma1207@gmail.com
 * Precise Automation and Robotics
 **/

@RequiresApi(api = Build.VERSION_CODES.N)
public class MyTileService extends TileService {

    public static final String TAG = MyTileService.class.getSimpleName();

    @Override
    public void onTileAdded() {
        Log.d(TAG, "onTileAdded: ");
    }

    @Override
    public void onStartListening() {

        Tile tile = getQsTile();
        Log.d(TAG, "onStartListening: " + tile.getLabel());
    }

    @Override
    public void onClick() {
        Log.d(TAG, "onClick: ");

        if (!isSecure()) {

            showDialog();

        } else {

            unlockAndRun(new Runnable() {
                @Override
                public void run() {

                    showDialog();
                }
            });
        }
    }

    private void showDialog() {

        showDialog(TileDialog.getDialog(this));
    }
}