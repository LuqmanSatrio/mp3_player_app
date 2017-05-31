package com.example.luqmansatriowicaksono.mediaplayer_basic_usage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;
    MediaPlayer wooof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView play = (TextView) findViewById(R.id.play);
        TextView pause = (TextView) findViewById(R.id.pause);
        TextView woof = (TextView) findViewById(R.id.woof);

        player = MediaPlayer.create(this, R.raw.shootingstar);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
            }
        });

        wooof = MediaPlayer.create(this, R.raw.woooof);


        woof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ImageView woff = (ImageView) findViewById(R.id.woff);
                woff.setImageResource(R.drawable.wuff);
                woff.setVisibility(View.VISIBLE);
                wooof.start();

            }
        });


    }
}
