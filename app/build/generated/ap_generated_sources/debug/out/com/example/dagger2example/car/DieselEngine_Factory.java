// Generated by Dagger (https://dagger.dev).
package com.example.dagger2example.car;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DieselEngine_Factory implements Factory<DieselEngine> {
  @Override
  public DieselEngine get() {
    return newInstance();
  }

  public static DieselEngine_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DieselEngine newInstance() {
    return new DieselEngine();
  }

  private static final class InstanceHolder {
    private static final DieselEngine_Factory INSTANCE = new DieselEngine_Factory();
  }
}