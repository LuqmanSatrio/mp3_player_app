package com.example.luqmansatriowicaksono.mediaplayer_basic_usage;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    ImageView woof1;
    ImageView woof2;
    MediaPlayer player;
    MediaPlayer wooof;
    TextView woof;
    View.OnClickListener pausewoof;
    View.OnClickListener wooflistener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        woof1 = (ImageView) findViewById(R.id.woff);
        woof2 = (ImageView) findViewById(R.id.woff1);

        TextView play = (TextView) findViewById(R.id.play);
        TextView pause = (TextView) findViewById(R.id.pause);
        woof = (TextView) findViewById(R.id.woof);

        player = MediaPlayer.create(this, R.raw.shootingstar);

        wooof = MediaPlayer.create(this, R.raw.woooof);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
                woof1.setImageResource(R.drawable.wuff);
                woof2.setImageResource(R.drawable.wuff);
                woof1.setVisibility(View.VISIBLE);
                woof2.setVisibility(View.VISIBLE);

            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
                woof1.setVisibility(View.INVISIBLE);
                woof2.setVisibility(View.INVISIBLE);
            }
        });

        final VideoView videoview = (VideoView) findViewById(R.id.video);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bark);
        videoview.setVideoURI(uri);


        pausewoof = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoview.pause();
                woof.setOnClickListener(wooflistener);
            }
        };


        wooflistener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                videoview.start();
                woof.setOnClickListener(pausewoof);


            }
        };

        woof.setOnClickListener(wooflistener);


    }


}
