package com.example.android.nasa_apod.ui.main;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.android.nasa_apod.databinding.MainViewholderBinding;
import com.example.android.nasa_apod.model.ApodEntity;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/nasa_apod/ui/main/MainViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/android/nasa_apod/databinding/MainViewholderBinding;", "onItemClick", "Lkotlin/Function1;", "Lcom/example/android/nasa_apod/model/ApodEntity;", "", "(Lcom/example/android/nasa_apod/databinding/MainViewholderBinding;Lkotlin/jvm/functions/Function1;)V", "bind", "entity", "app_debug"})
public final class MainViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.example.android.nasa_apod.databinding.MainViewholderBinding binding = null;
    private final kotlin.jvm.functions.Function1<com.example.android.nasa_apod.model.ApodEntity, kotlin.Unit> onItemClick = null;
    
    public MainViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.android.nasa_apod.databinding.MainViewholderBinding binding, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.android.nasa_apod.model.ApodEntity, kotlin.Unit> onItemClick) {
        super(null);
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.example.android.nasa_apod.model.ApodEntity entity) {
    }
}