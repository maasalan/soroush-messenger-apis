package com.google.android.gms.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;

final class fa extends SQLiteOpenHelper {
    private /* synthetic */ ex f5721a;

    fa(ex exVar, Context context, String str) {
        this.f5721a = exVar;
        super(context, str, null, 1);
    }

    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r11 = this;
        r0 = r11.f5721a;
        r0 = r0.f18116h;
        r1 = r0.f6067b;
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        r1 = 1;
        if (r5 != 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0023;
    L_0x0010:
        r2 = r0.f6066a;
        r5 = r2.mo1576b();
        r7 = r0.f6067b;
        r9 = r5 - r7;
        r5 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
        r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r0 < 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0023;
    L_0x0022:
        r1 = 0;
    L_0x0023:
        if (r1 != 0) goto L_0x002d;
    L_0x0025:
        r0 = new android.database.sqlite.SQLiteException;
        r1 = "Database open failed";
        r0.<init>(r1);
        throw r0;
    L_0x002d:
        r0 = super.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0032 }
        return r0;
    L_0x0032:
        r0 = r11.f5721a;
        r0 = r0.f18116h;
        r0.m4957a();
        r0 = r11.f5721a;
        r0 = r0.mo1623t();
        r0 = r0.f18134a;
        r1 = "Opening the database failed, dropping and recreating it";
        r0.m4846a(r1);
        r0 = "google_app_measurement.db";
        r1 = r11.f5721a;
        r1 = r1.mo1615l();
        r1 = r1.getDatabasePath(r0);
        r1 = r1.delete();
        if (r1 != 0) goto L_0x0067;
    L_0x005a:
        r1 = r11.f5721a;
        r1 = r1.mo1623t();
        r1 = r1.f18134a;
        r2 = "Failed to delete corrupted db file";
        r1.m4847a(r2, r0);
    L_0x0067:
        r0 = super.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0074 }
        r1 = r11.f5721a;	 Catch:{ SQLiteException -> 0x0074 }
        r1 = r1.f18116h;	 Catch:{ SQLiteException -> 0x0074 }
        r1.f6067b = r3;	 Catch:{ SQLiteException -> 0x0074 }
        return r0;
    L_0x0074:
        r0 = move-exception;
        r1 = r11.f5721a;
        r1 = r1.mo1623t();
        r1 = r1.f18134a;
        r2 = "Failed to open freshly created database";
        r1.m4847a(r2, r0);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fa.getWritableDatabase():android.database.sqlite.SQLiteDatabase");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        ex.m16050a(this.f5721a.mo1623t(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (VERSION.SDK_INT < 15) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
            try {
                rawQuery.moveToFirst();
            } finally {
                rawQuery.close();
            }
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        ex.m16051a(this.f5721a.mo1623t(), sQLiteDatabase2, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", ex.f18109a);
        ex.m16051a(this.f5721a.mo1623t(), sQLiteDatabase2, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        ex.m16051a(this.f5721a.mo1623t(), sQLiteDatabase2, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", ex.f18110b);
        ex.m16051a(this.f5721a.mo1623t(), sQLiteDatabase2, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", ex.f18111c);
        ex.m16051a(this.f5721a.mo1623t(), sQLiteDatabase2, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", ex.f18113e);
        ex.m16051a(this.f5721a.mo1623t(), sQLiteDatabase2, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        ex.m16051a(this.f5721a.mo1623t(), sQLiteDatabase2, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", ex.f18112d);
        ex.m16051a(this.f5721a.mo1623t(), sQLiteDatabase2, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", null);
        ex.m16051a(this.f5721a.mo1623t(), sQLiteDatabase2, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", null);
        ex.m16051a(this.f5721a.mo1623t(), sQLiteDatabase2, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        ex.m16051a(this.f5721a.mo1623t(), sQLiteDatabase2, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", ex.f18114f);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
