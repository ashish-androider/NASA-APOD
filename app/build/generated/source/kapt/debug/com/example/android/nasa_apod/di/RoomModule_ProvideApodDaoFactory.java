// Generated by Dagger (https://dagger.dev).
package com.example.android.nasa_apod.di;

import com.example.android.nasa_apod.domain.dao.ApodDao;
import com.example.android.nasa_apod.domain.db.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomModule_ProvideApodDaoFactory implements Factory<ApodDao> {
  private final Provider<AppDatabase> databaseProvider;

  public RoomModule_ProvideApodDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public ApodDao get() {
    return provideApodDao(databaseProvider.get());
  }

  public static RoomModule_ProvideApodDaoFactory create(Provider<AppDatabase> databaseProvider) {
    return new RoomModule_ProvideApodDaoFactory(databaseProvider);
  }

  public static ApodDao provideApodDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(RoomModule.INSTANCE.provideApodDao(database));
  }
}
