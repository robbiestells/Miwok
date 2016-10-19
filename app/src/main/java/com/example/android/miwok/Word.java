package com.example.android.miwok;

import android.content.Context;

/**
 * Created by rsteller on 10/19/2016.
 */

public class Word {

    private String miwokTranslation;

    private String englishTranslation;


    public Word(String miwok, String english) {
        miwokTranslation = miwok;
        englishTranslation = english;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }
}
