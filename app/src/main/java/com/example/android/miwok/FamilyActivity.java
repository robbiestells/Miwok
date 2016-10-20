package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer = new MediaPlayer();
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father", "әpә", R.drawable.family_father, R.raw.family_father));
        words.add(new Word("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word("son", "angsi", R.drawable.family_son, R.raw.family_son));
//        words.add(new Word("four", "oyyisa"));
//        words.add(new Word("five", "massokka"));
//        words.add(new Word("six", "temmokka"));
//        words.add(new Word("seven", "kenekaku"));
//        words.add(new Word("eight", "kawinta"));
//        words.add(new Word("nine", "wo'e"));
//        words.add(new Word("ten", "na'aacha"));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.wordList);

        listView.setAdapter(adapter);

        //listen for click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                releaseMediaPlayer();
                Word word = (Word) parent.getItemAtPosition(position);

//                Toast.makeText(getApplicationContext(),
//                        "Clicked on: " +  word.getMiwokTranslation(),
//                        Toast.LENGTH_SHORT).show();
                mediaPlayer = MediaPlayer.create(FamilyActivity.this,word.getAudioFile());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }
    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();
            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }
    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
}
