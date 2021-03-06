package pl.nataliana.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the particular button
        Button playlist = (Button) findViewById(R.id.playlist);
        Button song = (Button) findViewById(R.id.song);
        Button random = (Button) findViewById(R.id.trending);
        Button premium = (Button) findViewById(R.id.premium);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        // Set a click listener on that View
        song.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, SongActivity.class);
                startActivity(songIntent);
            }
        });

        // Set a click listener on that View
        random.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the trending View is clicked on.
            @Override
            public void onClick(View view) {
                Intent trendingIntent = new Intent(MainActivity.this, TrendingActivity.class);
                startActivity(trendingIntent);
            }
        });

        // Set a click listener on that View
        premium.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the premium View is clicked on.
            @Override
            public void onClick(View view) {
                Intent premiumIntent = new Intent(MainActivity.this, PremiumActivity.class);
                startActivity(premiumIntent);
            }
        });
    }

}

