package pl.nataliana.musicalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static pl.nataliana.musicalapp.R.id.text_field;

/**
 * Created by Natalka on 2017-04-30.
 */

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        //Set content to menu
        TextView menuText = (TextView) findViewById(R.id.menu);
        menuText.setText(R.string.menu_song);

        //Set content to text
        TextView text_fieldText = (TextView) findViewById(text_field);
        text_fieldText.setText(R.string.text_song);
    }
}
