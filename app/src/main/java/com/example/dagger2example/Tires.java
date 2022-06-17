package com.example.dagger2example;

import android.util.Log;

//we don't own this class so we can't annotate it with @Inject
public class Tires {
    private static final String TAG = "Car";
    public void inflate() {
        Log.d(TAG, "tires inflated");
    }
}
