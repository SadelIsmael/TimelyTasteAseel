package com.example.timelytasteaseel;

import com.google.firebase.firestore.auth.User;

import java.util.List;

public interface MyCallBackUser {

    void onCallBackUser(List<User> attractionsList);
}
