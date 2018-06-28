package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;

@TargetApi(11)
final class fq extends SQLiteOpenHelper {
    private /* synthetic */ fp f5789a;

    fq(fp fpVar, Context context, String str) {
        this.f5789a = fpVar;
        super(context, str, null, 1);
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            if (VERSION.SDK_INT < 11 || !(e instanceof SQLiteDatabaseLockedException)) {
                this.f5789a.mo1623t().f18134a.m4846a("Opening the local database failed, dropping and recreating it");
                String str = "google_app_measurement_local.db";
                if (!this.f5789a.mo1615l().getDatabasePath(str).delete()) {
                    this.f5789a.mo1623t().f18134a.m4847a("Failed to delete corrupted local db file", str);
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException e2) {
                    this.f5789a.mo1623t().f18134a.m4847a("Failed to open local database. Events will bypass local storage", e2);
                    return null;
                }
            }
            throw e2;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        ex.m16050a(this.f5789a.mo1623t(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        Throwable th;
        if (VERSION.SDK_INT < 15) {
            Cursor cursor = null;
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
                try {
                    rawQuery.moveToFirst();
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = rawQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        ex.m16051a(this.f5789a.mo1623t(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
