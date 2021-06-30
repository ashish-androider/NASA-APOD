// Generated by Dagger (https://dagger.dev).
package com.example.android.nasa_apod.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideApiKeyFactory implements Factory<String> {
  @Override
  public String get() {
    return provideApiKey();
  }

  public static NetworkModule_ProvideApiKeyFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provideApiKey() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideApiKey());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideApiKeyFactory INSTANCE = new NetworkModule_ProvideApiKeyFactory();
  }
}