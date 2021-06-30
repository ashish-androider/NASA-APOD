package com.example.android.nasa_apod.domain.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.android.nasa_apod.domain.dao.ApodDao;
import com.example.android.nasa_apod.model.ApodEntity;

@androidx.room.Database(entities = {com.example.android.nasa_apod.model.ApodEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/android/nasa_apod/domain/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "apodListDao", "Lcom/example/android/nasa_apod/domain/dao/ApodDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.android.nasa_apod.domain.dao.ApodDao apodListDao();
}