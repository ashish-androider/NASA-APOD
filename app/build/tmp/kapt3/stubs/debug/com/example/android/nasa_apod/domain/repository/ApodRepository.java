package com.example.android.nasa_apod.domain.repository;

import com.example.android.nasa_apod.domain.util.Resource;
import com.example.android.nasa_apod.model.ApodEntity;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001JX\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010H&\u00a8\u0006\u0012"}, d2 = {"Lcom/example/android/nasa_apod/domain/repository/ApodRepository;", "", "getLatestApods", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/android/nasa_apod/domain/util/Resource;", "", "Lcom/example/android/nasa_apod/model/ApodEntity;", "isRefresh", "", "param", "", "", "onSuccess", "Lkotlin/Function0;", "", "onError", "Lkotlin/Function1;", "", "app_debug"})
public abstract interface ApodRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.example.android.nasa_apod.domain.util.Resource<java.util.List<com.example.android.nasa_apod.model.ApodEntity>>> getLatestApods(boolean isRefresh, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> param, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError);
}