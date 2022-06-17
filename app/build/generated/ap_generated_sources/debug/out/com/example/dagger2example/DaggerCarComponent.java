// Generated by Dagger (https://dagger.dev).
package com.example.dagger2example;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerCarComponent {
  private DaggerCarComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CarComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder wheelsModule(WheelsModule wheelsModule) {
      Preconditions.checkNotNull(wheelsModule);
      return this;
    }

    public CarComponent build() {
      return new CarComponentImpl();
    }
  }

  private static final class CarComponentImpl implements CarComponent {
    private final CarComponentImpl carComponentImpl = this;

    private CarComponentImpl() {


    }

    private Wheels wheels() {
      return WheelsModule_ProvideWheelsFactory.provideWheels(WheelsModule_ProvideRimsFactory.provideRims(), WheelsModule_ProvideTiresFactory.provideTires());
    }

    @Override
    public Car getCar() {
      return injectCar(Car_Factory.newInstance(new Engine(), wheels()));
    }

    @Override
    public void inject(MainActivity mainActivity) {
      injectMainActivity(mainActivity);
    }

    private Car injectCar(Car instance) {
      Car_MembersInjector.injectEnableRemote(instance, new Remote());
      return instance;
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectCar(instance, getCar());
      return instance;
    }
  }
}
