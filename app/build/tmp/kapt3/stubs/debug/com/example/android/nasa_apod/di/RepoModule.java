package com.example.android.nasa_apod.di;

import com.example.android.nasa_apod.api.ApodService;
import com.example.android.nasa_apod.domain.dao.ApodDao;
import com.example.android.nasa_apod.domain.repository.ApodRepository;
import com.example.android.nasa_apod.domain.repository.ApodRepositoryImpl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/android/nasa_apod/di/RepoModule;", "", "()V", "provideApodRepository", "Lcom/example/android/nasa_apod/domain/repository/ApodRepository;", "appDao", "Lcom/example/android/nasa_apod/domain/dao/ApodDao;", "apodService", "Lcom/example/android/nasa_apod/api/ApodService;", "app_debug"})
@dagger.Module()
public final class RepoModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.android.nasa_apod.di.RepoModule INSTANCE = null;
    
    private RepoModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.android.nasa_apod.domain.repository.ApodRepository provideApodRepository(@org.jetbrains.annotations.NotNull()
    com.example.android.nasa_apod.domain.dao.ApodDao appDao, @org.jetbrains.annotations.NotNull()
    com.example.android.nasa_apod.api.ApodService apodService) {
        return null;
    }
}