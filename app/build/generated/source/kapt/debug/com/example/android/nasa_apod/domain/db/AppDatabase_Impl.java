package com.example.android.nasa_apod.domain.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.android.nasa_apod.domain.dao.ApodDao;
import com.example.android.nasa_apod.domain.dao.ApodDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ApodDao _apodDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `apod` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `copyright` TEXT, `date` TEXT, `explanation` TEXT, `hdurl` TEXT, `mediaType` TEXT, `serviceVersion` TEXT, `title` TEXT, `url` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6651479f01867b064f8744d5867216c5')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `apod`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsApod = new HashMap<String, TableInfo.Column>(9);
        _columnsApod.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApod.put("copyright", new TableInfo.Column("copyright", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApod.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApod.put("explanation", new TableInfo.Column("explanation", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApod.put("hdurl", new TableInfo.Column("hdurl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApod.put("mediaType", new TableInfo.Column("mediaType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApod.put("serviceVersion", new TableInfo.Column("serviceVersion", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApod.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApod.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysApod = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesApod = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoApod = new TableInfo("apod", _columnsApod, _foreignKeysApod, _indicesApod);
        final TableInfo _existingApod = TableInfo.read(_db, "apod");
        if (! _infoApod.equals(_existingApod)) {
          return new RoomOpenHelper.ValidationResult(false, "apod(com.example.android.nasa_apod.model.ApodEntity).\n"
                  + " Expected:\n" + _infoApod + "\n"
                  + " Found:\n" + _existingApod);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "6651479f01867b064f8744d5867216c5", "180cf1375294295c42fe89c63c925589");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "apod");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `apod`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ApodDao.class, ApodDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public ApodDao apodListDao() {
    if (_apodDao != null) {
      return _apodDao;
    } else {
      synchronized(this) {
        if(_apodDao == null) {
          _apodDao = new ApodDao_Impl(this);
        }
        return _apodDao;
      }
    }
  }
}
