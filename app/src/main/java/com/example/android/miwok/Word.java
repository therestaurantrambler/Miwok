package com.example.android.miwok;

/**
 * Created by Becca on 3/19/2018. Word class is a custom class that contains the miwok translation of the number
 * and the default translation of a number, an image file and an audio pronunciation file
 */


//create the class
public class Word {

// declare the  private default word
    private String mDefaultTranslation;

// declare the private miwok translation
    private String mMiwokTranslation;

// declare the private audio resource id
    private int mAudioResourceId;

// declare the private variable for the image. Initialize to a number that is outside range
// image resource id.  That is , initialize to false.
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
// create new Word object with out image to use for phrases.

    public Word (String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }


// create second constructor5 with image.
    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    // Get the default translation of the word

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //Get the miwok translation of the word

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //Get the audio for the word.

    public int getAudioResourceId() { return mAudioResourceId; }

    //Get the Image for the word.

    public int getImageResourceId() { return mImageResourceId; }

    //Determine if there is an image associated with the Word object. Returns true if there is
    //an image. Returns false if there is not an image.

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
