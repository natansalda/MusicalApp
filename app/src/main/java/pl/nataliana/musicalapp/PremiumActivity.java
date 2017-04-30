package pl.nataliana.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static pl.nataliana.musicalapp.R.id.text_field;

/**
 * Created by Natalka on 2017-04-30.
 */

public class PremiumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        //Set content to menu
        TextView menuText = (TextView) findViewById(R.id.menu);
        menuText.setText(R.string.menu_premium);

        //Set content to text
        TextView text_fieldText = (TextView) findViewById(text_field);
        text_fieldText.setText(R.string.text_premium);

        // Find the View that shows the particular button
        Button playlist = (Button) findViewById(R.id.playlist);
        Button song = (Button) findViewById(R.id.song);
        Button random = (Button) findViewById(R.id.trending);
        Button premium = (Button) findViewById(R.id.premium);
        premium.setText(R.string.main_menu);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(PremiumActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        // Set a click listener on that View
        song.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(PremiumActivity.this, SongActivity.class);
                startActivity(songIntent);
            }
        });

        // Set a click listener on that View
        random.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the trending View is clicked on.
            @Override
            public void onClick(View view) {
                Intent trendingIntent = new Intent(PremiumActivity.this, TrendingActivity.class);
                startActivity(trendingIntent);
            }
        });

        // Set a click listener on that View
        premium.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the premium View is clicked on.
            @Override
            public void onClick(View view) {
                Intent premiumIntent = new Intent(PremiumActivity.this, MainActivity.class);
                startActivity(premiumIntent);
            }
        });
    }
}
