package com.liulishuo.filedownloader.p199b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;

public final class C2141e extends SQLiteOpenHelper {
    public C2141e(Context context) {
        super(context, "filedownloader.db", null, 3);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS filedownloader( _id INTEGER PRIMARY KEY, url VARCHAR, path VARCHAR, status TINYINT(7), sofar INTEGER, total INTEGER, errMsg VARCHAR, etag VARCHAR, pathAsDirectory TINYINT(1) DEFAULT 0, filename VARCHAR, connectionCount INTEGER DEFAULT 1)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS filedownloaderConnection( id INTEGER, connectionIndex INTEGER, startOffset INTEGER, currentOffset INTEGER, endOffset INTEGER, PRIMARY KEY ( id, connectionIndex ))");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.delete("filedownloader", null, null);
        sQLiteDatabase.delete("filedownloaderConnection", null, null);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (VERSION.SDK_INT >= 16) {
            setWriteAheadLoggingEnabled(true);
            return;
        }
        if (VERSION.SDK_INT >= 11) {
            sQLiteDatabase.enableWriteAheadLogging();
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            sQLiteDatabase.execSQL("ALTER TABLE filedownloader ADD COLUMN pathAsDirectory TINYINT(1) DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE filedownloader ADD COLUMN filename VARCHAR");
        }
        if (i < 3) {
            sQLiteDatabase.execSQL("ALTER TABLE filedownloader ADD COLUMN connectionCount INTEGER DEFAULT 1");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS filedownloaderConnection( id INTEGER, connectionIndex INTEGER, startOffset INTEGER, currentOffset INTEGER, endOffset INTEGER, PRIMARY KEY ( id, connectionIndex ))");
        }
    }
}
