package com.example.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine{
    private static final String TAG = "Car";

    private int horsepower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horsepower") int horsepower,
                        @Named("engineCapacity") int engineCapacity) {
        this.horsepower = horsepower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started." +
                "\n Horsepower: " + horsepower +
                "\n engineCapacity: " + engineCapacity);
    }
}
