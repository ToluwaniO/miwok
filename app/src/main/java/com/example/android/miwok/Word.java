package com.example.android.miwok;

/**
 * Created by Awesome-Tbee on 1/25/2017.
 */

public class Word {

    private String mDefaultText, mMiwokText;
    private int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mSoundResourceId;


    public Word() {
    }

    public Word(String mDefaultText, String mMiwokText, int mImageResourceId, int mSoundResourceId) {
        this.mDefaultText = mDefaultText;
        this.mMiwokText = mMiwokText;
        this.mImageResourceId = mImageResourceId;
        this.mSoundResourceId = mSoundResourceId;
    }

    public Word(String mDefaultText, String mMiwokText, int mSoundResourceId) {
        this.mDefaultText = mDefaultText;
        this.mMiwokText = mMiwokText;
        this.mSoundResourceId = mSoundResourceId;
    }

    public String getmDefaultText() {
        return mDefaultText;
    }

    public void setmDefaultText(String mDefaultText) {
        this.mDefaultText = mDefaultText;
    }

    public String getmMiwokText() {
        return mMiwokText;
    }

    public void setmMiwokText(String mMiwokText) {
        this.mMiwokText = mMiwokText;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public int getmSoundResourceId() {
        return mSoundResourceId;
    }

    public void setmSoundResourceId(int mSoundResourceId) {
        this.mSoundResourceId = mSoundResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
