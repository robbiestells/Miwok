package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.id;
import static android.R.attr.x;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> englishNumbers = new ArrayList<String>();

        englishNumbers.add("one");
        englishNumbers.add("two");
        englishNumbers.add("three");
        englishNumbers.add("four");
        englishNumbers.add("five");
        englishNumbers.add("six");
        englishNumbers.add("seven");
        englishNumbers.add("eight");
        englishNumbers.add("nine");
        englishNumbers.add("ten");

        LinearLayout rootView =  (LinearLayout) findViewById(R.id.activity_numbers);
//        TextView wordView = new TextView(this);
//        wordView.setText(englishNumbers.get(0));
//        rootView.addView(wordView);
//
//        TextView wordView2 = new TextView(this);
//        wordView2.setText(englishNumbers.get(1));
//        rootView.addView(wordView2);
//
//        TextView wordView3 = new TextView(this);
//        wordView3.setText(englishNumbers.get(2));
//        rootView.addView(wordView3);

        int x = 0;

        while (x < englishNumbers.size()){
            TextView wordView = new TextView(this);
            wordView.setText(englishNumbers.get(x));
            rootView.addView(wordView);
            x ++;
        }
    }
}
