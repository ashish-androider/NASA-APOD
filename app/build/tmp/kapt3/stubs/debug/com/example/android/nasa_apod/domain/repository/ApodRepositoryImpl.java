package com.example.android.nasa_apod.domain.repository;

import com.example.android.nasa_apod.api.ApodService;
import com.example.android.nasa_apod.domain.dao.ApodDao;
import com.example.android.nasa_apod.domain.util.Resource;
import com.example.android.nasa_apod.model.ApodEntity;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JX\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/android/nasa_apod/domain/repository/ApodRepositoryImpl;", "Lcom/example/android/nasa_apod/domain/repository/ApodRepository;", "appDao", "Lcom/example/android/nasa_apod/domain/dao/ApodDao;", "apodService", "Lcom/example/android/nasa_apod/api/ApodService;", "(Lcom/example/android/nasa_apod/domain/dao/ApodDao;Lcom/example/android/nasa_apod/api/ApodService;)V", "getLatestApods", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/android/nasa_apod/domain/util/Resource;", "", "Lcom/example/android/nasa_apod/model/ApodEntity;", "isRefresh", "", "param", "", "", "onSuccess", "Lkotlin/Function0;", "", "onError", "Lkotlin/Function1;", "", "app_debug"})
public final class ApodRepositoryImpl implements com.example.android.nasa_apod.domain.repository.ApodRepository {
    private final com.example.android.nasa_apod.domain.dao.ApodDao appDao = null;
    private final com.example.android.nasa_apod.api.ApodService apodService = null;
    
    @javax.inject.Inject()
    public ApodRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.android.nasa_apod.domain.dao.ApodDao appDao, @org.jetbrains.annotations.NotNull()
    com.example.android.nasa_apod.api.ApodService apodService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.example.android.nasa_apod.domain.util.Resource<java.util.List<com.example.android.nasa_apod.model.ApodEntity>>> getLatestApods(boolean isRefresh, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> param, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
        return null;
    }
}