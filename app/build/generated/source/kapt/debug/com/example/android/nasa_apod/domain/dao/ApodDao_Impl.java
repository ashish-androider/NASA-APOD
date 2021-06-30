package com.example.android.nasa_apod.domain.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.android.nasa_apod.model.ApodEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ApodDao_Impl implements ApodDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ApodEntity> __insertionAdapterOfApodEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ApodDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfApodEntity = new EntityInsertionAdapter<ApodEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `apod` (`id`,`copyright`,`date`,`explanation`,`hdurl`,`mediaType`,`serviceVersion`,`title`,`url`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ApodEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getCopyright() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCopyright());
        }
        if (value.getDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDate());
        }
        if (value.getExplanation() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getExplanation());
        }
        if (value.getHdurl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHdurl());
        }
        if (value.getMediaType() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMediaType());
        }
        if (value.getServiceVersion() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getServiceVersion());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTitle());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getUrl());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM apod";
        return _query;
      }
    };
  }

  @Override
  public Object saveEntries(final List<ApodEntity> list, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfApodEntity.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Flow<List<ApodEntity>> getAll() {
    final String _sql = "SELECT * FROM apod ORDER BY apod.date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"apod"}, new Callable<List<ApodEntity>>() {
      @Override
      public List<ApodEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCopyright = CursorUtil.getColumnIndexOrThrow(_cursor, "copyright");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfExplanation = CursorUtil.getColumnIndexOrThrow(_cursor, "explanation");
          final int _cursorIndexOfHdurl = CursorUtil.getColumnIndexOrThrow(_cursor, "hdurl");
          final int _cursorIndexOfMediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaType");
          final int _cursorIndexOfServiceVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceVersion");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final List<ApodEntity> _result = new ArrayList<ApodEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ApodEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpCopyright;
            if (_cursor.isNull(_cursorIndexOfCopyright)) {
              _tmpCopyright = null;
            } else {
              _tmpCopyright = _cursor.getString(_cursorIndexOfCopyright);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpExplanation;
            if (_cursor.isNull(_cursorIndexOfExplanation)) {
              _tmpExplanation = null;
            } else {
              _tmpExplanation = _cursor.getString(_cursorIndexOfExplanation);
            }
            final String _tmpHdurl;
            if (_cursor.isNull(_cursorIndexOfHdurl)) {
              _tmpHdurl = null;
            } else {
              _tmpHdurl = _cursor.getString(_cursorIndexOfHdurl);
            }
            final String _tmpMediaType;
            if (_cursor.isNull(_cursorIndexOfMediaType)) {
              _tmpMediaType = null;
            } else {
              _tmpMediaType = _cursor.getString(_cursorIndexOfMediaType);
            }
            final String _tmpServiceVersion;
            if (_cursor.isNull(_cursorIndexOfServiceVersion)) {
              _tmpServiceVersion = null;
            } else {
              _tmpServiceVersion = _cursor.getString(_cursorIndexOfServiceVersion);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            _item = new ApodEntity(_tmpId,_tmpCopyright,_tmpDate,_tmpExplanation,_tmpHdurl,_tmpMediaType,_tmpServiceVersion,_tmpTitle,_tmpUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
