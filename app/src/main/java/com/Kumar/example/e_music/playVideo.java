package com.Kumar.example.e_music;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class playVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);

        VideoView videoView = findViewById(R.id.videoView);

        // Get the video file path from the intent
        String videoPath = getIntent().getStringExtra("videoPath");

        if (videoPath != null) {
            Uri videoUri = Uri.parse(videoPath);

            // Set up MediaController for playback controls
            MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);

            // Set the video URI and start playback
            videoView.setVideoURI(videoUri);
            videoView.start();
        }
    }
}
