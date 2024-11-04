package com.example.gymrat;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class BeginnerChestWorkoutActivity extends AppCompatActivity {

    private VideoView videoView1, videoView2, videoView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beginner_chest_workout);

        videoView1 = findViewById(R.id.videoView1);
        videoView2 = findViewById(R.id.videoView2);
        videoView3 = findViewById(R.id.videoView3);

        // Set up the video URI and the media controller
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.middle_chest_workout); // Replace with your video file name
        videoView1.setVideoURI(uri);

        // Add media controls
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView1);
        videoView1.setMediaController(mediaController);

        // Start the video
        videoView1.start();

        // Set up the video URI and the media controller
        Uri uri2 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lower_chest_workout);
        videoView2.setVideoURI(uri2);

        // Add media controls
        MediaController mediaController2 = new MediaController(this);
        mediaController.setAnchorView(videoView2);
        videoView2.setMediaController(mediaController2);

        // Start the video
        videoView2.start();

        // Set up the video URI and the media controller
        Uri uri3 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.upper_chest_workout);
        videoView3.setVideoURI(uri3);

        // Add media controls
        MediaController mediaController3 = new MediaController(this);
        mediaController.setAnchorView(videoView3);
        videoView3.setMediaController(mediaController3);

        // Start the video
        videoView3.start();
    }
}
