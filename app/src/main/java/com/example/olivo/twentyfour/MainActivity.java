package com.example.olivo.twentyfour;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound);

        Button play_button = (Button)this.findViewById(R.id.button);
        play_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.seekTo(0);
                }
                mp.start();
            }
        });
    }
}
