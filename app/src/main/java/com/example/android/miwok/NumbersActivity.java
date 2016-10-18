package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

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

        Log.v("NumbersActivity", "The number at index 9 is :" + englishNumbers.get(9));

    }
}
