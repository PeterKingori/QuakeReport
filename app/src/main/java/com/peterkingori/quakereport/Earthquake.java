package com.peterkingori.quakereport;

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private String mTimeInMilliseconds;

    public Earthquake(String magnitude, String location, String timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

}
