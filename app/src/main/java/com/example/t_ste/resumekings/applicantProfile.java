package com.example.t_ste.resumekings;

import android.graphics.Bitmap;

/**
 * Created by t_ste on 11/1/2016.
 * This is the data structure for the applicantProfile there is an array of these objects in the main
 * Activity this is important
 */
public class applicantProfile {
    private Bitmap ProfilePicture;
    private Bitmap ResumePicture;
    public String UserName;
    private String Email;
    private String PhoneNumber;
    private String Notes;

    public int getStars() {
        return Stars;
    }

    public void setStars(int stars) {
        Stars = stars;
    }

    private int Stars;

    public Bitmap getProfilePicture() {
        return ProfilePicture;
    }

    public void setProfilePicture(Bitmap profilePicture) {
        ProfilePicture = profilePicture;
    }

    public Bitmap getResumePicture() {
        return ResumePicture;
    }

    public void setResumePicture(Bitmap resumePicture) {
        ResumePicture = resumePicture;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String username) {
        UserName = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
    @Override
    public String toString() {
        return UserName+"\n"+Email;
    }
}
