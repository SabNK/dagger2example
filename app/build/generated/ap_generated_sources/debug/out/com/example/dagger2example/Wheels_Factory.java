// Generated by Dagger (https://dagger.dev).
package com.example.dagger2example;

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
public final class Wheels_Factory implements Factory<Wheels> {
  @Override
  public Wheels get() {
    return newInstance();
  }

  public static Wheels_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Wheels newInstance() {
    return new Wheels();
  }

  private static final class InstanceHolder {
    private static final Wheels_Factory INSTANCE = new Wheels_Factory();
  }
}
