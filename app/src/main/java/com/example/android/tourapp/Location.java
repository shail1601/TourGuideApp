package com.example.android.tourapp;


public class Location {
    private String mName;
    private String mAddress;
    private String mHours;
    private String mPhoneNumber;
    private String mDescription;
    private int mImageId = NO_IMAGE_ID;

    // No image constant
    private static final int NO_IMAGE_ID = -1;

    public Location(String name, String address, String hours, String phoneNumber, String description) {
        mName = name;
        mAddress = address;
        mHours = hours;
        mPhoneNumber = phoneNumber;
        mDescription = description;
    }

    /**
     * Constructor for when location includes an image
     *
     * @param name        String
     * @param address     String
     * @param hours       String
     * @param phoneNumber String
     * @param description String
     * @param imageId     int
     */
    public Location(String name, String address, String hours, String phoneNumber, String description, int imageId) {
        mName = name;
        mAddress = address;
        mHours = hours;
        mPhoneNumber = phoneNumber;
        mDescription = description;
        mImageId = imageId;
    }

    /**
     * returns the location name
     */
    public String getLocationName() {
        return mName;
    }

    /**
     * returns the price string for this location
     */
    public String getLocationAddress() {
        return mAddress;
    }

    /**
     * returns the String for hours of operation
     */
    public String getLocationHours() {
        return mHours;
    }

    /**
     * returns the location phone number
     */
    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    /**
     * returns Location description
     */
    public String getDescription() {
        return mDescription;
    }

    public boolean hasImage() {
        return mImageId != NO_IMAGE_ID;
    }

    /**
     * returns the image resource id
     */
    public int getImageResourceId() {
        return mImageId;
    }
}
