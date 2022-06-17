package com.example.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2example.car.Car;
import com.example.dagger2example.dagger.CarComponent;
import com.example.dagger2example.dagger.DaggerCarComponent;
import com.example.dagger2example.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    protected Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component = DaggerCarComponent.builder()
                .horsepower(240)
                .engineCapacity(2400)
                .build();
        component.inject(this);
        car.drive();
    }
}