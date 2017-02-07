package com.example.welcome.mobilemode;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    AudioManager am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        am=(AudioManager)getSystemService(Context.AUDIO_SERVICE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // this index for phone silent
                am.setRingerMode(0);
                Toast.makeText(MainActivity.this, "SilentMode", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //this index for phone vibrate
                am.setRingerMode(1);
                Toast.makeText(MainActivity.this, "VibrateMode", Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //this index for phone Ringing
                am.setRingerMode(2);
                Toast.makeText(MainActivity.this, "GeneralMode", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
