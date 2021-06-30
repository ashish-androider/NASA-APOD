package com.example.android.nasa_apod.api;

import com.example.android.nasa_apod.model.ApodEntity;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ-\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/android/nasa_apod/api/ApodService;", "", "getApodList", "", "Lcom/example/android/nasa_apod/model/ApodEntity;", "params", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ApodService {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.android.nasa_apod.api.ApodService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.nasa.gov/";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "planetary/apod")
    public abstract java.lang.Object getApodList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.android.nasa_apod.model.ApodEntity>> p1);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/android/nasa_apod/api/ApodService$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://api.nasa.gov/";
        
        private Companion() {
            super();
        }
    }
}