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

    private int audioFile;

    public Word(String english, String miwok, int audio) {
        miwokTranslation = miwok;
        englishTranslation = english;
        audioFile = audio;
    }

    public Word(String english, String miwok, int image, int audio) {
        miwokTranslation = miwok;
        englishTranslation = english;
        imageId = image;
        audioFile = audio;
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

    public int getAudioFile(){return audioFile;}
}
