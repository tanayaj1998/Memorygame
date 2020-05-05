package com.example.android.memorygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
   RelativeLayout zs;
    int arr[]=new int[12];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0; i<12; i++){
            arr[i] = 0;
        }



    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exiting App").setMessage("Are you sure you want to exit the Memory Game").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
            }
        }).setNegativeButton("No",null).show();
    }

    public void connect1(View v){
        for (int i = 0; i < 6; i++) {
            arr[i+6] = getResources().getIdentifier("drawable/" + "zs" + (i + 1), null, getPackageName());
            arr[i] = getResources().getIdentifier("drawable/" + "zs" + (i + 1), null, getPackageName());
        }
        Intent i = new Intent(MainActivity.this, Game.class);
        i.putExtra("images", arr);
        startActivity(i);
    }
    public void connect2(View v){
        for (int i = 0; i < 6; i++) {
            arr[i] = getResources().getIdentifier("drawable/" + "color" + (i + 1), null, getPackageName());
            arr[i+6] = getResources().getIdentifier("drawable/" + "color" + (i + 1), null, getPackageName());
        }
        Intent i = new Intent(MainActivity.this, Game.class);
        i.putExtra("images", arr);
        startActivity(i);
    }
    public void connect3(View v){
        for (int i = 0; i < 6; i++) {
            arr[i] = getResources().getIdentifier("drawable/" + "got" + (i + 1), null, getPackageName());
            arr[i+6] = getResources().getIdentifier("drawable/" + "got" + (i + 1), null, getPackageName());
        }
        Intent i = new Intent(MainActivity.this, Game.class);
        i.putExtra("images", arr);
        startActivity(i);
    }
    public void connect4(View v){
        for (int i = 0; i < 6; i++) {
            arr[i] = getResources().getIdentifier("drawable/" + "chem" + (i + 1), null, getPackageName());
            arr[i+6] = getResources().getIdentifier("drawable/" + "chem" + (i + 1), null, getPackageName());
        }
        Intent i = new Intent(MainActivity.this, Game.class);
        i.putExtra("images", arr);
        startActivity(i);
    }




}
