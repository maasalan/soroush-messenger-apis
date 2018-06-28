package com.google.android.gms.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension;

final class ah extends SQLiteOpenHelper {
    private /* synthetic */ ag f5519a;

    ah(ag agVar, Context context, String str) {
        this.f5519a = agVar;
        super(context, str, null, 1);
    }

    private static void m4576a(SQLiteDatabase sQLiteDatabase) {
        Set b = m4578b(sQLiteDatabase, JivePropertiesExtension.ELEMENT);
        r1 = new String[6];
        int i = 0;
        r1[0] = "app_uid";
        r1[1] = "cid";
        r1[2] = "tid";
        r1[3] = "params";
        r1[4] = "adid";
        r1[5] = "hits_count";
        while (i < 6) {
            Object obj = r1[i];
            if (b.remove(obj)) {
                i++;
            } else {
                String str = "Database properties is missing required column: ";
                String valueOf = String.valueOf(obj);
                throw new SQLiteException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        if (!b.isEmpty()) {
            throw new SQLiteException("Database properties table has extra columns");
        }
    }

    private final boolean m4577a(SQLiteDatabase sQLiteDatabase, String str) {
        Object obj;
        Throwable th;
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                boolean moveToFirst = query.moveToFirst();
                if (query != null) {
                    query.close();
                }
                return moveToFirst;
            } catch (SQLiteException e) {
                SQLiteException sQLiteException = e;
                cursor = query;
                obj = sQLiteException;
                try {
                    this.f5519a.m5149c("Error querying for table", str, obj);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            obj = e2;
            this.f5519a.m5149c("Error querying for table", str, obj);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        }
    }

    private static Set<String> m4578b(SQLiteDatabase sQLiteDatabase, String str) {
        Set<String> hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder(22 + String.valueOf(str).length());
        stringBuilder.append("SELECT * FROM ");
        stringBuilder.append(str);
        stringBuilder.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (Object add : columnNames) {
                hashSet.add(add);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
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
        r4 = this;
        r0 = r4.f5519a;
        r0 = r0.f18075e;
        r1 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
        r0 = r0.m4642a(r1);
        if (r0 != 0) goto L_0x0017;
    L_0x000f:
        r0 = new android.database.sqlite.SQLiteException;
        r1 = "Database open failed";
        r0.<init>(r1);
        throw r0;
    L_0x0017:
        r0 = super.getWritableDatabase();	 Catch:{ SQLiteException -> 0x001c }
        return r0;
    L_0x001c:
        r0 = r4.f5519a;
        r0 = r0.f18075e;
        r0.m4641a();
        r0 = r4.f5519a;
        r1 = "Opening the database failed, dropping the table and recreating it";
        r0.m5155f(r1);
        r0 = "google_analytics_v4.db";
        r1 = r4.f5519a;
        r1 = r1.f6279f;
        r1 = r1.f6283a;
        r0 = r1.getDatabasePath(r0);
        r0.delete();
        r0 = super.getWritableDatabase();	 Catch:{ SQLiteException -> 0x004c }
        r1 = r4.f5519a;	 Catch:{ SQLiteException -> 0x004c }
        r1 = r1.f18075e;	 Catch:{ SQLiteException -> 0x004c }
        r2 = 0;	 Catch:{ SQLiteException -> 0x004c }
        r1.f5619a = r2;	 Catch:{ SQLiteException -> 0x004c }
        return r0;
    L_0x004c:
        r0 = move-exception;
        r1 = r4.f5519a;
        r2 = "Failed to open freshly created database";
        r1.m5154e(r2, r0);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ah.getWritableDatabase():android.database.sqlite.SQLiteDatabase");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        if (be.m4606a() >= 9) {
            File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        if (VERSION.SDK_INT < 15) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
            try {
                rawQuery.moveToFirst();
            } finally {
                rawQuery.close();
            }
        }
        if (m4577a(sQLiteDatabase, "hits2")) {
            Set b = m4578b(sQLiteDatabase, "hits2");
            r2 = new String[4];
            int i = 0;
            r2[0] = "hit_id";
            r2[1] = "hit_string";
            r2[2] = "hit_time";
            r2[3] = "hit_url";
            while (i < 4) {
                Object obj = r2[i];
                if (b.remove(obj)) {
                    i++;
                } else {
                    str = "Database hits2 is missing required column: ";
                    String valueOf = String.valueOf(obj);
                    throw new SQLiteException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
            }
            int remove = b.remove("hit_app_id") ^ 1;
            if (b.isEmpty()) {
                if (remove != 0) {
                    str = "ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER";
                }
                if (m4577a(sQLiteDatabase, JivePropertiesExtension.ELEMENT)) {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
                } else {
                    m4576a(sQLiteDatabase);
                }
            }
            throw new SQLiteException("Database hits2 has extra columns");
        }
        str = ag.f18071a;
        sQLiteDatabase.execSQL(str);
        if (m4577a(sQLiteDatabase, JivePropertiesExtension.ELEMENT)) {
            m4576a(sQLiteDatabase);
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
