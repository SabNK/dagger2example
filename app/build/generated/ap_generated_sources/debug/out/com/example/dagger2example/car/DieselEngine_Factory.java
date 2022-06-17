// Generated by Dagger (https://dagger.dev).
package com.example.dagger2example.car;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DieselEngine_Factory implements Factory<DieselEngine> {
  private final Provider<Integer> horsepowerProvider;

  public DieselEngine_Factory(Provider<Integer> horsepowerProvider) {
    this.horsepowerProvider = horsepowerProvider;
  }

  @Override
  public DieselEngine get() {
    return newInstance(horsepowerProvider.get());
  }

  public static DieselEngine_Factory create(Provider<Integer> horsepowerProvider) {
    return new DieselEngine_Factory(horsepowerProvider);
  }

  public static DieselEngine newInstance(int horsepower) {
    return new DieselEngine(horsepower);
  }
}
