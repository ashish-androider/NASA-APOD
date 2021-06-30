package com.example.android.nasa_apod.ui.main;

import androidx.lifecycle.ViewModel;
import com.example.android.nasa_apod.di.key.ApiKey;
import com.example.android.nasa_apod.domain.repository.ApodRepository;
import com.example.android.nasa_apod.domain.util.*;
import com.example.android.nasa_apod.model.ApodPost;
import com.google.gson.Gson;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.*;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\'\u001a\u00020\u000fH\u0002J\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u000fJ\u000e\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR%\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0018\u00010\u001f0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/example/android/nasa_apod/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/android/nasa_apod/domain/repository/ApodRepository;", "(Lcom/example/android/nasa_apod/domain/repository/ApodRepository;)V", "apiKey", "", "getApiKey$annotations", "()V", "getApiKey", "()Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "dateEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/android/nasa_apod/model/ApodPost;", "dateUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "errorEventChannel", "Lcom/example/android/nasa_apod/domain/util/Event;", "errorEvents", "getErrorEvents", "()Lkotlinx/coroutines/flow/Flow;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "lists", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/example/android/nasa_apod/domain/util/Resource;", "", "Lcom/example/android/nasa_apod/model/ApodEntity;", "getLists", "()Lkotlinx/coroutines/flow/StateFlow;", "refreshChannel", "Lcom/example/android/nasa_apod/domain/util/Refresh;", "refreshEvent", "currentDate", "loadData", "", "refreshData", "date", "updateDate", "epoch", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.android.nasa_apod.domain.repository.ApodRepository repository = null;
    @javax.inject.Inject()
    public java.lang.String apiKey;
    @javax.inject.Inject()
    public com.google.gson.Gson gson;
    private final kotlinx.coroutines.channels.Channel<com.example.android.nasa_apod.domain.util.Event> errorEventChannel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.android.nasa_apod.domain.util.Event> errorEvents = null;
    private final kotlinx.coroutines.channels.Channel<com.example.android.nasa_apod.domain.util.Refresh> refreshChannel = null;
    private final kotlinx.coroutines.flow.Flow<com.example.android.nasa_apod.domain.util.Refresh> refreshEvent = null;
    private final kotlinx.coroutines.channels.Channel<com.example.android.nasa_apod.model.ApodPost> dateUpdateChannel = null;
    private final kotlinx.coroutines.flow.Flow<com.example.android.nasa_apod.model.ApodPost> dateEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.android.nasa_apod.domain.util.Resource<java.util.List<com.example.android.nasa_apod.model.ApodEntity>>> lists = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.nasa_apod.domain.repository.ApodRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiKey() {
        return null;
    }
    
    @com.example.android.nasa_apod.di.key.ApiKey()
    @java.lang.Deprecated()
    public static void getApiKey$annotations() {
    }
    
    public final void setApiKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.android.nasa_apod.domain.util.Event> getErrorEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.android.nasa_apod.domain.util.Resource<java.util.List<com.example.android.nasa_apod.model.ApodEntity>>> getLists() {
        return null;
    }
    
    public final void loadData() {
    }
    
    public final void refreshData(@org.jetbrains.annotations.NotNull()
    com.example.android.nasa_apod.model.ApodPost date) {
    }
    
    public final void updateDate(long epoch) {
    }
    
    private final com.example.android.nasa_apod.model.ApodPost currentDate() {
        return null;
    }
}