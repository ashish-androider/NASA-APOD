// Generated by Dagger (https://dagger.dev).
package com.example.android.nasa_apod.domain.repository;

import com.example.android.nasa_apod.api.ApodService;
import com.example.android.nasa_apod.domain.dao.ApodDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApodRepositoryImpl_Factory implements Factory<ApodRepositoryImpl> {
  private final Provider<ApodDao> appDaoProvider;

  private final Provider<ApodService> apodServiceProvider;

  public ApodRepositoryImpl_Factory(Provider<ApodDao> appDaoProvider,
      Provider<ApodService> apodServiceProvider) {
    this.appDaoProvider = appDaoProvider;
    this.apodServiceProvider = apodServiceProvider;
  }

  @Override
  public ApodRepositoryImpl get() {
    return newInstance(appDaoProvider.get(), apodServiceProvider.get());
  }

  public static ApodRepositoryImpl_Factory create(Provider<ApodDao> appDaoProvider,
      Provider<ApodService> apodServiceProvider) {
    return new ApodRepositoryImpl_Factory(appDaoProvider, apodServiceProvider);
  }

  public static ApodRepositoryImpl newInstance(ApodDao appDao, ApodService apodService) {
    return new ApodRepositoryImpl(appDao, apodService);
  }
}