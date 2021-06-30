package com.example.android.nasa_apod.domain.util;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kotlinx.coroutines.flow.Flow;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b\u001a\u00c4\u0001\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00100\u000f\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u00122\u0014\b\u0004\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u000f0\u00142\u001e\b\u0004\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00162$\b\u0004\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001a2\u0014\b\u0006\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\u001d0\u00162\u000e\b\u0006\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0014\b\u0006\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001b0\u0016H\u0086\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010!\u001a\n\u0010\"\u001a\u00020\u0005*\u00020\u0001\u001a\n\u0010#\u001a\u00020\u0001*\u00020\f\u001a\n\u0010$\u001a\u00020\u0001*\u00020\u0001\u001a\u001e\u0010%\u001a\u00020\u001b*\u00020&2\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u0016\u001a\u001c\u0010(\u001a\u00020\u001b*\u00020)2\u0006\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020,\u001a.\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050.\"\u0006\b\u0000\u0010/\u0018\u0001*\u0002H/2\u0006\u00100\u001a\u000201H\u0086\b\u00a2\u0006\u0002\u00102\u001a\n\u00103\u001a\u00020\u0005*\u00020\f\u001a\"\u00104\u001a\u00020\u0005\"\u0006\b\u0000\u0010/\u0018\u0001*\u0002H/2\u0006\u00100\u001a\u000201H\u0086\b\u00a2\u0006\u0002\u00105\u001a\n\u00106\u001a\u00020\u0005*\u00020\f\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001\u00a8\u00067"}, d2 = {"currentDate", "Ljava/time/LocalDate;", "getCurrentDate", "()Ljava/time/LocalDate;", "getCurrentFormattedDate", "", "getGetCurrentFormattedDate", "()Ljava/lang/String;", "getPastFormattedDate", "getGetPastFormattedDate", "getCalender", "Lcom/google/android/material/datepicker/MaterialDatePicker;", "", "kotlin.jvm.PlatformType", "networkBoundResource", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/android/nasa_apod/domain/util/Resource;", "ResultType", "RequestType", "loadFromDb", "Lkotlin/Function0;", "createCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "saveToDb", "Lkotlin/Function2;", "", "shouldFetch", "", "onCallSuccess", "onCallFailed", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "formatter", "instantToLocal", "minus", "showCalender", "Landroidx/fragment/app/FragmentManager;", "onDatePicked", "showSnackBarError", "Landroidx/fragment/app/Fragment;", "message", "view", "Landroid/view/View;", "toCustomMap", "", "T", "gson", "Lcom/google/gson/Gson;", "(Ljava/lang/Object;Lcom/google/gson/Gson;)Ljava/util/Map;", "toFormattedDate", "toJsonString", "(Ljava/lang/Object;Lcom/google/gson/Gson;)Ljava/lang/String;", "toPastFormattedDate", "app_debug"})
public final class ExtensionsKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.time.LocalDate currentDate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String getCurrentFormattedDate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String getPastFormattedDate = null;
    
    /**
     * https://developer.android.com/jetpack/guide
     */
    @org.jetbrains.annotations.NotNull()
    public static final <ResultType extends java.lang.Object, RequestType extends java.lang.Object>kotlinx.coroutines.flow.Flow<com.example.android.nasa_apod.domain.util.Resource<ResultType>> networkBoundResource(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.flow.Flow<? extends ResultType>> loadFromDb, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super RequestType>, ? extends java.lang.Object> createCall, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super RequestType, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> saveToDb, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ResultType, java.lang.Boolean> shouldFetch, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCallSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCallFailed) {
        return null;
    }
    
    public static final void showSnackBarError(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$showSnackBarError, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public static final void showCalender(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager $this$showCalender, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onDatePicked) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.material.datepicker.MaterialDatePicker<java.lang.Long> getCalender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatter(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate $this$formatter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.time.LocalDate getCurrentDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toFormattedDate(long $this$toFormattedDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toPastFormattedDate(long $this$toPastFormattedDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getGetCurrentFormattedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getGetPastFormattedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.time.LocalDate minus(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate $this$minus) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.time.LocalDate instantToLocal(long $this$instantToLocal) {
        return null;
    }
}