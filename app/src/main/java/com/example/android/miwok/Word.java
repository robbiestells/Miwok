package com.example.android.miwok;

import android.content.Context;

/**
 * Created by rsteller on 10/19/2016.
 */

public class Word {

    private String miwokTranslation;

    private String englishTranslation;

    private int imageId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String miwok, String english) {
        miwokTranslation = miwok;
        englishTranslation = english;
    }

    public Word(String miwok, String english, int image) {
        miwokTranslation = miwok;
        englishTranslation = english;
        imageId = image;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public int getImageId(){ return imageId;}

    public boolean hasImage(){
        return imageId != NO_IMAGE_PROVIDED;
    }
}
