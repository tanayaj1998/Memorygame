package com.example.android.memorygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.nio.file.spi.FileTypeDetector;
import java.util.Arrays;
import java.util.Collections;

public class Game extends AppCompatActivity {
TextView p1;
TextView p2;
ImageView iv_11,iv_12,iv_13,iv_14,iv_21,iv_22,iv_23,iv_24,iv_31,iv_32,iv_33,iv_34;
Integer shufflecards[]={101,102,103,104,105,106,201,202,203,204,205,206};
int card[];
int img101,img102,img103,img104,img105,img106,img201,img202,img203,img204,img205,img206;
int firstCard,secondCard;
int clickedFirst,clickedSecond;
int cardNo=1;
int turn=1;
int player1=0,player2=0;
    LinearLayout bg;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        p1=(TextView)findViewById(R.id.p1);
        p2=(TextView)findViewById(R.id.p2);
        Bundle extras = getIntent().getExtras();
        card= extras.getIntArray("images");
            init();
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Alert!").setMessage("Are you sure want to exit the current game?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("No",null).show();
    }

    void  init(){
        player1=0;
        player2=0;
        iv_11=(ImageView) findViewById(R.id.q_11);
        iv_12=(ImageView) findViewById(R.id.q_12);
        iv_13=(ImageView) findViewById(R.id.q_13);
        iv_14=(ImageView) findViewById(R.id.q_14);
        iv_21=(ImageView) findViewById(R.id.q_21);
        iv_22=(ImageView) findViewById(R.id.q_22);
        iv_23=(ImageView) findViewById(R.id.q_23);
        iv_24=(ImageView) findViewById(R.id.q_24);
        iv_31=(ImageView) findViewById(R.id.q_31);
        iv_32=(ImageView) findViewById(R.id.q_32);
        iv_33=(ImageView) findViewById(R.id.q_33);
        iv_34=(ImageView) findViewById(R.id.q_34);
        bg= (LinearLayout)findViewById(R.id.background);
        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");
        iv_11.setVisibility(View.VISIBLE);
        iv_12.setVisibility(View.VISIBLE);
        iv_13.setVisibility(View.VISIBLE);
        iv_14.setVisibility(View.VISIBLE);
        iv_21.setVisibility(View.VISIBLE);
        iv_22.setVisibility(View.VISIBLE);
        iv_23.setVisibility(View.VISIBLE);
        iv_24.setVisibility(View.VISIBLE);
        iv_31.setVisibility(View.VISIBLE);
        iv_32.setVisibility(View.VISIBLE);
        iv_33.setVisibility(View.VISIBLE);
        iv_34.setVisibility(View.VISIBLE);
        iv_11.setImageResource(R.drawable.questionmark);
        iv_12.setImageResource(R.drawable.questionmark);
        iv_13.setImageResource(R.drawable.questionmark);
        iv_14.setImageResource(R.drawable.questionmark);
        iv_21.setImageResource(R.drawable.questionmark);
        iv_22.setImageResource(R.drawable.questionmark);
        iv_23.setImageResource(R.drawable.questionmark);
        iv_24.setImageResource(R.drawable.questionmark);
        iv_31.setImageResource(R.drawable.questionmark);
        iv_32.setImageResource(R.drawable.questionmark);
        iv_33.setImageResource(R.drawable.questionmark);
        iv_34.setImageResource(R.drawable.questionmark);
        frontOfCardResources();
        Collections.shuffle(Arrays.asList(shufflecards));
        //  bg.setBackgroundColor("#c10f45");

        iv_11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                int theCard= Integer.parseInt((String)v.getTag());
                doStuff(theCard,iv_11);
            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard= Integer.parseInt((String)v.getTag());
                doStuff(theCard,iv_12);
            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard= Integer.parseInt((String)v.getTag());
                doStuff(theCard,iv_13);
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard= Integer.parseInt((String)v.getTag());
                doStuff(theCard,iv_14);
            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard= Integer.parseInt((String)v.getTag());
                doStuff(theCard,iv_21);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard= Integer.parseInt((String)v.getTag());
                doStuff(theCard,iv_22);
            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard= Integer.parseInt((String)v.getTag());
                doStuff(theCard,iv_23);
            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard= Integer.parseInt((String)v.getTag());
                doStuff(theCard,iv_24);
            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard= Integer.parseInt((String)v.getTag());
                doStuff(theCard,iv_31);
            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard= Integer.parseInt((String)v.getTag());
                doStuff(theCard,iv_32);
            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard= Integer.parseInt((String)v.getTag());
                doStuff(theCard,iv_33);
            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard= Integer.parseInt((String)v.getTag());
                doStuff(theCard,iv_34);
            }
        });
    }

    private void doStuff(int thecard, ImageView iv)
    {
        if(shufflecards[thecard]==101)
        {
            iv.setImageResource(img101);
        }
        else if(shufflecards[thecard]==102)
        {
            iv.setImageResource(img102);
        }
        else if(shufflecards[thecard]==103)
        {
            iv.setImageResource(img103);
        }
        else if(shufflecards[thecard]==104)
        {
            iv.setImageResource(img104);
        }
        else if(shufflecards[thecard]==105)
        {
            iv.setImageResource(img105);
        }
        else if(shufflecards[thecard]==106)
        {
            iv.setImageResource(img106);
        }
        else if(shufflecards[thecard]==201)
        {
            iv.setImageResource(img201);
        }
        else if(shufflecards[thecard]==202)
        {
            iv.setImageResource(img202);
        }else if(shufflecards[thecard]==203)
        {
            iv.setImageResource(img203);
        }
        else if(shufflecards[thecard]==204)
        {
            iv.setImageResource(img204);
        }
        else if(shufflecards[thecard]==205)
        {
            iv.setImageResource(img205);
        }
        else if(shufflecards[thecard]==206)
        {
            iv.setImageResource(img206);
        }
        if(cardNo==1)
        {
            firstCard=shufflecards[thecard];
            if(firstCard>200)
            {
                firstCard-=100;
            }
            cardNo=2;
            clickedFirst=thecard;
            iv.setEnabled(false);
        }
        else if(cardNo==2)
        {
            secondCard=shufflecards[thecard];
            if(secondCard>200)
            {
                secondCard-=100;
            }
            cardNo=1;
            clickedSecond=thecard;
            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },1000);
        }
    }

    private void calculate()
    {
        if(firstCard==secondCard)
        {
            switch (clickedFirst)
            {
                case 0: {iv_11.setVisibility(View.INVISIBLE);break;}
                case 1: {iv_12.setVisibility(View.INVISIBLE);break;}
                case 2: {iv_13.setVisibility(View.INVISIBLE);break;}
                case 3: {iv_14.setVisibility(View.INVISIBLE);break;}
                case 4: {iv_21.setVisibility(View.INVISIBLE);break;}
                case 5: {iv_22.setVisibility(View.INVISIBLE);break;}
                case 6: {iv_23.setVisibility(View.INVISIBLE);break;}
                case 7: {iv_24.setVisibility(View.INVISIBLE);break;}
                case 8: {iv_31.setVisibility(View.INVISIBLE);break;}
                case 9: {iv_32.setVisibility(View.INVISIBLE);break;}
                case 10: {iv_33.setVisibility(View.INVISIBLE);break;}
                case 11: {iv_34.setVisibility(View.INVISIBLE);break;}
            }
            switch (clickedSecond)
            {
                case 0: {iv_11.setVisibility(View.INVISIBLE);break;}
                case 1: {iv_12.setVisibility(View.INVISIBLE);break;}
                case 2: {iv_13.setVisibility(View.INVISIBLE);break;}
                case 3: {iv_14.setVisibility(View.INVISIBLE);break;}
                case 4: {iv_21.setVisibility(View.INVISIBLE);break;}
                case 5: {iv_22.setVisibility(View.INVISIBLE);break;}
                case 6: {iv_23.setVisibility(View.INVISIBLE);break;}
                case 7: {iv_24.setVisibility(View.INVISIBLE);break;}
                case 8: {iv_31.setVisibility(View.INVISIBLE);break;}
                case 9: {iv_32.setVisibility(View.INVISIBLE);break;}
                case 10: {iv_33.setVisibility(View.INVISIBLE);break;}
                case 11: {iv_34.setVisibility(View.INVISIBLE);break;}
            }
            if(turn==1)
            {
                player1++;
                p1.setText("P1: "+player1);
            }
            else if(turn==2)
            {
                player2++;
                p2.setText("P2: "+player2);
            }
        }
        else
        {
            iv_11.setImageResource(R.drawable.questionmark);
            iv_12.setImageResource(R.drawable.questionmark);
            iv_13.setImageResource(R.drawable.questionmark);
            iv_14.setImageResource(R.drawable.questionmark);
            iv_21.setImageResource(R.drawable.questionmark);
            iv_22.setImageResource(R.drawable.questionmark);
            iv_23.setImageResource(R.drawable.questionmark);
            iv_24.setImageResource(R.drawable.questionmark);
            iv_31.setImageResource(R.drawable.questionmark);
            iv_32.setImageResource(R.drawable.questionmark);
            iv_33.setImageResource(R.drawable.questionmark);
            iv_34.setImageResource(R.drawable.questionmark);

            if(turn==1)
            {
                turn=2;
                bg.setBackgroundColor(Color.parseColor("#8344ba"));
            }
            else if(turn==2)
            {
                turn=1;
                bg.setBackgroundColor(Color.parseColor("#FF6E7C"));
            }
        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        checkend();
    }

    private void checkend()
    {
        if(iv_11.getVisibility()==View.INVISIBLE&&iv_12.getVisibility()==View.INVISIBLE&&iv_13.getVisibility()==View.INVISIBLE&&iv_14.getVisibility()==View.INVISIBLE&&iv_21.getVisibility()==View.INVISIBLE&&iv_22.getVisibility()==View.INVISIBLE&&iv_23.getVisibility()==View.INVISIBLE&&iv_24.getVisibility()==View.INVISIBLE&&iv_31.getVisibility()==View.INVISIBLE&&iv_32.getVisibility()==View.INVISIBLE&&iv_33.getVisibility()==View.INVISIBLE&&iv_34.getVisibility()==View.INVISIBLE)
        {
            String successmsg="";
            if(player1>player2)
            {
                successmsg="Congratulations,Player 1 wins!";
            }
            else if(player2>player1)
            {
                successmsg="Congratulations,Player 2 wins!";
            }
            else
            {
                successmsg="Its a draw!";
            }
            AlertDialog.Builder alBuilder=new AlertDialog.Builder(Game.this);
            alBuilder.setMessage("GAME OVER\n"+successmsg).setCancelable(false).setPositiveButton("REPLAY", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    init();
                }
            }).setNeutralButton("NEW GAME", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            }).setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    moveTaskToBack(true);
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(0);
                }
            });

            AlertDialog alertDialog=alBuilder.create();
            alertDialog.show();

        }
    }

    private void frontOfCardResources(){
        img101=card[0];
        img102=card[1];
        img103=card[2];
        img104=card[3];
        img105=card[4];
        img106=card[5];
        img201=card[6];
        img202=card[7];
        img203=card[8];
        img204=card[9];
        img205=card[10];
        img206=card[11];

    }



}
