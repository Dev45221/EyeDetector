package com.example.eyedetector;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.pd.lookatme.LookAtMe;

public class Video extends AppCompatActivity {

    LookAtMe lookAtMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        lookAtMe = findViewById(R.id.lookme);

        lookAtMe.init(this);
        lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));
        // lookAtMe.setVideoPath("http://website.com/video/mp4/62000/62792m.mp4"); to use video from a url

        lookAtMe.start();
        lookAtMe.setLookMe();

    }
}