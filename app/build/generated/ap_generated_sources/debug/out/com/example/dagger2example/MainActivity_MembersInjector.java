// Generated by Dagger (https://dagger.dev).
package com.example.dagger2example;

import com.example.dagger2example.car.Car;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<Car> carProvider;

  public MainActivity_MembersInjector(Provider<Car> carProvider) {
    this.carProvider = carProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<Car> carProvider) {
    return new MainActivity_MembersInjector(carProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectCar(instance, carProvider.get());
  }

  @InjectedFieldSignature("com.example.dagger2example.MainActivity.car")
  public static void injectCar(MainActivity instance, Car car) {
    instance.car = car;
  }
}
