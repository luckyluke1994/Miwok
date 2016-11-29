package com.example.android.miwok;

/**
 * Created by lucky_luke on 10/9/2016.
 */
public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        mDefaultTranslation = defaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
