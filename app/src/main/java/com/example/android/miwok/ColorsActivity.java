package com.example.android.miwok;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.country;
import static com.example.android.miwok.R.id.phrases;

public class ColorsActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        words.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
//        words.add(new Word("four", "oyyisa"));
//        words.add(new Word("five", "massokka"));
//        words.add(new Word("six", "temmokka"));
//        words.add(new Word("seven", "kenekaku"));
//        words.add(new Word("eight", "kawinta"));
//        words.add(new Word("nine", "wo'e"));
//        words.add(new Word("ten", "na'aacha"));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.wordList);

        listView.setAdapter(adapter);


        //listen for click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Word word = (Word) parent.getItemAtPosition(position);

//                Toast.makeText(getApplicationContext(),
//                        "Clicked on: " +  word.getMiwokTranslation(),
//                        Toast.LENGTH_SHORT).show();
                mediaPlayer = MediaPlayer.create(ColorsActivity.this,word.getAudioFile());
                mediaPlayer.start();
            }
        });
    }
}
