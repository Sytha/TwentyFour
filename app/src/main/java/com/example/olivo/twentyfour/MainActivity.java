package com.example.olivo.twentyfour;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set possibility to control sound without anything playing
        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        /*
        // init the media player
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.a_24_ans);
        */

        // init soundpool
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .build();
        final SoundPool sp = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();

        // loading sound ressources
        final int a24AnsId = sp.load(this, R.raw.a_24_ans, 1);
        final int sacId = sp.load(this, R.raw.mon_sac_est_fait, 1);
        final int combienId = sp.load(this, R.raw.pour_combien_de_personnes, 1);
        final int jeBuvaisId = sp.load(this, R.raw.mais_je_buvais, 1);
        final int grosseId = sp.load(this, R.raw.tu_es_grosse, 1);
        final int maisOuiId = sp.load(this, R.raw.mais_oui, 1);
        final int pardonId = sp.load(this, R.raw.pardon, 1);
        final int rogueLeviosaId = sp.load(this, R.raw.rogue_leviosa, 1);
        final int ronLeviosaId = sp.load(this, R.raw.ron_leviosa, 1);
        final int stopItRonId = sp.load(this, R.raw.stop_it_ron, 1);
        final int wingardiumLeviosaId = sp.load(this, R.raw.wingardium_leviosa, 1);



        // buttons
        Button bt_a24ans = (Button)this.findViewById(R.id.a24Ans);
        Button bt_monSacEstFait = (Button)this.findViewById(R.id.monSacEstFait);
        Button bt_combien = (Button)this.findViewById(R.id.pourCombien);
        Button bt_jeBuvais = (Button)this.findViewById(R.id.maisJeBuvais);
        Button bt_tuEsGrosse = (Button)this.findViewById(R.id.tuEsGrosse);
        Button bt_maisOui = (Button)this.findViewById(R.id.maisOui);
        Button bt_pardon = (Button)this.findViewById(R.id.maisJeBuvais);
        Button bt_rogueLeviosa = (Button)this.findViewById(R.id.rogueLeviosa);
        Button bt_ronLeviosa = (Button)this.findViewById(R.id.ronLeviosa);
        Button bt_stopItRon = (Button)this.findViewById(R.id.stopItRon);
        Button bt_wingardiumLeviosa = (Button)this.findViewById(R.id.wingardiumLeviosa);



        // onClick events
        // a 24 ans
        bt_a24ans.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sp.play(a24AnsId, 1, 1, 1, 0, 1);
            }
        });
        // mon sac est fait!
        bt_monSacEstFait.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sp.play(sacId, 1, 1, 1, 0, 1);
            }
        });
        // pour combien de personnes ?
        bt_combien.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sp.play(combienId, 1, 1, 1, 0, 1);
            }
        });
        // Mais je buvais! JE BUVAIIIS
        bt_jeBuvais.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sp.play(jeBuvaisId, 1, 1, 1, 0, 1);
            }
        });
        // Tu es grosse, Mélissandre!
        bt_tuEsGrosse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sp.play(grosseId, 1, 1, 1, 0, 1);
            }
        });
        // Mais OUIIII!
        bt_maisOui.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sp.play(maisOuiId, 1, 1, 1, 0, 1);
            }
        });
        // Pardon
        bt_pardon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sp.play(pardonId, 1, 1, 1, 0, 1);
            }
        });
        // Leviosaaa (Rogue)
        bt_rogueLeviosa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sp.play(rogueLeviosaId, 1, 1, 1, 0, 1);
            }
        });
        // Leviosaaa (Ron)
        bt_ronLeviosa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sp.play(ronLeviosaId, 1, 1, 1, 0, 1);
            }
        });
        // Stop It Ron
        bt_stopItRon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sp.play(stopItRonId, 1, 1, 1, 0, 1);
            }
        });
        // Wingardium Leviosa
        bt_wingardiumLeviosa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sp.play(wingardiumLeviosaId, 1, 1, 1, 0, 1);
            }
        });
    }
}
