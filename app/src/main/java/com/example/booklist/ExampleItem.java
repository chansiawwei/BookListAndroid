package com.example.booklist;

public class ExampleItem {
    private int mImageResource;
    private String mText1;
    private String rating;


    public ExampleItem(int imageResource, String text1,String text2) {
        mImageResource = imageResource;
        mText1 = text1;
        rating=text2;    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getText1() {
        return mText1;
    }

    public String getText2() {
        return rating;
    }

}